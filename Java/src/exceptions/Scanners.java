package exceptions;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your Name ?");
		String name=sc.nextLine();
		System.out.printf("this is %s:%n",name);

		System.out.printf("ok,%s what is your age ?:%n",name);
		int age=sc.nextInt();
		System.out.printf("iam %d old:%n", age);

		System.out.println("hey what's the price of this piece:");
		float f= sc.nextFloat();
		System.out.printf("its price is %.3f:%n",f);

		sc.nextLine();
		System.out.printf("enter your surName %s%n",name);
		String surName=sc.nextLine();

		char c=surName.charAt(0);
		System.out.printf("your surName starts with %c",c);
		sc.close();
	}
}
