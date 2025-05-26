import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE MULTIPLO DE 3 ===");
        System.out.println("O programa se consiste em verificar se o número digitado é ou não multiplo de 3.");
        System.out.print("Digite o número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 3 == 0) {
            System.out.printf("O número %d É multiplo de 3.", numero);
        } else {
            System.out.printf("O número %d NÃO É multiplo de 3", numero);
        }
    }
}

