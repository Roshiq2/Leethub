class Solution:
    def minEatingSpeed(self, v: List[int], hourly: int) -> int:
        def findMax(v):
            maxi = float('-inf')
            n = len(v)
            # Find the maximum
            for i in range(n):
                maxi = max(maxi, v[i])
            return maxi

        def calculateTotalHours(v, hourly):
            totalH = 0
            n = len(v)
            # Find total hours
            for i in range(n):
                totalH += math.ceil(v[i] / hourly)
            return totalH

        def minimumRateToEatBananas(v, h):
            low = 1
            high = findMax(v)

            # Apply binary search
            while low <= high:
                mid = (low + high) // 2
                totalH = calculateTotalHours(v, mid)
                if totalH <= h:
                    high = mid - 1
                else:
                    low = mid + 1
            return low
        return minimumRateToEatBananas(v, hourly)
                