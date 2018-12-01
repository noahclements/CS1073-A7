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

		//sc.next();
		columns = sc.nextInt();
		sc.nextLine();
		encryptedInput = sc.nextLine();

		char ch = encryptedInput.charAt(0);

		System.out.println(columns);
		System.out.println(encryptedInput);

		int counter = 0;
		//if(columns == 0) {

		//} else {
		//	do {
		
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


				for(int i = 0; i < columns; i++) {
					for(int x = 0; x < columns; x++) {
						System.out.print(decryptBlock[i][x]);
					}
					System.out.println();
				}

					/*
					columns = sc.nextInt();
					sc.nextLine();
					encryptedInput = sc.nextLine();
*/


			//} while(columns != 0);
		//}
		


	}
}

