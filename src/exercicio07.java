import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, peso, altura;

        System.out.println("=== VERIFICADOR DE IMC ===");
        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Insira seu peso no seguinte formato (xx.x): ");
        peso = scanner.nextLine();
        System.out.print("Insira sua altura no seguinte formato (x.xx): ");
        altura = scanner.nextLine();

        if (!peso.substring(3, 4).equals(".")) {
            System.out.println("Formato do peso inválido!");
        } else if (!altura.substring(1, 2).equals(".") ) {
            System.out.println("Formto da altura inválida!");
        } else {
            double pesoNumero = Double.parseDouble(peso);
            double alturaNumero = Double.parseDouble(altura);
        }

    }
}
