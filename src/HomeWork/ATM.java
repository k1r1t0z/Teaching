package HomeWork;

public class ATM {
    int banknotes1 = 20;
    int banknotes2 = 50;
    int banknotes3 = 100;
    int number1 = 50;
    int number2 = 50;
    int number3 = 50;
    int sumATM = 1000;

    int giveMoney(int sum) {
        return sumATM + sum;
    }

    String result (int a) {
        if (sumATM < a) {
            return "В банкомате недостаточно средств";
        } else {
            return "Успешное выполнение операции";
        }
    }

}
