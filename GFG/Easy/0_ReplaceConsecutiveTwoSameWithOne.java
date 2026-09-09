/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public String removeDuplicates(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
         for(int i =0; i<s.length()-1; i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                sb.append(String.valueOf(s.charAt(i)));
            }
             
         }
         sb.append(s.charAt(s.length()-1));
         
         return sb.toString();
    }
}
