class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        sum = {}

        for index, value in enumerate(nums):
            if target - value in sum:
                return [sum[target - value], index]
            sum[value] = index

nums = [2,7,11,15]
target = 9
print(Solution().twoSum(nums, target))

"""

2
9 -2 = 7, 7 in sum  false
sum = {2,0}

7
9 - 7 = 2, 2 in sum true

return [0, 1]



"""
