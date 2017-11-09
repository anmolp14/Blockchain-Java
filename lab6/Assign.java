import java.io.File;
import java.io.FileInputStream;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform; import javafx.fxml.FXMLLoader; import javafx.stage.Stage; import javafx.scene.Scene; import javafx.scene.layout.AnchorPane; import javafx.scene.Parent; import javafx.scene.control.MenuBar; import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Assign extends Application{
  @Override
  public void start(Stage primaryStage) throws Exception{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml")); Parent root = loader.load(); Scene scene = new Scene(root,400,500); primaryStage.setTitle("Java Editor"); primaryStage.setScene(scene); primaryStage.show();
  }
  public static void main(String args[]){
  launch(args);
  }
}
