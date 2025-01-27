class Solution:
    def pivotInteger(self, n: int) -> int:
        
        for i in range(1, n + 1):
            left = sum(list(range(1, i + 1)))
            right = sum(list(range(i, n + 1)))
            if left == right:
                return i

        return -1


