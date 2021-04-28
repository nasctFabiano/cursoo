package entities;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y2, y1, conta;
		
		System.out.println("x1   y1");
		System.out.println("x2   y2");
		System.out.println("Digite o valor de x1");
		x1 = sc.nextDouble();
		System.out.println("Digite o valor de y1");
		y1 = sc.nextDouble();
		System.out.println("Digite o valor de x2");
		x2 = sc.nextDouble();
		System.out.println("Digite o valor de y2");
		y2 = sc.nextDouble();
		
		conta = x1 * y2 / x2 * y1;
		
		System.out.println(conta);
		
		
		sc.close();
	}

}
