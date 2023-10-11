package atv3;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a idade");
		idade = input.nextInt();
		if (idade<16) {System.out.println("Não eleitor");}
			else if (idade==18 && idade<=65) {System.out.println("Eleitor obrigatorio");}
				else if (idade==17) {System.out.println("Eleitor facultativo");}
					else if (idade==16) {System.out.println("Eleitor facultativo");}
						else if (idade>65) {System.out.println("Eleitor facultativo");}
					
	}

}
