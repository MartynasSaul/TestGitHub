package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Nuo kurios raides norite spausdinti?");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputText = scanner.next().toLowerCase();
		
		scanner.close();
				
		char input = inputText.charAt(0);
		
		if (!Character.isAlphabetic(input)) {
			System.out.println("Tai ne simbolis");
			return;
		}
	
		
		
		
		for (char c = input; c <= 'z'; c++) {
			
			String symbol = ", ";
			
			if (c == 'z') {
				symbol = ".";
			}
			
			System.out.print (c + symbol);
}

	}
	
}
