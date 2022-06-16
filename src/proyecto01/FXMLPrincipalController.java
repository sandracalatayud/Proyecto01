/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto01;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FXMLPrincipalController implements Initializable {

    @FXML
    private GridPane gridFiltros;
    @FXML
    private CheckBox cbLoTengo;
    @FXML
    private CheckBox cbNoLoTengo;
    @FXML
    private CheckBox cbFisico;
    @FXML
    private CheckBox cbElectronico;
    @FXML
    private CheckBox cbPrestado;
    @FXML
    private CheckBox cbEnPrestamo;
    @FXML
    private CheckBox cbVendido;
    @FXML
    private CheckBox cbDonado;
    @FXML
    private CheckBox cbAudio;
    @FXML
    private ListView<?> lvEdiciones;
    @FXML
    private Button btAnadirLibro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AnadirLibro(ActionEvent event) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("FXMLAnadirLibro.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("New Window");
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    private void LoTengo(ActionEvent event) {
    }

    @FXML
    private void NoLoTengo(ActionEvent event) {
    }
    
}
