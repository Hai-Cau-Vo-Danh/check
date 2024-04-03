package thử;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String name = sc.next();
			int age = sc.nextInt();
			double gpa = sc.nextDouble();
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Grade Point Average: " + gpa);
		}
	}
}