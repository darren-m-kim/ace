# https://leetcode.com/problems/count-good-triplets/

from typing import List, Dict, Tuple, Sequence

# 1
class Solution_01:
    def countGoodTriplets(self, arr: List[int], a: int, b: int, c: int) -> int:
        indices = range(len(arr))
        count = len([(i, j, k) for i in indices for j in indices for k in indices
                if i < j < k
                and abs(arr[i] - arr[j]) <= a
                and abs(arr[j] - arr[k]) <= b
                and abs(arr[i] - arr[k]) <= c])
        return count
Solution_01().countGoodTriplets([3,0,1,1,9,7], 7, 2, 3)
