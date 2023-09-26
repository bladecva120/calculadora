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
        System.out.print("Informe um número: ");
        calc.n1 = sc.nextDouble();
        System.out.print("Informe um número: ");
        calc.n2 = sc.nextDouble();

        System.out.printf("Adição: %.2f%n", calc.adição());
        System.out.printf("Subtração: %.2f%n", calc.subtração());
        System.out.printf("Multiplicação: %.2f%n", calc.multiplicação());
        System.out.printf("Divisão: %.2f%n", calc.divisão());
        calc.linha();
        System.out.print("Informe um número para mostrar a tabuada: ");
        tab.n1 = sc.nextInt();
        tab.adição();
        calc.linha();
        tab.subtração();
        calc.linha();
        tab.multiplicação();
        calc.linha();
        tab.divisão();

    }

}
