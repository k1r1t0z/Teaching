package HomeWork.HW13;

public class UserInfo {
    static void info(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Error length login");
        } else if (!login.matches("\\S+")) {
            throw new WrongLoginException("Error. Bad symbol in login");
        } else {
            System.out.println(login);
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Error length password");
        } else if (!password.matches("\\S+")) {
            throw new WrongPasswordException("Error. Bad symbol in password");
        } else if (!password.matches("\\w+\\d+")) {
            throw new WrongPasswordException("Error. Password must contain a number");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Error. Password mismatch ");
        } else {
            System.out.println(password);
        }
    }
}
