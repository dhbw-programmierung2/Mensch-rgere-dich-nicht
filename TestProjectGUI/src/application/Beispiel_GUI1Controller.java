package application;

import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;


public class Beispiel_GUI1Controller {

    @FXML
    public Circle house1Black;
    public Circle house2Black;
    public Circle house3Black;
    public Circle house4Black;
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
    public Button wuerfeln;
    public Button ziehen;
    public Button naechsterSpieler;

    void initSelectUI(){
        ziehen.setDisable(true);
        naechsterSpieler.setDisable(true);
        
        Image im = new Image("/application/gruen.jpg", false);
        house4Green.setFill(new ImagePattern(im));
        
        house4Green.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
    }

    public void rollDice(){
        
    }
}