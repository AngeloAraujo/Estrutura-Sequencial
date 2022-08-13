import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira a temperatura em Farenheit para ser convertida: ");
		float Farenheit = entrada.nextFloat();
			
		System.out.println("A temperatura Farenheit convertida em Celsius é: "+(5*(Farenheit-32)/9)+ " Celsius");
		
		entrada.close();
	}

}
