import java.util.Random;

public class PasswordGenerator {
    String generatePassword(int length   ,boolean useUppercase, boolean useLowercase,
                            boolean useNumbers, boolean useSpecialCharacters) {

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String upercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+?";
        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for(int i = 0 ; i < length; i++ ){
            char nextLetter = lowercase.charAt(rand.nextInt(lowercase.length()));
            password.append(nextLetter);
        }
        return password.toString();

    }
}
