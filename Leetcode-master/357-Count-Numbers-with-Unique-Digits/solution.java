public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        
        int res=0;
        int uniqueDigits = 9;
        int availableNumber = 9;
        
        while(n-->1 && availableNumber > 0){
            uniqueDigits *= availableNumber;
            res += uniqueDigits;
            availbleNumber--;
        }
        
        return res;
    }
}