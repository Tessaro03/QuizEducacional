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
   
    Pergunta[] perguntas = new Pergunta[10];
    Pergunta pergunta1 = new Pergunta("Quais são os principais cuidados que devemos ter com o meio ambiente?"," Envolve ações simples para proteger a natureza.","Jogar lixo no chão","Economizar água e energia","Cortar árvores sem necessidade","Usar produtos químicos sem se preocupar com o descarte","respostaB","Uma das práticas mais importantes é a redução, reutilização e reciclagem. Devemos procurar reduzir o consumo excessivo, optar por produtos duráveis e separar corretamente os resíduos para reciclagem. Assim, podemos diminuir a quantidade de lixo que é enviado para aterros sanitários e minimizar os impactos no meio ambiente.");
    Pergunta pergunta2 = new Pergunta("O que devemos fazer com o papel que já foi usado e não precisa mais?","Podemos dar uma nova utilidade a ele."," Jogar no lixo comum","Queimar para se livrar dele","Jogar no vaso sanitário","Reciclar ou reutilizar","respostaD","Quando o papel já foi usado e não precisa mais, devemos dar a ele uma destinação adequada. Uma opção é reciclar o papel, colocando-o na lixeira destinada à coleta seletiva de papel. Ao fazer isso, o papel será recolhido por empresas especializadas que o transformarão em novos produtos, como papel reciclado, evitando a necessidade de cortar mais árvores para a produção de papel virgem.");
    Pergunta pergunta3 = new Pergunta("Qual dos itens a seguir não pode ser descartado no lixo reciclável?", "Tem pólo positivo e negativo","Latinha de alumínio","Garrafa de vidro","Sacola de plástico","Bateria","respostaD","Por que não podemos descartar pilhas no lixo comum? Muitas destas pilhas e baterias são feitas de metais pesados como mercúrio, cádmio, níquel e substâncias que contém estes metais. Estas substâncias são muito tóxicas e prejudicam o organismo e possuem efeito cumulativo.");
    Pergunta pergunta4 = new Pergunta("Qual dos seguintes comportamentos ajuda a economizar energia elétrica?" , " Envolve desligar aparelhos que não estão sendo usados." , "Deixar todas as luzes acesas" , "Usar o ar-condicionado em todas as horas do dia" ," Desligar a TV e o computador quando não estiver usando" , "Deixar o chuveiro ligado enquanto escova os dentes" , "respostaC" ,"Desligar a TV e o computador quando não estão sendo utilizados é uma prática simples, porém eficaz, para economizar energia elétrica. Esses aparelhos consomem energia mesmo quando estão em modo de espera ou em stand-by. Esse consumo em espera, conhecido como consumo vampiro ou standby power, pode representar uma parcela significativa do consumo total de energia de uma residência.");
    Pergunta pergunta5 = new Pergunta("Quais são algumas maneiras de reduzir a poluição do ar em nossa vida cotidiana? ","Envolve escolhas conscientes em relação ao transporte e consumo.","Utilizando mais plástico descartável "," Fazendo queimadas no quintal ","Usando transporte público ou compartilhado ","Jogando lixo na rua ","respostaC","Evitar queimadas e fogueiras: A queima de resíduos e o uso de fogueiras ao ar livre são práticas que liberam uma grande quantidade de poluentes na atmosfera. É essencial evitar essas atividades e optar por métodos seguros e menos poluentes para o descarte de materiais, como a compostagem de resíduos orgânicos.");
    Pergunta pergunta6 = new Pergunta("O que podemos fazer para ajudar a melhorar a qualidade do ar em nossa comunidade?","Envolve práticas de cuidado com o meio ambiente.","Plantar árvores e cuidar dos jardins","Ignorar as regulamentações ambientais","Utilizar produtos químicos tóxicos em casa","Descartar produtos eletrônicos de forma inadequada","respostaA","Plantar árvores e cuidar dos espaços verdes: As árvores desempenham um papel importante na absorção de dióxido de carbono e na produção de oxigênio. Ao plantar árvores em áreas urbanas e cuidar dos espaços verdes, estamos contribuindo para a melhoria da qualidade do ar. As árvores também ajudam a reduzir o efeito de ilhas de calor nas cidades, proporcionando sombra e resfriamento.");
    Pergunta pergunta7 = new Pergunta("Qual é a principal fonte de poluição do ar em áreas urbanas? "," É um tipo de veículo movido a combustíveis fósseis. ","Carros elétricos ","Bicicletas ","Motocicletas ","Ônibus elétricos ","respostaC","A principal fonte de poluição do ar em áreas urbanas é o uso de veículos movidos a combustíveis fósseis, como carros, motocicletas e ônibus que utilizam gasolina, diesel ou outros combustíveis derivados do petróleo. Esses veículos emitem uma variedade de poluentes atmosféricos, incluindo dióxido de carbono (CO2), óxidos de nitrogênio (NOx), monóxido de carbono (CO), hidrocarbonetos e partículas sólidas, conhecidas como material particulado.");
    Pergunta pergunta8 = new Pergunta("Qual das seguintes práticas contribui para a utilização responsável da água?","Envolve evitar desperdícios e conservar esse recurso natural vital.","Deixar a torneira aberta enquanto escova os dentes.","Tomar banhos longos e com o chuveiro em alta pressão."," Utilizar água potável para regar o jardim.","Consertar imediatamente vazamentos e gotejamentos.","respostaD","Vazamentos e gotejamentos em torneiras, canos e sistemas hidráulicos podem resultar em perdas significativas de água ao longo do tempo. Mesmo pequenos vazamentos, aparentemente insignificantes, podem acumular grandes quantidades de água desperdiçada ao longo do tempo.");
    Pergunta pergunta9 = new Pergunta("Qual é a importância de separar corretamente os materiais recicláveis?","Ajuda no processo de reciclagem e na redução do impacto ambiental.","Não faz diferença, pois tudo acaba no mesmo lugar.","Facilita o descarte indiscriminado de resíduos.","Ajuda a diminuir a necessidade de coleta seletiva.","Permite a correta destinação dos materiais para reciclagem.","respostaD","A separação correta dos materiais recicláveis é de extrema importância devido aos benefícios que ela proporciona para o processo de reciclagem e para a redução do impacto ambiental. Quando os materiais são separados de acordo com sua natureza e categoria, é possível direcioná-los adequadamente para os centros de reciclagem, onde serão processados e transformados em novos produtos.");
    Pergunta pergunta10 = new Pergunta("Quais são algumas das principais fontes de poluição sonora em áreas urbanas?","Essas fontes podem incluir atividades humanas e infraestruturas.","Cantos de pássaros","Som de carros elétricos","Máquinas industriais","Queda de água em uma cachoeira","respostaC","A poluição sonora proveniente dessas fontes pode resultar em diversos impactos negativos, como problemas de saúde, estresse, dificuldade de concentração, distúrbios do sono, perturbação do bem-estar emocional e até mesmo perda auditiva. É importante adotar medidas de controle e regulamentações para mitigar a poluição sonora e preservar a qualidade de vida nas áreas urbanas.");
    
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
       perguntas[4] = pergunta5;
       perguntas[5] = pergunta6;
       perguntas[6] = pergunta7;
       perguntas[7] = pergunta8;
       perguntas[8] = pergunta9;
       perguntas[9] = pergunta10;
       
       
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
