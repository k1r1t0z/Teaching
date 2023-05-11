package LessonTask;

public class mainCreditCard {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(3425234, 120);
        CreditCard creditCard2 = new CreditCard(123456, 87);
        CreditCard creditCard3 = new CreditCard(42554546, 620);
        creditCard1.accrual(50);
        creditCard2.accrual(50);
        creditCard3.takeOff(50);
        System.out.println("Номер первой карты: " + creditCard1.accountNumber + "\nСчет первой карты: " + creditCard1.accrual(50));
        System.out.println("\nНомер второй карты: " + creditCard2.accountNumber + "\nСчет второй карты: " + creditCard2.accrual(50));
        System.out.println("\nНомер третьей карты: " + creditCard3.accountNumber + "\nСчет третьей карты: " + creditCard3.takeOff(50));
    }
}
