/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

/**
 *
 * @author BLADE CVA120
 */
import java.util.Scanner;
import java.util.Locale;
import entidade_calc.Calc;
import entidade_tab.Tabuada;

public class Calculadora {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();
        Tabuada tab = new Tabuada();

        //System.out.print("Informe qual tabuada deseja utilizar: ");
        System.out.print("Informe um n�mero: ");
        calc.n1 = sc.nextDouble();
        System.out.print("Informe um n�mero: ");
        calc.n2 = sc.nextDouble();

        System.out.printf("Adi��o: %.2f%n", calc.adi��o());
        System.out.printf("Subtra��o: %.2f%n", calc.subtra��o());
        System.out.printf("Multiplica��o: %.2f%n", calc.multiplica��o());
        System.out.printf("Divis�o: %.2f%n", calc.divis�o());
        calc.linha();
        System.out.print("Informe um n�mero para mostrar a tabuada: ");
        tab.n1 = sc.nextInt();
        tab.adi��o();
        calc.linha();
        tab.subtra��o();
        calc.linha();
        tab.multiplica��o();
        calc.linha();
        tab.divis�o();

    }

}
