import java.util.*;
public class problem17{
    public static double Sjf(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        int time=0;
        int wt=0;
        for(int i=0;i<n;i++){
            time+=wt;
            wt+=nums[i];
        }
        double avg=(double)time/n;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        System.out.printf("%.2f",Sjf(nums));

    }
}