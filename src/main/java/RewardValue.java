public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Test the constructors and methods
        RewardValue rewardInCash = new RewardValue(100.0);  // 100 dollars
        System.out.println("Cash value: $" + rewardInCash.getCashValue());
        System.out.println("Miles value: " + rewardInCash.getMilesValue() + " miles");

        RewardValue rewardInMiles = new RewardValue(50000, true);  // 50000 miles
        System.out.println("Miles value: " + rewardInMiles.getMilesValue() + " miles");
        System.out.println("Cash value: $" + rewardInMiles.getCashValue());
    }
}
