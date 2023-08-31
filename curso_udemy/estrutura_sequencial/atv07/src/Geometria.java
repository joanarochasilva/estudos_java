import java.util.Locale;
import java.util.Scanner;

public class Geometria {
    public static void main(String[] args) {

        //mudando local
        Locale.setDefault(Locale.US);

        //instanciando o objeto sc
        Scanner sc = new Scanner(System.in);

        //criando as variaveis
        double A, B, C, areaTriang, areaCirc, areaTrap, areaQuad, areaRetang;

        //leitura
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        //processamento
        areaTriang = (A * C) / 2;
        areaCirc = Math.PI * Math.pow(C, 2);
        areaTrap = ((A + B) * C) / 2;
        areaQuad = B * B;
        areaRetang = A * B;

        //saida
        System.out.printf("TRIANGULO: %.3f%n", areaTriang);
        System.out.printf("CIRCULO: %.3f%n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
        System.out.printf("QUADRADO: %.3f%n", areaQuad);
        System.out.printf("RETANGULO: %.3f%n", areaRetang);

        //fechando sc
        sc.close();
    }
}