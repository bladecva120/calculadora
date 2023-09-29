/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

/**
 *
 * @author BLADE CVA120
 */
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Locale;
import calc_entidade.Calc;
import tab_entidade.Tabuada;
import imc_entidade.Imc;
import media_entidade.Media;

public class Calculadora {

    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();
        Tabuada tab = new Tabuada();
        Imc imc = new Imc();
        Media media = new Media();
        System.out.println("*** JAVA APPLICATION ***");
        calc.linhaApp();
        while (true) {
            System.out.print(
                    "[1]-Calculadora\n"
                    + "[2]-Mostrar tabuada\n"
                    + "[3]-Calcular IMC\n"
                    + "[4]-Média de nota\n"
                    + "[0]-Sair\n"
                    + "O que deseja fazer?: ");
            int opc = sc.nextInt();
            if (opc == 1) {
                calc.linha();
                System.out.print(
                        "[A]-Adição\n"
                        + "[S]-Subtração\n"
                        + "[M]-Multiplicação\n"
                        + "[D]-Divisão\n"
                        + "Qual função matemática deseja operar?: ");
                char resp = sc.next().charAt(0);
                if (resp == 'a') {
                    calc.linha();
                    System.out.print("Informe um número: ");
                    calc.n1 = sc.nextDouble();
                    System.out.print("Informe um número: ");
                    calc.n2 = sc.nextDouble();
                    System.out.printf("Adição: %.2f%n", calc.adição());
                    calc.linha();
                } else if (resp == 's') {
                    System.out.print("Informe um número: ");
                    calc.n1 = sc.nextDouble();
                    System.out.print("Informe um número: ");
                    calc.n2 = sc.nextDouble();
                    System.out.printf("Subtração: %.2f%n", calc.subtração());
                    calc.linha();
                } else if (resp == 'm') {
                    System.out.print("Informe um número: ");
                    calc.n1 = sc.nextDouble();
                    System.out.print("Informe um número: ");
                    calc.n2 = sc.nextDouble();
                    System.out.printf("Multiplicação: %.2f%n", calc.multiplicação());
                    calc.linha();
                } else if (resp == 'd') {
                    System.out.print("Informe um número: ");
                    calc.n1 = sc.nextDouble();
                    System.out.print("Informe um número: ");
                    calc.n2 = sc.nextDouble();
                    System.out.printf("Divisão: %.2f%n", calc.divisão());
                    calc.linha();
                }
            } else if (opc == 2) {
                calc.linha();
                System.out.print(
                        "[A]-Adição\n"
                        + "[S]-Subtração\n"
                        + "[M]-Multiplicação\n"
                        + "[D]-Divisão\n"
                        + "Qual operação matemática deseja mostrar?: ");
                char resp = sc.next().charAt(0);
                calc.linha();
                if (resp == 'a') {
                    System.out.print("Qual tabuada da Adição quer exibir?: ");
                    tab.n1 = sc.nextInt();
                    tab.adição();
                    calc.linha();
                } else if (resp == 's') {
                    System.out.print("Qual tabuada da Subtração que exibir?: ");
                    tab.n1 = sc.nextInt();
                    tab.subtração();
                    calc.linha();
                } else if (resp == 'm') {
                    System.out.print("Qual tabuada da Multiplicação que exibir?: ");
                    tab.n1 = sc.nextInt();
                    tab.multiplicação();
                    calc.linha();
                } else if (resp == 'd') {
                    System.out.print("Qual tabuada da divisão quer exibir?: ");
                    tab.n1 = sc.nextInt();
                    tab.divisão();
                    calc.linha();
                }

            } else if (opc == 3) {
                calc.linha();
                System.out.print("Informe seu peso: ");
                imc.peso = sc.nextDouble();
                System.out.print("Informe sua altura: ");
                imc.altura = sc.nextDouble();
                calc.linha();
                System.out.printf("IMC: %.2f%n", imc.imcCalc());
                calc.linha();
            } else if (opc == 4) {
                calc.linha();
                System.out.print("Informe a quantidade de notas: ");
                media.quant = sc.nextInt();
                for (int i = 1; i <= media.quant; i++) {
                    System.out.printf("informe a %dª nota: ", i);
                    media.n1 = sc.nextDouble();
                    media.soma += media.n1;
                }
                System.out.printf("Média de notas: %.2f%n", media.calcMedia());
                calc.linha();
            } else if (opc == 0) {
                calc.linha();
//                // dorme por 5 segundos
//                TimeUnit.SECONDS.sleep(1);
//                System.out.print("ENCERRANDO");
//                TimeUnit.SECONDS.sleep(1);
//                System.out.print(".");
//                TimeUnit.SECONDS.sleep(1);
//                System.out.print(".");
//                TimeUnit.SECONDS.sleep(1);
//                System.out.print(".");
//                TimeUnit.SECONDS.sleep(1);
//                System.out.println("FIM DO PROGRAMA!!");
//                TimeUnit.SECONDS.sleep(1);
//                calc.linha();
//                TimeUnit.SECONDS.sleep(1);
                break;
            }
        }
    }
}
