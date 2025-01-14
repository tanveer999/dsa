from typing import List


class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        n = len(nums) 

        if nums[0] > 0 or nums[n - 1] < 0:
            return n
        neg = pos = 0

        # -ve

        low = 0
        high = n - 1

        while low <= high:

            mid = low + (high - low) // 2

            if nums[mid] < 0:
                neg = mid
                low = mid + 1

            else:
                high = mid  - 1


        # +ve
        low = 0
        high = n - 1
        while low <= high:

            mid = low + (high - low) // 2

            if nums[mid] > 0:
                pos = mid

                high = mid - 1

            else:
                low = mid + 1


        if neg != 0:
            neg += 1

        if pos != 0:
            pos = n - pos

        return max(neg, pos) if neg !=0 or pos !=0 else 0
        


nums = [-3, -2, -1, -1, 1, 3]
nums = [0, 0, 0, 0]
nums = [-2, -1, -1, 0, 0, 0]
print(Solution().maximumCount(nums))
        
