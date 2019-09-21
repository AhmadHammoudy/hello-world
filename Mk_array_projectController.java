/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mkarrayproject;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class Mk_array_projectController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    HBox hbox;
    @FXML
    JFXTextField txtArrayCount;
    @FXML
    JFXTextArea txtResult;
    
    public void generate(){
        int arrayCount = Integer.parseInt(txtArrayCount.getText());
        for(int i = 0; i< arrayCount ; i++){
            JFXTextField t1 = new JFXTextField();
            hbox.getChildren().add(t1);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
