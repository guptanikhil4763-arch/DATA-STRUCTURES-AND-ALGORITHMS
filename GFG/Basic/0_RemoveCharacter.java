/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-character3815/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str1.length(); i++){
            char ch =  str1.charAt(i);
            if(str2.indexOf(ch)==-1){
                sb.append(String.valueOf(ch));
            }
        }
        String str = sb.toString();
        return str;
    }
}
