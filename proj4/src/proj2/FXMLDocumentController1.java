/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;
//import javafx.scene.control.Alert.*;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author ASHOK
 */
//drawer hamburger controller
public class FXMLDocumentController1 implements Initializable {

    @FXML
    private JFXButton floor0;
    @FXML
    private JFXButton floor1;
    @FXML
    private JFXButton floor2;
    @FXML
    private JFXButton floor3;
    @FXML
    private JFXButton floor4;
    @FXML
    private JFXButton floor5;
    @FXML
    private JFXButton floor6;
    @FXML
    private JFXButton floor7;
    
    
    static boolean issplashloaded = false;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void floor0action(ActionEvent event) {
        ElevatorManager.addFloor(0);
    }

    @FXML
    private void floor1action(ActionEvent event) {
        ElevatorManager.addFloor(1);
    }

    @FXML
    private void floor2action(ActionEvent event) {
        ElevatorManager.addFloor(2);
    }

    @FXML
    private void floor3action(ActionEvent event) {
        ElevatorManager.addFloor(3);
    }

    @FXML
    private void floor4action(ActionEvent event) {
        ElevatorManager.addFloor(4);
    }

    @FXML
    private void floor5action(ActionEvent event) {
        ElevatorManager.addFloor(5);
    }

    @FXML
    private void floor6action(ActionEvent event) {
        ElevatorManager.addFloor(6);
    }

    @FXML
    private void floor7action(ActionEvent event) {
        ElevatorManager.addFloor(7);
    }
    
}
