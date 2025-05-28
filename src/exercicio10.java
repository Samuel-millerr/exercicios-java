import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioAumento;
        String porcentagem;

        System.out.println("=== REAJUSTE DE SALÁRIO ===");
        System.out.println("Seja bem, vindo(a)! Para verificarmos o reajuste do seu salário insira as informações abaixo: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário atual: ");
        double salario = Double.parseDouble(scanner.nextLine());

        if (salario < 759) {
            System.out.println("A informação do salário está em incorreta. Em nossa empresa não oferecemos salários abaixo dos R$759");
        } else {
            if (salario <= 3000) {
                salarioAumento = salario*1.35;
                porcentagem = "35%";
            } else {
                salarioAumento = salario*1.15;
                porcentagem = "15%";
            }
            System.out.printf("Parabéns %s, você teve um aumento de %s. Seu novo salário é R$%.2f", nome, porcentagem, salarioAumento);
        }
    }
}
