import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero01, numero02, numero03;


        System.out.println("=== ORDEM CRESCENTE ===");
        System.out.print("1° número: ");
        numero01 = Integer.parseInt(scanner.nextLine());
        System.out.print("2° número: ");
        numero02 = Integer.parseInt(scanner.nextLine());
        System.out.print("3° número: ");
        numero03 = Integer.parseInt(scanner.nextLine());

        if (numero01 == numero02 && numero01 == numero03) {
            System.out.println("Os 3 números são iguais!");
        } else {
            String ordemCrescente;
            if (numero01 >= numero02 && numero01 > numero03) {
                ordemCrescente = numero01 + ", " + numero02 + ", " + numero03;
            } else if (numero01 >= numero03 && numero01 > numero02) {
                ordemCrescente = numero01 + ", " + numero03 + ", " + numero02;
            } else if (numero02 >= numero01 && numero02 > numero03) {
                ordemCrescente = numero02 +  ", " + numero01 + ", " + numero03;
            } else if (numero02 >= numero03 && numero02 > numero01) {
                ordemCrescente = numero02 +  ", " + numero01 + ", " + numero03;
            } else if(numero03 >= numero02 && numero03 > numero01) {

            } else {

            }
            System.out.printf(ordemCrescente);

        }
    }
}
