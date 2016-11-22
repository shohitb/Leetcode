public class Solution {
    public int getSum(int a, int b) {
        
        int c = a ^ b;
        
        int d = (a&b) << 1;
        
        if(d == 0){
            return c;
        }
        
        else{
            
            return getSum(c, d);
        }
        
        
    }
}