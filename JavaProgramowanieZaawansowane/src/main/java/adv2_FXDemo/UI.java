package adv2_FXDemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UI extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception{
    GridPane pane = new GridPane();
    Scene scene = new Scene(pane, 600, 400, Color.WHITE);
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(10, 10, 10, 10));
    pane.setVgap(10);
    Label label = new Label("Write text");
    TextField textField = new TextField();
    textField.setStyle("-fx-font-size: 24pt; -fx-border-color: #FFAABB; -fx-color: #FFBBAA");
    Button submit = new Button("Save");
    TextArea textArea = new TextArea();
    pane.add(label, 0, 0);
    pane.add(textField, 0, 1);
    pane.add(submit, 0, 2);
    pane.add(textArea, 0, 3);
    submit.setOnAction(event -> {
      textArea.appendText(textField.getText() + System.lineSeparator());
    });
    primaryStage.setTitle("SimpleUIDemo");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
