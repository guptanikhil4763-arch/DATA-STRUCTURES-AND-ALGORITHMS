"""
Problem Link : https://leetcode.com/problems/sum-of-unique-elements/
Platform     : LeetCode
Difficulty   : Easy
"""

class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        dict = {}
        for i in nums:
            if i in dict.keys():
                dict[i] = dict[i] +1
            else:
                dict[i] = 1

        sum = 0
        for i in dict:
            if dict[i] == 1:
                sum = sum +i
        return sum                           
        
