/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientdatabase.GUI;

import patientdatabase.BE.Patient;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import patientdatabase.BLL.BLLManager;

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
                FXCollections.observableArrayList();
        
        BLLManager bllManager = BLLManager.getInstance();
        patientList.addAll(bllManager.getAllPatients());
        
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tablePatients.setItems(patientList);
    }
    
}
