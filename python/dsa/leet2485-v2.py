class Solution:
    def pivotInteger(self, n: int) -> int:
        
        total = sum(list(range(1, n + 1)))

        lsum = 0

        for i in range(1, n + 1):
            rsum = total - lsum
            lsum += i

            if lsum == rsum:
                return i

        return -1

