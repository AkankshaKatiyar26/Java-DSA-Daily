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
       for( char ch:map.keySet()){
        System.out.println(ch+"->"+map.get(ch));
       }
    }
}
