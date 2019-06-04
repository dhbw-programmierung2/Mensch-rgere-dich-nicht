package board_package;
/**
 * @author kim
 * */
public class Token {
	
	/**@param position ist der index in ArrayList von Spielfeld-feldern, welche nummeriert sind.
	 * 
	 * Die ArrayList, welche die Spielfeldfelder mit Positionsnummern beinhaltet wird hiermit durchlaufen



	 */
	int position;
	String spielerfarbe;
	
	public Token(String spielerfarbe) {
		spielerfarbe = this.spielerfarbe;
		position = -1;
		
	}
	
	public void move() {
		Würfel w = new Würfel(); //Wie auch immer das würfeln umgesetzt ist
		int würfelzahl = w.würfeln();
		//Im nächsten Schritt wird die Würfelzahl überprüft
		if(isvalidmove(würfelzahl) == true && position == -1) {		//Wenn man grad raus kommt läuft man auf 0 (Man erkennt dass derf Token im Haus steht an Position = -1
			
			position = 0;			
		}
		else if(isvalidmove(würfelzahl) == true && position>=0) {	//Ist man draußen (positioin über 0), dann läuft man die Würfelzahl
			position = position + würfelzahl;
		}
		
		
		
	}
	public boolean isvalidmove(int w) {
		Boolean rückgabe;
		if(position == -1) {
			if(w==6) {
				
				rückgabe = true; //Wenn man im Start steht und ne 6 hat, darf man raus
			}else
			rückgabe = false; //Man darf eben nicht raus
			
		}else if(position >=0){
			
		//	rückgabe = dann muss man halt den Regeln folgen;
		}
		
		return true/*rückgabe*/;
	}

	
}
