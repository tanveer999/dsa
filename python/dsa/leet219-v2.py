class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        
        count_set = set()

        for index, val in enumerate(nums):

            if index > k:
                count_set.remove(nums[index - (k + 1)])

            if val in count_set:
                return True
            
            count_set.add(val)
        return False
