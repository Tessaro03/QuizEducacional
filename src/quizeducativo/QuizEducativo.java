package quizeducativo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuizEducativo extends Application {
    
    private static Scene sceneJanelaPerg, sceneJanelaResu, sceneJanelaMenu, sceneJanelaFinal, sceneJanelaRegras, sceneJanelaCreditos;
    private static Stage primaryStage;
    private static int pontuacao;
    private static boolean desistir;
    
    public static boolean getDesistencia() {
        return desistir;
    }
    
    public static void setDesistencia(boolean desistencia) {
        desistir = desistencia;
    }
    
    
    public static int getPontuacao() {
        return pontuacao;
    }
    
    public static void setPontuacao(int novaPontuacao) {
        pontuacao = novaPontuacao;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader janelaPerg = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        FXMLLoader janelaResu = new FXMLLoader(getClass().getResource("FXMLResultado.fxml"));
        FXMLLoader janelaMenu = new FXMLLoader(getClass().getResource("FXMLMenu.fxml"));
        FXMLLoader janelaFinal = new FXMLLoader(getClass().getResource("FXMLFinalizado.fxml"));
        FXMLLoader janelaRegras = new FXMLLoader(getClass().getResource("FXMLRegras.fxml"));
        FXMLLoader janelaCreditos = new FXMLLoader(getClass().getResource("FXMLCreditos.fxml"));
        
        primaryStage = stage;
        
        primaryStage.setTitle("Quiz Educação Abiental");    
        
        Parent parentJanelaPerg = janelaPerg.load();
        Parent parentJanelaResu = janelaResu.load();
        Parent parentJanelaMenu = janelaMenu.load();
        Parent parentJanelaFinal = janelaFinal.load();
        Parent parentJanelaRegras = janelaRegras.load();
        Parent parentJanelaCreditos = janelaCreditos.load();
        
        sceneJanelaPerg = new Scene(parentJanelaPerg, 721, 535);
        sceneJanelaResu = new Scene(parentJanelaResu, 721, 535);
        sceneJanelaMenu = new Scene(parentJanelaMenu, 600, 400);
        sceneJanelaFinal = new Scene(parentJanelaFinal, 721, 535);
        sceneJanelaRegras = new Scene(parentJanelaRegras, 721, 535);
        sceneJanelaCreditos = new Scene(parentJanelaCreditos, 721, 535);
        
        stage.setScene(sceneJanelaMenu);
        stage.show();
    }
    public static void changeScreen(int opcao){
        switch(opcao){
            case 1:
                primaryStage.setScene(sceneJanelaPerg);
                break;
            case 2:
                primaryStage.setScene(sceneJanelaResu);
                break;
            case 3:
                primaryStage.setScene(sceneJanelaMenu);
                break;
            case 4:
                primaryStage.setScene(sceneJanelaFinal);
                break;    
            case 5:
                primaryStage.setScene(sceneJanelaRegras);
                break;
            case 6:
                primaryStage.setScene(sceneJanelaCreditos);
                break;
        }
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
