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
    void peek(){
        System.out.print(arr[top]);
    }
    void increment(int k,int val){
        int n=Math.min(k,size);
        for(int i=0;i<n;i++){
            arr[i]+=val;
        }
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
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
        int k = sc.nextInt();
        int val = sc.nextInt();
        st.increment(k,val);
        st.display();
    }
}