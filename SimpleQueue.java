import java.util.Scanner;

class Queue{
    private int arr[];
    private int front;
    private int rear;

    public Queue(int size){
        front=-1;
        rear=-1;
        arr=new int[size];
    }

    public void push(int val){
        if(isFull()){
            System.out.println("The queue is full");
            return;
        }
        rear++;
        arr[rear]=val;
    }

    public int pop(){
        front++;
        return arr[front];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        return arr[front+1];
    }

    public boolean isFull(){
        return rear==arr.length-1;
    }

    public boolean isEmpty(){
        return rear==front;
    }

    public void display(){
        if(rear==front){
            System.out.println("The queue is Empty");
            return;
        }else{
            for(int i=front+1;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
    }
}

public class SimpleQueue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the queue size you want:");
        int size=sc.nextInt();
        Queue s= new Queue(size);
        while(true){
            System.out.println("Choose the following :");
            System.out.println("1.Push element into the queue.");
            System.out.println("2.Pop the element into the queue.");
            System.out.println("3.Peek element from the queue.");
            System.out.println("4.Check whether the queue is full or not.");
            System.out.println("5.Check whether the queue is empty or not.");
            System.out.println("6.Display the queue.");
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
                    if(element!=-1){
                        System.out.println("The popped element is : "+ element);
                    }else{
                        System.out.println("The queue is empty.");
                    }
                    break;
                case 3:
                    int peek=s.peek();
                    System.out.println("The top element of the queue is : "+peek);
                    break;
                case 4:
                    if(s.isFull()==true){
                        System.out.println("The queue is full");
                    }else{
                        System.out.println("The queue is not-full");
                    }
                    break;
                case 5:
                    if(s.isEmpty()==true){
                        System.out.println("The queue is empty");
                    }else{
                        System.out.println("The queue is not-empty");
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
