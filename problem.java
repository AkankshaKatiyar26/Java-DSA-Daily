import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());

        }
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int s=sc.nextInt();
            graph.get(u).add(s);
            graph.get(s).add(u);


        }
        for(int i=0;i<v;i++){
            System.out.print(i+"->");
            for(int node : graph.get(i))
                System.out.print(node + " ");
            System.out.println();
        
        }

    }
}
