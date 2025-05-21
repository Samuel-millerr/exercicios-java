import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double real, dolar, euro;
        String decisaoMoedaOriginal, decicaoMoedaConvertida;


        System.out.println("=== CONVERSOR DE MOEDAS ===");
        System.out.println("Temos as seguintes moedas disponíveis: ");
        System.out.println(" [1] Real \n[2] Dolar \n[3] Euro");
        System.out.println("Digite qual a moeda que você tem: ");
        decisaoMoedaOriginal = scanner.nextLine();
        System.out.println("Digite para qual moeda você deseja converter: ");
        decicaoMoedaConvertida = scanner.nextLine();

        if (decisaoMoedaOriginal.equals(decicaoMoedaConvertida)) {
            System.out.println("Não é possível converter uma moeda para ela mesma!");
        } else {
            switch (decisaoMoedaOriginal) {
                default -> throw new IllegalStateException("Unexpected value: " + decisaoMoedaOriginal);
            }

        }


    }
}
