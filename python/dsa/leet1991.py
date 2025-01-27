class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        
        r = 0

        for i in nums:
            r += i

        l = 0

        for i,val in enumerate(nums):

            r = r - val

            if r == l:
                return i

            l += val

        return -1
