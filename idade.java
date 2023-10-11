package atv3;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a idade");
		idade = input.nextInt();
		if(idade>0 && idade <18) {System.out.println("Menor de idade");}
		else if(idade<65 && idade >=18) {System.out.println("Maior de idade");}
			else if(idade >=65) {System.out.println("Pessoa idosa");}
				else if (idade<0){System.out.println("Idade não reconhecida");}
	}

}
