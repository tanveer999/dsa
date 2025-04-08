class Solution:
    def maxScore(self, s: str) -> int:
        zero_count = 0
        one_count = 0

        for i in s:
            if i == '1':
                one_count += 1

        out = 0
        
        for i in range(1, len(s)):
            if s[i - 1] == '0':
              zero_count += 1
            else:
              one_count -= 1

            out = max(out, zero_count + one_count)

        out = max(out, zero_count + one_count)

        return out
            