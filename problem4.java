import java.util.*;
public class problem4 {
    static class Node{
        int data;
        Node next=null;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node front=null;
    static Node rear=null;
    static void enqueue(int x){
        Node newNode=new Node(x);

        if(rear==null){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    static int dequeue(){
        if(front==null){
            return -1;
        }
        int val=front.data;
        front=front.next;
        if(front==null) rear=null;
        return val;
    }
    static void printQueue(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            enqueue(sc.nextInt());
        }
        printQueue();
        System.out.println(dequeue());
        printQueue();
    }
    
}
