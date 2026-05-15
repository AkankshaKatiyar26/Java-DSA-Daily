import java.util.*;
public class Solution{
    static class Node{
        int x ,y,steps;
        Node(int x,int y,int steps){
            this.x=x;
            this.y=y;
            this.steps=steps;
        }
    }
    public static int minDis(int[] pos,int[] target,int n){
        int dx[]={2,2,-2,-2,1,1,-1,-1};
        int dy[]={1,-1,1,-1,2,-2,2,-2};
        boolean[][] visited=new boolean[n][n];
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(pos[0],pos[1],0));
        visited[pos[0]][pos[1]]=true;
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr.x==target[0] && curr.y==target[1]){
                return curr.steps;
            }nqt
            for(int i=0;i<8;i++){
                int newX=curr.x+dx[i];
                int newY=curr.y+dy[i];
                if(newX>=0 && newY>=0 && newX<n && newY<n && !visited[newX][newY]){
                    visited[newX][newY]=true;
                    q.add(new Node(newX,newY,curr.steps+1));
                }
            }
            
        }
        return -1;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter board size: ");
        int n = sc.nextInt();

        int[] pos = new int[2];
        int[] target = new int[2];

        System.out.print("Enter Knight Start Position (row col): ");
        pos[0] = sc.nextInt();
        pos[1] = sc.nextInt();

        System.out.print("Enter Target Position (row col): ");
        target[0] = sc.nextInt();
        target[1] = sc.nextInt();

        int result = minDis(pos, target, n);

        System.out.println("Minimum steps required = " + result);

        sc.close();
    }
}
