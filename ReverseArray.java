class Solution {
    public void reverse(int[] arr, int n) {
        rev(arr,0,n-1);
    }
    public void rev(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        rev(arr,l+1,r-1);
    }
}

