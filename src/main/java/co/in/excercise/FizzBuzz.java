package co.in.excercise;

import java.util.Scanner;

public class FizzBuzz {

	public String convert(int toConvertToFizzBuzz) {
		if (toConvertToFizzBuzz <= 0) {
			return "";
		} else if (toConvertToFizzBuzz % 3 == 0 && toConvertToFizzBuzz % 5 == 0) {
			return "FizzBuzz";
		} else if (toConvertToFizzBuzz % 3 == 0) {
			return "Fizz";
		} else if (toConvertToFizzBuzz % 5 == 0) {
			return "Buzz";
		} else {
			return "";
		}

	}

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter value for input");
			int input = sc.nextInt();
			//IntStream.rangeClosed(1, input).mapToObj(i -> fizzBuzz.convert(i) + " ").forEach(System.out::print);
			for (int i = 1; i <= input; i++) {
				String fizbuz = fizzBuzz.convert(i);
				System.out.print(fizbuz.length() > 0 ? fizbuz + " " : "");
			}
		}
	}

}
