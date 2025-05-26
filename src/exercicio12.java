import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        boolean valido = true;

        System.out.println("=== VERIFICADOR DE DOMÍNIO ===");
        System.out.print("Insira um email para ser verificado: ");
        email = scanner.nextLine();

        int inicioDominio = email.indexOf("@");
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
            if (email.indexOf("@") != email.lastIndexOf("@"))  {
                valido = false;
                System.out.println(" O e-mail possui mais de um @.");
            }
            if (!email.substring(inicioDominio + 1, finalDominio).contains(".")) {
                valido = false;
                System.out.println(" O e-mail não tem um o ponto depois o @.");
            }
            if ((inicioDominio != finalDominio-1) && (email.substring(inicioDominio+1, inicioDominio+2).equals("."))) {
                valido = false;
                System.out.println(" O e-mail possui um ponto logo após o arroba.");
            }
        }

        if (valido) {
            System.out.println("E-mail válido!");
        } else {
            System.out.println("E-mail inválido!");
        }
    }
}