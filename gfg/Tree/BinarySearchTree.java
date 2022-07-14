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
