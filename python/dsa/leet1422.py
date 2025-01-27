class Solution:
    def maxScore(self, s: str) -> int:
        
        ones = 0
        zeroes = 0
        out = 0
        for i in s:
            if i == '1':
                ones += 1
    
        for i in range(len(s) - 1):

            if s[i] == '0':
                zeroes += 1
            else:
                ones -= 1

            out = max(out, ones + zeroes)
        
        return out
print(Solution().maxScore('011101'))
