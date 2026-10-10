class Solution {
    public double myPow(double x, int n) {
        // Cast to long to prevent overflow on -2147483648
        long N = n;
        if (N < 0) {
            N = -N;
        }
        
        double ans = 1.0;
        double current_product = x;
        
        // Iterative Binary Exponentiation
        while (N > 0) {
            if (N % 2 == 1) {
                ans = ans * current_product;
            }
            current_product = current_product * current_product;
            N /= 2;
        }
        
        // Apply the negative exponent inversion ONCE at the very end
        if (n < 0) {
            return 1.0 / ans;
        }
        
        return ans;
    }
}