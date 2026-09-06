/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/for-loop-2/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static void utility(String s) {
        // code here
        for(int i =0; i<s.length(); i++){
            if( i%2==0){
            System.out.print(s.charAt(i));
            }
        }
    }
}
