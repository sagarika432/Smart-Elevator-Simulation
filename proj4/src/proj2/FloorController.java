/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author ASHOK
 */
public class FloorController implements Initializable {

    @FXML
    private JFXButton upid;
    @FXML
    private JFXButton downid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void upidaction(ActionEvent event) {
       // SendingMail.sendMail("varshak333@gmail.com");
    }

    @FXML
    private void downidaction(ActionEvent event) {
    }
    
}
