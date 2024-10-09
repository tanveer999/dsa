class Solution:
    def isPalindrome(self, x: int) -> bool:

        if x < 0:
            return False
        cur = x
        rev = 0

        # 12
        while x != 0:
            rem = x % 10
            rev = rev * 10 + rem
            x = x // 10

        return rev == cur

print(Solution().isPalindrome(12))