package Tree;

import java.util.ArrayList;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        System.out.println(isSymmetric(root));
    }
    static public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;

        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        
        if(arr.size() %2 ==0) return false;
        else {
            int mid = arr.size() / 2;
            int i = 0, j = arr.size() - 1;
            while(i < j) {
                if(arr.get(i) != arr.get(j)) return false;
                i++;
                j--;
            }
            return true;
        }
    }

    static public void inorder(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
}
