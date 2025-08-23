import java.util.Scanner;

class Stack{
    private int top;
    private int arr[];

    public Stack(int size){
        top=-1;
        arr=new int[size];
    }

    public void push(int val){
        if(top==arr.length-1){
            System.out.println("The stack is full.");
            return;
        }
        top++;
        arr[top]=val;
    }

    public int pop(){
        int ele=arr[top];
        top--;
        return ele;
    }

    public int peek(){
        return arr[top];
    }

    public boolean isFull(){
        return top==arr.length-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void display(){
        if(top==-1){
            System.out.println("The stack is Empty .");
        }else{
            for(int i=arr.length-1;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
}
public class SimpleStack{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the stack size you want:");
        int size=sc.nextInt();
        Stack s= new Stack(size);
        while(true){
            System.out.println("Choose the following :");
            System.out.println("1.Push element into the stack.");
            System.out.println("2.Pop the element into the stack.");
            System.out.println("3.Peek element from the stack.");
            System.out.println("4.Check whether the stack is full or not.");
            System.out.println("5.Check whether the stack is empty or not.");
            System.out.println("6.Display the stack.");
            System.out.println("7.Exit the code");
            int operation=sc.nextInt();

            switch(operation) {
                case 1:
                    System.out.println("Enter the value you want to insert:");
                    int val=sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    int element=s.pop();
                    System.out.println("The popped element is : "+ element);
                    break;
                case 3:
                    int peek=s.peek();
                    System.out.println("The top element of the stack is : "+peek);
                    break;
                case 4:
                    if(s.isFull()==true){
                        System.out.println("The stack is full");
                    }else{
                        System.out.println("The stack is not-full");
                    }
                    break;
                case 5:
                    if(s.isEmpty()==true){
                        System.out.println("The stack is empty");
                    }else{
                        System.out.println("The stack is not-empty");
                    }
                    break;
                case 6:
                    s.display();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

