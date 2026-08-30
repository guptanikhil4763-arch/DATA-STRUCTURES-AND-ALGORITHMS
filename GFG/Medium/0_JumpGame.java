/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/jump-game/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public boolean canReach(int[] arr) {
        // code here
   
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
