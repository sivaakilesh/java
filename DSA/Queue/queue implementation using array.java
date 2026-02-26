import java.util.Scanner;
class Queue{
    int []arr;
    int size;
    int front;
    int rear;
    Queue(int n){
        arr=new int[n];
        size=n;
        front=0;
        rear=-1;
    }
    void enqueue(int x){
        if(rear==size-1){
            System.out.print("overflow");
        }
        arr[++rear]=x;
    }
    int dequeue(){
        if(front>rear){
            System.out.print("underflow");
            return -1;
        }
        int removed=arr[front++];
        return removed;
    }
    int peek(){
        if(front>rear){
            System.out.print("empty");
            return -1;
        }
        return arr[front];
    }
    void display(){
        if(front>rear){
            System.out.print("empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue q=new Queue(n);
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
             q.enqueue(val);
        }
        q.display();
        q.dequeue();
        q.display();
        System.out.println("Front element: " + q.peek());
    }
        
}