package atv3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, soma;
		Scanner input= new Scanner(System.in);
		System.out.println("Digite o primeiro numero para a soma:");
		n1 = input.nextFloat();
		System.out.println("Digite o segundo numero para a soma:");
		n2 = input.nextFloat();
		soma= (float)(n1+n2);
		if (soma>20) {System.out.println(soma+8);
		}
		if (soma<20){System.out.println(soma-5);
		}
		if (soma==20){System.out.println(soma-5);
		}
		
		
	}

}
