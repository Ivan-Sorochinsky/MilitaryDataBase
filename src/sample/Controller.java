package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField login_field;

    @FXML
    private TextField password_field;

    @FXML
    private Button signButton;

    @FXML
    void initialize(){
   signButton.setOnAction(event -> {
       signButton.getScene().getWindow().hide();
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("app.fxml"));
       try {
           loader.load();
       } catch (IOException e) {
           e.printStackTrace();
       }
       Parent root = loader.getRoot();
       Stage stage = new Stage();
       stage.setScene(new Scene(root));
       stage.showAndWait();
   });
    }

}

