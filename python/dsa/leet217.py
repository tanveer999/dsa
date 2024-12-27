class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
       
        nums.sort()
        
        for i in range(len(nums) - 1):
            if nums[i + 1] == nums[i]:
                return True
        
        return False


nums = [1,2,3,1]

print(Solution().containsDuplicate(nums))
