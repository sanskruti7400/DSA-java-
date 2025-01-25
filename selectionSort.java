import java.util.*;

public class selectionSort {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        System.out.println("Enter array elements:");
        int nums[]=new int [size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Array before sorting :");
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
        System.out.println("\nArray after sorting :");
        selectionSort(nums,size);
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    }
    public static void selectionSort(int nums[],int size){
        int min;
        for(int i=0;i<nums.length-1;i++){
            min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
    }
}
