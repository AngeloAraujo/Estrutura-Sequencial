import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira a dist�ncia em metros para ser convertida: ");
		int metro = entrada.nextInt();
		
		System.out.println("A medida em cent�metros �: "+(metro*100)+" cm.");
		
		entrada.close();
	}

}
