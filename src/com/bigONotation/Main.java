package com.bigONotation;

public class Main {
	public void log(int[] numbers, String[] names) {
		// This method will run in constant time of O(1) means constant time
		System.out.println(numbers[0]);
		System.out.println(numbers[0]);

		// O(2+n)
		System.out.println();// O(1)
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}
		System.out.println();// O(1)

		// O(n + n) or O(2n)
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}

		// O(n + m) or can be simplified to O(n) as the runtime complexity increases
		// linearly
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}
		for (String name : names) {
			System.out.println(name);// O(m)
		}

		// O(n*n) 
		// Quadratic
		for (int number : numbers)// O(n)
			for (String name : names)// O(n)
				System.out.println("number ::"+"name");
		
		// O(log n) 
		// logarithmic - an algorithm that run in logarithmic curve slows down at some point

	}

}
