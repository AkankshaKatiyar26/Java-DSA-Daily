
import java.util.*;
public class problem10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] nums=new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int count =0;
        for(int i=0;i<n;i++){
            prefix+=nums[i];
            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);

        }
        System.out.println(count);

    }
}
// count subarrays sum=k
