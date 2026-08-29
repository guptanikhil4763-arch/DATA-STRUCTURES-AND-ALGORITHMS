"""
Problem Link : https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1
Platform     : GFG
Difficulty   : Easy
"""

class Solution:

	
	def removeDuplicates(self, s):
	    dict ={}
	    for i in s:
	        if i in dict.keys():
	            dict[i] = dict[i]+1;
	        else:
	           dict[i] =1;
	    string = ""
	    for i in dict.keys():
	        
	        
	        string= string+i
	   
	    return string
