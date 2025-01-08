class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        
        if k == 1:
            return 0
    
        min_diff = 2 * (10 ** 5)

        sorted_nums = sorted(nums)

        for i in range(k - 1, len(nums)):
            min_diff = min(min_diff, sorted_nums[i] - sorted_nums[i - (k - 1)])

        return min_diff
