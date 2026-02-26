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
        }
          if(data<=front.data){
            newnode.next=front;;
            front.prev=newnode;
            front=newnode;
        }
        if(data>=rear.data){
            rear.next=newnode;
            newnode.prev=rear;
            rear=newnode;
        }
        
    }
    void getMin(){
        System.out.print("Min : "+front.data);
    }
    void getMax(){
        System.out.print("Max : "+rear.data);
    }
    void deleteMin(){
        front=front.next;
        if(front==null){
            rear=null;
        }
        System.out.print("Deleting Min : ");
    }
    void deleteMax(){
        rear=rear.prev;
        rear.next=null;
        System.out.print("Deleting Max : ");
    }
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
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
        System.out.println();
        q.deleteMin();
        q.display();
        System.out.println();
        q.deleteMax();
        q.display();
        System.out.println();
        q.getMin();
        System.out.println();
        q.getMax();
    }
}
