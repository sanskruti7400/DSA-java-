class Solution {
    public int NnumbersSum(int N) {
        return getSum(N);
    }
    public int getSum(int n){
        int i=n;
        if(n<i){
            return 0;
        }
        int s=n;
        s=s+getSum(n-1);
        return s;
    }
}
