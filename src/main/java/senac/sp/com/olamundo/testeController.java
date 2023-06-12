package senac.sp.com.olamundo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class testeController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField textoMensagem;

    @FXML
    protected void onOpenButtonClick() throws IOException {
       /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("teste.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage stage = new Stage();
        stage.setTitle("HellO!");
        stage.setScene(scene);
        stage.show();*/


        //ler valor do textfield

        welcomeText.setText(textoMensagem.getText());
    }
}
