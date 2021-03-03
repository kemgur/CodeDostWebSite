package sec01alphabetpatterns;

import java.util.Scanner;

public class AlphabetPattern0303 {

	/*
    This program is to print a character/alphabet pattern 3 in JAVA.
E
D D
C C C
B B B B
A A A A A
    */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character"); 				
		char c = scan.next().toUpperCase().charAt(0); 
		
		if ( c < 'A' || c > 'Z')
			System.out.println("Please enter an alphabet");
		
		else {
			int x = c - 64;						 
			for ( int i = 0 ; i < x ; i++) { 
				for ( int j = 0 ; j <= i ; j++) {
					System.out.print(((char)(c - i)) + " ");
				}
				System.out.println();
			}
			
		}
		scan.close();

	}
}
