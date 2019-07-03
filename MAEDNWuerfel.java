package maednpackage;

import java.util.Random;

/**
 * Diese Klasse beschreibt die Würfelaktionen von Mensch ärgere dich nicht
 * 
 * @author JSCHMID
 *
 */

public class MAEDNWuerfel {
	
	//Speichern der gewürfelten Zahl
	private int wurf = 0; 
	
	//Anzahl der Würfe in gesamten Spiel
	private int zaehler = 0; 
	
	//Anzahl der Versuche
	private int versuche = 0;  
	
	
	/**
	 * Erzeugen einer zufälligen Zahl
	 * 
	 * @return eine zufällige Zahl von 1 bis 6
	 */
	private int zufallsZahl()
	{
		// Erzeugen eines Random Objekts
		Random rnd = new Random();
		
		//Value bekommt eine zufällige Zahl zwischen 1 und  zugewiesen
		int value = rnd.nextInt(5) + 1;
		
		return value;
	}
		
	
	/**
	* Simuliert einen Würfelwurf
	*/
	public void wurf()
	{
		if (wurf == 0) { 
		
		// Der variablen Wurf die gewürfelte Augenzahl zurückgeben
		wurf = zufallsZahl(); 
		
		zaehler++;
		versuche++;
		
		}
	}
	
	/**
	* Den Würfel auf 0 setzen
	*/
	public void wurfZuruecksetzen()
	{
		wurf = 0;
	}
	
	/**
	* Gibt den Würfelwert zurück
	* 
	* @return Gibt den Würfelwert zurück
	*/
	public int getWurf()
	{
		return wurf; // Würfelzahl zurück geben
	}
	
	/**
	* Gibt den Würfelzähler zurück
	* 
	* @return Gibt den Würfelzähler zurück
	*/
	public int getWurfzaheler()
	{
		return zaehler; 
	}
	
	/**
	* Anzahl der Versuche auf 0 setzen
	*/
	public void AnzahlVersucheGleichNull()
	{
		versuche = 0; 
	}
	
	/**
	* Anzahl der Versuche zurückgeben
	* 
	* @return Anzahl der Versuche
	*/
	public int getAnzahlVersuche()
	{
		return versuche; 
	}
	
	
}
