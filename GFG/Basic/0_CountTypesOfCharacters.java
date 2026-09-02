/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/count-type-of-characters3635/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Sol {
    int[] count(String s) {
        // your code here
        int[] arr = new int[4];
        
        for( int i =0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if(ch>='a'&& ch<='z'){
                arr[1]++;
            }
            else if(ch>='A'&& ch<='Z'){
                arr[0]++;
            }
            else if(ch>='0'&& ch<='9'){
                arr[2]++;
            }
            else{
                arr[3]++;
            }
        }
        return arr;
    }
}
