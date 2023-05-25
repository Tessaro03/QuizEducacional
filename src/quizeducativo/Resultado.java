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
       perguntas[4] = pergunta5;
       perguntas[5] = pergunta6;
       perguntas[6] = pergunta7;
       perguntas[7] = pergunta8;
       perguntas[8] = pergunta9;
       perguntas[9] = pergunta10;
       
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
