// BST
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}
class Solution{
    public TreeNode searchBst(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        else if(root.val<val){
           return searchBst(root.right, val);
        }else{
            return searchBst(root.left, val);
        }
    }
}
public class problem5 {
    public static TreeNode insert(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        TreeNode root=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            root=insert(root,val);
        }
        inorder(root);
        System.out.println();
        System.out.print("Enter vale to search: ");
        int target=sc.nextInt();
        Solution sol=new Solution();
        TreeNode result=sol.searchBst(root,target);
        if(result!=null){
            System.out.println(result.val);
        }else{
            System.out.println("not");
        }
        sc.close();
    }
    
}
