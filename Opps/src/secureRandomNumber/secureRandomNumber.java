package secureRandomNumber;

import java.security.SecureRandom;

public class secureRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecureRandom randomNumbers = new SecureRandom();
		
		for (int counter = 1; counter <= 3; counter++) {
			
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d  ", face); // display generated value
			if (counter % 3 == 0) {
				System.out.println();
				}
			}
		}
	}
