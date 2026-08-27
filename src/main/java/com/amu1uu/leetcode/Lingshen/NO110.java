package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月27日 13:00
 */
/**
 * 给定一个二叉树，判断它是否是 平衡二叉树
 * 平衡二叉树 是指该树所有节点的左右子树的高度相差不超过 1。
 */
public class NO110 {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
    public int getHeight(TreeNode root){
        if(root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        if(left == -1) {
            return -1;
        }
        int right = getHeight(root.right);
        if(right == -1){
            return -1;
        }
        if(Math.abs(left - right) > 1){
            return -1;
        }
        return Math.max(left,right) +1 ;
    }


    public boolean isBalanced1(TreeNode root) {
        if(root == null){
            return true;
        }
        // 递归求左右子树的高度
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        if(Math.abs(lHeight - rHeight) > 1){
            return false;
        }
        return isBalanced1(root.right) && isBalanced1(root.left);
    }
    public int height(TreeNode root){
        if(root==null) {
            return 0;
        } else {
            int lHeight = height(root.left);
            int rHeight = height(root.right);
            return Math.max(lHeight,rHeight) + 1;
        }
    }
}
