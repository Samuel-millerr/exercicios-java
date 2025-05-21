import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String classificacao;

        System.out.println("=== VERIFICADOR DE CLASSE ELEITORAL ===");
        System.out.println("A classificação atual da classe eleitoral está no seguinte esquema: ");
        System.out.println(" Não eleitor (abaixo de 16 anos)]\n Eleitor Obrigatório (entre 18 e 65 anos)\n Eleitor facultativo (16 a 18 anos e maior de 65 anos");
        System.out.print("Insira a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        if (idade < 1) {
            classificacao = "Idade Inválida!";
        } else if (idade <= 15) {
            classificacao = "não eleitor!";
        } else if (idade >= 18 && idade <= 65) {
            classificacao = "eleitor obrigatório!";
        } else {
            classificacao = "eleitor facultativo!";
        }

        System.out.printf("Sua classificação é de: %s", classificacao);
    }
}
