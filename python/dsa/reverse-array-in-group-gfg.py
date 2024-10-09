class Solution:
    # Function to reverse every sub-array group of size k.
    def reverseInGroups(self, arr, k):
        
        i = 0
        while i < len(arr): 
            
            start = i
            end = i + k - 1 if i + k <= len(arr) else len(arr) - 1
            self.reverse(arr, start, end)
            i += k


    def reverse(self, arr, start, end):

        while start < end:
            arr[start], arr[end] = arr[end], arr[start]
            start += 1
            end -= 1

arr = [1, 2, 3, 4, 5]
k = 3

# Solution().reverse(arr, 0, len(arr) - 1)
Solution().reverseInGroups(arr, k)
print(arr)
        