package niuke;

import java.util.ArrayList;

import niuke.TreeNode;
public class PreTwoTree {
      public int[] preorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> arrayList =new ArrayList<>();
        dfs(root, arrayList);
        return arrayList.stream().mapToInt(i->i).toArray();
    }

    public void dfs(TreeNode root ,ArrayList arrayList){
        if(root == null){
            return;
        }
        arrayList.add(root.val);
        dfs(root.left, arrayList);
        dfs(root.right, arrayList);
    }

     public void dfs1(TreeNode root ,ArrayList arrayList){
        if(root == null){
            return;
        }
        dfs(root.left, arrayList);
        arrayList.add(root.val);
        dfs(root.right, arrayList);
    }

    public int[] inorderTraversal (TreeNode root) {
        // write code here
         ArrayList<Integer> arrayList =new ArrayList<>();
        dfs1(root, arrayList);
        return arrayList.stream().mapToInt(i->i).toArray();
    }

    public void dfs2(TreeNode root ,ArrayList arrayList){
        if(root == null){
            return;
        }
        dfs2(root.left, arrayList);
        dfs2(root.right, arrayList);
        arrayList.add(root.val);
    }

    public int[] postorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> arrayList =new ArrayList<>();
        dfs2(root, arrayList);
        return arrayList.stream().mapToInt(i->i).toArray();
    }
}
