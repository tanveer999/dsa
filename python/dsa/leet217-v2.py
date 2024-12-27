class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        items = set()
        for i in nums:
            if i in items:
                return True
            items.add(i)
        
        return False
        
        


nums = [1,2,3,]
print(Solution().containsDuplicate(nums))
