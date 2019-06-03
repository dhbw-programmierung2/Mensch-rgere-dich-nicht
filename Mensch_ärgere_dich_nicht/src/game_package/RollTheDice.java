package game_package;

import java.util.Random;

/**
* @author jonas
*/
public class RollTheDice {
	
	public static void main(String[] args) {
		
		rollTheDice();
	}
	
	/*
	 * Methode würfelt eine zufällige Zahl von 1 - 6
	 */
	public static void rollTheDice() {
		
		Random r = new Random();
		int diceHasSpoken = r.nextInt(6);
		System.out.println(diceHasSpoken + 1);
	}
}
