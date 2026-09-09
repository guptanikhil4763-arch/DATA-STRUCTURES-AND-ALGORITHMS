/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/pangram-checking-1587115620/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public static boolean checkPangram(String s) {
        // code here
        int[] arr = new int[26];
        for(int i =0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch>='a' && ch<='z'){
           int index = ch-'a';
           arr[index]++;
            }
            
        }
        for( int j=0; j<arr.length; j++){
            if(arr[j]==0){
                return false;
            }
        }
        return true;
    }
}
