import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o raio para calcular a �rea do c�rculo: ");
		float raio = entrada.nextFloat();
		
		System.out.println("A �rea do c�rculo �: "+(3.14*(Math.pow(raio, raio))));
		
		entrada.close();
	}

}
