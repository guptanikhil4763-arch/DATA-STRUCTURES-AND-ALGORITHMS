/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/run-length-encoding/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int count =1;
        for( int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                
            }
            else{
                sb.append(String.valueOf(ch));
                sb.append(String.valueOf(count));
                count =1;
                
            }
        }
        sb.append(String.valueOf(s.charAt(s.length()-1)));
        sb.append(String.valueOf(count));
        
        return sb.toString();
    }
}
