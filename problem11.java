// Monotonic Stack-Next Greater Element 
import java.util.*;
public class problem11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                int index=st.pop();
                arr[index]=nums[i];
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
