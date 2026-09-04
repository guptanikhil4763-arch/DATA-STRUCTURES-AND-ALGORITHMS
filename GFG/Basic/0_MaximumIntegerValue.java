/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/maximum-integer-value1434/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int maximumIntegerValue(String s) {

     int ans = 0;
     for(int i = 0;i<s.length();i++){
         int a = s.charAt(i)-'0';
         ans=Math.max(ans*a,ans+a);
     }
     return ans;
      
      
    }
}
