class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        out = ''
        
        match_index=0

        for index,val in enumerate(word):
          if val == ch:
              match_index = index
              break
          
        for i in range(match_index,-1,-1):
          out += word[i]

        for i in range(match_index + 1, len(word)):
          out += word[i]

        return out