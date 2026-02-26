import java.util.*;
class Node{
   int data;
   Node prev;
   Node next;
   Node(int data){
      this.data=data;
      this.prev=null;
      this.next=null;
   }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node head=null;
		Node tail=null;
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
		   int v=sc.nextInt();
		   Node node=new Node(v);
		   if(head==null){
		      head=node;
		      tail=node;
		   }else{
		      tail.next=node;
		      node.prev=tail;
		      tail=node;
		   }
		}
		int x=sc.nextInt();
		Node newNode=new Node(x);
		if(head==null){
		      head=newNode;
		      tail=newNode;
		   }else{
		newNode.next=head;
		 head.prev=newNode;
		head=newNode;
		   }
		   Node temp=head;
		while(temp!=null){
		   System.out.print(temp.data+" ");
		   temp=temp.next;
		}
		   int a=sc.nextInt();
		Node newnode=new Node(a);
		if(head==null){
		      head=newnode;
		      tail=newnode;
		   }else{
		 tail.next=newnode;
		 newnode.prev=tail;
		 tail=newnode;
		   }
		   
	     temp=head;
		while(temp!=null){
		   System.out.print(temp.data+" ");
		   temp=temp.next;
		}
		   temp=head;
		   int count=0;
		   while(temp!=null){
		       count++;
		       temp=temp.next;
		   }
		   int b=sc.nextInt();
		   Node Newnode=new Node(b);
		   if(head==null){
		      head=Newnode;
		      tail=Newnode;
		   }else{
		       temp=head;
		       for(int i=0;i<count/2;i++){
		           temp=temp.next;
		       }
		       Newnode.next=temp;
            Newnode.prev = temp.prev;
            if(temp.prev != null) temp.prev.next = Newnode;
            temp.prev = Newnode;
            if(Newnode.prev == null) head = Newnode;
		       
		   }
	     temp=head;
		while(temp!=null){
		   System.out.print(temp.data+" ");
		   temp=temp.next;
		}
	}
}
