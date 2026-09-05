/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr.length ==1){
            return arr[0];
        }
     String pre = arr[0]; 
     for( int i =1; i<arr.length; i++){
         int j =0;
         int k =0;
         while(j<arr[i].length() && k<pre.length()){
             if(arr[i].charAt(j)==pre.charAt(k)){
                 j++;
                 k++;
             }
             else{
                 pre = pre.substring(0,k);
             }
             if(pre.length()==0){
                 return pre;
             }
         }
     }
     return pre;
       
    }
}
