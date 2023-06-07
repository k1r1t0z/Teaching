package HomeWork.HW13;

public class Main {
    public static void main(String[] args) {
        try {
            UserInfo.info("kiritoz@mail.ru", "krrrtZ23415", "krrrtZ23415");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
