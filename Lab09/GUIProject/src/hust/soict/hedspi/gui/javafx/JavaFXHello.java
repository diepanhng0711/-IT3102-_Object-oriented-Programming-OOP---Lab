package hust.soict.hedspi.gui.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXHello extends Application {
    private Button btnHello;
    
    //override
    public void start (Stage primaryStage) {
        btnHello = new Button();
        btnHello.setText("Say Hello");

        btnHello.setOnAction(evt -> System.out.println("Xin chao Viet Nam!"));

        StackPane root = new StackPane();
        root.getChildren().add(btnHello);

        Scene scene = new Scene(root, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
