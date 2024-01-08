from typing import List
from collections import defaultdict

class Solution:
    def checkValid(self, matrix: List[List[int]]) -> bool:
        row = defaultdict(set)
        col = defaultdict(set)

        for i in range(len(matrix)):
            for j in range(len(matrix)):
                if matrix[i][j] in row[i] or matrix[i][j] in col[j]:
                    return False
                
                row[i].add(matrix[i][j])
                col[j].add(matrix[i][j])
        
        return True

matrix = [[1,2,3],[3,1,2],[2,3,3]]

print(Solution().checkValid(matrix))