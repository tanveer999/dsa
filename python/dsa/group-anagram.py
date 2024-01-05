# 49
from typing import List

class Solution:
    def groupAnagrams1(self, strs: List[str]) -> List[List[str]]:
        """
        
        """
        anagram = {}

        for str in strs:
            sort_str = ''.join(sorted(str))

            if sort_str not in anagram.keys():
                anagram[sort_str] = []
            
            if sort_str in anagram.keys():
                anagram[sort_str].append(str)

        output = []

        for value in anagram.values():
            output.append(value)

        return output

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
       
        anagrams = []
        visited = [False] * len(strs)
        for i in range(len(strs)):
            if visited[i]:
                continue
            group = [strs[i]]
            for j in range(i + 1, len(strs)):
                if self.isAnagram(strs[i], strs[j]):
                    group.append(strs[j])
                    visited[j] = True
            visited[i] = True
            anagrams.append(group)
            
        return anagrams

    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False

        s_count = {}
        t_count = {}

        for i in s:
            s_count[i] = s_count.get(i, 0) + 1

        for j in t:
            t_count[j] = t_count.get(j, 0) + 1

        return s_count == t_count
    
obj = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]

print(obj.groupAnagrams1(strs))