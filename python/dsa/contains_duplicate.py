# 217
from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        res = dict()

        for num in nums:
            if num in res.keys():
                res[num] += 1
            else:
                res[num] = 1

        flag = False
        for value in res.values():
            if value > 1:
                flag = True
                break
        return flag
    
    def containsDuplicate1(self, nums: List[int]) -> bool:
        res = set()

        for num in nums:
            if num in res:
                return True
            else:
                res.add(num)
        return False

    def containsDuplicate2(self, nums: List[int]) -> bool:
        res = dict()

        for num in nums:
            if num in res and res[num] >= 1:
                return True
            else:
                res[num] = res.get(num, 0) + 1
        return False
        
obj = Solution()
print(obj.containsDuplicate2([1,2,3,4]))

