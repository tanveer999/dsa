from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        temp_dict = dict()

        for index, val in enumerate(nums):
            if target - val in temp_dict:
                return [temp_dict[target - val],index]
            else:
                temp_dict[val] = index

nums = [2,7,11,15]
target = 9

print(Solution().twoSum(nums, target))