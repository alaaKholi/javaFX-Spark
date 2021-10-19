/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

/**
 *
 * @author Alaa Kholi
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;

public class HelloJavaFX extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label text = new Label("Hello World From JavaFX ...");
        //text.setPadding(new Insets(60));
        //text.setFont(Font.font("Lucida Sans Unicode", FontPosture.ITALIC, 20));


        Scene scene = new Scene(text, 400, 200);

        primaryStage.setTitle("Hello World !");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
