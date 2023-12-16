package co.in.excercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVData {
	private static final String CSV_FILE_PATH = "";

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(";");
				for (String d : data) {
					System.out.println(d + "\t");
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
