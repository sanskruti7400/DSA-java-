class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> arr=new ArrayList<>();

        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i); 
        }
        return result;
    }
}
