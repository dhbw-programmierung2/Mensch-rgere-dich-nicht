package application;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Controller {

	@FXML
	public SplitPane splitPane;
	public AnchorPane anchorPane;
	public Circle house1Black;
	public Circle house2Black;
	public Circle house3Black;
	public Circle house4Black;
	public Circle house1Purple;
	public Circle house2Purple;
	public Circle house3Purple;
	public Circle house4Purple;
	public Circle aim1Purple;
	public Circle aim2Purple;
	public Circle aim3Purple;
	public Circle aim4Purple;
	public Circle house1Blue;
	public Circle house2Blue;
	public Circle house3Blue;
	public Circle house4Blue;
	public Circle aim1Blue;
	public Circle aim2Blue;
	public Circle aim3Blue;
	public Circle aim4Blue;
	public Circle aim2Yellow;
	public Circle aim3Yellow;
	public Circle aim4Yellow;
	public Circle house1Red;
	public Circle house2Red;
	public Circle house4Red;
	public Circle house3Red;
	public Circle aim1Green;
	public Circle aim4Red;
	public Circle aim3Red;
	public Circle aim2Red;
	public Circle aim1Red;
	public Circle aim1Yellow;
	public Circle aim1Black;
	public Circle aim2Black;
	public Circle aim3Black;
	public Circle aim4Black;
	public Circle house4Green;
	public Circle house3Green;
	public Circle aim4Green;
	public Circle aim3Green;
	public Circle aim2Green;
	public Circle house2Yellow;
	public Circle house3Yellow;
	public Circle house4Yellow;
	public Circle house1Green;
	public Circle house2Green;
	public Circle house1Yellow;
	public GridPane gridPane;
	public Button cube;
	public Button pull;
	public Button nextPlayer;
	public ListView listView;
	
	private ArrayList<Node> nodeList = new ArrayList<Node>();
	private ArrayList<Circle> circleList = new ArrayList<Circle>();
	
	public void initSelectUI() {
		
	
		// Liste erstellen die alle Nodes enthält die auf der Splitpane sind
					anchorPane.getChildren().forEach(x -> nodeList.add(x));
					for (Node tempNode : nodeList) {
						if(tempNode instanceof Circle) {
							circleList.add((Circle) tempNode);
						}
					}
					for(Circle tempCircle : circleList) {
						tempCircle.radiusProperty().bind(anchorPane.widthProperty().divide(30));
						tempCircle.centerXProperty().bind(anchorPane.widthProperty().divide(30));
						tempCircle.centerYProperty().bind(anchorPane.widthProperty().divide(30));
					}
				
					Image im1 = new Image("/application/green.jpg", false);
			        house1Green.setFill(new ImagePattern(im1));
			        house1Green.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
			        
			        house2Green.setFill(new ImagePattern(im1));
			        house2Green.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
			        
			        house3Green.setFill(new ImagePattern(im1));
			        house3Green.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
					
			        house4Green.setFill(new ImagePattern(im1));
			        house4Green.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
			        
			        Image im2 = new Image("/application/yellow.jpg", false);
			        house1Yellow.setFill(new ImagePattern(im2));
			        house1Yellow.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			        
			        house2Yellow.setFill(new ImagePattern(im2));
			        house2Yellow.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			        
			        house3Yellow.setFill(new ImagePattern(im2));
			        house3Yellow.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			        
			        house4Yellow.setFill(new ImagePattern(im2));
			        house4Yellow.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
			        
			        Image im3 = new Image("/application/black.jpg", false);
			        house1Black.setFill(new ImagePattern(im3));
			        house1Black.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
			        
			        house2Black.setFill(new ImagePattern(im3));
			        house2Black.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
			        
			        house3Black.setFill(new ImagePattern(im3));
			        house3Black.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
			        
			        house4Black.setFill(new ImagePattern(im3));
			        house4Black.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
			        
			        Image im4 = new Image("/application/red.jpg", false);
			        house1Red.setFill(new ImagePattern(im4));
			        house1Red.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
			        
			        house2Red.setFill(new ImagePattern(im4));
			        house2Red.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));

			        house3Red.setFill(new ImagePattern(im4));
			        house3Red.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
			        
			        house4Red.setFill(new ImagePattern(im4));
			        house4Red.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
			        
			      
				}

	}
	

