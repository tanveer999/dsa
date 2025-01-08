class Solution:
    def findLHS(self, nums: List[int]) -> int:

        freq = dict()

        for i in nums:

            freq[i] = freq.get(i, 0) + 1

        output = 0

        for key, value in freq.items():
            if key - 1 in freq:
                output = max(output, value + freq[key - 1])

        return output
