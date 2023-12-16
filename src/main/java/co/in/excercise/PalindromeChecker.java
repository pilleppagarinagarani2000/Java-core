package co.in.excercise;

import java.util.Scanner;

public class PalindromeChecker {

	private boolean isPalindrome(String input, int start, int end) {
		if (input == null || input.length() == 0)
			return false;
		if (start == end)
			return true;
		if (input.charAt(start) != input.charAt(end))
			return false;
		if (start < end + 1)
			return isPalindrome(input, ++start, --end);

		return true;
	}

	public boolean isPalindrome(String input) {
		return isPalindrome(input, 0, input != null ? input.length() - 1 : 0);
	}

	public static void main(String[] args) {
		PalindromeChecker checker = new PalindromeChecker();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter value for input");
			String input = sc.next();
			System.out.println(input);
			boolean isPolindrom = checker.isPalindrome(input);

			if (isPolindrom) {
				System.out.println(input + " is a polyndrom string");
			} else {
				System.out.println(input + " is not a polyndrom string");
			}

		}

	}
}
