from typing import List
from collections import defaultdict

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        nums_set = set(nums)
        count = 0
        for i in nums:
            if i - 1 in nums_set:
                continue
            longest = 1
            while i + longest in nums_set:
                longest += 1
            count = max(count, longest)
        
        return count

nums = [100,4,200,1,3,2]

print(Solution().longestConsecutive(nums))