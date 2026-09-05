package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月29日 20:36
 */

/**
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左子树只包含 严格小于 当前节点的数。
 * 节点的右子树只包含 严格大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 */
public class NO98 {
    /** 前序遍历
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode node,long l,long r){
        if(node == null){
            return true;
        }
        long x = node.val;
        return l<x && x<r &&
                isValidBST(node.left,l,x) && isValidBST(node.right,x,r);
    }
     **/

/** 中序遍历
     private long pre = Long.MIN_VALUE;

     public boolean isValidBST(TreeNode root) {
         if (root == null) {
             return true;
         }
         if (!isValidBST(root.left)) { // 左
             return false;
         }
         if (root.val <= pre) { // 中
             return false;
         }
         pre = root.val;
         return isValidBST(root.right); // 右
     }
**/

    /**
     * 后序
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root){
        return dfs(root)[1] != Long.MAX_VALUE;
    }
    public long[] dfs(TreeNode root){
        if(root == null){
            return new long []{Long.MAX_VALUE, Long.MIN_VALUE};
        }
        long[] left = dfs(root.left);
        long[] right = dfs(root.right);
        if(root.val < left[1] || root.val > right[0]){
            return new long[] {Long.MIN_VALUE,Long.MAX_VALUE};
        }
        return new long[]{Math.min(left[0],root.val) , Math.max(right[1] , root.val)};
    }
}
