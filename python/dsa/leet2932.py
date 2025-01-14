class Solution:
    def maximumStrongPairXor(self, nums: List[int]) -> int:
        
        pairs = []

        for i in range(len(nums)):
            for j in range(len(nums)):
                if abs(nums[i] - nums[j]) <= min(nums[i], nums[j]):
                    pairs.append((nums[i], nums[j]))

        out = 0
        for pair in pairs:
            out = max(out, pair[0] ^ pair[1])

        return out
