import java.util.*;
public class problem8 {
    static int maxArray(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];

        }
        int max=maxArray(arr,index+1);
        return Math.max(arr[index],max);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(maxArray(arr,0));
    }
}
