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
import java.lang.reflect.InvocationTargetException;
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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import proyecto01.FXMLPrincipalController;

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
    @FXML
    private TextField tfLugarAdquisicion;
    @FXML
    private TextField tfFechaAdquisicion;
    @FXML
    private TextField tfCompradoEn;
    @FXML
    private TextField tfRegaladoPor;
    @FXML
    private TextField tfBorrowTo;
    @FXML
    private TextField tfLoanBy;
    @FXML
    private TextField tfPortada;
    @FXML
    private TextField tfEdicion;


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
    private ComboBox<String> cbIdioma;
    @FXML
    private ComboBox<String> cbIdiomaOriginal;
    @FXML
    private ComboBox<String> cbPais;
    @FXML
    private ComboBox<String> cbPaisOriginal;


    /* TG LO TIENE */
    @FXML
    private ToggleGroup tgLoTienes;
    @FXML
    private RadioButton rbSi;
    @FXML
    private RadioButton rbNo;

    /* TG ESTADO */
    @FXML
    private ToggleGroup tgEstado;
    @FXML
    private RadioButton rbOwned;
    @FXML
    private RadioButton rbDonated;
    @FXML
    private RadioButton rbSold;
    @FXML
    private RadioButton rbBorrowed;
    @FXML
    private RadioButton rbLoaned;

    /* TG FORMATOS */
    @FXML
    private ToggleGroup tgFormato;
    @FXML
    private RadioButton rbRustica;
    @FXML
    private RadioButton rbBolsillo;
    @FXML
    private RadioButton rbElectronico;
    @FXML
    private RadioButton rbAudiolibro;


    /* BOTONES */
    @FXML
    private Button btAnadirLibro;
    @FXML
    private Button btLimpiarFormulario;
    @FXML
    private Button btCancelar;
    @FXML
    private RadioButton rbTapaDura;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     * @throws java.io.FileNotFoundException
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // SET listas de países e idiomas
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\scm93\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto01\\src\\resources\\paisesespaniol.txt"));
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\scm93\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto01\\Resources\\idiomas.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder();
                String line = br.readLine();
                String line1 = br1.readLine();

                while (line != null && line1 != null) {
                    //Add Item
                    cbPais.getItems().add(line);
                    cbPaisOriginal.getItems().add(line);
                    cbIdioma.getItems().add(line1);
                    cbIdiomaOriginal.getItems().add(line1);

                    sb.append(line);
                    line = br.readLine();
                    sb1.append(line1);
                    line1 = br1.readLine();
                }

            } finally {
                br.close();
                br1.close();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLAnadirLibroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            ex.getMessage();
        }

    }

    @FXML
    private void anadirLibro(ActionEvent event) throws IOException{

        RadioButton rbGenero = (RadioButton) tgGenero.getSelectedToggle();
        RadioButton rbEstado = (RadioButton) tgEstado.getSelectedToggle();
        RadioButton rbFormato = (RadioButton) tgFormato.getSelectedToggle();
        

        try {
            Book_Copy book = new Book_Copy(tfCompradoEn.getText(), tfRegaladoPor.getText(), tfFechaAdquisicion.getText(), tfLugarAdquisicion.getText(),rbEstado==null?STATUS.NULL:STATUS.valueOf(rbGenero.getId()),
                    tfBorrowTo.getText(), tfLoanBy.getText(), tfTitulo.getText(), tfSubtitulo.getText(), tfPaginas.getText().equals("")?0:Integer.parseInt(tfPaginas.getText()), tfEditorial.getText(),
                    cbPais.getValue(), tfFecha.getText(), rbFormato==null?FORMAT.NULL :FORMAT.valueOf(rbGenero.getId()), tfPortada.getText(), tfIsbn.getText(), tfEdicion.getText().equals("")?0: Integer.parseInt(tfEdicion.getText()),
                    tfColeccion.getText(), cbIdioma.getValue(), tfTituloOriginal.getText(), tfSubtituloOriginal.getText(), tfAutor.getText(), cbPaisOriginal.getValue(), tfFechaOriginal.getText(),
                    cbIdiomaOriginal.getValue(), tfSaga.getText(), tfNumSaga.getText().equals("")?0: Integer.parseInt(tfNumSaga.getText()), taSinopsis.getText(), rbGenero==null?AUTHOR_GENRE.NULL:AUTHOR_GENRE.valueOf(rbGenero.getId()));
                     
            
            //INSERCCIÓN de datos en tablas de BD
            
            conexion objConexion = new conexion();
            
            if (objConexion.ejecutarSentenciaSQL("INSERT INTO book (book_id, title_original,author, country_original_publishing, date_original_publishing, original_language, "
                    + "series, num_series, sinopsis, genre)"
                    + " VALUES (null, '" + book.getTitle_original() + "', '" + book.getAuthor() + "','" + book.getCountry_original_publishing() + "','"
                    + book.getDate_original_publishing() + "','" + book.getOriginal_languaje() + "','" + book.getSeries() + "'," + book.getNum_series() + ",'" + book.getSinopsis() + "','" + book.getGenre() + "')") == 1) {
                limpiarFormulario();
            } else {
                System.out.println("Error");
            }
            if (objConexion.ejecutarSentenciaSQL("INSERT INTO book_edition (book_edition_id, title, subtitle, pages, publisher, country_publishing, date_publishing, format, cover, isbn, edition, colection, language)"
                    + " VALUES (null, '"+ book.getTitle()+"','"+book.getSubtitle()+"','"+book.getPages()+"','"+book.getPublisher()+"','"+book.getCountry_publishing()+"','"+book.getDate_publishing()+"','"+book.getFormat()
                        +"','"+book.getCover()+"','"+book.getIsbn()+"','"+book.getEdition()+"','"+book.getColection()+"','"+book.getFormat()+"')")==1){
                limpiarFormulario();
            }else {
                System.out.println("Error");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("FXMLPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void limpiarFormulario(ActionEvent event) {

        limpiarFormulario();

    }

    @FXML
    private void cancelar(ActionEvent event) {

        //Cerrar ventana actual
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

    }

    public void limpiarFormulario() {

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
        tfPortada.setText("");
        tfEdicion.setText("");
        taSinopsis.setText("");
        rbMujer.setSelected(false);
        rbHombre.setSelected(false);
        rbNoBinario.setSelected(false);
        rbOtro.setSelected(false);
        rbVarios.setSelected(false);
        rbSi.setSelected(false);
        rbNo.setSelected(false);
        rbRustica.setSelected(false);
        rbBolsillo.setSelected(false);
        rbElectronico.setSelected(false);
        rbAudiolibro.setSelected(false);
        cbPais.setValue("");
        cbPaisOriginal.setValue("");
        cbIdioma.setValue("");
        cbIdiomaOriginal.setValue("");
        rbOwned.setSelected(false);
        rbDonated.setSelected(false);
        rbSold.setSelected(false);
        rbBorrowed.setSelected(false);
        rbLoaned.setSelected(false);
        tfFechaAdquisicion.setText("");
        tfLugarAdquisicion.setText("");
        tfCompradoEn.setText("");
        tfRegaladoPor.setText("");
        tfBorrowTo.setText("");
        tfLoanBy.setText("");

        
    }

}
