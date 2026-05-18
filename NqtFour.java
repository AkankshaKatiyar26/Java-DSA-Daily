import java.util.*;
public class NqtFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> h=new HashSet<>();
        int max=0;
         int left=0;
        for(int right=0;right<s.length();right++){
            while(h.contains(s.charAt(right))){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(s.charAt(right));
            max=Math.max(max,h.size());
        }
        System.out.println(max);
    }
}
