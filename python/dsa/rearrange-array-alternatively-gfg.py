class Solution:
    ##Complete this function
    #Function to rearrange  the array elements alternately.
    def rearrange(self,arr, n): 
        ##Your code here
        start = 0
        end = n - 1
        max = arr[-1] + 1
        for i in range(0, n):

            if i % 2 == 0:
                arr[i] = (arr[end] % max) * max + arr[i]
                end -= 1
            else:
                arr[i] = (arr[start] % max ) * max + arr[i]
                start += 1
        
        for i in range(0, n):
            arr[i] = arr[i] // max
        print(arr)

arr = [10,20,30,40,50,60,70,80,90,100,110]
n = len(arr)
Solution().rearrange(arr, n)