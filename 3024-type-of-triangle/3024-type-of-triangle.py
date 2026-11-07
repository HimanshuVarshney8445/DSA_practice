class Solution(object):
    def triangleType(self, nums):
        if (nums[0] + nums[1] <= nums[2] or
            nums[1] + nums[2] <= nums[0] or
            nums[0] + nums[2] <= nums[1]):
            return "none"
        temp=len(set(nums))
        if temp==1:
            return "equilateral"
        elif temp==3:
            return "scalene"
        else:
            return "isosceles"
        