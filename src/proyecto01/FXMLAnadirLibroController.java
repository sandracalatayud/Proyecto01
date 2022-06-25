/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FXMLAnadirLibroController implements Initializable {

    /* TEXTFIELD CAMPOS */
    @FXML
    private TextField tfTitulo;
    @FXML
    private TextField tfSubtitulo;
    @FXML
    private TextField tfAutor;
    @FXML
    private TextField tfEditorial;
    @FXML
    private TextField tfPaginas;
    @FXML
    private TextField tfFecha;
    @FXML
    private TextField tfIsbn;
    @FXML
    private TextField tfColeccion;
    @FXML
    private TextField tfTituloOriginal;
    @FXML
    private TextField tfSubtituloOriginal;
    @FXML
    private TextField tfFechaOriginal;
    @FXML
    private TextField tfSaga;
    @FXML
    private TextField tfNumSaga;

    /* TEXT AREA */
    @FXML
    private TextArea taSinopsis;

    /* TG GÉNERO */
    @FXML
    private ToggleGroup tgGenero;
    @FXML
    private RadioButton rbMujer;
    @FXML
    private RadioButton rbHombre;
    @FXML
    private RadioButton rbNoBinario;
    @FXML
    private RadioButton rbOtro;
    @FXML
    private RadioButton rbVarios;

    /* COMBO BOXES */
    @FXML
    private ComboBox<FORMAT> cbFormato;
    @FXML
    private ComboBox<String> cbIdioma;
    @FXML
    private ComboBox<String> cbIdiomaOriginal;
    @FXML
    private ComboBox<String> cbPais;
    @FXML
    private ComboBox<String> cbPaisOriginal;
    private ObservableList<String> countries;

    /* TG LO TIENE */
    @FXML
    private ToggleGroup tgLoTienes;
    @FXML
    private RadioButton rbSi;
    @FXML
    private RadioButton rbNo;

    /* BOTONES */
    @FXML
    private Button btAnadirLibro;
    @FXML
    private Button btLimpiarFormulario;
    @FXML
    private Button btCancelar;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     * @throws java.io.FileNotFoundException
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // SET lista de países
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\scm93\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto01\\src\\resources\\paisesespaniol.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    //Add Item
                    cbPais.getItems().add(line);
                    cbPaisOriginal.getItems().add(line);

                    sb.append(line);
                    line = br.readLine();
                }

            } finally {
                br.close();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLAnadirLibroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            ex.getMessage();
        }

        //SET lista idiomas
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\scm93\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto01\\Resources\\idiomas.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br1.readLine();

                while (line != null) {
                    //Add Item
                    cbIdioma.getItems().add(line);

                    sb.append(line);
                    line = br1.readLine();
                }

            } finally {
                br1.close();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLAnadirLibroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    @FXML
    private void anadirLibro(ActionEvent event) {
    }

    @FXML
    private void limpiarFormulario(ActionEvent event) {

        tfTitulo.setText("");
        tfSubtitulo.setText("");
        tfAutor.setText("");
        tfEditorial.setText("");
        tfPaginas.setText("");
        tfIsbn.setText("");
        tfColeccion.setText("");
        tfTituloOriginal.setText("");
        tfSubtituloOriginal.setText("");
        tfFechaOriginal.setText("");
        tfSaga.setText("");
        tfNumSaga.setText("");
        taSinopsis.setText("");
        rbMujer.setSelected(false);
        rbHombre.setSelected(false);
        rbNoBinario.setSelected(false);
        rbOtro.setSelected(false);
        rbVarios.setSelected(false);
        rbSi.setSelected(false);
        rbNo.setSelected(false);

        //FALTA COMBOBOX Y PORTADA
    }

    @FXML
    private void cancelar(ActionEvent event) {

        //Cerrar ventana actual
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

    }

}
