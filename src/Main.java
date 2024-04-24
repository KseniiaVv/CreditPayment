//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000; // сумма кредита, руб
        double Percent = 9.99; // годовая процентная ставка, %
        int term = 2; // срок кредита, г

        double monthlyPercent =  Percent / 100 / 12; // ежемесячная процентная ставка
        int numberOfPayments = term * 12; // Срок кредита, месяцев
        int MonthlyPayment = service.calculate(amount, monthlyPercent, numberOfPayments); // Ежемесячный платеж

        System.out.println((amount) + " руб, сумма кредита");
        System.out.println((term) + " г, срок кредита");
        System.out.println((Percent) + " %, процентная ставка");
        System.out.println((MonthlyPayment) + " руб, ежемесячный платеж");
    }
}
