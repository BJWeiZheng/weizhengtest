package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by weizheng on 2016/5/16.
 */
public class Traversal {
    public static TreeNode init(){
        int[] nums = {2,3,4,5,6,7};
        TreeNode root = new TreeNode(1);
        TreeNode current;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        for(int i = 0; i < nums.length; ) {
            current = queue.remove();
            current.setLeftChild(new TreeNode(nums[i++]));
            current.setRightChild(new TreeNode(nums[i++]));
            queue.add(current.getLeftChild());
            queue.add(current.getRightChild());
        }
        return root;
    }


    public static void preOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode current;

        while(!queue.isEmpty()) {
            current = queue.remove();
            System.out.println(current.getData());
            if (current.getLeftChild() != null)
                queue.add(current.getLeftChild());
            if (current.getRightChild() != null)
                queue.add(current.getRightChild());
        }
    }

    public static void inOrderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            if(current != null) {
                stack.push(current);
                current = current.getLeftChild();
            } else {
                current = stack.pop();
                System.out.println(current.getData());
                current = current.getRightChild();
            }
        }
    }

    public static void postOrderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            if(current != null) {
                stack.push(current);
                current = current.getLeftChild();
            } else {
                current = stack.pop();
                System.out.println(current.getData());
                current = current.getRightChild();
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = init();
        preOrderTraversal(root);
    }
}
