import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO COM CONDIÇÕES ===");
        System.out.println("O programa se consiste em receber dois número e realizar a soma, porém:");
        System.out.println(" - Caso o valor dos dois números somados for maior que 20, é somado mais 8.");
        System.out.println(" - Caso contrario é subtraido 5.");

        System.out.print("\nDigite o 1° número: ");
        double numero01 = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite on 2° número: ");
        double numero02 = Double.parseDouble(scanner.nextLine());
        double soma = numero01 + numero02;

        if (soma > 20) {
            System.out.printf("\nSoma dos números: %.1f\nCálculo com condição: %.1f", soma, (soma+20));
        } else {
            System.out.printf("\nSoma dos números: %.1f\nCálculo com condição: %.1f", soma, (soma-5));
        }
    }
}
