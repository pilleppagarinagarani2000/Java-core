package co.in.excercise;

public class Permutation {

	public static void main(String[] args) {
		Permutation permutation = new Permutation();
		String input = "ABC";
		permutation.printPermutation(input, 0, input.length() - 1);
	}

	public void printPermutation(String input, int l, int r) {
		if (l == r)
			System.out.println(input);
		else {
			for (int i = l; i <= r; i++) {
				input = swap(input, l, i);
				printPermutation(input, l + 1, r);
				input = swap(input, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
