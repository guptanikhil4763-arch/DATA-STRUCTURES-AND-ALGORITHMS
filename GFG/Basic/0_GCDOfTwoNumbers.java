/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(a==0) return b;
        return gcd(b%a , a);
    }
}

