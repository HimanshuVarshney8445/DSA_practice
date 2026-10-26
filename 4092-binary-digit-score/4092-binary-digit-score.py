class Solution(object):
    def find(self,a):
        count=0
        while a>0:
            r=a%2
            if r==1:
                count+=1
            a//=2
        return count

    def calculateScore(self, a, b):
        s1=self.find(a)
        s2=self.find(b)
        if s1>=s2:
            return s1*s2
        return s2/s1
        