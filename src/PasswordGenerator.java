import java.util.Random;

public class PasswordGenerator {
    String generatePassword(int length   ,boolean useUppercase, boolean useLowercase,
                            boolean useNumbers, boolean useSpecialCharacters) {

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String upercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+?";

        StringBuilder charOptions = new StringBuilder();

        if (useUppercase) {
            charOptions.append(upercase);
        }

        if (useLowercase) {
            charOptions.append(lowercase);
        }

        if (useNumbers) {
            charOptions.append(digits);
        }

        if (useSpecialCharacters) {
            charOptions.append(symbols);
        }


        String allcharacters = charOptions.toString();

        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for(int i = 0 ; i < length; i++ ){
            char nextLetter = allcharacters.charAt(rand.nextInt(allcharacters.length()));
            password.append(nextLetter);
        }
        return password.toString();

    }
}
