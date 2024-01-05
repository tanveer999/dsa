# 347
from typing import List

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}

        for num in nums:
            count[num] = count.get(num, 0) + 1
        
        # print(count)

        frequency = list(count.values())

        sorted_frequency = sorted(frequency, reverse=True)

        top_k_frequency = sorted_frequency[:k]
        # print(top_k_frequency)

        output = []
        for key, val in count.items():
            if val in top_k_frequency:
                output.append(key)

        return output


nums = [4,1,-1,2,-1,2,3]
k = 2

print(Solution().topKFrequent(nums, k))