/*
6.18 Displaying a square of Asterisks
@Author : Andreh Naisan
 */
package DisplayingASquareOfAsterisks618;

import java.util.Scanner;

public class SquareAsterisks {
    
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

            System.out.print("Enter side of square: ");
            
            int SQside = scanner.nextInt();
                
            scanner.close();

            SquareAsterisks(SQside);
    }

    public static void SquareAsterisks(int Side) {
            
	for (int i = 0; i < Side; i++) {
                    
        for (int j = 0; j < Side; j++)
                            
            System.out.print("*");

            System.out.println();
            
	}
    }
    
}
