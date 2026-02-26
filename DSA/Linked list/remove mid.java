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
		Node temp=head;
		int n=0;
		while(temp!=null){
		    n++;
		    temp=temp.next;
		}
		int mid=n/2;
		temp=head;
		for(int i=1;i<mid;i++){
		    temp=temp.next;
		    
		}
// 		temp=head;
// 		while(temp!=null&&temp.next!=null){
		    temp.next=temp.next.next;
// 		}
	  temp=head;
 		while(temp!=null){
		   System.out.print(temp.data+" ");
		   temp=temp.next;
 		}
	}
}
