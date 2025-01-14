from typing import List


class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:

        if k == 0:
            return [0] * len(code)

        out = [0] * len(code)
        if k > 0:

            for index, value in enumerate(code):
                sum = 0
                for j in range(k):
                    sum += code[(j + index + 1) % len(code)]

                out[index] = sum
        if k < 0:
            for i in range(len(code)):
                sum = 0

                for j in range(abs(k)):
                    sum += code[(i - 1 - j) % len(code)]

                out[i] = sum

        return out


code = [5, 7, 1, 4]
k = -2

print(Solution().decrypt(code, k))
