package uitschool.exception;

public class PassDemo {
    public static void main(String[] args) {

        validate("sss", "11913", "14");

    }

    static boolean validate(String login, String pass, String cpass) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            if (pass.length() > 20 || !pass.equals(cpass)) {
                throw new WrongPasswordException();
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Неверный логин ili pass");
        }
        finally {
            System.out.println(login + " " + pass + " " + cpass);
        }
        if(pass.length() < 20 || !pass.equals(cpass) || login.length() > 20){
            return true;
        }
        else return false;
    }
}

