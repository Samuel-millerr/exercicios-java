import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== IDADE DOS NADADORES ===");
        System.out.println("O programa irá avaliar a idade dos jogadores e classifica-los: ");
        System.out.println(" 5 a 7 anos: Infantil A\n 8 a 10 anos: Infantil B\n 11 a 13 anos: Juvenil A\n 14 a 17 anos: Juvenil B\n 18 anos ou mais: Sênior");

        System.out.print("\nInsira a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        if (idade < 1) {
            System.out.println("A idade inserida é inválida!");
        } else if (idade <= 4) {
            System.out.println("A idade não possuí classificação!");
        } else if (idade <= 7) {
            System.out.println("Classificação: Infantil A");
        } else if (idade <= 10) {
            System.out.println("Classificação: Infantil B");
        } else if (idade <= 13) {
            System.out.println("Classificação: Juvenil A");
        } else if (idade <= 17) {
            System.out.println("Classificação: Juvenil B");
        } else {
            System.out.println("Classificação: Sênior");
        }
    }
}
