package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeImplementation {
    public static void main(String[] args) {

        // Node root = null; //empty tree
        Node root = new Node(1);
        Node leftChild1 = new Node(2);
        Node rightChild1 = new Node(3);
        Node leftChild2 = new Node(4);

        root.left = leftChild1;
        root.right = rightChild1;

        leftChild1.left = leftChild2;
        leftChild1.right = new Node(5);

        leftChild1.right.right = new Node(6);
        leftChild2.left = new Node(7);

        System.out.println("pre order");
        preorderTraversal(root);
        System.out.println();

        System.out.println("in order");
        inorderTraversal(root);
        System.out.println();

        System.out.println("post order");
        postorderTraversal(root);
        System.out.println();

        System.out.println("left subtree height");
        System.out.println(leftSubTreeHeight(root));
        System.out.println();

        // root = null;
        System.out.println("heigth");
        System.out.println(height(root));

        System.out.println("left node at k distance");
        int k = 0;

        printLeftNodeAtKDistance(root);
        System.out.println("nodes at distance k");
        printNodesAtDistanceK(root, k);

        System.out.println("level order traversal");
        Deque<Node> dq = new ArrayDeque<>();
        // root = null;
        levelOrderTraversal(root, dq);

        System.out.println("\nlevel order line by line");
        levelOrderLineByLine(root);
        System.out.println();

        System.out.println("number of Nodes");
        System.out.println(numberOfNodes(root));
        
        System.out.println("max nodes");
        System.out.println(maxNode(root));

        System.out.println("left view");
        printLeftView(root);
        System.out.println();

        root = null;
        root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.right.left = new Node(2);
        System.out.println(childrenSumProperty(root));
    }

    static boolean childrenSumProperty(Node root) {
        if(root == null)
            return true;

        if(childrenSumProperty(root.left)  && childrenSumProperty(root.right)) {
            int sum = 0;
            if(root.left != null) {
                sum += root.left.data;
            }
            if(root.right != null) {
                sum += root.right.data;
            }
            if(root.left == null && root.right == null) {
                sum = root.data;
            }
            return sum == root.data;
        } else {
            return false;
        }
    }

    static void printLeftView(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        int count = 0;
        while(q.size() > 1) {
            Node current = q.remove();
            if(current != null)
                count++;

            if(current == null) {
                count = 0;
                q.add(null);
                continue;
            }
            
            if(count == 1) {
                System.out.print(current.data + " ");
            }

            if(current.left != null) {
                q.add(current.left);
            }
            if(current.right != null) {
                q.add(current.right);
            }
        }
    }

    static int maxNode(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        
        return Math.max(root.data, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    static int numberOfNodes(Node root) {
        if(root == null) 
            return 0;

        return 1 + numberOfNodes(root.left) + numberOfNodes(root.right);
    }

    static void levelOrderLineByLine(Node root) {
        if (root == null)
            return;

        Queue<Node> dq = new LinkedList<>();

        dq.add(root);
        dq.add(null);

        while (dq.size() > 1) {
            Node curr = dq.remove();
            if (curr == null) {
                System.out.println();
                dq.add(null);
                continue;
            }
            System.out.print(curr.data + " ");
            if (curr.left != null)
                dq.add(curr.left);
            if (curr.right != null)
                dq.add(curr.right);
        }
    }

    static void levelOrderTraversal(Node root, Deque<Node> dq) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        if (root.left != null)
            dq.addLast(root.left);
        if (root.right != null)
            dq.addLast(root.right);

        if (dq.isEmpty()) {
            root = null;
        } else {
            root = dq.removeFirst();
        }
        levelOrderTraversal(root, dq);
    }

    static void printNodesAtDistanceK(Node root, int k) {
        if (root == null)
            return;

        if (k == 0) {
            System.out.print(root.data + " ");
        }

        printNodesAtDistanceK(root.left, k - 1);
        printNodesAtDistanceK(root.right, k - 1);
    }

    static int printLeftNodeAtKDistance(Node root) {
        if (root == null) {
            return 0;
        }

        int lcount = 1 + printLeftNodeAtKDistance(root.left);
        if (lcount == 2 - 1)
            System.out.println(root.data);
        return lcount;
    }

    static int height(Node root) {
        if (root == null)
            return 0;

        return Math.max(1 + height(root.left), 1 + height(root.right));
    }

    public static int leftSubTreeHeight(Node root) {
        if (root == null)
            return 0;
        return 1 + leftSubTreeHeight(root.left);
    }

    public static void postorderTraversal(Node root) {
        if (root == null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
