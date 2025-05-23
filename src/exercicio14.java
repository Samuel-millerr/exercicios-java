import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bissexto;

        System.out.println("=== DIAS PARA O NATAL ===");
        String data = scanner.nextLine();

        String dia = data.substring(0,2);
        String mes = data.substring(3,5);
        String ano = data.substring(6);
        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);

        System.out.println("DEBUG");
        System.out.println(diaInt);
        System.out.println(mesInt);
        System.out.println(anoInt);
        if ((!data.substring(2,3).equals("/")) || (!data.substring(5,6).equals("/"))) {
            System.out.println("O formato da data está incorreto");
            if (data.length() != 9) {
                System.out.println("O tamanho está incorreto!");
            }
        } else {
            int diasFaltantes = 30*(12-mesInt);

            System.out.println("\nDEBUG");
            System.out.println(diasFaltantes);

            switch (mesInt) {
                case 1:
                    diasFaltantes = (diaInt==31) ? diasFaltantes += 1 : diasFaltantes;
                    System.out.println("\nDEBUG");
                    System.out.println(diasFaltantes);
                case 2:
                    if ((anoInt % 4 == 0) || (anoInt % 100 == 0 && anoInt % 400 != 0)) {
                        bissexto = true;
                        diasFaltantes += 29;
                    } else {
                        bissexto = false;
                        diasFaltantes += 28;
                    }
                    System.out.println("\nDEBUG");
                    System.out.println(diasFaltantes);
                case 5:
                    diasFaltantes = (diaInt==31) ? diasFaltantes += 2 : diasFaltantes;
                    System.out.println("\nDEBUG");
                    System.out.println(diasFaltantes);
                case 7:
                    diasFaltantes = (diaInt==31) ? diasFaltantes += 3 : diasFaltantes;
                    System.out.println("\nDEBUG");
                    System.out.println(diasFaltantes);
                case 8:
                    diasFaltantes = (diaInt==31) ? diasFaltantes += 4 : diasFaltantes;
                    System.out.println("\nDEBUG");
                    System.out.println(diasFaltantes);
                case 10:
                    diasFaltantes = (diaInt==31) ? diasFaltantes += 5 : diasFaltantes;
                    System.out.println("\nDEBUG");
                    System.out.println(diasFaltantes);
                case 12:
                    diasFaltantes = (diaInt==31) ? diasFaltantes += 1 : diasFaltantes;
                    System.out.println("\nDEBUG");
                    System.out.println(diasFaltantes);
            }
            System.out.println(diasFaltantes);


            }
        }
    }
