package HomeWork;

public class MainAtm {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.giveMoney(900);
        System.out.println(atm.result(450));
    }
}
