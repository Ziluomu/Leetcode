package com.amu1uu.leetcode.Lingshen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年08月27日 13:16
 */

/**
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */
public class NO199 {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,0,ans);
        return ans;
    }
    public void dfs(TreeNode root,int depth , ArrayList ans){
        if(root == null){
            return;
        }
        if(depth == ans.size()){
            ans.add(root.val);
        }
        dfs(root.right,depth+1 ,ans);
        dfs(root.left, depth +1 ,ans);
    }
}

