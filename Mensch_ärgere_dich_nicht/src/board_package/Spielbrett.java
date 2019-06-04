package board_package;

public class Spielbrett {
	int[]spielbrett;
	
	public Spielbrett(int felder) {
		int[] board = new int[felder];
		for(int i = 0; i<felder;i++) {
			
			board[i]=i;
		}
		this.spielbrett=board;
	 
	}
	
}
