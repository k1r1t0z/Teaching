package LessonTask;

public class CreditCard {
    long accountNumber;
    long amountAccount;

    public CreditCard(long accountNumber, long amountAccount) {
        this.accountNumber = accountNumber;
        this.amountAccount = amountAccount;
    }

    long accrual(long sum) {
        return sum + amountAccount;
    }

    void takeOff(int sum1) {
        if (sum1 < amountAccount){
            long result = amountAccount - sum1;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    String infoNumber() {
        return "Ваш номер карты: " + this.accountNumber + "\n";
    }

    String infoScore() {
        return "Ваш счет: " + this.amountAccount + "\n";
    }
}
