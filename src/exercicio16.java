import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorVenda, comissaoFixa, taxaComissao, comissao;

        taxaComissao = 0.14;
        boolean menorZero = false;

        System.out.println("=== COMISSÃO ===");
        System.out.println("Insira abaixo o valor de sua venda e será demostrado o valor da sua comissão");
        System.out.print("Valor da Venda: ");
        valorVenda = Double.parseDouble(scanner.nextLine());

        if (valorVenda <= 0) {
            comissaoFixa = 0;
            comissao = 0;
            menorZero = true;
        } else if (valorVenda < 40000) {
            comissaoFixa = 500;
            comissao = valorVenda*taxaComissao;
            comissao += comissaoFixa;
        } else if (valorVenda < 60000) {
            comissaoFixa = 550;
            comissao = valorVenda*taxaComissao;
            comissao += comissaoFixa;
        } else if (valorVenda < 80000) {
            comissaoFixa = 600;
            comissao = valorVenda*taxaComissao;
            comissao += comissaoFixa;
        } else if (valorVenda < 100000) {
            comissaoFixa = 650;
            comissao = valorVenda*taxaComissao;
            comissao += comissaoFixa;
        } else {
            taxaComissao = 0.16;
            comissaoFixa = 700;
            comissao = valorVenda*taxaComissao;
            comissao += comissaoFixa;
        }

        if (menorZero) {
            System.out.println("Você não vendeu nem um real :(");
        } else {
            System.out.printf("Segue abaixo as informações sobre a comissão: \nValor da Venda: R$%.2f \nComissão Fixa: R$%.2f \nComissao total (taxa:%.0f%%): R$%.2f", valorVenda, comissaoFixa, taxaComissao*100, comissao);
        }
    }
}
