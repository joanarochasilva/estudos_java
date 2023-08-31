import java.util.Scanner;

public class PecasPagas {
    public static void main(String[] args) {

        //instanciando o objeto sc
        Scanner sc = new Scanner(System.in);

        //criando as variaveis
        int codPeca1, numPeca1, codPeca2, numPeca2;
        double valorPeca1, valorPeca2, valorPag;

        //leitura
        codPeca1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();;

        codPeca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        //processamento
        valorPag = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        //saida
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPag);

        //fechando sc
        sc.close();

    }
}