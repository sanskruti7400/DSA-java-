import java.util.*;

public class bubbleSort{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array before sorting:");
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("\narray after sorting:");
        bubblesorting(arr,size);
        for(int i=0;i<size;i++){
            System.out.println(" "+arr[i]);
        }
    }
    public static void bubblesorting(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}