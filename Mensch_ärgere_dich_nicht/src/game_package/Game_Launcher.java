package game_package;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import board_package.*;

/**
 * Diese Klasse repräsentiert den Game Launcher.
 * Dies ist der Einstieg in das Spiel, hier werden die Einstellungen gemacht
 * 
 * @author Jonas
 *
 * @version 0.1
 */

public class Game_Launcher extends JFrame implements ActionListener {
	
	/*
	 * Erstellen von Text-label und Buttons.
	 * Benennung der Buttons -> Parameter
	 */
	
	private JLabel lblWelcome = new JLabel("Mensch ärgere dich nicht - Game Launcher");
	private JLabel lblChoosePlayer = new JLabel("Anzahl der Spieler");
	private JLabel lblChooseColour = new JLabel("Farbenauswahl");
	
	private JButton btEinSpieler = new JButton("1 Spieler");
	private JButton btZweiSpieler= new JButton("2 Spieler");
	private JButton btDreiSpieler = new JButton("3 Spieler");
	private JButton btVierSpieler = new JButton("4 Spieler");
	
	private JButton btConfirmColour = new JButton("Farbe bestätigen");
	private JButton btExit = new JButton("Beenden");
	
	
	/**
	 * Die Mainklasse erzeugt den Game Launcher
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		new Game_Launcher();

	}
	
	
	/**
	 * Konstruktor der 
	 */
	public Game_Launcher() {
		
		
		lblWelcome.setBounds(260, 0, 800, 100);
		
		lblChoosePlayer.setBounds(100, 100, 190, 20);
		
		lblChooseColour.setBounds(550, 100, 190, 20);
		
		
		
		btEinSpieler.setBounds(100,150,150,20);
		btZweiSpieler.setBounds(100,200,150,20);
		btDreiSpieler.setBounds(100,250,150,20);
		btVierSpieler.setBounds(100,300,150,20);
		
		btConfirmColour.setBounds(550, 150, 150, 20);
		btExit.setBounds(600, 430, 150, 20);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		

		/*
		 * Hinzufügen der Buttons und Lables in den Container
		 */
		cp.add(lblWelcome);
		cp.add(lblChoosePlayer);
		cp.add(lblChooseColour);

		cp.add(btEinSpieler);
		cp.add(btZweiSpieler);
		cp.add(btDreiSpieler);
		cp.add(btVierSpieler);
		
		cp.add(btConfirmColour);
		cp.add(btExit);
		
		/*
		 * Titel des Fensters setzen
		 * Größe in Pixeln des Fensters festlegen
		 */
		setTitle("Mensch Ärgere Dich Nicht");
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		/*
		 * Buttons ihre Aktionen zuweisen
		 */
		btEinSpieler.addActionListener(this);
		btZweiSpieler.addActionListener(this);
		btDreiSpieler.addActionListener(this);
		btVierSpieler.addActionListener(this);
		
		btConfirmColour.addActionListener(this);
		btExit.addActionListener(this);
		
	}
	

	
		public void actionPerformed(ActionEvent event){
		
		Object obj = event.getSource();
		

		
		if (obj == btEinSpieler) {
			
			Board_fourPlayers window = new Board_fourPlayers();
			
			
			/*
			 * Operation Ein Spieler
			 */
			
		}
				
		if (obj == btZweiSpieler) {
			
			Board_fourPlayers window = new Board_fourPlayers();
			
			/*
			 * Operation Zwei Spieler
			 */
			
		}
		

		if (obj == btDreiSpieler) {
			Board_fourPlayers window = new Board_fourPlayers();
			/*
			 * Operation Drei Spieler	
			 */
		
		}
				
		
		if (obj == btVierSpieler) {
			Board_fourPlayers window = new Board_fourPlayers();
			/*
			 * Operation Vier Spieler
			 */
			
					
		}
		
		
		if (obj == btConfirmColour) {
		
			/*
			 * Operation Farben bestätigen
			 */
			
		}
		
		
		/*
		 * Beenden der Applikation
		 */
		if (obj == btExit) {
			
				System.exit(0);
				
		}
	}
}