class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k = 0

        for index, item in enumerate(nums):
            if item == 0:
                continue
            
            nums[index], nums[k] = nums[k], nums[index]
            k += 1



