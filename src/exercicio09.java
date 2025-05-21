import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULO DE KM/L ===");
        System.out.println("Para calcularmos o km/l, insira as informações abaixo, por gentileza: ");
        System.out.print("Distância percorrida (em km/l): ");
        double distanciaPercorrida = Double.parseDouble(scanner.nextLine());
        System.out.print("Quantidade de litros consumidos (em litros): ");
        double litrosConsumidos = Double.parseDouble(scanner.nextLine());

        double kilometrosLitro = distanciaPercorrida / litrosConsumidos;

        System.out.printf("Consumo em km/l %.1f\n",  kilometrosLitro);
        if (kilometrosLitro < 1){
            System.out.println("Valor da distância ou consumo inválido!");
        }else if (kilometrosLitro < 8) {
            System.out.println("Venda o carro!");
        } else if (kilometrosLitro < 12) {
            System.out.println("Econômico.");
        } else {
            System.out.println("Super econômico.");
        }

    }

}
