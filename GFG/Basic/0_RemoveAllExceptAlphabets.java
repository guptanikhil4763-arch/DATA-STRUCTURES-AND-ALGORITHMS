/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-all-characters-other-than-alphabets4923/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public String removeChars(String s) {
        // code here
        StringBuilder sb =  new StringBuilder();
        for( int i =0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z' ){
                sb.append(String.valueOf(s.charAt(i)));
            }
        }
        return sb.toString();
    }
};
