/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public String convert(String s) {
        // code here
      String[] arr = s.split(" ");
      for( int i =0; i<arr.length; i++){
          String str =arr[i];
          for( int j =0; j<str.length(); j++){
              String str1 = str.substring(0,1).toUpperCase();
              String str2 = str.substring(1,str.length());
              str = str1+str2;
          }
          arr[i] =str;
      }
      String result = String.join(" ", arr);
      return result;
       
    }
};
