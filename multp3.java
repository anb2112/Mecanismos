package atv3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n;
		Scanner input= new Scanner(System.in);
		System.out.println("Digite o numero:");
		n = input.nextFloat();
		if (n%3==0) {System.out.println("é múltiplo de 3");}
		else {System.out.println("não é múltiplo de 3");}
	}

}
