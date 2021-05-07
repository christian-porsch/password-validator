public class PasswordValidator {

    public static boolean passwordLength(String password) {

        if(password.length() < 5){
            return false;
        }
        return true;
    }

    public static boolean passwordContainsDigits(String password) {

        char[] checkForDigits = password.toCharArray();

        for (int i = 0; i < checkForDigits.length; i++) {
            if (Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
