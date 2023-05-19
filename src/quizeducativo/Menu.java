package quizeducativo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Menu implements Initializable{
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    
    }
    
    @FXML
    private Button creditosButton;

    @FXML
    private Button iniciarButton;

    @FXML
    private Button regrasButton;

    @FXML
    void creditos(ActionEvent event) {

    }

    @FXML
    void iniciar(ActionEvent event) {
        QuizEducativo.changeScreen(1);
    }

    @FXML
    void regras(ActionEvent event) {

    }

}

