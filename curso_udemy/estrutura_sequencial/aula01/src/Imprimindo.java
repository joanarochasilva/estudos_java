import java.util.Locale;
public class Imprimindo {
    public static void main(String[] args) {

        System.out.println("Hello world");
        System.out.println("Bom dia");

        int y = 32;
        double x = 3.14569787992;
        System.out.println(y);
        System.out.println(x);

        //"%.2f" é o padrão da linguagem para definir o número de casas decimais.
        // Para usá-lo empregue a função printf ao invés de println.
        // Para gerar a quebra de linha nesse caso use System.out.printf("%.2f%n", x);

        System.out.printf("%.2f%n", x);
        System.out.printf("%.3f%n", x);

        // Printf pega o formato do computador que você está usando (separador do sistema).
        // Para trocar para o . utilizado internacionamente utiliza-se o comando abaixo

        Locale.setDefault(Locale.US);

        // Observe a troca por .
        System.out.printf("%.2f%n", x);
        System.out.printf("%.3f%n", x);

        // Concatenacao usando printf
        //O valor de x entará no lugar do %.2f com duas casas decimais
        System.out.printf("RESULTADO = %.2f metros%n", x);

        //Outra opcao de concatenacao usando outros marcadores
        //%f = ponto flutuante
        //%d = inteiro
        //%s = texto
        //%n = quebra de lina

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


    }
}