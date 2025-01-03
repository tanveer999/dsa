class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        
        start = 0
        end = len(nums) - 1

        while start < end:

            mid  = start + (end - start) // 2

            if nums[mid] == target:
                return mid
            
    
            if target > nums[mid]:
                start = mid + 1
            else:
                end = mid - 1

        
        if nums[start] == target:
            return start
        elif target > nums[start]:
            return start + 1
        elif target < nums[start]: 
            return start 
