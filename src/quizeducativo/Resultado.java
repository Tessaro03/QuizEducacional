package quizeducativo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Resultado implements Initializable{
        
    Pergunta[] perguntas = new Pergunta[4];
    Pergunta pergunta1 = new Pergunta("Qual é a maior reserva indígena brasileira assim como a primeira a ser criada?","A usina hidrelétrica de Belo Monte fica situada no seu principal rio.","Reserva Bangú","Reserva dos Palhares","Reserva Tupiniquin","Reserva do rio Xingú","respostaD","O parque foi criado em 1961 pelo então presidente brasileiro Jânio Quadros, tendo sido a primeira terra indígena homologada pelo governo federal. Seus principais idealizadores foram os irmãos Villas Bôas, mas quem redigiu o projeto foi o antropólogo e então funcionário do Serviço de Proteção ao Índio, Darcy Ribeiro.");
    Pergunta pergunta2 = new Pergunta("Qual a fonte de energia mais limpa ?","No Brasil temos duas usinas dessa fonte de energia, denominadas Angra I e Angra II","Energia eólica","Energia maremotriz","Energia solar","Energia nuclear","respostaD","A principal vantagem da fonte nuclear de energia é a sua baixa emissão de poluentes e a sua elevada produtividade. Essa fonte de energia produz lixo radioativo, porém o mesmo pode ser selado hermeticamente nos dias atuais, com um lacre que só se rompe após o material perder toda sua radioatividade.");
    Pergunta pergunta3 = new Pergunta("Qual dos itens a seguir não pode ser descartado no lixo reciclável?", "Tem pólo positivo e negativo","Latinha de alumínio","Garrafa de vidro","Sacola de plástico","Bateria","respostaD","Por que não podemos descartar pilhas no lixo comum? Muitas destas pilhas e baterias são feitas de metais pesados como mercúrio, cádmio, níquel e substâncias que contém estes metais. Estas substâncias são muito tóxicas e prejudicam o organismo e possuem efeito cumulativo.");
    Pergunta pergunta4 = new Pergunta("A maior parte do nitrogênio que compõe as moléculas orgânicas ingressa nos ecossistemas pela ação de:" , "são microorganismos" , "algas marinhas" , "animais" ," bactérias" , "fungos" , "respostaC" ,"O nitrogênio atmosférico deve passar por um processo natural chamado fixação biológica de nitrogênio, realizado por bactérias. As mais famosas e utilizadas são as dos gêneros Rhizobium e Bradyrhizobium, que transformam o Nitrogênio em uma forma que pode ser usada na nutrição das plantas.");



    @FXML
    private Button proximaPerg;
    @FXML
    public Label informacoes;
    @FXML
    private AnchorPane paginaDeResultado;

    int num = 0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       perguntas[0] = pergunta1;
       perguntas[1] = pergunta2;
       perguntas[2] = pergunta3;
       perguntas[3] = pergunta4;
       
       informacoes.setText(perguntas[num].getInformacao());
    }
    
    
    @FXML
    void proximaPerg(ActionEvent event) {
        if (QuizEducativo.getDesistencia() == true) {
            num = 0;
            QuizEducativo.setDesistencia(false);
            QuizEducativo.changeScreen(3);
            informacoes.setText(perguntas[num].getInformacao());
        } else if(num < (perguntas.length - 1) && (QuizEducativo.getDesistencia() == false)){
            informa();
            QuizEducativo.changeScreen(1);
        } else{
            num = 0;
            informacoes.setText(perguntas[num].getInformacao());
            QuizEducativo.changeScreen(4);
        }
    }
    
    public void informa(){
       num += 1;
       informacoes.setText(perguntas[num].getInformacao());
       
    }
}
