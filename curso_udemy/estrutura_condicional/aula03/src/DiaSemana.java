import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                System.out.println(dia);
                break;

            case 2:
                dia = "segunda";
                System.out.println(dia);
                break;

            case 3:
                dia = "terça";
                System.out.println(dia);
                break;

            case 4:
                dia = "quarta";
                System.out.println(dia);
                break;

            case 5:
                dia = "quinta";
                System.out.println(dia);
                break;

            case 6:
                dia = "sexta";
                System.out.println(dia);
                break;

            case 7:
                dia = "sábado";
                System.out.println(dia);
                break;

            default:
                System.out.println("Valor inválido!");
        }
    }
}