# 189
from typing import List

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if k == 0 or k % len(nums) == 0:
            return
        self.reverse(nums, 0, len(nums) - 1)
        self.reverse(nums, 0, (k % len(nums)) - 1)
        self.reverse(nums, k % len(nums), len(nums) - 1)
        
    def reverse(self, nums, start, end):
        while start < end:
            if end > len(nums) - 1:
                return
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1

nums = [1,2,3,4,5,6,7]
k = 3

Solution().rotate(nums, k)