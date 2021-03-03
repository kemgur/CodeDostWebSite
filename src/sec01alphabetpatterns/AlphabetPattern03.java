package sec01alphabetpatterns;

import java.util.Scanner;

public class AlphabetPattern03 {

	/*
	 This program is to print a character/alphabet pattern 3 in JAVA.

E
D D
C C C
B B B B
A A A A A
	 */
	public static void main(String[] args) {
		

		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines");//Satır sayısını girin
		n = sc.nextInt();
		
		for (i = 1;  i<=n; i++) {
			for (j = 1; j <=i; j++) {
				
				System.out.print((char)(n-i+1+64));
			}
			System.out.println("");
			
		}
	}

}
