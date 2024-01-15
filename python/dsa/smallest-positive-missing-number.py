class Solution:
    
    #Function to find the smallest positive number missing from the array.
    def missingNumber(self,arr,n):
        #Your code here
        arr_set = set(arr)

        for i in range(1, n + 2):
            if i in arr_set:
                continue
            else:
                return i
    
    
N = 5
# arr = [1,2,3,4,5]
arr = [0,-10,1,3,-20]

print(Solution().missingNumber(arr, N))