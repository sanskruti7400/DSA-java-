import java.util.Scanner;

public class BinaryRecurssive{
     public static int binaryRecurssive(int l,int r,int arr[],int target){
        if(l>r){
            return -1;
        }
        int mid=l+(r-l)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            return binaryRecurssive(mid+1, r, arr, target);
        }else{
            return binaryRecurssive(l, mid-1, arr, target);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be find");
        int target=sc.nextInt();
        int res=binaryRecurssive(0,n-1,arr,target);
        if(res!=-1){
            System.out.println("The element is found at index :" +res);
            return;
        }
        System.out.println("The element is not found");
    }
}
