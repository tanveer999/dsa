from typing import List
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        
        count_set = set()

        i = 0
        while i < len(nums) and i < k + 1:
            if nums[i] in count_set:
                return True
            count_set.add(nums[i])
            # print(count_set)
            i += 1

        i = k + 1
        while i < len(nums):
            # print(i)
            # print(f'removing item {nums[i - (k + 1)]}')
            count_set.remove(nums[i - (k + 1)])
            # print(f'count_set after removing {count_set}')
            if nums[i] in count_set:
                return True
            count_set.add(nums[i])
            # print(f'after adding new item: {count_set}')
            i += 1

        return False
        # for i in range(k + 1):
        #
        #     if nums[i] in count_set:
        #         return True
        #
        #     count_set.add(nums[i])
        #     print(count_set)
        #     
        # for index, item in enumerate(nums[k:len(nums) - k]):
        #
        #     if nums[index - k] in count_set: 
        #         count_set.remove(nums[index - k]) 
        #     if item in count_set:
        #         return True
        #     count_set.add(item)
        #
        # return False


nums = [1,2,3,1]
nums = [1,0,1,1]
k = 1
print(Solution().containsNearbyDuplicate(nums, k))
