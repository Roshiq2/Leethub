
class Solution {

    int count = 0; // stores total reverse pairs found

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }

    void mergeSort(int[] a, int l, int r) {
        if (l >= r) // base case: single element or invalid range
            return;
        int m = l + (r - l) / 2;

        mergeSort(a, l, m);     // sort left half
        mergeSort(a, m + 1, r); // sort right half

        int j = m + 1;

        // count reverse pairs across the two sorted halves before merging
        for (int i = l; i <= m; i++) {
            while (j <= r && (long) a[i] > 2L * a[j]) // long cast avoids overflow
                j++;
            count += j - (m + 1); // number of valid j's found for this i
        }

        int[] temp = new int[r - l + 1]; // temporary array to hold merged result
        int i = l, k = 0;
        j = m + 1;

        while (i <= m && j <= r) { // standard merge of two sorted halves
            if (a[i] <= a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i <= m) // copy remaining left half elements, if any
            temp[k++] = a[i++];
        while (j <= r) // copy remaining right half elements, if any
            temp[k++] = a[j++];

        for (i = 0; i < temp.length; i++) {
            a[l + i] = temp[i]; // copy merged result back into original array
        }
    }
}