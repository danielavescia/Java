package variaveisExercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
	
  Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = input.nextInt();
		
		System.out.println("Enter the age that you want to retire:");
		int ageRetire = input.nextInt();
		
		int timeToRetire = ageRetire - age;
		
		int retired = age - ageRetire;
		
		
		if(age >= 18 && ageRetire <= 99 && age < ageRetire) {
			System.out.println("You got " + timeToRetire +  " years to work");
		
		} else  if (age> ageRetire) {
			System.out.println("You already retired " + retired+ " years ago");
		} else {
			System.out.println("You must enter a validad age");}
