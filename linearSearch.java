import java.util.*;

public class linearSearch {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array :\n");
        int n=sc.nextInt();
        System.out.println("Enter target element to search:\n");
        int key=sc.nextInt();
        System.out.println("Enter array elements:\n");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=linearSearch(arr,n,key);
        if(res==-1){
            System.out.println("element not found");
        }else{
            System.out.println("the element found at index is :" + res);
        }
    }
    
    public static int linearSearch(int arr[],int n ,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }    

}