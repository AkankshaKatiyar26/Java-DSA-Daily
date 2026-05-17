import java.util.*;
public class NqtThree {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
             int largest=Integer.MIN_VALUE;
             int second=Integer.MIN_VALUE;
             for(int i=0;i<n;i++){
                if(arr[i]>largest){
                    second=largest;
                    largest=arr[i];
                }else if(arr[i]>second && arr[i]!=largest){
                    second=arr[i];
                }

             }
             if(second==Integer.MIN_VALUE){
                System.out.println("NO");

             }
             else{
                System.out.println(second);
             }

        }
    }

