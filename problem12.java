import java.util.*;
public class problem12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[n];
        for(int j=0;j<n;j++){
            while(!st.isEmpty() && nums[j]<nums[st.peek()]){
                int index=st.pop();
                arr[index]=nums[j];
            }
            st.push(j);
        }
        while(!st.isEmpty()){
            arr[st.pop()]=-1;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
