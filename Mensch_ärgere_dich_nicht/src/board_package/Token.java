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
		W�rfel w = new W�rfel(); //Wie auch immer das w�rfeln umgesetzt ist
		int w�rfelzahl = w.w�rfeln();
		//Im n�chsten Schritt wird die W�rfelzahl �berpr�ft
		if(isvalidmove(w�rfelzahl) == true && position == -1) {		//Wenn man grad raus kommt l�uft man auf 0 (Man erkennt dass derf Token im Haus steht an Position = -1
			
			position = 0;			
		}
		else if(isvalidmove(w�rfelzahl) == true && position>=0) {	//Ist man drau�en (positioin �ber 0), dann l�uft man die W�rfelzahl
			position = position + w�rfelzahl;
		}
		
		
		
	}
	public boolean isvalidmove(int w) {
		Boolean r�ckgabe;
		if(position == -1) {
			if(w==6) {
				
				r�ckgabe = true; //Wenn man im Start steht und ne 6 hat, darf man raus
			}else
			r�ckgabe = false; //Man darf eben nicht raus
			
		}else if(position >=0){
			
		//	r�ckgabe = dann muss man halt den Regeln folgen;
		}
		
		return true/*r�ckgabe*/;
	}

	
}
