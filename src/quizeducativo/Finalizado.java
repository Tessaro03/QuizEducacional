package quizeducativo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Finalizado implements Initializable {
    
    @FXML
    private Button menuButton;

    @FXML
    private Label pontuacaoLabel;

    @FXML
    private Label qualidadeTxt;

    @FXML
    private Label txtFinal;

    @FXML
    private Button resultado;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 
    
    @FXML
    void menu(ActionEvent event) {
        QuizEducativo.changeScreen(3);
        pontuacaoLabel.setText("");
        resultado.setDisable(false);
        qualidadeTxt.setText("");
        txtFinal.setText("");
    }
    
    @FXML
    void mostraResultado(ActionEvent event) {
        int pontuacao = QuizEducativo.getPontuacao();
        String txtQualidade;
        pontuacaoLabel.setText(Integer.toString(pontuacao)); 
        QuizEducativo.setPontuacao(0);
        resultado.setDisable(true);
        String qualidade;
        if (pontuacao >= 8) {
            qualidade = "EXCELENTE";
            qualidadeTxt.setTextFill(Color.rgb(0, 79, 39));
            txtQualidade = "Parabéns,Seu conhecimento sobre educação ambiental nas grandes metrópoles é admirável. Sua compreensão dos desafios e soluções relacionados ao meio ambiente urbano mostra que você está no caminho certo para se tornar um defensor da natureza em sua cidade. Continue assim e inspire outros a agirem de forma sustentável. O futuro do planeta está em boas mãos, como as suas!";
        } else if (pontuacao >= 5) {
            qualidade = "BOM";
            qualidadeTxt.setTextFill(Color.rgb(159, 230, 63));
            txtQualidade = "Parabéns pelo seu esforço, Continue explorando esse assunto, buscando informações e oportunidades para se envolver em práticas sustentáveis. Com sua motivação, você pode se tornar um agente de mudança positiva em sua comunidade. Vamos juntos cuidar do nosso planeta!";
        } else if (pontuacao >= 3) {
            qualidade = "RAZOAVEL";
            qualidadeTxt.setTextFill(Color.rgb(230, 211, 1));
            txtQualidade = " Parabéns, mesmo que você não tenha acertado todas as perguntas. Pequenas ações, como economizar água e energia, reciclar e adotar uma abordagem mais consciente em relação ao consumo, podem ter um impacto significativo. Juntos, podemos criar um futuro sustentável.";
        } else {
            qualidade = "RUIM";
            qualidadeTxt.setTextFill(Color.rgb(100, 0, 19));
            txtQualidade = "Apesar de não ter tido um bom desempenho desta vez, o mais importante é estar disposto a aprender e fazer a diferença. A questão ambiental é complexa, mas você pode começar tomando pequenas atitudes no seu dia a dia. Procure informações confiáveis sobre os desafios ambientais enfrentados nas cidades e descubra maneiras de agir de forma mais sustentável.";
        }
        qualidadeTxt.setText(qualidade);
        txtFinal.setText(txtQualidade);
    }
    
}
