import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=== DIAS PARA O NATAL ===");
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
        } else {
            bissexto = (anoInt % 4 == 0) || (anoInt % 100 == 0 && anoInt % 400 == 0) && (diaInt != 29);

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
                    diasPassados = 333 + diaInt;
                    diasFaltantes = 359 - diasPassados;
                    break;
                default:
                    diasFaltantes = 0;
                    System.out.println("Não existem mais de 12 meses no ano!");
            }
            System.out.println(diasFaltantes);
        }
    }
}
