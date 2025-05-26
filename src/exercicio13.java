import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cotacaoReal, cotacaoDolar, cotacaoEuro;
        double cotacao = 0;
        double convertido;
        int decisaoMoedaOriginal, decisaoMoedaConvertida;
        String moedaCotada;


        System.out.println("=== CONVERSOR DE MOEDAS ===");
        System.out.println("Temos as seguintes moedas disponíveis: ");
        System.out.println(" [1] Real \n [2] Dolar \n [3] Euro");
        System.out.print("Digite qual a moeda que você tem: ");
        decisaoMoedaOriginal = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite para qual moeda você deseja converter: ");
        decisaoMoedaConvertida = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o valor que você deseja converter: ");
        int valor = Integer.parseInt(scanner.nextLine());

        if (decisaoMoedaOriginal == decisaoMoedaConvertida) {
            System.out.println("Não é possível converter a moeda para ela mesma!");
        } else {
            switch (decisaoMoedaOriginal) {
                case 1:
                    cotacaoDolar = 0.17;
                    cotacaoEuro = 0.16;
                    if (decisaoMoedaConvertida == 2) {
                        moedaCotada = "Dólar";
                        cotacao = cotacaoDolar;
                        convertido = valor * cotacaoDolar;
                    } else {
                        moedaCotada = "Euro";
                        cotacao = cotacaoEuro;
                        convertido = valor * cotacaoEuro;
                    }
                    break;
                case 2:
                    cotacaoEuro = 0.89;
                    cotacaoReal = 5.72;
                    if (decisaoMoedaConvertida == 3) {
                        moedaCotada = "Euro";
                        cotacao = cotacaoEuro;
                        convertido = valor * cotacaoEuro;
                    } else {
                        moedaCotada = "Real";
                        cotacao = cotacaoReal;
                        convertido = valor * cotacaoReal;
                    }
                    break;
                case 3:
                    cotacaoDolar = 1.13;
                    cotacaoReal = 6.45;
                    if (decisaoMoedaConvertida == 1) {
                        moedaCotada = "Real";
                        cotacao = cotacaoReal;
                        convertido = valor * cotacaoReal;
                    } else {
                        moedaCotada = "Dólar";
                        cotacao = cotacaoDolar;
                        convertido = valor * cotacaoDolar;
                    }
                    break;
                default:
                    System.out.println("Nenhuma das moedas foi escolhida");
                    convertido = 0;
                    moedaCotada = "none";
                    cotacao = 0;
            }
            System.out.println("==== OUTPUT ====");
            System.out.printf((convertido == 0) ? "Não foi escolhido nenhuma das moedas!" : "Quantidade de moedas: %d \nCotação do %s: %.2f \nValor Final: %.2f", valor,moedaCotada, cotacao, convertido);
        }
    }
}


