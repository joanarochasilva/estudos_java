import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        //instanciando o objeto scanner
        Scanner sc = new Scanner(System.in);

        //criando a variavel que recebera o valor de entrada, a variável pi e a variável area
        double raio, area, pi = 3.14159;;

        //lendo
        raio = sc.nextDouble();

        //processando
        area = pi * Math.pow(raio, 2);

        //saida
        System.out.printf("A = %.4f", area);

        //fechando o objeto scanner
        sc.close();

    }
}