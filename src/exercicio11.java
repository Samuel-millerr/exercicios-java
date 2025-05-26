import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        String classificacao;

        System.out.println("=== VERIFICADOR DE TRIANGULO ===");
        System.out.println("Para verificarmos o tipo de triangulo, insira os seus 3 lados: ");
        System.out.print("Lado01: ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.print("Lado02: ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.print("Lado03: ");
        c = Double.parseDouble(scanner.nextLine());

        if ((a+b) <= c || (a+c) <= b || (b+c) <= a) {
            System.out.println("Essa forma geometrica não é um triangulo!");
        } else{
            if (a == b && a == c) {
                classificacao = "equilatero";
            } else if ((a == b && a != c) || (a==c && a != b) || (b == c && b != a)) {
                classificacao = "isóceles";
            } else {
                classificacao = "escaleno";
            }
            System.out.printf("Esse triangulo é um triangulo '%s'!", classificacao);
        }
    }
}
