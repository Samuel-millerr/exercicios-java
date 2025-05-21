import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        boolean valido = true;

        System.out.println("=== VERIFICADOR DE DOMÍNIO ===");
        System.out.print("Insira um email para ser verificado: ");
        email = scanner.nextLine();

        int inicioDominio = email.indexOf("@") + 1;
        int finalDominio = email.length();
        int primeiroCaracter = email.charAt(0);
        int ultimoCaracter = email.charAt(finalDominio - 1);

        if (!Character.isLetter(primeiroCaracter) || !Character.isLetter(ultimoCaracter)) {
            valido = false;
            System.out.println(" O e-mail não começa ou não termina com letras.");
        }
        if (!email.contains("@") ) {
            valido = false;
            System.out.println(" O e-mail não possui @.");
        } else {
            if (!email.substring(inicioDominio, finalDominio).contains(".")) {
                valido = false;
                System.out.println(" O e-mail não tem um o ponto depois o @.");
            }
            if (email.substring(inicioDominio, finalDominio).equals(".")) {
                valido = false;
                System.out.println(" O e-mail possui um ponto após o arroba.");
            }
        }

        if (valido) {
            System.out.println("E-mail válido!");
        } else {
            System.out.println("E-mail inválido!");
        }
    }
}