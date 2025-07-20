class Solution {
    public boolean isArmstrong(int n) {
        int r=0,c=0,s=0,x=n;
        while(n>0){
            r=n%10;
            c=r*r*r;
            s=s+c;
            n=n/10;
        }
        if(x==s){
            return true;
        }
        return false;
    }
}
