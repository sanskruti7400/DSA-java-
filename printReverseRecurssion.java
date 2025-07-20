class Solution {
    public void printNumbers(int n) {
        print(n,1);
    }
    public void print(int n,int i){
        if(n<i){
            return;
        }
        System.out.println(n);
        print(n-1,i);
    }
}
