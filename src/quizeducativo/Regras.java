package quizeducativo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Regras {

    @FXML
    private Button menu;

    @FXML
    void voltarMenu(ActionEvent event) {
        QuizEducativo.changeScreen(3);
    }

}
