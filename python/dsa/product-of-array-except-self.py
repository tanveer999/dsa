# 238
from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        """
        [1, 1, 2, 6]
        [,,8,6]

        """
        prod = []

        left_prod = 1
        for i in nums:
            prod.append(left_prod)
            left_prod *= i

        right_prod = 1
        for i in range(len(nums) - 1, -1, -1):
            prod[i] *= right_prod
            right_prod *= nums[i]

        return prod
    
    def productExceptSelf1(self, nums: List[int]) -> List[int]:

        """
        [1, 1, 2, 6]
        [,,8,6]

        """
        pre_prod = [1] * len(nums)
        post_prod = [1] * len(nums)

        for i in range(1, len(nums)):
            pre_prod[i] = nums[i - 1] * pre_prod[i - 1]

        for i in range(len(nums) - 2, -1, -1):
            post_prod[i] = nums[i + 1] * post_prod[i + 1]
        
        return [pre_prod[i] * post_prod[i] for i in range(len(nums))]
    

    def productExceptSelf2(self, nums: List[int]) -> List[int]:

        """
        [1, 1, 2, 6]
        [,,8,6]

        """
        pre_prod = [1] * len(nums)

        for i in range(1, len(nums)):
            pre_prod[i] = nums[i - 1] * pre_prod[i - 1]

        post = 1
        for i in range(len(nums) - 1, -1, -1):
            # post_prod[i] = nums[i + 1] * post_prod[i + 1]
            pre_prod[i] = pre_prod[i] * post
            post *= nums[i]
        
        return pre_prod

nums = [1,2,3,4]

print(Solution().productExceptSelf2(nums))