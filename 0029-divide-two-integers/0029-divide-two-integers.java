class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==-1&&dividend==-2147483648){
            return 2147483647;
         }
        else{
           int c= dividend/divisor;
            return c;
    }
    }
}