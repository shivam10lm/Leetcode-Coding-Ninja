class Solution {
    public int stockBuySell(int[] arr, int n) {
       int maxProfit = 0;

       int mini = arr[0];

       for(int i = 1; i < n; i++){

        int currentProfit = arr[i] - mini;

        maxProfit = Math.max(currentProfit, maxProfit);

        mini = Math.min(mini, arr[i]);

       }

       return maxProfit;
    }
}
