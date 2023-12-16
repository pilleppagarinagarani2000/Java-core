package co.in.excercise;

import java.util.Scanner;

public class StringBuilderReverseString {

	public static void main(String[] args) {
		StringBuilderReverseString r = new StringBuilderReverseString();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter sentance");
			String sentance = sc.nextLine();
			System.out.println(r.reverseString(sentance));
		}
	}

	public String reverseString(String sentance) {
		if (sentance == null || sentance.length() <= 0)
			return "";
		StringBuilder finalReverse = new StringBuilder();
		String[] words = sentance.split(" ");
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			finalReverse.append(sb).append(" ");
		}
		return finalReverse.toString().trim();
	}

}
