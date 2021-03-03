package sec01alphabetpatterns;

import java.util.Scanner;

//Guzel bir soru
//Cozunce daha guzel oldu.Remote olarak.  
//Kemal
//Cakisma- kemal
public class AlphabetPattern01 {

	/*
	 This program is to print a character/alphabet pattern 1 in JAVA.

A
B B
C C C
D D D D
E E E E E
	 */
	public static void main(String[] args) {
		
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines");//Satır sayısını girin
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			for(j=1 ; j<=i ; j++) {
				System.out.print((char)(i+64));	//'A'==65 ascii value
			}
			System.out.println("");//Bir alt satira inmesi icin
		}
		
	}

}
