# 242

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        t_count = {}
        s_count = {}

        for i in s:
            s_count[i] = s_count.get(i, 0) + 1
        for j in t:
            t_count[j] = t_count.get(j, 0) + 1
        
        return s_count == t_count
    
obj = Solution()
s = 'rat'
t = 'cat'
print(obj.isAnagram(s, t))