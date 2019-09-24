package Validation;

import java.util.Scanner;

public class IntegerValidation {

	public static void main(String[] args) {
		String name;
		System.out.println("Enter name:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
	/*	if (name.matches("[a-zA-Z0-9_]{2}+")) {
		    System.out.println("Valid name");
		}else{
			System.out.println("Invalid name");
		}*/
		if (name.matches("[0-9]")) {
		    System.out.println("Valid name");
		}else{
			System.out.println("Invalid name");
		}
	}

}
