class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        
        i = m -1
        j = n - 1
        k = len(nums1) - 1

        while i>=0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[i], nums1[k] = nums1[k], nums1[i]
                k -= 1
                i -= 1
            else:
                nums2[j], nums1[k] = nums1[k], nums2[j]
                k -= 1
                j -= 1

        while j >= 0:
            nums2[j], nums1[k] = nums1[k], nums2[j]
            k -= 1
            j -= 1



