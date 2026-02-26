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
		Node temp=tail;
		while(temp!=null){
		   System.out.print(temp.data+" ");
		   temp=temp.prev;
		}
	}
}
