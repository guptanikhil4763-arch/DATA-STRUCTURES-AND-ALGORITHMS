/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/extract-maximum2943/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    static int extractMaximum(String s) {
        // code here
        int current =0;
        int max =-1;
        boolean found = false;
        for( int i =0; i<s.length(); i++){
           
            char ch =  s.charAt(i);
            if(ch>='0' && ch<='9'){
                found =  true;
                int num = ch-'0';
                current = current*10 + num;
                
                
            }
            else{
                if(max<current){
                    max = current;
                }
                current = 0;
            }
        }
        if(current>max){
            max = current;
        }
        if(found == false ){
            return -1;
        }
        else{
        
        return max;
        }
    }
}

