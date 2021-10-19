/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Alaa Kholi
 */
public class LoginScreen extends Application {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

   
    @Override
    public void start(Stage primaryStage) {

        //creating label welcome         
        Label header = new Label("Welcome");
        //Comic Sans MS //Lucida Sans Unicode
        header.setFont(Font.font("Comic Sans MS", FontWeight.NORMAL, 20));

        //creating label email 
        Label text1 = new Label("Email :");

        //creating label password 
        Label text2 = new Label("Password :");

        //Creating Text Filed for email        
        TextField textField1 = new TextField();

        //Creating Text Filed for password        
        PasswordField textField2 = new PasswordField();

        //Creating Buttons 
        Button button1 = new Button("login");

        //Creating a Grid Pane 
        GridPane gridPane = new GridPane();

        //Setting size for the pane 
        gridPane.setMinSize(400, 300);

        //Setting the padding  
        gridPane.setPadding(new Insets(10));

        //Setting the vertical and horizontal gaps between the columns 
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //Setting the Grid alignment 
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(header, 0, 0);
        gridPane.add(text1, 0, 1);
        gridPane.add(textField1, 1, 1);
        gridPane.add(text2, 0, 2);
        gridPane.add(textField2, 1, 2);
        gridPane.add(button1, 1, 3);
    

//        gridPane.addRow(0, header);
//        gridPane.addRow(1, text1,textField1);
//        gridPane.addRow(2, text2,textField2);
//        gridPane.addRow(3, button1);

        Pane root = new Pane();
        root.getChildren().add(gridPane);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Login Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
}
