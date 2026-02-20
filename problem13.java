import java.util.*;
public class problem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
            
        }
        int k=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        for(int i=1;i<k;i++){
            pq.poll();
        }
        System.out.println(pq.peek());

    }
    
}
