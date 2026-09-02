/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-the-camel3348/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Sol {
    int countCamelCase(String s) {
        int count =0;
        // your code here
        for( int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch==Character.toUpperCase(ch) ){
                count++;
            }
        }
        return count;
    }
}
