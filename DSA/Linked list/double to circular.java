import java.util.Scanner;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        }
        if(head!=null&&tail!=null){
            tail.next=head;
            head.prev=tail;
        }
        Node temp=head;
        if(temp!=null){
            do{
            System.out.print(temp.data+" ");
            temp=temp.next;
            }while(temp!=head);
        }
    }
}