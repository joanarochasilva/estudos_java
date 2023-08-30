import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        //A entrada de dados em Java depende da instanciação de um objeto usando a biblioteca Scanner
        //Essa instanciação interliga sc ao teclado
        //Ao final dê sc.close()
        Scanner sc = new Scanner(System.in);

        //sc.next() permite que a palavra digitada seja armazenada dentro da variável
        String a;
        a = sc.next();

        System.out.println("Você digitou: " + a);

        //Ler um número inteiro
        int b;
        b = sc.nextInt();

        //Ler um número com ponto flutuante
        double c;
        c = sc.nextDouble();

        //Ler um caractere
        char e;
        e = sc.next().chartAt(0);

        //Ler vários dados na mesma linha
        String f;
        int g;
        double h;
        f = sc.next();
        g = sc.nextInt();
        h = sc.nextDouble();

        //Ler até quebra de linha
        //Usando apneas o next() lê-se apenas uma palavra
        String i;
        i = sc.nextLine();

        sc.close();
    }
}