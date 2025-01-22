import java.util.*;

public class binarySeaarch {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:\n");
        int n=sc.nextInt();
        System.out.println("Enter the targeted element :\n");
        int target=sc.nextInt();
        System.out.println("Enter the array elements :\n");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=binary(arr,n,target);
        if(res==-1){
            System.out.println("not found");
        }else{
            System.out.println("found at index "+res);
        }
    }
    public static int binary(int arr[],int n,int target){
        int high=n-1,low=0;
        int mid;
        while(low<high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}