public class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] word = s.toCharArray();
        
        int i = 0;
        int j = s.length() - 1;
        
        
        while(i < j){
            while(i<j && !vowels.contains(word[i] + "")){
                i++;
            }
            
            while(i<j && !vowels.contains(word[j] + "")){
                j--;
            }
            
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            
            i++;
            j--;
        }
        
        return new String(word);
        
    }
}