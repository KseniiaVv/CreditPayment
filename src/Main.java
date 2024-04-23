//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int S = 1000000; // сумма кредита, руб
        double i = 9.99; // годовая процентная ставка, %
        int n = 2; // срок кредита, г

        double monthlyPercent = service.calculate(i); // ежемесячная процентная ставка
        int term = service.calculate(n); // Срок кредита
        int cps = service.calculate(S, monthlyPercent, term); // Ежемесячный платеж

        System.out.println((S) + "Сумма кредита");
        System.out.println((term) + "срок кредита, мес");
        System.out.println((monthlyPercent) + "ежемесячная процентная ставка");
        System.out.println((cps) + "Ежемесячный платеж");
    }
}
