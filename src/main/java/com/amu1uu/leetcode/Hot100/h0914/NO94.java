package com.amu1uu.leetcode.Hot100.h0914;

import com.amu1uu.leetcode.Lingshen.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年09月14日 14:27
 */

/**
 * 中序遍历  左根右
 */
public class NO94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(ans,root);
        return ans;
    }
    private void dfs(List<Integer> ans, TreeNode node){
        if(node == null){
            return ;
        }
        dfs(ans,node.left);
        ans.add(node.val);
        dfs(ans,node.right);
    }
}
