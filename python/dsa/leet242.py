class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        word_count = dict()

        for i in s:
            word_count[i] = word_count.get(i, 0) + 1

        for i in t:
            if i not in word_count:
                return False
            word_count[i] -= 1

        for value in word_count.values():
            if value != 0:
                return False

        return True









s = "anagramb"
t = "nagaram"

print(Solution().isAnagram(s, t))
