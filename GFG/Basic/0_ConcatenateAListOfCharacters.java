/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/convert-a-list-of-characters-into-a-string5142/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public String charToStr(String[] arr) {
        // code here
       StringBuilder sb = new StringBuilder();
       for( int i=0; i<arr.length; i++){
           sb.append(arr[i]);
       }
       return sb.toString();
    }
}
