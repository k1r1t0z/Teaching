package LessonTask;

public class CreditCard {
    long accountNumber;
    long amountAccount;

    long accrual(long sum) {
        return sum + amountAccount;
    }

    public CreditCard() {

    }


    public CreditCard(int accountNumber, int amountAccount) {
        this.accountNumber = accountNumber;
        this.amountAccount = amountAccount;
    }


    long takeOff(long sum1) {
        return amountAccount - sum1;
    }

    void infoCard() {
        System.out.println(accountNumber + " " + amountAccount);
    }
}
