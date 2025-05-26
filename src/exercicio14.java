import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DIAS PARA O NATAL ===");
        System.out.print("Digite o a data no seguinte formato (xx/xx/xxxx): ");
        String data = scanner.nextLine();

        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6);
        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);

        int diasFaltantes;
        int diasPassados;
        boolean bissexto;

        if ((!data.substring(2, 3).equals("/")) || (!data.substring(5, 6).equals("/"))) {
            System.out.println("O formato da data está incorreto");
        } else if (data.length() != 10) {
            System.out.println("O tamanho está incorreto!");
        } else if ((diaInt>31) && (mesInt == 1 || mesInt == 3 || mesInt == 5 || mesInt == 7 || mesInt == 8 || mesInt == 10 || mesInt == 12)) {
            System.out.println("O mês escolhido tem apenas 31 dias!");
        } else if ((diaInt>30) && (mesInt == 4 || mesInt == 6 || mesInt == 9 || mesInt == 11)) {
            System.out.println("O mês escolhido tem apenas 30 dias!");
        } else {
            bissexto = (anoInt % 4 == 0) || (anoInt % 100 == 0 && anoInt % 400 == 0) && (diaInt != 29);

            if (bissexto &&  diaInt > 29 && mesInt == 2) {
                System.out.println("Fevereiro tem apenas 29 dias em ano bissexto!");
            } else if (!bissexto && diaInt > 28 && mesInt == 2) {
                System.out.println("Fevereiro tem apenas 28 dias!");
            } else {
                switch (mesInt) {
                    case 1:
                        if (bissexto) {
                            diasFaltantes = (359+1) - diaInt;
                        } else {
                            diasFaltantes = 359 - diaInt;
                        }
                        break;
                    case 2:
                        if (bissexto) {
                            diasPassados = (31 - 1) + diaInt;
                        } else {
                            diasPassados = 31 + diaInt;
                        }
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 3:
                        diasPassados = 59 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 4:
                        diasPassados = 90 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 5:
                        diasPassados = 120 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 6:
                        diasPassados = 151 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 7:
                        diasPassados = 181 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 8:
                        diasPassados = 212 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 9:
                        diasPassados = 242 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 10:
                        diasPassados = 303 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 11:
                        diasPassados = 304 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    case 12:
                        if (diaInt == 25) {
                            System.out.println("Hoje é natal!!!");
                        } else if (diaInt > 25) {
                            System.out.println("O natal já passou!");
                        }
                        diasPassados = 334 + diaInt;
                        diasFaltantes = 359 - diasPassados;
                        break;
                    default:
                        diasFaltantes = 0;
                        System.out.println("Existem meses somente de 1 a 12.");
                }
                System.out.printf((diasFaltantes > 0) ? "Faltam " + diasFaltantes + " dias para o natal." : " ");
            }
        }
    }
}
