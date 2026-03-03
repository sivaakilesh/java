import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Linkedlist{
    Node head = null;
    void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }temp.next = newnode;
    }
    void removelast(int val){
        if(head == null)return;
        Node temp = head;
        int count = 0;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        int v = count-val;
        temp = head;
        for(int i=0;i<v;i++){
            temp = temp.next;
        }temp.next = temp.next.next;
    }
    void display(){
        if(head == null){
            System.out.print("List is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist ll = new Linkedlist();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll.insert(sc.nextInt());
        }
         int v = sc.nextInt();
         ll.removelast(v);
         ll.display();
    }
}