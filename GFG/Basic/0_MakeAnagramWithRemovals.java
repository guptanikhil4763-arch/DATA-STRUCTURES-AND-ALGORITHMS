/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/anagram-of-string/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int remAnagram(String s1, String s2) {
        // code here
        int count = 0;
     for( int i =0; i<s1.length(); i++){
         char ch = s1.charAt(i);
         int index = s2.indexOf(ch);
         if( index !=-1){
             s2 =s2.substring(0,index)+s2.substring(index+1,s2.length());
             
             
         }
         else{
             count++;
         }
         
         
         
         
     }
     count =  count +s2.length();
     return count;
    }
};
