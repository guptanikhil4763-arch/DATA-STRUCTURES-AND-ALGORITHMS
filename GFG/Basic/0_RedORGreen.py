"""
Problem Link : https://practice.geeksforgeeks.org/problems/red-or-green5711/1
Platform     : GFG
Difficulty   : Basic
"""

class Solution:
    def redOrGreen(self, s: str) -> int:
        # code here
        if(len(set(s)))==1:
            return 0;
        dict = {}
        for i  in s:
            if i in dict.keys():
                dict[i] = dict[i] +1;
            else:
                dict[i] =1
        min =999999999999999999999999999999999999
        for i in dict.keys():
            if dict[i]<min:
                min = dict[i]
        return min                
            
            
