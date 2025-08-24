import java.util.Scanner;

class LinearQueue{
    private int arr[];
    private int front=-1;
    private int rear=-1;

    public LinearQueue(int size){
        arr=new int[size];
        front=-1;
        rear=-1;
    }

    public void enqueue(int val){
        if(isFull()){
            System.err.println("The queue is full");
            return;
        }
        if(isEmpty()){
            front=0;
        }
        rear=(rear+1)%arr.length;
        arr[rear]=val;
    }

    public int dequeue(){
        int element=arr[front];
        if(isEmpty()){
            return -1;
        }
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%arr.length;
        }
        return element;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public boolean isFull(){
        return (rear+1)%arr.length==front;
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public void display(){
    if(isEmpty()){
        System.out.println("The queue is empty");
        return;
    }
    if(front <= rear){
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
    } else {
        for(int i = front; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
    }
    System.out.println();
}

}
public class CircularQueue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the queue size you want:");
        int size=sc.nextInt();
        LinearQueue s= new LinearQueue(size);
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
                    s.enqueue(val);
                    break;
                case 2:
                    int element=s.dequeue();
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
