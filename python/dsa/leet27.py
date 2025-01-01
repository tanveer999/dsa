class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
       
        k = 0
        i = 0

        while i <= len(nums) - 1:
            if nums[i] != val:
                nums[k], nums[i] = nums[i], nums[k]
                k += 1
                i += 1
            else:
                i += 1

        return k

nums = [3,2,2,3]
# nums = [2]
val = 3
print(Solution().removeElement(nums, val))
