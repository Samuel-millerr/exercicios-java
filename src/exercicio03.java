import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SOMA DE 3 ALGARISMOS ===");
        System.out.println("O programa ira verificar um algarismo de 3 digitos e retornar a soma dos mesmos.");
        System.out.print("Digite um número com 3 digitos: ");
        String numero = scanner.nextLine();

        if (numero.length() == 3) {
            int digito01, digito02, digito03;
            digito01 = Integer.parseInt(numero.substring(0,1));
            digito02 = Integer.parseInt(numero.substring(1,2));
            digito03 = Integer.parseInt(numero.substring(2,3));
            System.out.printf("%d + %d + %d = %d", digito01, digito02, digito03, (digito01+digito02+digito03));
        } else {
            System.out.printf("O número %s não possuí 3 algarismos!", numero);
        }
    }
}
