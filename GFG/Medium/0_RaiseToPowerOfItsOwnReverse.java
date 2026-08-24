/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        int call = power(a,b/2);
        if(b%2==0){
            return call*call;
        }
        else{
            return a*call*call;
        }
    }
    
    public int reverseExponentiation(int n) {
    if(n==10){
        return 10;
    }
    return power(n,n);
        
    }
}

