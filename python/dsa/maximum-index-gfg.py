class Solution:
    #Complete this function
    # Function to find the maximum index difference.
    def maxIndexDiff(self,A, N): 
        left_min = [0] * N
        right_max = [0] * N

        left_min[0] = A[0]
        for i in range(1, N):
            left_min[i] = min(left_min[i - 1], A[i])
        
        right_max[N - 1] = A[N - 1]
        for i in range(N - 2, -1, -1):
            right_max[i] = max(right_max[i + 1], A[i])

        i = 0
        j = 0
        res = -1
        while (i < N) and (j < N):
            if left_min[i] <= right_max[j]:
                res = max(res, j - i)
                j += 1
            else:
                i += 1
        return res
    
N = 9
A = [34, 8, 10, 3, 2, 80, 30, 33, 1]
        
print(Solution().maxIndexDiff(A, N))