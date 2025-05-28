import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeroString, primeiroDigito, segundoDigito;
        boolean menorDez = false;
        boolean menorVinte = false;

        System.out.println("=== NÚMERO POR EXTENSO ===");
        System.out.println("O número devem ser escrito sempre com dois dígitos (ex: 07), além de ser permitido somente números entre 0 e 99.");
        System.out.print("Escreva o número que você deseja ver por extenso: ");
        numeroString = scanner.nextLine();
        primeiroDigito = numeroString.substring(0, 1);
        segundoDigito = numeroString.substring(1, 2);

        if (Integer.parseInt(numeroString) > 99 || Integer.parseInt(numeroString) < 0) {
            System.out.println("São permitidos somente números de 0 a 99!");
        } else {
            switch (primeiroDigito) {
                case "0":
                    menorDez = true;
                    break;
                case "1":
                    menorVinte = true;
                    break;
                case "2":
                    System.out.print("Vinte");
                    break;
                case "3":
                    System.out.print("Trinta");
                    break;
                case "4":
                    System.out.print("Quarenta");
                    break;
                case "5":
                    System.out.print("Cinquenta");
                    break;
                case "6":
                    System.out.print("Sessenta");
                    break;
                case "7":
                    System.out.print("Setenta");
                    break;
                case "8":
                    System.out.print("Oitenta");
                    break;
                case "9":
                    System.out.print("Noventa");
                    break;
            }

            if (menorDez) {
                switch (segundoDigito) {
                    case "1":
                        System.out.println("Um");
                        break;
                    case "2":
                        System.out.println("Dois");
                        break;
                    case "3":
                        System.out.println("Três");
                        break;
                    case "4":
                        System.out.println("Quatro");
                        break;
                    case "5":
                        System.out.println("Cinco");
                        break;
                    case "6":
                        System.out.println("Seis");
                        break;
                    case "7":
                        System.out.println("Sete");
                        break;
                    case "8":
                        System.out.println("Oito");
                        break;
                    case "9":
                        System.out.println("Nove");
                        break;
                    default:
                        System.out.println("Zero");
                }

            } else if (menorVinte) {
                switch (segundoDigito) {
                    case "1":
                        System.out.println("Onze");
                        break;
                    case "2":
                        System.out.println("Doze");
                        break;
                    case "3":
                        System.out.println("Treze");
                        break;
                    case "4":
                        System.out.println("Quatorze");
                        break;
                    case "5":
                        System.out.println("Quinze");
                        break;
                    case "6":
                        System.out.println("Dezesseis");
                        break;
                    case "7":
                        System.out.println("Dezessete");
                        break;
                    case "8":
                        System.out.println("Dezoito");
                        break;
                    case "9":
                        System.out.println("Dezenove");
                        break;
                    default:
                        System.out.println("Dez");
                }

            } else {
                switch (segundoDigito) {
                    case "0":
                        System.out.print(" ");
                        break;
                    case "1":
                        System.out.print(" e Um");
                        break;
                    case "2":
                        System.out.print(" e Dois");
                        break;
                    case "3":
                        System.out.print(" e Três");
                        break;
                    case "4":
                        System.out.print(" e Quatro");
                        break;
                    case "5":
                        System.out.print(" e Cinco");
                        break;
                    case "6":
                        System.out.print(" e Seis");
                        break;
                    case "7":
                        System.out.print(" e Sete");
                        break;
                    case "8":
                        System.out.print(" e Oito");
                        break;
                    case "9":
                        System.out.print(" e Nove");
                        break;
                }
            }
        }
    }
}
