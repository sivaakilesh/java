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
		int val=sc.nextInt();
		Node newNode=new Node(val);
		if(n==0){
		    newNode.next=head;
		    head=newNode;
		}else{
		Node temp=head;
		for(int i=0;i<n-1&&temp!=null;i++){
		    temp=temp.next;
		}
		if(temp==null){
		    System.out.print("out of range");
		    return;
		}
		 newNode.next=temp.next;
		 temp.next=newNode;
	}
		 Node temp=head;
		while(temp!=null){
		   System.out.print(temp.data+" ");
		   temp=temp.next;
		}
	}
}
