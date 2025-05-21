import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, peso, altura, classificacao;

        System.out.println("=== VERIFICADOR DE IMC ===");
        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Insira seu peso no seguinte formato (xx.x): ");
        peso = scanner.nextLine();
        System.out.print("Insira sua altura no seguinte formato (x.xx): ");
        altura = scanner.nextLine();


        double pesoNumero = Double.parseDouble(peso);
        double alturaNumero = Double.parseDouble(altura);

        double imc = pesoNumero/Math.pow(alturaNumero, 2);

        if (imc < 0) {
          classificacao = "Valor Inválido";
        } else if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Saudável";
        } else if (imc < 30) {
            classificacao = "Sobrepreso";
        } else if (imc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obresida Grau III";
        }

        System.out.printf("\n%s seu IMC é %.2f e sua classificação é %s", nome, imc, classificacao);
        }


    }

