import java.util.*;


class  NqtTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       
        String[] words=s.split(" ");
        int n=words.length;
        StringBuilder result=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0) result.append(" ");
        }
        System.out.println(result.toString());

    }
  


    
}
