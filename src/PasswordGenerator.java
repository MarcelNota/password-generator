import java.util.Random;

public class PasswordGenerator {
    String generatePassword(int thesize   ,boolean useUppercase, boolean useLowercase,
                            boolean useNumbers, boolean useSpecialCharacters) {

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String upercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for(int i = 0 ; i < thesize; i++ ){
            char nextLetter = lowercase.charAt(rand.nextInt(lowercase.length()));
            password.append(nextLetter);
        }
        return password.toString();

    }
}
