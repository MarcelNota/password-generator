import java.util.Scanner;

public class TextbasedInterface implements UserInterface{

    private Scanner scanner;

    public TextbasedInterface(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int getPasswordLength() {
        System.out.println("Please enter the password length: ");
        return scanner.nextInt();
    }

    @Override
    public boolean useLowercase() {
        System.out.println("Would you like the password to have lowercase characters? (y/n): ");
        return scanner.next().equalsIgnoreCase( "y");
    }

    @Override
    public boolean useUppercase() {
        System.out.println("Would you like the password to have uppercase characters? (y/n): ");
        return scanner.next().equalsIgnoreCase( "y");
    }

    @Override
    public boolean useNumbers() {
        System.out.println("Would you like the password to have numerical characters? (y/n): ");
        return scanner.next().equalsIgnoreCase( "y");
    }

    @Override
    public boolean useSymbols() {
        System.out.println("Would you like the password to have symbol characters? (y/n): ");
        return scanner.next().equalsIgnoreCase( "y");
    }

    @Override
    public void displayPassword(String password) {
        System.out.println("Here is the Password: " + password);

    }
}
