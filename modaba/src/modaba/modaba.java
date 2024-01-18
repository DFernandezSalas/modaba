package modaba;

import java.util.Scanner;

public class modaba {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Pon un numero de 'y modabas': ");
		int n = reader.nextInt();
		String text = "y modab";
		for(int i = 0;i<n;i++) {
			text = text + "a";
			System.out.println(text);
		}
	}
}
