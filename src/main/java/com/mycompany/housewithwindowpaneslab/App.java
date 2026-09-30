package com.mycompany.housewithwindowpaneslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var houseWall = new Rectangle(450, 450);
        houseWall.setX(150);
        houseWall.setY(250);
        houseWall.setFill(Color.LIGHTGREY);
        houseWall.setStroke(Color.BLACK);
        
        var roof = new Polygon(150, 250, 375, 50, 600, 250);
        roof.setFill(Color.RED);
        
        var door = new Rectangle(75, 150);
        door.setX(350);
        door.setY(550);
        door.setFill(Color.BROWN);
        
        var windowGlass1 = new Rectangle(100, 100);
        windowGlass1.setX(200);
        windowGlass1.setY(400);
        windowGlass1.setFill(Color.LIGHTBLUE);
        
        var windowPane1 = new Line(200, 450, 300, 450);
        var windowPane2 = new Line(250, 400, 250, 500);
        
        var windowGlass2 = new Rectangle(100, 100);
        windowGlass2.setX(450);
        windowGlass2.setY(400);
        windowGlass2.setFill(Color.LIGHTBLUE);
        
        var windowPane3 = new Line(450, 450, 550, 450);
        var windowPane4 = new Line(500, 400, 500, 500);
        
        var chimney = new Rectangle(50, 125);
        chimney.setX(275);
        chimney.setY(100);
        chimney.setFill(Color.DARKGRAY);
        
        var grass = new Rectangle(750, 50);
        grass.setY(700);
        grass.setFill(Color.DARKGREEN);
        
        var houseBase = new Rectangle(450, 10);
        houseBase.setX(150);
        houseBase.setY(700);
        houseBase.setFill(Color.BEIGE);
        
        var sun = new Circle(650, 100, 35);
        sun.setFill(Color.YELLOW);
        
        var sunLine1 = new Line(650, 50, 650, 150);
        sunLine1.setStroke(Color.YELLOW);
        var sunLine2 = new Line(600, 100, 700, 100);
        sunLine2.setStroke(Color.YELLOW);
        var sunLine3 = new Line(600, 50, 700, 150);
        sunLine3.setStroke(Color.YELLOW);
        var sunLine4 = new Line(600, 150, 700, 50);
        sunLine4.setStroke(Color.YELLOW);
        
        
        var root = new Pane();
        root.getChildren().addAll(houseWall, roof, door, windowGlass1, windowGlass2, 
                windowPane1, windowPane2, windowPane3, windowPane4, chimney, grass, houseBase, 
        sun, sunLine1, sunLine2, sunLine3, sunLine4);
        
        var scene = new Scene(new StackPane(root), 750, 750);
        stage.setScene(scene);
        stage.setTitle("House with Window Panes");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}