package variaveisExercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

    Scanner readAnswer = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = readAnswer.nextInt();
		
		if (n1%2 ==0) {
			System.out.println("The number is even");
			
		} if(n1%2 != 0) {
			System.out.println("The number is odd");
		}
    
    }
    }
