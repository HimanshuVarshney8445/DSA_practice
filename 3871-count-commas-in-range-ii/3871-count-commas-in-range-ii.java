class Solution {
    public long countCommas(long n) {
        long num=n;
        long count=0;
        if (num >= 1_000_000_000_000_000L) {
            long numbers = num - 1_000_000_000_000_000L + 1;
            count += numbers * 5L;
        }
        if (num >= 1000000000000L) {
            long upper = Math.min(num, 999_999_999_999_999L);
            long numbers = upper - 1_000_000_000_000L + 1;
            count += numbers * 4L;
        }
        if (num >= 1000000000L) {
            long upper = Math.min(num, 999_999_999_999L);
            long numbers = upper - 1_000_000_000L + 1;
            count += numbers * 3L;
        }
        if (num >= 1000000L) {
            long upper = Math.min(num, 999_999_999L);
            long numbers = upper - 1_000_000L + 1;
            count += numbers * 2L;
        }
        if (num >= 1000L) {
            long upper = Math.min(num, 999_999L);
            long numbers = upper - 1_000L + 1;
            count += numbers * 1L;
        }
        return count;
    }
}
