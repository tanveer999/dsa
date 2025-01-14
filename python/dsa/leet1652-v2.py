from typing import List
class Solution:

    def decrypt(self, code: List[int], k: int) -> List[int]:

        if k == 0:
            return [0] * len(code)

        out = [0] * len(code)
        if k > 0:
            
            out[0] = wsum = sum(code[1:k + 1])
            
            for i in range(1, len(code)):

                r = (i + k) % len(code)

                out[i] = out[i - 1] - code[i] + code[r]

        if k < 0:

            out[-1] = wsum = sum(code[-2:k - 2:-1])

            for i in range(-2, -len(code) - 1, -1):
                l = (i - k) % len(code)

                out[i] = out[i + 1] - code[i] + code[l]
                

        return out


code = [2,4,9,3]
k = -2
print(Solution().decrypt(code, k))

