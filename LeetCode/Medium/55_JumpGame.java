/**
 * Problem Link : https://leetcode.com/problems/jump-game/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public boolean canJump(int[] arr) {
    

        int maxReach = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + arr[i]);

            if (maxReach >= arr.length - 1) {
                return true;
            }
        }

        return true;
    }
}
           


    
      
      

     
        


