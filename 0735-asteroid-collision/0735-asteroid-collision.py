class Solution:
    def asteroidCollision(self, asteroids):
        res = []
        for cur in asteroids:
            while res and res[-1] > 0 and cur < 0:
                if res[-1] < -cur:
                    res.pop()
                    continue
                elif res[-1] == -cur:
                    res.pop()
                break
            else:
                res.append(cur)
        return res