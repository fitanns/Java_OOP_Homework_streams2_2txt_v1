package com.gmail.fitanns;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File folder = new File("folder");
		folder.mkdirs();
		File file1 = new File("folder", "1.txt");
		File file2 = new File("folder", "2.txt");
		File file3 = new File("folder", "3.txt");
		try {
			file1.createNewFile();
			file2.createNewFile();
			file3.createNewFile();
		} catch (IOException e) {
			System.out.println("Error createNewFile");
		}

		TextFiles t = new TextFiles();
		t.fileWrite(file1, file2);

		String a = t.loadFromFile(file1);
		String b = t.loadFromFile(file2);

		String[] arrayA = a.split(" ");
		String[] arrayB = b.split(" ");

		String[] c = t.stringEquals(arrayA, arrayB);
		for (String z : c) {
			t.writeFile3(file3, z);
		}

	}
}
