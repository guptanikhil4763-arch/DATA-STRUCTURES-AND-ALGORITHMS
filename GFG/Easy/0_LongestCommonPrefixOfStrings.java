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
      StringBuilder sb = new StringBuilder();
       int i =0;
       int j =0;
       while(i<arr[0].length() && j<arr[1].length()){
           if(arr[0].charAt(i)==arr[1].charAt(j)){
               sb.append(String.valueOf(arr[0].charAt(i)));
               i++;
               j++;
           }
           else if (arr[0].charAt(i)!=arr[1].charAt(j)){
              break;
           }
           
           
       }
      for( int k = 2; k<arr.length; k++){
          int l =0;
          int m =0;
          while(l<sb.length() && m<arr[k].length()){
              if(sb.charAt(l)==arr[k].charAt(m)){
                  l++;
                  m++;
              }
              else{
                  for( int n = l; n<sb.length(); n++){
                      sb.deleteCharAt(n);
                  }
              }
          }
      
     }
       return sb.toString();
       
       
    }
}
