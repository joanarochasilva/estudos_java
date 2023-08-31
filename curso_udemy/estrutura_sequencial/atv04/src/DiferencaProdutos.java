import java.util.Scanner;

public class DiferencaProdutos {
    public static void main(String[] args) {
        //instanciando o objeto sc

        Scanner sc = new Scanner(System.in);

        //Criando as variáveis que serão lidas e a que armazenara resultados

        int a, b, c, d, diferenca;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        //processando

        diferenca = (a * b) -(c * d);

        //saida

        System.out.printf("DIFERENÇA = %d%n", diferenca);

        //fechando sc
        sc.close();
    }
}