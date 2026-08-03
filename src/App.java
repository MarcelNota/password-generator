

public class App {
    public static void main(String[] args) {
        UserInterface ui = new TextbasedInterface();            // upcasting

        int length = ui.getPasswordLength();
        boolean useLowercase = ui.useLowercase();
        boolean useUppercase = ui.useUppercase();
        boolean useNumbers = ui.useNumbers();
        boolean useSymbols = ui.useSymbols();


        PasswordGenerator gen = new PasswordGenerator();

        String password = gen.generatePassword(length, useLowercase, useUppercase, useNumbers, useSymbols);

        ui.displayPassword(password);

    }
}
