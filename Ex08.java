import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex08 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);

		System.out.print("Quanto � o valor da sua hora de trabalho? ");
		double valorhora = entrada.nextFloat();
		
		System.out.print("Quantas horas voc� trabalhou este m�s? ");
		double horastrabalhadas = entrada.nextFloat();
		
		System.out.println("O seu sal�rio este m�s � de : "+(new DecimalFormat("#,##0.00").format(valorhora*horastrabalhadas)+ " reais"));
		
		entrada.close();
	}

}
