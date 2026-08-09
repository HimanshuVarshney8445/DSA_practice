class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int j=discounts.length-1;
        double sum=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        for(int i=prices.length-1;i>=0;i--){
            int temp=0;
            if(j>=0) temp=discounts[j--];
            sum+=((double)prices[i]*(100-temp)/100);
            System.out.println(sum);
        }
        return sum;
    }
}
// 10 21 30              ,,           50 60