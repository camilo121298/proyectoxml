/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivosxml;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Empleado;

/**
 *
 * @author camilo.rodriguez
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField nametxt;
    @FXML
    private TextField directiontxt;
    @FXML
    private TextField agetxt;
    @FXML
    private TextField codetxt;
    @FXML
    private TextField departtxt;
    LinkedList<Empleado> lista;
    @FXML
    private void addEmployer(ActionEvent event){
        lista.add(new Empleado(
            codetxt.getText(), 
            departtxt.getText(), 
            nametxt.getText(), 
            directiontxt.getText(), 
            Integer.parseInt(agetxt.getText())               
        ));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       lista = new LinkedList<>();
    }    
    
}
