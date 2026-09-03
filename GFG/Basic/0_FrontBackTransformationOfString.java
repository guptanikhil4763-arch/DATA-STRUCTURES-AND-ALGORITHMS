/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/front-back-transformation1659/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    String transformString(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for( int  i =0; i<s.length(); i++){
            char ch = s.charAt(i);
           if(ch>='a' && ch<='z'){
               int num = ch -'a'+1;
               sb.append(String.valueOf((char)(123-num)));
               
               
           }
           else if(ch>='A' && ch<='Z'){
               int num = ch -'A'+1;
               sb.append(String.valueOf((char)(91-num)));
           }
        }
        return sb.toString();
    }
}
