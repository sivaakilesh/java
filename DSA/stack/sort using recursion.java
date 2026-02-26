import java.util.Scanner;
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
    int peek(){
        return arr[top];
    }
      boolean isEmpty() {
        return top == -1;
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    void sort(){
        if(!isEmpty()){
        int temp=pop();
        sort();
        insertsort(temp);
        }
    }
        void insertsort(int val){
        if(isEmpty()||val>peek()){
            push(val);
        }else{
            int top=pop();
            insertsort(val);
            push(top);
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Stack st=new Stack(a);
        for(int i=0;i<a;i++){
            int v=sc.nextInt();
            st.push(v);
        }
        st.sort();
        st.display();
    }
}