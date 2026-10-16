class Solution(object):
    def distributeCandies(self, candy):
        freq={}
        for i in range(len(candy)):
            freq[candy[i]]=freq.get(candy[i],0)+1
        n=len(candy)//2
        return min(n,len(freq))