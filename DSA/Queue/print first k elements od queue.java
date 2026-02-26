import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Queue{
    Node front=null;
    Node rear=null;
    void enqueue(int data){
        Node newnode=new Node(data);
        if(front==null){
            front=newnode;
            rear=newnode;
        }else{
            rear.next=newnode;
            newnode.prev=rear;
            rear=newnode;
        }
    }
    void display(int k){
        Node temp=front;
         int count=0;
        while(temp!=null&&count<k){
            System.out.print(temp.data+" ");
            temp=temp.next;
            count++;
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            q.enqueue(val);
        }
        q.display(sc.nextInt());
    }
}
