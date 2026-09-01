/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    String firstAlphabet(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
         String[] arr = s.split(" ");
         for( int i =0; i<arr.length; i++){
             String str = arr[i];
             sb.append(str.substring(0,1));
         }
         String ptr = sb.toString();
         return ptr;
    }
};
