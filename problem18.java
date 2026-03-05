import java.util.*;;
public class problem18{
    static int priority(char c){
        if(c=='+' || c=='-') return 1;
        if(c=='*' || c=='/') return 2;
        if(c=='^') return 3;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        String result="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        
       
        if(Character.isLetterOrDigit(c)){
            result+=c;
        }
        else if(c=='('){
            st.push(c);
        }
        else if(c==')'){
            while(!st.isEmpty() && st.peek()!='('){
                result+=st.pop();
            }
            st.pop();
        }
        else{
            while(!st.isEmpty() && priority(c)<=priority(st.peek())){
                result+=st.pop();
        }
        st.push(c);
        
    }
}

while(!st.isEmpty()){
    result+=st.pop();
}
System.out.println(result);
    }

}