public class CreditPaymentService {


    public int calculate(int amount, double monthlyPercent, int numberOfPayments) {
        double result;
        result = amount * (monthlyPercent + monthlyPercent / (Math.pow((1 + monthlyPercent), numberOfPayments) - 1));
        return (int) result;
    }
}
