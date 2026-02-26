import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    Node front=null;
    Node rear=null;
    void enqueue(int data){
    Node newnode=new Node(data);
    if(rear==null){
        front=newnode;
        rear=newnode;
    }else{
        rear.next=newnode;
        rear=newnode;
    }
}
void dequeue(){
    if(front==null){
        System.out.print("queue is empty");
    }else{
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
}
void peek(){
    if(front==null){
        System.out.print("queue is empty");
    }else{
        System.out.println(front.data);
    }
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
        q.dequeue();
        // System.out.println();
       q.display();
       System.out.println();
       q.peek();
    }
}