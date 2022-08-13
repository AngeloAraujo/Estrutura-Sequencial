import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o raio para calcular a área do círculo: ");
		float raio = entrada.nextFloat();
		
		System.out.println("A área do círculo é: "+(3.14*(Math.pow(raio, raio))));
		
		entrada.close();
	}

}
