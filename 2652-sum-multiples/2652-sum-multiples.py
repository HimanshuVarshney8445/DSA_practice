class Solution(object):
    def sumOfMultiples(self, n):
        sm=0
        for i in range(0,n+1):
            if i%3==0:
                sm+=i
            elif i%5==0:
                sm+=i
            elif i%7==0:
                sm+=i
        return sm
        