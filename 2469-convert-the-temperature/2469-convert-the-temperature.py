class Solution(object):
    def convertTemperature(self, celsius):
        kl = celsius + 273.15
        fr = celsius*1.8 + 32
        return [kl,fr]
        