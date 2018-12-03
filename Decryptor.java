import java.util.Scanner;
public class Decryptor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int columns = 0;
		int columnCounter = 0;
		
		String encryptedInput = "";
		//String[][] decryptBlock;
		//sc.useDelimiter(" ");
		//System.out.println(sc.nextInt());
		//sc.next();
		//encryptedInput = sc.nextLine();
		String decryptedOutput = "";
		//sc.next();
		columns = sc.nextInt();
		sc.nextLine();
		encryptedInput = sc.nextLine();

		char ch = encryptedInput.charAt(0);

		System.out.println(columns);
		System.out.println(encryptedInput);

		int counter = 0;
		int numOfRows = encryptedInput.length / columns;
		//if(columns == 0) {

		//} else {
		//	do {
				// problem: algorithm is hard coded for first example of 5 columns, it thinks its a square instead of rectangle
				// idea: encryptedInput.length / columns = row, ex. columns =5, input = 25.. 25 / 5 = 5, row = 5
				// ALGORITHM 1 FOR DECRYPTION : BOTTOM TO TOP, TOP TO BOTTOM FROM LEFT TO RIGHT
				char [][] decryptBlock = new char[columns][columns];
				for(int row = 0; row < columns; row++) {
					if(row % 2 == 0) {
						for(int col = columns-1; 0 <= col; col--, columnCounter++) {
							ch = encryptedInput.charAt(columnCounter);
							decryptBlock[col][row] = ch;
						}
					} else {
						for(int col = 0; col < columns; col++, columnCounter++) {
							ch = encryptedInput.charAt(columnCounter);
							decryptBlock[col][row] = ch;
						}
					}
					
				}

				// printing for clarity
				for(int i = 0; i < columns; i++) {
					for(int x = 0; x < columns; x++) {
						System.out.print(decryptBlock[i][x]);
					}
					System.out.println();
				}

				// ALGORITHM 2 FOR DECRYPTION: PRINTING LEFT TO RIGHT, RIGHT TO LEFT FROM TOP TO BOTTOM

				for(int row = 0; row < columns; row++){
					if(row % 2 == 0) {
						for(int col = 0; col < columns; col++) {
							decryptedOutput += decryptBlock[row][col];
						}
					} else {
						for(int col = columns -1; 0 <= col; col--) {
							decryptedOutput += decryptBlock[row][col];
						}
					}
				}
				System.out.println(decryptedOutput);



					/*
					columns = sc.nextInt();
					sc.nextLine();
					encryptedInput = sc.nextLine();
*/


			//} while(columns != 0);
		//}
		


	}
}

