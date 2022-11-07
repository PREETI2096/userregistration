package com.bridgelabz.userregistration;
import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
	public void validFirstName() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String firstName = sc.nextLine();

		boolean fName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName);

		if (fName) {
			System.out.println("firstname is correct ");
		} else {
			System.out.println("firstname is incorrect ");
		}
	}
}