public class FinancialForecast {

    // Recursive function to calculate future value
    public static double calculateFutureValueRecursive(double amount, double growthRate, int years) {
        if (years == 0) return amount;  // Base case
        return calculateFutureValueRecursive(amount, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using memoization
    public static double calculateFutureValueMemoized(double amount, double growthRate, int years, Double[] memo) {
        if (years == 0) return amount;
        if (memo[years] != null) return memo[years];
        memo[years] = calculateFutureValueMemoized(amount, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialAmount = 1000.0;
        double growthRate = 0.10;  // 10% annual growth
        int years = 10;

        // Simple recursive
        double futureValue1 = calculateFutureValueRecursive(initialAmount, growthRate, years);
        System.out.printf("Recursive Future Value after %d years: ₹%.2f\n", years, futureValue1);

        // Optimized with memoization
        Double[] memo = new Double[years + 1];
        double futureValue2 = calculateFutureValueMemoized(initialAmount, growthRate, years, memo);
        System.out.printf("Memoized Future Value after %d years: ₹%.2f\n", years, futureValue2);
    }
}
