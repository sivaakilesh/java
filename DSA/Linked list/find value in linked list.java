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
	   int n=sc.nextInt();
	   Node head=null;
	   Node tail=null;
	   for(int i=0;i<n;i++){
	      int v=sc.nextInt();
	      Node node=new Node(v);
	      node.next=head;
	      head=node;
	   }
	   int k=sc.nextInt();
	   Node temp=head;
	   boolean found=false;
	   while(temp!=null){
	      if(temp.data==k){
	         found=true;
	         break;
	      }
	      temp=temp.next;
	   }
	    temp=head;
	   while(temp!=null){
	      System.out.print(temp.data+" ");
	      temp=temp.next;
	   }
	   if(found){
	      System.out.println("\n"+"yes");
	   }else{
	      System.out.println("\n"+"no");
	   }
	}
}