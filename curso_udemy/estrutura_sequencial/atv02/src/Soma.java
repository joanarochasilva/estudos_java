import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        //instanciando o objeto responsável pela leitura
        Scanner sc = new Scanner(System.in);

        //criando as variáveis que receberão os valoes de entrada
        int x, y, soma;

        //leitura
        x = sc.nextInt();
        y = sc.nextInt();

        //processamento da requisição
        soma = x + y;

        //Saida
        System.out.printf("Soma = %d", soma);

        //fechando o leitor (boa prática)
        sc.close();
    }
}