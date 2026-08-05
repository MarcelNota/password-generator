import java.util.Random;

public class PasswordGenerator {

    // Método auxiliar responsável por verificar se dois grupos de caracteres
    // possuem algum caractere em comum.
    //
    // Exemplo:
    // hasOverlap("A7b", "ABC") -> true (porque existe o caractere A)
    // hasOverlap("123", "ABC") -> false (não existe nenhum caractere igual)
    private boolean hasOverlap(String s1, String s2) {

        // Converte a primeira String em um array de caracteres
        // e percorre cada caractere individualmente.
        for (char c : s1.toCharArray()) {

            // Verifica se o caractere atual existe dentro da segunda String.
            //
            // String.valueOf(c) transforma o char em String,
            // porque o método contains() recebe uma String.

            if (s2.contains(String.valueOf(c))) {
                // Encontrou um caractere em comum.
                // A senha contém um caractere daquele grupo.
                return true;
            }
        }
        return false;
    }

    String generatePassword(int length   ,boolean useUppercase, boolean useLowercase,
                            boolean useNumbers, boolean useSpecialCharacters) {

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String upercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+?";

        StringBuilder charOptions = new StringBuilder(); // Junta todos os grupos de caracteres que o usuário permitiu usar



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

        // Garante que existe pelo menos um grupo de caracteres selecionado.
        //
        // Sem essa validação:
        // charOptions ficaria vazio e o Random não teria caracteres
        // para escolher, causando erro.

        if (charOptions.length() == 0) {
            throw new IllegalArgumentException("Select at least one character option");
        }


        // Transforma o StringBuilder em String.
        //
        // Agora a lista de caracteres está pronta para ser usada
        // apenas como fonte de consulta durante a geração.

        String allcharacters = charOptions.toString();


        // Variável que controla se a senha gerada passou
        // por todas as regras de validação.
        boolean passwordIsValid = false;


        // Continua criando senhas até encontrar uma que cumpra
        // todas as exigências escolhidas pelo usuário.

        while (true){


            // StringBuilder usado para construir a senha final
            // caractere por caractere.

            StringBuilder password = new StringBuilder();
            Random rand = new Random();


            // Loop responsável por criar a senha.
            //
            // A cada repetição:
            // 1. Escolhe uma posição aleatória em allcharacters.
            // 2. Pega o caractere daquela posição.
            // 3. Adiciona esse caractere na senha.

            for(int i = 0 ; i < length; i++ ){

                // Escolhe um índice aleatório dentro do tamanho
                // dos caracteres disponíveis.
                char nextLetter = allcharacters.charAt(rand.nextInt(allcharacters.length()));

                // Adiciona o caractere escolhido na senha.
                password.append(nextLetter);
            }
            String pass = password.toString();


            // Assume inicialmente que a senha é válida.
            //
            // Caso alguma regra abaixo falhe,
            // alteramos para false.

            passwordIsValid = true;


            // Verifica se a senha possui pelo menos uma letra minúscula.
            //
            // A condição significa:
            // "Se o usuário pediu letras minúsculas
            // e a senha NÃO possui nenhuma,
            // então ela é inválida."

            if (useLowercase && !hasOverlap(pass, lowercase)) {
                passwordIsValid = false;
            }

            // Verifica se a senha possui pelo menos uma letra maiúscula.

            if (useUppercase && !hasOverlap(pass, upercase)) {
                passwordIsValid = false;
            }

            // Verifica se a senha possui pelo menos um número.

            if (useNumbers && !hasOverlap(pass, digits)) {
                passwordIsValid = false;
            }

            // Verifica se a senha possui pelo menos um símbolo.

            if (useSpecialCharacters && !hasOverlap(pass, symbols)) {
                passwordIsValid = false;
            }


            // Se todas as regras foram cumpridas,
            // retorna a senha criada e encerra o método.

            if (passwordIsValid) {
                return pass;
            }


            // Caso alguma regra falhe:
            // mostra a senha rejeitada e volta ao início do while
            // para criar uma nova tentativa.

            System.out.println("Password failed, trying again..." + pass);

        }

    }
}
