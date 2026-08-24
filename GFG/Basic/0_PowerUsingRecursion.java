/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/power-using-recursion/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static int power( int a, int b){
        if(b ==0 ){
            return 1;
        }
        return  a*power(a,b-1);
    }
    public int recursivePower(int n, int p) {
        // code here
      return power(n,p);
        }
}

