/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for( int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(sb.indexOf(String.valueOf(ch)) ==-1){
                sb.append(ch);
            }
            
        }
        String result = sb.toString();
        return result;
       
        }
}

