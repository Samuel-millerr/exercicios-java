import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero01, numero02, numero03;
        int maior, meio, menor;
        String ordemCrescente;

        System.out.println("=== ORDEM CRESCENTE ===");
        System.out.print("1° número: ");
        numero01 = Integer.parseInt(scanner.nextLine());
        System.out.print("2° número: ");
        numero02 = Integer.parseInt(scanner.nextLine());
        System.out.print("3° número: ");
        numero03 = Integer.parseInt(scanner.nextLine());

        if (numero01 == numero02 && numero01 == numero03) {
            menor = 0;
            meio = 0;
            maior = 0;
        } else if (numero01 <= numero02 && numero01 <= numero03){
            menor = numero01;
            if (numero02 <= numero03) {
                meio = numero02;
                maior = numero03;
            } else {
                meio = numero03;
                maior = numero02;
            }
        } else if (numero02 <= numero01 && numero02 <= numero03) {
            menor = numero02;
            if (numero01 <= numero03) {
                meio = numero01;
                maior = numero03;
            } else {
                meio = numero03;
                maior = numero01;
            }
        } else {
            menor = numero03;
            if (numero01 <= numero02) {
                meio = numero01;
                maior = numero02;
            } else {
                meio = numero02;
                maior = numero01;
            }
        }
        System.out.println("Ordem Crescente: " + menor + " - " + meio + " - " + maior);

        }
    }
