package game_package;

import java.awt.*;


import game_package.*;

import board_package.*;

import javax.swing.*;


import java.awt.event.*;

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
	//private JLabel lblChoosePlayer = new JLabel("Anzahl der Spieler");
	//private JLabel lblChooseColour = new JLabel("Farbenauswahl");
	
	private JLabel lblSpieler1 = new JLabel("Spieler1");
	private JLabel lblSpieler2 = new JLabel("Spieler2");
	private JLabel lblSpieler3 = new JLabel("Spieler3");
	private JLabel lblSpieler4 = new JLabel("Spieler4");
	private JLabel lblSpieler5 = new JLabel("Spieler5");
	private JLabel lblSpieler6 = new JLabel("Spieler6");

	
	private JButton btEinSpieler = new JButton("Go - 1 Spieler");
	private JButton btZweiSpieler= new JButton("Go - 2 Spieler");
	private JButton btDreiSpieler = new JButton("Go - 3 Spieler");
	private JButton btVierSpieler = new JButton("Go - 4 Spieler");
	private JButton btFuenfSpieler = new JButton("Go - 5 Spieler");
	private JButton btSechsSpieler = new JButton("Go - 6 Spieler");
	
//	private JButton btConfirmColour = new JButton("Farbe bestätigen");
	private JButton btExit = new JButton("Beenden");
	
	private JTextField txtSpieler1name = new JTextField();
	private JTextField txtSpieler2name = new JTextField();
	private JTextField txtSpieler3name = new JTextField();
	private JTextField txtSpieler4name = new JTextField();
	private JTextField txtSpieler5name = new JTextField();
	private JTextField txtSpieler6name = new JTextField();

	
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
		
		String[] colorsAvailable = {"Grün","Rot","Blau","Gelb","Violett","Schwarz"};
		
		String[] typAuswahl = { "Mensch", "Computer"};

		JComboBox colorListSpieler1 = new JComboBox(colorsAvailable);
		JComboBox colorListSpieler2 = new JComboBox(colorsAvailable);
		JComboBox colorListSpieler3 = new JComboBox(colorsAvailable);
		JComboBox colorListSpieler4 = new JComboBox(colorsAvailable);
		JComboBox colorListSpieler5 = new JComboBox(colorsAvailable);
		JComboBox colorListSpieler6 = new JComboBox(colorsAvailable);
		JComboBox colorListSpieler7 = new JComboBox(colorsAvailable);
		
		JComboBox typSpieler1 = new JComboBox(typAuswahl);
		JComboBox typSpieler2 = new JComboBox(typAuswahl);
		JComboBox typSpieler3 = new JComboBox(typAuswahl);
		JComboBox typSpieler4 = new JComboBox(typAuswahl);
		JComboBox typSpieler5 = new JComboBox(typAuswahl);
		JComboBox typSpieler6 = new JComboBox(typAuswahl);



		
		lblWelcome.setBounds(330, 0, 1500, 100);
		
	//	lblChoosePlayer.setBounds(100, 100, 190, 20);
		
	//	lblChooseColour.setBounds(550, 100, 190, 20);
		
		txtSpieler1name.setBounds(0,150,150,20);
		txtSpieler2name.setBounds(150,150,150,20);
		txtSpieler3name.setBounds(300,150,150,20);
		txtSpieler4name.setBounds(450,150,150,20);
		txtSpieler5name.setBounds(600, 150,150,20);
		txtSpieler6name.setBounds(750,150,150,20);

		
		lblSpieler1.setBounds(0,100,150,20);
		lblSpieler2.setBounds(150,100,150,20);
		lblSpieler3.setBounds(300,100,150,20);
		lblSpieler4.setBounds(450,100,150,20);
		lblSpieler5.setBounds(600, 100,150,20);
		lblSpieler6.setBounds(750,100,150,20);
		
		btEinSpieler.setBounds(0,400,150,20);
		btZweiSpieler.setBounds(150,400,150,20);
		btDreiSpieler.setBounds(300,400,150,20);
		btVierSpieler.setBounds(450,400,150,20);
		
		btFuenfSpieler.setBounds(600, 400,150,20);
		btSechsSpieler.setBounds(750,400,150,20);
		
		colorListSpieler1.setBounds(0,200,150,20);
		colorListSpieler2.setBounds(150,200,150,20);
		colorListSpieler3.setBounds(300,200,150,20);
		colorListSpieler4.setBounds(450,200,150,20);
		colorListSpieler5.setBounds(600,200,150,20);
		colorListSpieler6.setBounds(750,200,150,20);
		
		typSpieler1.setBounds(0,300,150,20);
		typSpieler2.setBounds(150,300,150,20);
		typSpieler3.setBounds(300,300,150,20);
		typSpieler4.setBounds(450,300,150,20);
		typSpieler5.setBounds(600,300,150,20);
		typSpieler6.setBounds(750,300,150,20);
		
	//	btConfirmColour.setBounds(550, 150, 150, 20);
		btExit.setBounds(750, 430, 150, 20);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		

		/*
		 * Hinzufügen der Buttons und Lables in den Container
		 */
		cp.add(lblWelcome);
	//	cp.add(lblChoosePlayer);
	//	cp.add(lblChooseColour);

		cp.add(btEinSpieler);
		cp.add(btZweiSpieler);
		cp.add(btDreiSpieler);
		cp.add(btVierSpieler);
		cp.add(btFuenfSpieler);
		cp.add(btSechsSpieler);
		
		cp.add(txtSpieler1name);
		cp.add(txtSpieler2name);
		cp.add(txtSpieler3name);
		cp.add(txtSpieler4name);
		cp.add(txtSpieler5name);
		cp.add(txtSpieler6name);

		
		cp.add(lblSpieler1);
		cp.add(lblSpieler2);
		cp.add(lblSpieler3);
		cp.add(lblSpieler4);
		cp.add(lblSpieler5);
		cp.add(lblSpieler6);


		cp.add(colorListSpieler1);
		cp.add(colorListSpieler2);
		cp.add(colorListSpieler3);
		cp.add(colorListSpieler4);
		cp.add(colorListSpieler5);
		cp.add(colorListSpieler6);
		
		cp.add(typSpieler1);
		cp.add(typSpieler2);
		cp.add(typSpieler3);
		cp.add(typSpieler4);
		cp.add(typSpieler5);
		cp.add(typSpieler6);


		
	//	cp.add(btConfirmColour);
		cp.add(btExit);
		
		/*
		 * Titel des Fensters setzen
		 * Größe in Pixeln des Fensters festlegen
		 */
		setTitle("Mensch Ärgere Dich Nicht");
		setSize(915,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		/*
		 * Buttons ihre Aktionen zuweisen
		 */
		btEinSpieler.addActionListener(this);
		btZweiSpieler.addActionListener(this);
		btDreiSpieler.addActionListener(this);
		btVierSpieler.addActionListener(this);
		
		btFuenfSpieler.addActionListener(this);
		btSechsSpieler.addActionListener(this);
		
		colorListSpieler1.addActionListener(this);
		colorListSpieler2.addActionListener(this);
		colorListSpieler3.addActionListener(this);
		colorListSpieler4.addActionListener(this);
		colorListSpieler5.addActionListener(this);
		colorListSpieler6.addActionListener(this);

		typSpieler1.addActionListener(this);
		typSpieler2.addActionListener(this);
		typSpieler3.addActionListener(this);
		typSpieler4.addActionListener(this);
		typSpieler5.addActionListener(this);
		typSpieler6.addActionListener(this);

		
	//	btConfirmColour.addActionListener(this);
		btExit.addActionListener(this);
		
	}
	

	
		public void actionPerformed(ActionEvent event){
		
		Object obj = event.getSource();
		

		
		if (obj == btEinSpieler) {
			
		//	Game_Launcher launcher = new Game_Launcher();
			
			Board_fourPlayers window = new Board_fourPlayers();	
			window.frame.setVisible(true);
			window.initialize();
			
		//	launcher.System.exit(0);
		}
				
		if (obj == btZweiSpieler) {
			
			Board_fourPlayers window = new Board_fourPlayers();	
			window.frame.setVisible(true);
			window.initialize();

			
		}
		

		if (obj == btDreiSpieler) {
					
			Board_fourPlayers window = new Board_fourPlayers();	
			window.frame.setVisible(true);
			window.initialize();

		
		}
				
		
		if (obj == btVierSpieler) {
			
			Board_fourPlayers window = new Board_fourPlayers();	
			window.frame.setVisible(true);
			window.initialize();

			
					
		}
		if (obj == btFuenfSpieler) {
			
			Board_sixPlayers window = new Board_sixPlayers();	
			window.frame.setVisible(true);
			window.initialize();

			
					
		}
		if (obj == btSechsSpieler) {
	
			Board_sixPlayers window = new Board_sixPlayers();	
			window.frame.setVisible(true);
			window.initialize();

	
			
}

		
		
	//	if (obj == btConfirmColour) {
		
			/*
			 * Operation Farben bestätigen
			 */
			
	//	}
		
		
		/*
		 * Beenden der Applikation
		 */
		if (obj == btExit) {
			
				System.exit(0);
				
		}
//		
//        JComboBox cb = (JComboBox)e.getSource();
//        String color = (String)cb.getSelectedItem();
//        updateLabel(color);
	}
}
