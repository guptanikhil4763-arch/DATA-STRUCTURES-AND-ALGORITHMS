/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-string1818/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Sol {
    Boolean check(String s) {
        // your code here
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for( int i =0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
