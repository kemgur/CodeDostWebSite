package sec01alphabetpatterns;

import java.util.Scanner;

public class AlphabetPattern02 {

	/*
	 
	 This program is to print a character/alphabet pattern 2 in JAVA.

E E E E E
D D D D
C C C
B B
A
	 */
	public static void main(String[] args) {
		
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines");//Satır sayısını girin
		n = sc.nextInt();
		
		for (i = n; i>=1; i--) {
			for (j = 1;  j<=i; j++) {
				
				System.out.print((char)(64+i));
				
			}
			System.out.println("");
		}
		
	}

}
