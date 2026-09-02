/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    static String delAlternate(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i<s.length()){
            if( i%2==0){
                sb.append(String.valueOf(s.charAt(i)));
            }
            i++;
        }
        String str = sb.toString();
        return str;
        
    }
}
