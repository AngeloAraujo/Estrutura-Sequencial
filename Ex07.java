import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o comprimento do quadrado em metros: ");
		float comprimento = entrada.nextFloat();
		
		System.out.print("Insira a largura do quadrado em metros: ");
		float largura = entrada.nextFloat();
		
		System.out.println("A �rea do quadrado �: "+(comprimento*largura)+ " m�");
		
		entrada.close();
	}

}
