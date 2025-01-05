from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = dict()

        for item in nums:
            count[item] = count.get(item, 0) + 1


        for key, value in count.items():
            if value > len(nums) // 2:
                return key

nums = [2,2,3]
