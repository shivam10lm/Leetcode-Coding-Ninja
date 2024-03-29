public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        long n = a.length;

        long sn = (n * (n + 1)) / 2;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;

        long s = 0, s2 = 0;

        for(int i = 0; i < n; i++){
            s += a[i];
            s2 += a[i] * a[i];
        }

        long val1 = s - sn;
        long val2 = s2 - s2n;
        val2 = val2/val1;
        long x = (val1 + val2)/2;
        long y = x - val1;


        return new int[]{(int)x, (int)y};

    }
}
