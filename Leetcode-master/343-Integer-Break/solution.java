public class Solution {
    public int integerBreak(int n) {
        int result = 1;
        if(n==3){
            return 2;
        }
        
        if (n==2){
            return 1;
        }
        
        if(n<2){
            return 0;
        }
        
        while(n>4){
            result *= 3;
            n-=3;
        }
        
        
        result *= n;
        
        return result;
    }
}