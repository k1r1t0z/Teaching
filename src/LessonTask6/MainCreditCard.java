package LessonTask6;

public class MainCreditCard {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(4255456798081232l, 120);
        CreditCard creditCard2 = new CreditCard(5314987443567321l, 87);
        CreditCard creditCard3 = new CreditCard(4231465790108660l, 620);
        creditCard1.accrual(50);
        creditCard2.accrual(50);
        creditCard3.takeOff(50);
        System.out.println(creditCard1.infoNumber() + creditCard1.infoScore());
        System.out.println(creditCard2.infoNumber() + creditCard2.infoScore());
        System.out.println(creditCard3.infoNumber() + creditCard3.infoScore());
    }
}
