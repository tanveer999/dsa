class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        new_str = ""
        for i in s:
            if i.isalnum():
                new_str += i

        new_str = new_str.lower()
        start = 0
        end = len(new_str) - 1
        print(len(new_str))
        while start < end:
            if new_str[start] == new_str[end]:
                start += 1
                end -= 1
            else:
                return False
        return True

# s = "A man, a plan, a canal: Panama"
s = " "
print(Solution().isPalindrome(s))
