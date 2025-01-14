from typing import List
class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        
        nums.sort()

        low = 0
        high = len(nums) - 1

        while low < high:

            mid = low + (high - low) // 2

            if target < nums[mid]:

                high = mid - 1

            elif target > nums[mid]:

                low = mid + 1

            else:

                low = mid
                high = mid

                while low >= 0 and nums[low] == target:
                    low -= 1

                while high < len(nums) and nums[high] == target:
                    high += 1

                break

        return list(range(low + 1, high))

nums = [1,2,5,2,3]
t = 3
print(Solution().targetIndices(nums, t))
