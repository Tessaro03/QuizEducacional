package quizeducativo;

import java.util.Random;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class FXMLDocumentController implements Initializable {
   
    Pergunta[] perguntas = new Pergunta[4];
    Pergunta pergunta1 = new Pergunta("Qual é a maior reserva indígena brasileira assim como a primeira a ser criada?","A usina hidrelétrica de Belo Monte fica situada no seu principal rio.","Reserva Bangú","Reserva dos Palhares","Reserva Tupiniquin","Reserva do rio Xingú","respostaD","O parque foi criado em 1961 pelo então presidente brasileiro Jânio Quadros, tendo sido a primeira terra indígena homologada pelo governo federal. Seus principais idealizadores foram os irmãos Villas Bôas, mas quem redigiu o projeto foi o antropólogo e então funcionário do Serviço de Proteção ao Índio, Darcy Ribeiro.");
    Pergunta pergunta2 = new Pergunta(" Qual a fonte de energia mais limpa ?","No Brasil temos duas usinas dessa fonte de energia, denominadas Angra I e Angra II","Energia eólica","Energia maremotriz","Energia solar","Energia nuclear","respostaD","A principal vantagem da fonte nuclear de energia é a sua baixa emissão de poluentes e a sua elevada produtividade. Essa fonte de energia produz lixo radioativo, porém o mesmo pode ser selado hermeticamente nos dias atuais, com um lacre que só se rompe após o material perder toda sua radioatividade.");
    Pergunta pergunta3 = new Pergunta("Qual dos itens a seguir não pode ser descartado no lixo reciclável?", "Tem pólo positivo e negativo","Latinha de alumínio","Garrafa de vidro","Sacola de plástico","Bateria","respostaD","Por que não podemos descartar pilhas no lixo comum? Muitas destas pilhas e baterias são feitas de metais pesados como mercúrio, cádmio, níquel e substâncias que contém estes metais. Estas substâncias são muito tóxicas e prejudicam o organismo e possuem efeito cumulativo.");
    Pergunta pergunta4 = new Pergunta(" A maior parte do nitrogênio que compõe as moléculas orgânicas ingressa nos ecossistemas pela ação de:" , "são microorganismos" , "algas marinhas" , "animais" ," bactérias" , "fungos" , "respostaC" ,"O nitrogênio atmosférico deve passar por um processo natural chamado fixação biológica de nitrogênio, realizado por bactérias. As mais famosas e utilizadas são as dos gêneros Rhizobium e Bradyrhizobium, que transformam o Nitrogênio em uma forma que pode ser usada na nutrição das plantas.");

    
    @FXML
    private Button dicaButton;
    @FXML
    private Label dicaText;
    @FXML
    private Button metade;
    @FXML
    private Label pergunta;
    @FXML
    private Label pontos;
    @FXML
    private Button pular;
    @FXML
    private Button respostaA;
    @FXML
    private Button respostaB;
    @FXML
    private Button respostaC;
    @FXML
    private Button respostaD;
    @FXML
    private Label resultado;
    @FXML
    private Button pagResposta;
    @FXML
    private Button menuButton;
    @FXML
    private Button desistir;

    int contPula = 1;
    int contDica = 1;
    int contMetade = 1;
    int num = 0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       perguntas[0] = pergunta1;
       perguntas[1] = pergunta2;
       perguntas[2] = pergunta3;
       perguntas[3] = pergunta4;
       
       pagResposta.setDisable(true);
       pergunta.setText(perguntas[num].getPergunta());
       respostaA.setText(perguntas[num].getRespostaA());
       respostaB.setText(perguntas[num].getRespostaB());
       respostaC.setText(perguntas[num].getRespostaC());
       respostaD.setText(perguntas[num].getRespostaD());

    }    
    @FXML
    void dica(ActionEvent event) {
        if (contDica <= 3){
        dicaText.setText(perguntas[num].getDica());
        dicaButton.setDisable(true);
        contDica += 1;
        }
    }
    
    @FXML
    void metade(ActionEvent event) {
        if (contMetade <= 3 ){
            int sorteados = 0;
            int sorteado = 4;
            Random random = new Random();
            do{
                int numeroSorteado = random.nextInt(4);
                if (numeroSorteado == 0 && !(perguntas[num].getCorreta().equals("respostaA")) && sorteado != 0){sorteados += 1; respostaA.setDisable(true); sorteado = 0;}
                if (numeroSorteado == 1 && !(perguntas[num].getCorreta().equals("respostaB")) && sorteado != 1){sorteados += 1; respostaB.setDisable(true); sorteado = 1;}
                if (numeroSorteado == 2 && !(perguntas[num].getCorreta().equals("respostaC")) && sorteado != 2){sorteados += 1; respostaC.setDisable(true); sorteado = 2;}
                if (numeroSorteado == 3 && !(perguntas[num].getCorreta().equals("respostaD")) && sorteado != 3){sorteados += 1; respostaD.setDisable(true); sorteado = 3;}
            }while (sorteados != 2);
            metade.setDisable(true);
            contMetade += 1;
        }
    }
    @FXML
    void pularPerg(ActionEvent event) {
        if (contPula <= 3){
            pular.setDisable(true);
            contPula += 1;
            QuizEducativo.setPontuacao(QuizEducativo.getPontuacao() + 1);
            pontos.setText(Integer.toString(QuizEducativo.getPontuacao()));
            QuizEducativo.changeScreen(2);
            reiniciar();
        }
    }
    
    @FXML
    void resposta(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            Button clickedButton = (Button) event.getSource();
            if (clickedButton.getId().equals(perguntas[num].getCorreta())) {
                    resultado.setText("RESPOSTA CORRETA!");
                    resultado.setTextFill(Color.rgb(0, 79, 39));
                    QuizEducativo.setPontuacao(QuizEducativo.getPontuacao() + 1);
                    String ponto = Integer.toString(QuizEducativo.getPontuacao());
                    pontos.setText(ponto);
            } else {
                resultado.setText("RESPOSTA INCORRETA!");
                resultado.setTextFill(Color.rgb(255, 0, 0));
            }
            respostaA.setDisable(true);
            respostaB.setDisable(true);
            respostaC.setDisable(true);
            respostaD.setDisable(true);
            metade.setDisable(true);
            dicaButton.setDisable(true);
            pular.setDisable(true);
            pagResposta.setDisable(false);
            
            
        }
    }
    @FXML
    void pagResposta(ActionEvent event) {
        QuizEducativo.changeScreen(2);
        reiniciar();
    }
    @FXML
    void menu(ActionEvent event) {
        QuizEducativo.changeScreen(3);
    }
    @FXML
    void desistencia(ActionEvent event) {
        num = 100;
        QuizEducativo.setPontuacao(0);
        reiniciar();
        QuizEducativo.setDesistencia(true);
        QuizEducativo.changeScreen(2);
    }
    
    
    public void reiniciar(){
        if (num < (perguntas.length - 1)){
            if (contDica > 3){dicaButton.setDisable(true);}else{dicaButton.setDisable(false);}
            if (contMetade > 3){metade.setDisable(true);}else{metade.setDisable(false);}
            if (contPula > 3){pular.setDisable(true);}else{pular.setDisable(false);}

            
            respostaA.setDisable(false);
            respostaB.setDisable(false);
            respostaC.setDisable(false);
            respostaD.setDisable(false);
            resultado.setText("");
            dicaText.setText("");
            pular.setDisable(false);
            pagResposta.setDisable(true);
            num += 1;
            pergunta();
        } else { 
            num = 0;
            contDica = 1;
            contMetade = 1;  
            contPula = 0;
            respostaA.setDisable(false);
            respostaB.setDisable(false);
            respostaC.setDisable(false);
            respostaD.setDisable(false);
            String ponto = Integer.toString(0);
            pontos.setText(ponto);
            resultado.setText("");
            metade.setDisable(false);
            dicaButton.setDisable(false);
            dicaText.setText("");
            pular.setDisable(false);
            pagResposta.setDisable(true);
            pergunta();
        }
    }
    public void pergunta(){
       pergunta.setText(perguntas[num].getPergunta());
       respostaA.setText(perguntas[num].getRespostaA());
       respostaB.setText(perguntas[num].getRespostaB());
       respostaC.setText(perguntas[num].getRespostaC());
       respostaD.setText(perguntas[num].getRespostaD());
    }
    
   
}
