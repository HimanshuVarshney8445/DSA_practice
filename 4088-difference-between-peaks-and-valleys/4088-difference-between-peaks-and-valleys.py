class Solution(object):
    def peakValleyDifference(self, nums):
        peakSum=0
        valleySum=0
        for i in range(1,len(nums)-1):
            if nums[i]>nums[i-1] and nums[i]>nums[i+1]:
                peakSum+=nums[i]
            if nums[i]<nums[i-1] and nums[i]<nums[i+1]:
                valleySum+=nums[i]
        return peakSum-valleySum