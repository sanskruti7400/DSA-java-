class Solution {
    public void printNumbers(int n) {
      print(1,n);
    }
    public void print(int i,int n){
      if(i>n){
        return;
      }
      System.out.println(i);
       print(i+1,n);
    }
}
