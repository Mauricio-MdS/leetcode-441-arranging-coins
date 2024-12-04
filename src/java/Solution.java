class Solution {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long coinsUsed = (long)mid * (mid + 1) / 2;
            if (coinsUsed == n) return mid;
            if (coinsUsed < n) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
}