/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/red-or-green5711/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int redOrGreen(String s){
        // code here
     int red = 0;
     int green = 0;
     for ( int i = 0; i<s.length(); i++){
         if(s.charAt(i) =='R'){
             red++;
         }
         else{
             green++;
         }
     }
     return Math.min(green,red);
     
    }
}
