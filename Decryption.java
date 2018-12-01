public class Decryption {
	private int columns;
	private String encryptedInput;
	private int columnCounter = -1;
	private char ch;
	public Decryption(int colIn, String encryptIn) {
		columns = colIn;
		encryptedInput = encryptIn;
	}


	public void Decrypt() {
			char [][] decryptBlock = new char[columns][columns];
			for(int i = 0; i < columns; i++) {
				columnCounter++;
				for(int row = 0; row < columns; row++, columnCounter += columns) {
					ch = encryptedInput.charAt(columnCounter);
					decryptBlock[i][row] = ch;
				}
			}

			for(int i = 0; i < columns; i++) {
				for(int x = 0; x < columns; x++) {
					System.out.print(decryptBlock[i][x]);
				}
				System.out.println();
			}
	}
}