public class FuncoesMat {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
        double E, F, G;
        double H, I, J;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        System.out.printf("A raíz quadrada de %.2f é igual a %.2f%n", x, A);
        System.out.printf("A raíz quadrada de %.2f é igual a %.2f%n", y, B);
        System.out.printf("A raíz quadrada de %.2f é igual a %.2f%n", z, C);

        E = Math.pow(x, y);
        F = Math.pow(y, 2.0);
        G = Math.pow(z, 2.0);
        System.out.printf("%.2f elevado a %.2f é igual a: %f%n", x, y, E);
        System.out.printf("%.2f elevado a 2 é igual a: %.2f%n", y, F);
        System.out.printf("%.2f elevado a 2 é igual a: %.2f%n", z, G);

        H = Math.abs(x);
        I = Math.abs(y);
        J = Math.abs(z);
        System.out.printf("A raíz quadrada de %.2f é igual a %.2f%n", x, H);
        System.out.printf("A raíz quadrada de %.2f é igual a %.2f%n", y, I);
        System.out.printf("A raíz quadrada de %.2f é igual a %.2f%n", z, J);
    }
}