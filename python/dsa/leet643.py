class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        sum = 0
        for i in range(k):
            sum += nums[i]

        max_avg = sum / k

        for i in range(k, len(nums)):

            sum = sum + nums[i] - nums[i - k]

            max_avg = max(max_avg, sum / k)

        return max_avg
