/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public String modify(String s) {
		// code here
		char[] arr = s.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u') {
				i++;
			}
			 if (arr[j] != 'a' && arr[j] != 'e' && arr[j] != 'i' && arr[j] != 'o' && arr[j] != 'u') {
				j--;
			}
			
			 if ((arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
			
				 && (arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u')) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
		}
		String str = new String(arr);
		return str;
		
	}
}

