package atv3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n= input.nextInt();
		if(n%2==0) { 
			System.out.println("par");
		}else {System.out.println("impar");}
	}

}
