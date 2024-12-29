class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        k = 0
        i = 1

        while i < len(nums):
            if nums[i] <= nums[k]:
                i += 1
            else:
                k += 1
                nums[k], nums[i] = nums[i], nums[k]
                i += 1

        return k + 1

# nums = [1,1,2]
nums = [0,0,1,1,1,2,2,3,3,4]
print(Solution().removeDuplicates(nums))
