import java.util.Scanner;
public class Decryptor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int columns = 0;
		String encryptedInput = "";
		
		// finds the first number for columns, and then the encrypted string
		columns = sc.nextInt();
		sc.nextLine();
		encryptedInput = sc.nextLine();


		System.out.println(columns);
		System.out.println(encryptedInput);

		int numOfRows = 0; 
		if(columns == 0) {
			// do nothing
		} else {
			do {
				
				char ch = encryptedInput.charAt(0);
				String decryptedOutput = "";
				int columnCounter = 0;
				numOfRows = encryptedInput.length() / columns; // fills the number of rows to make a rectangle 2D array 
				char [][] decryptBlock = new char[numOfRows][columns];

				// ALGORITHM 1 FOR DECRYPTION : BOTTOM TO TOP, TOP TO BOTTOM FROM LEFT TO RIGHT
				for(int row = 0; row < columns; row++) {
					if(row % 2 == 0) {	// if the row is even
						for(int col = numOfRows-1; 0 <= col; col--, columnCounter++) {	// it will go bottom-to-top, filling the array
							ch = encryptedInput.charAt(columnCounter);
							decryptBlock[col][row] = ch;
						}
					} else {	// if the row is uneven
						for(int col = 0; col < numOfRows; col++, columnCounter++) { // it will go top-to bottom, filling the array
							ch = encryptedInput.charAt(columnCounter);
							decryptBlock[col][row] = ch;
						}
					}
					
				}

				// printing for clarity
				for(int i = 0; i < numOfRows; i++) {
					for(int x = 0; x < columns; x++) {
						System.out.print(decryptBlock[i][x]);
					}
					System.out.println();
				}

				// ALGORITHM 2 FOR DECRYPTION: PRINTING LEFT TO RIGHT, RIGHT TO LEFT FROM TOP TO BOTTOM

				for(int row = 0; row < numOfRows; row++){ // goes top to bottom
					if(row % 2 == 0) { // if the row is even
						for(int col = 0; col < columns; col++) { // adds that column to the string from left to right
							decryptedOutput += decryptBlock[row][col];
						}
					} else { // if the row is uneven
						for(int col = columns -1; 0 <= col; col--) {	// adds that column to the string from right to left
							decryptedOutput += decryptBlock[row][col];
						}
					}
				}
				System.out.println(decryptedOutput);



					// goes until column == 0
					columns = sc.nextInt();
					if(sc.hasNextLine()) {
						sc.nextLine();
						encryptedInput = sc.nextLine();
					}



			} while(columns != 0);
		}
		


	}
}

