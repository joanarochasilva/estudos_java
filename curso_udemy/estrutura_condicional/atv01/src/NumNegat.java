import java.util.Scanner;

public class NumNegat {
    public static void main(String[] args) {
        //instanciando o objeto sc
        Scanner sc = new Scanner(System.in);

        //iniciando a variavel e lendo a informacao
        int num = sc.nextInt();
        String x;

        //procenssamento
        (num < 0) ? x = "NEGATIVO" : x = "NÃO NEGATIVO";


    }
}