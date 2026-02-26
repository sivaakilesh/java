import java.util.*;
class Node{
   int data;
   Node next;
   Node(int data){
      this.data=data;
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
		      tail=node;
		      //node.next=head;
		      //head=node;
		   }
		}
		int n=sc.nextInt();
		 Node temp=head;
		 int count=0;
		 while(temp!=null){
		     count++;
		     temp=temp.next;
		 }
		 if(n==count){
		     head=head.next;
		 }
		 else{
		 temp=head;
		 for(int i=1;i<count-n;i++){
		     temp=temp.next;
		 }
		 if(temp.next!=null){
		     temp.next=temp.next.next;
		 }
		 }
		 temp=head;
		while(temp!=null){
		   System.out.print(temp.data+" ");
		   temp=temp.next;
		}
	}
}
