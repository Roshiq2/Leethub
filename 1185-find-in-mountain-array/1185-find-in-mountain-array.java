class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // Step 1: Find the peak of the mountain array
        int left = 0;
        int right = mountainArr.length() - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            int midNextValue = mountainArr.get(mid + 1);
            
            // Compare the current element with the next element
            if (midValue < midNextValue) {
                // If the current element is less than the next element, move to the right
                left = mid + 1;
            } else {
                // Otherwise, move to the left
                right = mid;
            }
        }
        
        // The left pointer will be at the peak element's index
        int peakIndex = left;
        
        // Step 2: Search for the target in the ascending part of the mountain
        int leftResult = binarySearch(mountainArr, target, 0, peakIndex, true);
        
        // If the target is found in the ascending part, return its index
        if (leftResult != -1) {
            return leftResult;
        }
        
        // Step 3: Search for the target in the descending part of the mountain
        int rightResult = binarySearch(mountainArr, target, peakIndex, mountainArr.length() - 1, false);
        
        // Return the index where the target is found in the descending part
        return rightResult;
    }
    
    private int binarySearch(MountainArray mountainArr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) {
                // If the current element is the target, return its index
                return mid;
            }
            
            if (ascending) {
                if (midValue < target) {
                    // If the current element is less than the target, move to the right
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (midValue < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}