class Solution(object):
    def maxAlternatingSum(self, nums):
        temp=[]
        for i in range(len(nums)):
            num = nums[i]*nums[i]
            temp.append(num)
        temp.sort()
        ans=0
        i=0
        j=len(nums)-1
        while i<j:
            ans+=(temp[j]-temp[i])
            i+=1
            j-=1
        if len(nums)%2!=0:
            ans+=temp[len(nums)//2]
        return ans
        