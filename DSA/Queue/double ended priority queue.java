import java.util.*;
class Node{
   int data;
   Node prev;
   Node next;
   Node (int val){
      this.data=val;
      this.next=null;
      this.prev=null;
   }
}
class LinkedlistQueue{
   Node front=null;
   Node rear=null;
   boolean isEmpty(){
         return front==null;
      }
   void insert(int val){
      Node newnode=new Node(val);
      if(isEmpty()){
         front=rear=newnode;
      }
      if(val<=front.data){
         newnode.next=front;
         front.prev=newnode;
         front=newnode;
         return;
         
      }
      if(val>=rear.data){
         rear.next=newnode;
         newnode.prev=rear;
         rear=newnode;
         return;
      }
      Node temp=front;
      while(temp!=null&&temp.data<val){
         temp=temp.next;
      }
      newnode.prev=temp.prev;
      newnode.next=temp;
      temp.prev.next=newnode;
      temp.prev=newnode;
   }
   void deletemin(){
      if(isEmpty()){
         System.out.print("empty");
         return;
      }
      if(front==rear){
         front=rear=null;
      }else{
         front=front.next;
         front.prev=null;
      }
   }
   void deletemax(){
      if(isEmpty()){
         System.out.print("empty");
         return;
      }
      if(front==rear){
         front=rear=null;
      }else{
         rear=rear.prev;
         rear.next=null;
      }
   }
   void maxelement(){
      System.out.print(rear.data);
      return;
   }
   void minelement(){
      System.out.print(front.data);
      return;
   }
   void display(){
      Node temp=front;
      while(temp!=null){
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
   }
}
public class Main{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      LinkedlistQueue ll=new LinkedlistQueue();
      System.out.print("1.insert  2.deletemin 3. deletemax  4.display 5.maxelement  6. minelement");
      while(true){
         int n=sc.nextInt();
         switch(n){
            case 1:
               int v=sc.nextInt();
               for(int i=0;i<v;i++){
                  int k=sc.nextInt();
                  ll.insert(k);
               }
               break;
            case 2:
               ll.deletemin();
               break;
            case 3:
               ll.deletemax();
               break;
            case 4:
               ll.display();
               break;
            case 5:
               ll.maxelement();
               break;
            case 6:
               ll.minelement();
               break;
            case 7:
               System.exit(0);
            default:
            System.out.print("invalid choice...");
            break;
         }
      }
   }
}