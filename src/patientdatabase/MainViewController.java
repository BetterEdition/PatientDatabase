/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientdatabase;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainViewController implements Initializable
{
    
    @FXML
    private Label label;
    @FXML
    private TableView<Patient> tablePatients;
    @FXML
    private TableColumn<Patient, String> columnName;
    @FXML
    private TableColumn<Patient, String> columnEmail;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        readDataIntoList();
    }    

    private void readDataIntoList()
    {
        ObservableList<Patient> patientList = 
                FXCollections.observableArrayList(
                    new Patient(0, "Jeppe", "jle@easv.dk", "Full retardo"),
                    new Patient(1, "Lucas", "luc2517@easv365.dk", "Swaztica Afficianato")
                );
        
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tablePatients.setItems(patientList);
    }
    
}
