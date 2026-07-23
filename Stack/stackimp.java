package Stack;

import java.util.LinkedList;

// class stackimp {
//     int top;
//     int arr[];
//     int size;
//     stackimp(int size){
//         this.size=size;
//         arr=new int[size];
//         top=-1;
//     }
//     void push(int data){
//         if(top==size-1){
//             System.out.println("Stack is full");
//         }
//         else{
//             top++;
//             arr[top]=data;
//         }
//     }
//     int pop(){
//         if(top==-1){
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         else{
//             top--;
//             return arr[top+1];
//         }
//     }
//     int peek(){
//         if(top==-1){
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         else{
//             return arr[top];
//         }
//     }
//     public static void main(String[] args) {
//         stackimp s = new stackimp(5);
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         System.out.println("Top element is: " + s.peek());
//         System.out.println("Popped element: " + s.pop());
//         System.out.println("New top element: " + s.peek());
//     }
// }
//Implementation of stack via Linked Lists
class stackimp{
    private class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top;
    int cap;
    int currsize;
    stackimp(int cap){
        if (cap <= 0) {
        throw new IllegalArgumentException("Stack capacity must be greater than 0!");
        }
        else if(cap>10){
            throw new IllegalArgumentException("Stack capacity must be lesser than 10!");
        }
        this.cap=cap;
        this.top=null;
        this.currsize=0;
    }
    void push(int data){
        if(currsize==cap){
            System.out.println("Stack is full");
            return;
        }
        Node newnNode=new Node(data);
        newnNode.next=top;
        top=newnNode;
        currsize++;
    }
    int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int popped=top.data;
        top=top.next;
        currsize--;
        return popped;
    }
    int peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public static void main(String[] args) {
        stackimp s = new stackimp(10);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}