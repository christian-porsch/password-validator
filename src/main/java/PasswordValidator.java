public class PasswordValidator {


    public static boolean passwordLength(String password) {

        if (password.length() < 5) {
            return false;
        }
        return true;
    }

    public static boolean passwordContainsDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean passwordContainsLowerHigher(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i)) || Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidPassword(String password){
        return passwordLength(password)
                && passwordContainsDigits(password)
                && passwordContainsLowerHigher(password);
    }

    public static boolean isValidPasswordList(String[] listOfPasswords){
        for (int i = 0; i < listOfPasswords.length; i++) {
            String singlePassword = listOfPasswords[i];
            boolean validation = isValidPassword(singlePassword);
            if (validation == true){
                return true;
            }
        }
        return false;
    }

}
