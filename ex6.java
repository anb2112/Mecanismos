package atv3;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float peso, altu, imc;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		peso = input.nextFloat();
		System.out.println("Digite a altura: ");
		altu = input.nextFloat();
		imc =(float)((peso)/(altu*altu));
		System.out.println(imc);
		if (imc<20) {System.out.println("Abaixo do peso");}
			else if (imc>=20 && 26>imc) {System.out.println("Peso normal");}
				else if (imc>=25 && 31>imc) {System.out.println("Sobre peso");}
					else if (imc>=30 && 41>imc) {System.out.println("Obeso");}
							else if (imc>40) {System.out.println("Obeso morbido");}
								else {System.out.println("imc invalido");}
		}

}
