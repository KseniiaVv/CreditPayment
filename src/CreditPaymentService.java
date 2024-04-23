public class CreditPaymentService {

    public double calculate(double i) {
        double result;
        result = i / 100 / 12;
        return result;
    }

    public int calculate(int n) {
        double result;
        result = n * 12;
        return (int) result;
    }

    public int calculate(int S, double monthlyPercent, int term) {
        double result;
        result = S * (monthlyPercent + monthlyPercent / (Math.pow((1 + monthlyPercent), term) - 1));
        return (int) result;
    }
}
