public class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // sqrt(0)=0, sqrt(1)=1
        
        int left = 1, right = x / 2, ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid; // use long to prevent overflow
            
            if (sq == x) return mid; // perfect square
            if (sq < x) {
                ans = mid; // store the last mid that was too small
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.mySqrt(4));  // 2
        System.out.println(sol.mySqrt(8));  // 2
        System.out.println(sol.mySqrt(1));  // 1

    }
}
