import java.util.*;
public class problem15 {
    static void printName(int n,String name){
        if(n==0){
            return ;
        }
        System.out.println(name);
        printName(n-1,name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        printName(n, name);
    }
}
