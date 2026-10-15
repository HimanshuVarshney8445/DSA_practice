class Solution(object):
    def sumCounts(self, nums):
        ans=0
        for i in range(len(nums)):
            st=set()
            for j in range(i,len(nums)):
                st.add(nums[j])
                ans+=len(st)*len(st)
        return ans
        