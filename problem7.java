import java.util.*;
public class problem7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
       
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxfreq=0;
        char max=' ';
       for( char ch:map.keySet()){
        if(map.get(ch)>maxfreq){
            maxfreq=map.get(ch);
            max=ch;
        }
       }
        System.out.println(max+"->"+maxfreq);
       

    }
}
