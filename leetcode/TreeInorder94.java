// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Deque;
// import java.util.List;



// // class TreeNode {
// //     int val;
// //     TreeNode left;
// //     TreeNode right;

// //     TreeNode() {
// //     }

// //     TreeNode(int val) {
// //         this.val = val;
// //     }

// //     TreeNode(int val, TreeNode left, TreeNode right) {
// //         this.val = val;
// //         this.left = left;
// //         this.right = right;
// //     }
// // }


// public class TreeInorder94 {
//     public static void main(String[] args) {

//     }

//     public void inorderRecursive(TreeNode root, List<Integer> list) {
//         if(root == null) return;
//         inorderRecursive(root.left, list);
//         list.add(root.val);
//         inorderRecursive(root.right, list);
//     }

//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         Deque<TreeNode> stack = new ArrayDeque<>();

//         TreeNode curr = root;

//         while(curr != null || !stack.isEmpty()) {
//             while(curr != null) {
//                 stack.push(curr);
//                 curr = curr.left;
//             }

//             curr = stack.pop();

//             list.add(curr.val);
//             curr = curr.right;
//         }
//         return list;
//     }
// }
