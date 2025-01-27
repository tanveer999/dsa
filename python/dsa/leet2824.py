class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        
        nums.sort()
        n = len(nums)
        result = 0

        for i in range(n):

            target_range = self.bs(nums, target - nums[i], i, n)

            result += target_range - i

        return result

    def bs(self, nums, target, low, high):

        while  high - low > 1:

            mid = low + (high - low) // 2


            if target > nums[mid]:

                low = mid

            else:

                high = mid

        return low
