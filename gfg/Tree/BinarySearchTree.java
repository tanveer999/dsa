package Tree;

class Node1 {
    int data;
    Node1 left;
    Node1 right;

    Node1(int data) {
        this.data = data;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        Node1 root = new Node1(5);
        root.left = new Node1(3);
        root.right = new Node1(6);

        // System.out.println("inorder traversal");
        // inorderTraversal(root);
        // System.out.println();

    
        System.out.println("Search in BST");
        root = null;
        root = new Node1(15);
        root.left = new Node1(5);
        root.left.left = new Node1(3);

        root.right = new Node1(20);
        root.right.left = new Node1(18);
        root.right.right = new Node1(80);
        root.right.left.left = new Node1(16);
        System.out.println(search(root, 15));

        System.out.println("insert");
        root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 15);
        root = insert(root, 12);
        root = insert(root, 18);
        root = insert(root, 20);
        inorderTraversal(root);

        System.out.println();
        System.out.println("delete node is BST");
        root = null;
        delete(root, 30);

        System.out.println();
        System.out.println("floor node");
        root = null;
        root = new Node1(10);
        root.left = new Node1(5);
        root.right = new Node1(15);
        root.right.left = new Node1(12);
        root.right.right = new Node1(30);
        Node1 floorNode = floor(root, 100);
        if(floorNode == null) System.out.println(floorNode);
        else System.out.println(floorNode.data);

        Node1 ceilNode = ceil(root, 14);
        if(ceilNode == null) System.out.println(ceilNode);
        else System.out.println(ceilNode.data);
    }

    static Node1 ceil(Node1 root, int key) {
        if(root == null) return null;

        Node1 res = null;

        while(root != null) {
            if(root.data == key) {
                return root;
            }
            if(key > root.data) {
                root = root.right;
            } else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }

    static Node1 floor(Node1 root, int key) {
        if(root == null) return null;

        Node1 curr = root;
        Node1 floorNode = null;

        while(curr != null) {
            if(floorNode == null && curr.data < key){ 
                floorNode = curr;
            }
            if(floorNode != null && curr.data <= key && curr.data > floorNode.data) {
                floorNode = curr;
            }
            if(key > curr.data) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        return floorNode;
    }

    static Node1 delete(Node1 root, int key) {
        if(root == null)
            return null;

        if(key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else {
                Node1 successor = successor(root);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }
    static Node1 successor(Node1 root) {
        Node1 curr = root.right;
        while(curr != null && root.left != null)
            curr = root.left;
        
        return curr;
    }

    static Node1 insert(Node1 root, int key) {
        Node1 newNode = new Node1(key);

        if(root == null)
            return newNode;
        
        if(key < root.data)
            root.left = insert(root.left, key);
        else 
            root.right = insert(root.right, key);
        return root;
        // solution 1
        // if(root == null)
        //     return newNode;
        
        // if(key < root.data) {
        //     if(root.left != null)
        //         insert(root.left, key);
        //     else {
        //         root.left = newNode;
        //         return root;
        //     }
        // } else {
        //     if(root.right != null)
        //         insert(root.right, key);
        //     else {
        //         root.right = newNode;
        //         return root;
        //     }
        // }
        // return root;
    }

    static boolean search(Node1 root, int key) {
        if(root == null)
            return false;
        
        if(key == root.data) {
            return true;
        }
        if(key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    static void inorderTraversal(Node1 root) {
        if(root == null)
            return;
        
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
}
