/**
 * Problem Link : https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int minimumPushes(String word) {
        int sum =0;
        int press= 0;
        int i =0;
        while( i<word.length()){
        if( i<8){
            sum = sum+1;
            i++;
        }
        else if( i<16){
            sum=sum+2;
            i++;
        }
        else if(i<24){
            sum =sum+3;
            i++;
        }
        else{
            sum =sum+4;
            i++;
        }

        }
        return sum;

        
    }
}
