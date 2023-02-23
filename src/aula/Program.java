/*Exercicio: Ler os dados (nome, valor hora e horas) de dois funcionários
e mostrar o valor total pago aos funcionários. Dados 1ºfuncionario: Ana, 80 reais, 10h.
Dados 2º funcionario: Joao, 50 reais, 12h. (sem OO por enquanto)
 */

import aula.Funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // Declarando as variaveis do tipo Funcionario:
        Funcionario funcionario1, funcionario2;

        //instanciando os objetos, criando dentro da memoria:
        funcionario1 = new Funcionario();
        funcionario2 = new Funcionario();



        System.out.println("Dados do primeiro funcionário:" );
         funcionario1.nome= scanner.next();
         funcionario1.valorPorHora = scanner.nextDouble();
       funcionario1.horas  = scanner.nextInt();

        System.out.println("Dados do segundo funcionário:" );
       funcionario2.nome  = scanner.next();
        funcionario2.valorPorHora = scanner.nextDouble();
        funcionario2.horas= scanner.nextInt();

        double  total = funcionario1.total() + funcionario2.total();
        System.out.println("Total:" + total);


    }
}
