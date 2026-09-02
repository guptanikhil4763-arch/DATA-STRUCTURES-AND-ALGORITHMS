/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/java-strings-set-15112/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String s3 = s1+s2;
        char[] arr = s3.toCharArray();
        int i =0; 
        int j =arr.length-1;
        while( i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String s = new String(arr);
        return s;
    }
}
