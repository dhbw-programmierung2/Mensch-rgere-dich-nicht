package maednpackage;

import java.util.Random;

/**
 * Diese Klasse beschreibt die W�rfelaktionen von Mensch �rgere dich nicht
 * 
 * @author JSCHMID
 *
 */

public class MAEDNWuerfel {
	
	//Speichern der gew�rfelten Zahl
	private int wurf = 0; 
	
	//Anzahl der W�rfe in gesamten Spiel
	private int zaehler = 0; 
	
	//Anzahl der Versuche
	private int versuche = 0;  
	
	
	/**
	 * Erzeugen einer zuf�lligen Zahl
	 * 
	 * @return eine zuf�llige Zahl von 1 bis 6
	 */
	private int zufallsZahl()
	{
		// Erzeugen eines Random Objekts
		Random rnd = new Random();
		
		//Value bekommt eine zuf�llige Zahl zwischen 1 und  zugewiesen
		int value = rnd.nextInt(5) + 1;
		
		return value;
	}
		
	
	/**
	* Simuliert einen W�rfelwurf
	*/
	public void wurf()
	{
		if (wurf == 0) { 
		
		// Der variablen Wurf die gew�rfelte Augenzahl zur�ckgeben
		wurf = zufallsZahl(); 
		
		zaehler++;
		versuche++;
		
		}
	}
	
	/**
	* Den W�rfel auf 0 setzen
	*/
	public void wurfZuruecksetzen()
	{
		wurf = 0;
	}
	
	/**
	* Gibt den W�rfelwert zur�ck
	* 
	* @return Gibt den W�rfelwert zur�ck
	*/
	public int getWurf()
	{
		return wurf; // W�rfelzahl zur�ck geben
	}
	
	/**
	* Gibt den W�rfelz�hler zur�ck
	* 
	* @return Gibt den W�rfelz�hler zur�ck
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
	* Anzahl der Versuche zur�ckgeben
	* 
	* @return Anzahl der Versuche
	*/
	public int getAnzahlVersuche()
	{
		return versuche; 
	}
	
	
}
