class Solution:
    ##Complete this function
    #Function to check if array is sorted and rotated.

    def check_increasing_order(self, arr, n):

        i = 0
        while (i < n - 1 and arr[i] <= arr[i + 1]):
            i += 1
        
        if i == n - 1:
            return False
        
        i += 1

        while (i < n - 1 and arr[i] <= arr[i + 1]):
            i += 1

        if i == n -1 and arr[i] < arr[0]:
            return True
        else:
            return False
        
    def check_decreasing_order(self, a, n):
        i = 0

        while i < n - 1 and a[i] >= a[i + 1]:
            i += 1
        
        if i == n - 1:
            return False
        
        i += 1

        while i < n - 1 and a[i]  >= a[i + 1]:
            i += 1

        if i == n - 1 and a[i] >= a[0]:
            return True
        else:
            return False


    def checkRotatedAndSorted(self,arr,n):
        #code here 
        if self.check_increasing_order(arr, n):
            return True

        if self.check_decreasing_order(arr, n):
            return True
        
        return False

arr = [3,2,1,4]
n = len(arr)

print(Solution().checkRotatedAndSorted(arr, n))