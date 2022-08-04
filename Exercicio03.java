package variaveisExercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
  Scanner readNumber = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = readNumber.nextInt();
		
		System.out.println("Enter the secon number: ");
		int num2 = readNumber.nextInt();
		
		if (num1 == num2) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");		
		}
    
  }
}
