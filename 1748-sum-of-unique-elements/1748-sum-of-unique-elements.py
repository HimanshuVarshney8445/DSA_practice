class Solution(object):
    def sumOfUnique(self, nums):
        freq={}
        ans=0
        for i in nums:
            freq[i]=freq.get(i,0)+1
        for i in freq:
            if freq[i]==1:
                ans+=i
        return ans
        