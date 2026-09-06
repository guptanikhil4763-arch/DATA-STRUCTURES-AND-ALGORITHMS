/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public static char[] rotate(char []arr, int m, int n){
        int i =m;
        int j = n;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
        
    }
    public static boolean isRotated(String s1, String s2) {
        if(s1.length()==1){
            return false;
        }
        char[] arr = s1.toCharArray();
        char[] arr2 = s1.toCharArray();
            arr = rotate ( arr,0,1);
            arr = rotate(arr,2, arr.length-1);
            arr= rotate(arr,0, arr.length-1);
            arr2 = rotate(arr2,0, arr2.length-3);
            arr2 = rotate(arr2,arr.length-2,arr2.length-1 );
            arr2 = rotate(arr2,0, arr2.length-1);
            String s= new String(arr);
            String str = new String(arr2);
           if(s.equals(s2) || str.equals(s2)){
               return true;
           }
           else{
               return false;
           }
        
    }
}
