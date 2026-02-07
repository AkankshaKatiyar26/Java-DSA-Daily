import java.util.*;
import java.util.Queue;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        left=right=null;
    }
}
class Tree{
    TreeNode root;
    TreeNode insert(TreeNode root,int val){
        if(root==null){
             return new TreeNode(val);
        }
        if(val<root.val){
            root.left=insert(root.left,val);
        }else if(val>root.val){
            root.right=insert(root.right,val);
        }
        return root;
    }
    List<List<Integer>> zigzagLevel(TreeNode root){
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> levelOrder=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(level%2==0){
                    levelOrder.add(0,curr.val);

                }else{
                    levelOrder.add(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(levelOrder);
            level++;

        }
        return ans;

    }
}
public class problem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tree tree=new Tree();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            tree.root=tree.insert(tree.root,val);
        }
        List<List<Integer>> result=tree.zigzagLevel(tree.root);
        System.out.println("answer:");
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
        }
        
    }
    
}
