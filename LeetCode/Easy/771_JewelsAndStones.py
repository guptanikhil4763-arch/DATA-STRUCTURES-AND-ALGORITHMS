"""
Problem Link : https://leetcode.com/problems/jewels-and-stones/
Platform     : LeetCode
Difficulty   : Easy
"""

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        dict = {}
        for i in stones:
            if i in dict.keys():
                dict[i] = dict[i]+1
            else :
                dict[i] = 1
        count = 0
        for i in dict:
            if i in jewels:
                count = count + dict[i]
        return count                 
