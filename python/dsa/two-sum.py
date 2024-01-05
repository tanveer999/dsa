# 1
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res = {}

        for index, key in enumerate(nums):
            if (target - key) in res:
                return [res[target - key], index]
            else:
                res[key] = index

        return []

obj = Solution()

nums = [2,7,11,15]
target = 9

print(obj.twoSum(nums, target))