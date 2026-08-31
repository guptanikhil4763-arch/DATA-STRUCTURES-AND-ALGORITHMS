/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-vowels-from-string1446/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder sb =  new StringBuilder();
        for( int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch =='e'||ch =='i'||ch=='o'||ch=='u'  ){
                continue;
            }
            else{
                sb.append(String.valueOf(ch));
            }
        }
        String str =sb.toString();
        return str;
    }
}
