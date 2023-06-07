package HomeWork.HW13;

public class UserInfo {
    static boolean info(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || password.length() > 20) {
            throw new WrongLoginException("Error length login or password");
        } else if (!login.matches("\\S+") || !password.matches("\\S+")) {
            throw new WrongLoginException("Error. Bad symbol in login or password");
        } else if (!password.matches("\\w+\\d+")) {
            throw new WrongPasswordException("Error. Password must contain a number");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Error. Password mismatch ");
        } else {
            return true;
        }
    }
}

