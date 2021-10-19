/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Alaa Kholi
 */
public class ProfileScreen extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //creating label profile header 
        Label header = new Label("Profile");
        header.setFont(Font.font("Helvetica", FontWeight.NORMAL, 20));

        //creating label first name 
        Label firsName = new Label("First Name :");

        //creating label last name 
        Label lastName = new Label("Last Name :");

        //creating label user name 
        Label userName = new Label("User Name :");

        //creating label email 
        Label emailId = new Label("Email :");

        //Creating Text Filed for firstname        
        TextField textField1 = new TextField();

        //Creating Text Filed for lasttname        
        TextField textField2 = new TextField();

        //Creating Text Filed for username        
        TextField textField3 = new TextField();

        //Creating Text Filed for email        
        TextField textField4 = new TextField();

        //Creating Buttons 
        Button Submit = new Button("Submit");

        //Creating a Grid Pane 
        GridPane gridPane = new GridPane();

        //styling gridPane
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(40));
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.addRow(0, header);
        gridPane.addRow(1, firsName, textField1);
        gridPane.addRow(2, lastName, textField2);
        gridPane.addRow(3, userName, textField3);
        gridPane.addRow(4, emailId, textField4);
        gridPane.addRow(5, Submit);

        Scene scene = new Scene(gridPane, 500, 500);

        primaryStage.setTitle("Profile Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
