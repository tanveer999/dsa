class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """

        end = len(digits) - 1

        while end >= 0:
            sum = digits[end] + 1

            if sum != 10:
                digits[end] = sum
                return digits
            else:
                digits[end] = 0
                end -= 1

        return [1] + digits

# digits = [1,2,3]
digits = [9]
print(Solution().plusOne(digits))
