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
    public static Node rotateRight(Node head,int k){
        int count=1;
        Node temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        // Node head=temp;
        k=k%count;
        if(k==0)return head;
        temp.next=head;
        head.prev=temp;
        Node newHead=head;
        for(int i=0;i<count-k-1;i++){
            newHead=newHead.next;
        }
        Node newTail=newHead.prev;
        newTail.next=null;
        newHead.prev=null;
        return newHead;
    }
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
        int k=sc.nextInt();
        head=rotateRight(head,k);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}