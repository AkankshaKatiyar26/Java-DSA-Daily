import java.util.*;
public class problem16{
    public static int Activity(int[] a,int[] b){
        int n=a.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=a[i];
            arr[i][1]=b[i];
        }
        Arrays.sort(arr,(x,y) -> x[1]-y[1]);
        int count=1;
        int End=arr[0][1];
        for(int i=1;i<n;i++){
            if(arr[i][0]>=End){
                count++;
                End=arr[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int result=Activity(a,b);
        System.out.println(result);
    }
}