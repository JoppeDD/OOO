package ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ontcijferaar extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ontcijferaar");

        FlowPane root = new FlowPane();
        root.setAlignment(Pos.BASELINE_CENTER);
        root.setVgap(5);
        root.setHgap(5);

        Scene mainScene = new Scene(root, 400, 600);
        Label numberLabel = new Label("5 + 3 = ");
        TextField numberTextField = new TextField();
        Button button = new Button("Check");

        root.getChildren().add(numberLabel);
        root.getChildren().add(numberTextField);
        root.getChildren().add(button);

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}
