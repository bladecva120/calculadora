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
import bhask_entidade.Bhaskara;

public class Calculadora {

    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();
        Tabuada tab = new Tabuada();
        Imc imc = new Imc();
        while (true) {
            System.out.println("*** JAVA APPLICATION ***");
            calc.linhaApp();
            System.out.print(
                    "[1]-Calculadora\n"
                    + "[2]-Mostrar tabuada\n"
                    + "[3]-Calcular IMC\n"
                    + "[4]-M�dia de nota\n"
                    + "[5]-Bh�skara\n"
                    + "[0]-Sair\n"
                    + "O que deseja fazer?: ");
            int opc = sc.nextInt();
            if (opc == 1) {
                calc.linha();
                System.out.print(
                        "[A]-Adi��o\n"
                        + "[S]-Subtra��o\n"
                        + "[M]-Multiplica��o\n"
                        + "[D]-Divis�o\n"
                        + "Qual fun��o matem�tica deseja operar?: ");
                char resp = sc.next().charAt(0);
                if (resp == 'a') {
                    calc.linha();
                    System.out.print("Informe o 1� n�mero: ");
                    calc.n1 = sc.nextDouble();
                    System.out.print("Informe o 2� n�mero: ");
                    calc.n2 = sc.nextDouble();
                    System.out.printf("Adi��o: %.2f%n", calc.adi��o());
                    calc.linha();
                } else if (resp == 's') {
                    calc.linha();
                    System.out.print("Informe o 1� n�mero: ");
                    calc.n1 = sc.nextDouble();
                    System.out.print("Informe o 2� n�mero: ");
                    calc.n2 = sc.nextDouble();
                    System.out.printf("Subtra��o: %.2f%n", calc.subtra��o());
                    calc.linha();
                } else if (resp == 'm') {
                    calc.linha();
                    System.out.print("Informe o 1� n�mero: ");
                    calc.n1 = sc.nextDouble();
                    System.out.print("Informe o 2� n�mero: ");
                    calc.n2 = sc.nextDouble();
                    System.out.printf("Multiplica��o: %.2f%n", calc.multiplica��o());
                    calc.linha();
                } else if (resp == 'd') {
                    calc.linha();
                    System.out.print("Informe o 1� n�mero: ");
                    calc.n1 = sc.nextDouble();
                    System.out.print("Informe o 2� n�mero: ");
                    calc.n2 = sc.nextDouble();
                    System.out.printf("Divis�o: %.2f%n", calc.divis�o());
                    calc.linha();
                }
            } else if (opc == 2) {
                calc.linha();
                System.out.print(
                        "[A]-Adi��o\n"
                        + "[S]-Subtra��o\n"
                        + "[M]-Multiplica��o\n"
                        + "[D]-Divis�o\n"
                        + "Qual opera��o matem�tica deseja mostrar?: ");
                char resp = sc.next().charAt(0);
                calc.linha();
                if (resp == 'a') {
                    System.out.print("Qual tabuada da Adi��o quer exibir?: ");
                    tab.n1 = sc.nextInt();
                    tab.adi��o();
                    calc.linha();
                } else if (resp == 's') {
                    System.out.print("Qual tabuada da Subtra��o quer exibir?: ");
                    tab.n1 = sc.nextInt();
                    tab.subtra��o();
                    calc.linha();
                } else if (resp == 'm') {
                    System.out.print("Qual tabuada da Multiplica��o quer exibir?: ");
                    tab.n1 = sc.nextInt();
                    tab.multiplica��o();
                    calc.linha();
                } else if (resp == 'd') {
                    System.out.print("Qual tabuada da divis�o quer exibir?: ");
                    tab.n1 = sc.nextInt();
                    tab.divis�o();
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
                double soma = 0;
                System.out.print("Informe a quantidade de notas: ");
                int quant = sc.nextInt();
                calc.linha();
                for (int i = 1; i <= quant; i++) {
                    System.out.printf("informe a %d� nota: ", i);
                    double n1 = sc.nextDouble();
                    soma += n1;
                }
                Media media = new Media(quant, soma);
                System.out.printf("M�dia de notas: %.2f%n", media.calcMedia());
                calc.linha();
            } else if (opc == 5) {
                calc.linha();
                System.out.print("Informe o valor de A: ");
                int A = sc.nextInt();
                System.out.print("Informe o valor de B: ");
                int B = sc.nextInt();
                System.out.print("Informe o valor de C: ");
                int C = sc.nextInt();
                Bhaskara bhask = new Bhaskara(A, B, C);
                calc.linha();
                System.out.println("Valor de Delta: " + (int) bhask.delta());
                if (bhask.delta() > 0) {
                    System.out.println("Equa��o com 2 ra�zes reais e diferentes");
                } else if (bhask.delta() == 0) {
                    System.out.println("Equa��o com 2 ra�zes reais e iguais");
                } else if (bhask.delta() < 0) {
                    System.out.println("Equa��o n�o possui ra�zes reais");
                    calc.linha();
                    continue;
                }
                System.out.println("Valor de X1: " + bhask.valorX1());
                System.out.println("Valor de X2: " + bhask.valorX2());
                calc.linha();
            } else if (opc == 0) {
                calc.linha();
                // dorme por 5 segundos
                TimeUnit.SECONDS.sleep(1);
                System.out.print("ENCERRANDO");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("FIM DO PROGRAMA!!");
                TimeUnit.SECONDS.sleep(1);
                calc.linha();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
        }
    }
}
