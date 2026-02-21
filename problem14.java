import java.util.*;
public class problem14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            if(arr[i]<0){
                neg.add(arr[i]);
            }
        }
        
        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int index=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                arr[index]=pos.get(i);
                index++;
            }

        } else{
            for(int i=0;i<pos.size();i++){
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int index=pos.size()*2;
            for(int i=pos.size();i<neg.size();i++){
                arr[index]=neg.get(i);
                index++;
            }

        } 
        System.out.println(Arrays.toString(arr));      

    }
    
}
