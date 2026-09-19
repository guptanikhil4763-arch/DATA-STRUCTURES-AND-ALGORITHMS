/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/implement-atoi/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int myAtoi(String s) {
        // code here
        long num =0;
            int i=0;
             
            while(i<s.length() && s.charAt(i) ==' ' ){
                i++;
            }
            int sign = 1;
            
            
            int j = i; 
            
             if( j<s.length() &&s.charAt(j)=='+'){
                sign = 1;
                j++;
            }
            else if( j<s.length() && s.charAt(j) =='-' ){
                sign = -1;
                j++;
            }
            long limit;
            if(sign ==-1){
               limit = 2147483648L;
            }
            else {
                limit = 2147483647L;
            }
            
            while(j<s.length()){
               char ch = s.charAt(j);
              
                if(Character.isDigit(ch)){
                int n = ch-'0';
                if(num>((limit-n)/10)){
                    if(sign ==1){
                        return 2147483647;
                    }
                    else{
                        return  -2147483648;
                    }
                }
                num= num*10 + n;
                j++;
            }
            else{
                break;
            }
        }
        return (int)(sign* num);
    }
}
