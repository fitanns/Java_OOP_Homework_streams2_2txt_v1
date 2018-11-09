package com.gmail.fitanns;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFiles {

	public void fileWrite(File file1, File file2) {
		String str = "Hello World";
		String str2 = "Hello Peace";
		try (PrintWriter a = new PrintWriter(file1); PrintWriter b = new PrintWriter(file2)) {
			a.println(str);
			b.println(str2);
		} catch (IOException e) {
			System.out.println("File write error");
		}
	}

	public static String loadFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				sb.append(sc.nextLine()).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}

	public String[] stringEquals(String[] arrayA, String[] arrayB) {
		int z = 0;
		for (String i : arrayA) {
			for (String b : arrayB) {
				if (i.equals(b)) {
					z++;
				}
			}
		}
		String[] arrayC = new String[z];
		int y = 0;
		for (String i : arrayA) {
			for (String b : arrayB) {
				if (i.equals(b)) {
					arrayC[y] = i;
					y++;

				}
			}
		}
		return arrayC;
	}

	public void writeFile3(File file3, String c) {

		try (PrintWriter z = new PrintWriter(file3)) {
			z.println(c);
		} catch (IOException e) {
			System.out.println("File write error");
		}
	}



}
