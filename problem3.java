import java.util.*;

public class problem3 {
    static int[] nums;
    static int front=0, rear=-1, size=0;
    static void  enqueue(int x){
        rear=rear+1;
        nums[rear]=x;
        size++;
    }
    static int dequeue(){
        if(size==0) return -1;
        size--;
        return nums[front++];

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nums=new int[n];
        for(int i=0;i<n;i++){
            enqueue(sc.nextInt());
            
        }
        System.out.println(dequeue());
    }
    
}
