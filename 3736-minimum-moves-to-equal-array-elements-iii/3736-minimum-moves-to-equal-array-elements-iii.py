class Solution(object):
    def minMoves(self, nums):
        mx=0
        count=0
        for i in nums:
            mx=max(mx,i)
        for i in nums:
            count+=abs(i-mx)
        return count