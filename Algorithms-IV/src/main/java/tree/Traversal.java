package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal {

    // 递归先序遍历
    public static void PreorderTraversal(TreeNode root) {
        TreeNode node = root;
        Stack<TreeNode> treeNodes = new Stack<>();
        while (node != null || !treeNodes.isEmpty()) {
            while (node != null) {
                System.out.println(node.val);
                treeNodes.push(node);
                node = node.left;
            }
            if (!treeNodes.isEmpty()) {
                node = treeNodes.pop();
                node = node.right;
            }
        }
    }

    // 递归先序遍历
    public static void inorderTraversal(TreeNode root) {
        TreeNode node = root;
        Stack<TreeNode> treeNodes = new Stack<>();
        while (node != null || !treeNodes.isEmpty()) {
            while (node != null) {
                treeNodes.push(node);
                node = node.left;
            }
            if (!treeNodes.isEmpty()) {
                node = treeNodes.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }

    // 递归先序遍历
    public static void postorderTraversal(TreeNode root) {
        TreeNode node = root;
        Stack<TreeNode> treeNodes = new Stack<>();
        Stack<TreeNode> sout = new Stack<>();
        while (node != null || !treeNodes.isEmpty()) {
            while (node != null) {
                sout.push(node);
                treeNodes.push(node);
                node = node.right;
            }
            if (!treeNodes.isEmpty()) {
                node = treeNodes.pop();
                node = node.left;
            }
        }
        while (!sout.isEmpty()) {
            System.out.println(sout.pop().val);
        }
    }

    //层序遍历
    public static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()) {
            TreeNode poll = treeNodes.poll();
            System.out.println(poll);
            if (poll.left != null) {
                treeNodes.offer(poll.left);
            }
            if (poll.right != null) {
                treeNodes.offer(poll.right);
            }
        }
    }

}
