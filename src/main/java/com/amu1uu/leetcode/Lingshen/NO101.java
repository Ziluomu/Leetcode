package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月27日 12:53
 */

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class NO101 {
    public boolean isSymmetric(TreeNode root) {

        return isSameTree(root.left,root.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p == q;
        }
        return p.val== q.val && isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
    }
}
