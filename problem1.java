import java.util.*;
public class problem1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            q.add(x);
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
 
    

