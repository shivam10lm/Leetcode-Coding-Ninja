public class Solution {
    public static int root(int mid, int n, int m){
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low = 1, high = m;

        while(low <= high){
            int mid = (low + high)/2;
            int midN = root(mid, n, m);
            if(midN == 1)
                return mid;
            else if(midN == 0)
                low = mid + 1;
            else
                high = mid - 1;
            }
            return -1;
        }
    }
