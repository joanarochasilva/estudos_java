import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class SalarioFuncionario {
    public static void main(String[] args) {
        //mudando a localidade (ponto flutuante)
        Locale.setDefault(US);

        //instanciando o objeto sc
        Scanner sc = new Scanner(System.in);

        //criando as variaveis
        int numero;
        double horasTrabalhadas, valorHorastrabalhadas, salario;

        //leitura
        numero = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        valorHorastrabalhadas = sc.nextDouble();

        //processamento
        salario = horasTrabalhadas * valorHorastrabalhadas;

        //saida
        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}