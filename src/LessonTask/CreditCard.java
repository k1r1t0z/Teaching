package LessonTask;

public class CreditCard {
    long accountNumber;
    long amountAccount;

    long accrual(long sum) {
        return sum + amountAccount;
    }

    public CreditCard() {

    }


    public CreditCard(long accountNumber, long amountAccount) {
        this.accountNumber = accountNumber;
        this.amountAccount = amountAccount;
    }


    long takeOff(long sum1) {
        return amountAccount - sum1;
    }

     String infoNumber() {
        return "Ваш номер карты: " + this.accountNumber + "\n";
    }

    String infoScore () {
        return "Ваш счет: " + this.amountAccount + "\n";
    }
}
