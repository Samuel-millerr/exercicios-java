import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calculo;

        System.out.println("=== ESTACIONAMENTO ===");
        System.out.print("Digite a quantidade de horas completas que o carro ficou no estacionamento: ");
        int hora = Integer.parseInt(scanner.nextLine());

        if (hora < 1) {
            System.out.println("Horário Inválido!");
        } else {
            if (hora <= 2) {
                calculo = hora * 2;
            } else if (hora <= 4) {
                calculo = (hora-2) * 1.40 + (2*2);
            } else {
                calculo = (hora - 4) + (2*1.40) + (2*2);
            }
            System.out.printf("O valor total do estacionamento é de R$%.1f", calculo);
        }

    }
}
