class Solution:
    #Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    #with O(1) extra space.

    # logic divident = divisor * quotient + reminder
    def arrange(self,arr, n): 
        #Your code here

        for i in range(n):
            arr[i] = arr[arr[i]] % n * n + arr[i]
        
        for i in range(n):
            arr[i] = arr[i] // n

        print(arr)


N = 5
arr = [4,0,2,1,3]

Solution().arrange(arr, N)