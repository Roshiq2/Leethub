import java.util.Arrays;

class Solution { 
    public int minEatingSpeed(int[] piles, int h) { 
        int low = 1;
        int high = 0;
        
        // Faster way to find the maximum pile
        for (int pile : piles) {
            if (pile > high) {
                high = pile;
            }
        }
        
        int ans = high; 
        
        while (low <= high) { 
            int mid = low + (high - low) / 2; // Prevents potential overflow
            
            if (canEatAll(piles, mid, h)) { 
                ans = mid; 
                high = mid - 1; 
            } else { 
                low = mid + 1; 
            } 
        } 
        return ans; 
    } 

    private boolean canEatAll(int[] piles, int speed, int h) { 
        long totalH = 0; // Changed to long to prevent overflow
        for (int bananas : piles) { 
            // Fast integer alternative to Math.ceil((double)bananas / speed)
            totalH += (bananas + speed - 1) / speed; 
            
            // Early exit if we already exceed allowed hours
            if (totalH > h) {
                return false;
            }
        } 
        return true; 
    } 
}
