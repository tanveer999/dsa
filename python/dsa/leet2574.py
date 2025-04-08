from typing import List
class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        n = len(nums)
        lsum = [0] * n
        rsum = [0] * n

        for i in range(1, n):
            lsum[i] = lsum[i - 1] + nums[i - 1]

        for i in range(-2, -n - 1, -1):
            rsum[i] = rsum[i + 1] + nums[i + 1]

        print(lsum)
        print(rsum)

        out = [0] * n
        for i in range(n):
            out[i] = abs(lsum[i] - rsum[i])

        return out

Solution().leftRightDifference([10,4,8,3])
