class Solution(object):
    def canAliceWin(self, nums):
        single=0
        double=0
        for i in range(len(nums)):
            if nums[i]>9:
                double+=nums[i]
            else:
                single+=nums[i]
        if single!=double:
            return True
        return False