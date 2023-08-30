
public class Casting {
    public static void main(String[] args) {

        //Exemplo 2

        int x;
        double y;

        x = 5;
        y = 2;

        System.out.println(x);
        System.out.println(y);

        //Exemplo 3
        // Sempre indique o tipo de número. Double ponha x.0
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);

        //Exemplo 4
        //resultado inteiro, logo o resultado é arredondado. Para que isso não ocorra coloque double na frente (casting)
        int t, w;
        double resultado;

        t = 5;
        w = 2;

        resultado = (double) t / w;

        System.out.println(resultado);

        //Exemplo 5
        //Sem o casting, o código geraria um erro já que l é int e j double.
        double j;
        int l;

        j = 5.0;
        l = (int) j;

        System.out.println(l);


    }
}