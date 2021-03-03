package sec01alphabetpatterns;
import java.util.*;
public class AlphabetPattern04 {

	/*
	 This program is to print a character/alphabet pattern 4 in JAVA.

A A A A A
B B B B
C C C
D D
E
	 */
	public static void main(String[] args) {
		
		 int i,j,n;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the no of lines");
		 n= sc.nextInt();
		 
		 for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++) {
				
				System.out.print((char)(i+64));
				
			}
			System.out.println("");
		}
		 

		
		
	}

}
