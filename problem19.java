import java.util.*;
public class problem19{
    public static void main(String[] args) {
        String s="aabbbc";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++ ){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        StringBuilder result=new StringBuilder();
        for( char ch : map.keySet()){
            int freq=map.get(ch);
            int square=freq*freq;

        
        for(int i=0;i<square;i++){
            result.append(ch);
        }
        }
        System.out.println(result.toString());

    }

}