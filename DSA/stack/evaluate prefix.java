import java.util.*;
class Stack{
    int arr[];
    int top;
    int size;
    Stack(int size){
        arr=new int[size];
        top=-1;
        this.size=size;
    }
    void push(int val){
        arr[++top]=val;
    }
    int pop(){
        return arr[top--];
    }
    void peek(){
        System.out.print(arr[top]);
    }
     void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
public class Main{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      String pre=sc.next();
       Stack st=new Stack(pre.length());
      for(int i=pre.length()-1;i>=0;i--){
         char ch=pre.charAt(i);
         if(Character.isDigit(ch)){
            st.push(ch-'0');
         }else{
            int a=st.pop();
            int b=st.pop();
            
            switch(ch){
               case '+':st.push(a+b);break;
               case '-':st.push(a-b);break;
               case '*':st.push(a*b);break;
               case '/':st.push(a/b);break;
            }
         }
      }
      System.out.print(st.pop());
   }
}