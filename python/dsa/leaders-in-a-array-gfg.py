class Solution:
    #Back-end complete function Template for Python 3
    
    #Function to find the leaders in the array.
    def leaders(self, A, N):
        #Code here
        leads = []
        leads.append(A[-1])

        for i in range(N - 2, -1, -1):
            if A[i] > leads[-1]:
                leads.append(A[i])
        
        leads.reverse()
        return leads
    

n = 6
A = [16,17,4,3,5,2]

print(Solution().leaders(A, n))