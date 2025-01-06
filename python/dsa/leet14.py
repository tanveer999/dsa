class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        
        sorted_strs = sorted(strs, key=len)

        out = ""
        for index, value in enumerate(sorted_strs[0]):

            j = 1
            
            while j < len(sorted_strs):
                if sorted_strs[j][index] == value:
                    j += 1
                    continue
                else:
                    return out
            
            out += value

        return out
