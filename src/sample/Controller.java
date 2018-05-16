package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
       System.out.println("Fvfbfbf");
   });
    }

}

