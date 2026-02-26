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
		   }
		}
		int n=sc.nextInt();
		 while (head != null && head.data == n) {
            head = head.next;
        }
		Node temp=head;
		
		while(temp!=null&&temp.next!=null){
	    if(temp.next.data==n){
	    temp.next=temp.next.next;
	    }
	    else{
	        temp=temp.next;
	    }
		}
		 temp=head;
		while(temp!=null){
		   System.out.print(temp.data+" ");
		   temp=temp.next;
		}
	}
}
