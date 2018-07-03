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
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

/**
 * FXML Controller class
 *
 * @author ASHOK
 */
// keypad tab controller 
public class KeypadController implements Initializable {
    boolean l1 =false;
    boolean l2 = false ;
    @FXML
    private JFXButton lift0;
    @FXML
    private JFXButton lift1;
    @FXML
    private JFXButton lift2;
    @FXML
    private JFXButton lift3;
    @FXML
    private JFXButton lift7;
    @FXML
    private JFXButton lift5;
    @FXML
    private JFXButton lift4;
    @FXML
    private JFXButton lift6;
    @FXML
    private MenuItem elevator1;
    @FXML
    private MenuItem elevator2;
    @FXML
    private JFXButton ALARM;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     //   ALARM.setStyle("-fx-background-image: url('alarm2.png')");
     //BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("alarm3.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
      //  Background background = new Background(backgroundImage);

        
       // ALARM.setBackground(background);

    }    

    @FXML
    private void lift0action(ActionEvent event) {
        if(l1)
        {
            ElevatorManager.e1.addFloor(0);
        }
        else
        {
            ElevatorManager.e2.addFloor(0);
        }
            
        
        
    }

    @FXML
    private void lift1action(ActionEvent event) {
        
         if(l1)
        {
            ElevatorManager.e1.addFloor(1);
        }
        else
        {
            ElevatorManager.e2.addFloor(1);
        }
    }

    @FXML
    private void lift2action(ActionEvent event) {
         if(l1)
        {
            ElevatorManager.e1.addFloor(2);
        }
        else
        {
            ElevatorManager.e2.addFloor(2);
        }
    }

    @FXML
    private void lift3action(ActionEvent event) {
         if(l1)
        {
            ElevatorManager.e1.addFloor(3);
        }
        else
        {
            ElevatorManager.e2.addFloor(3);
        }
    }

    @FXML
    private void lift7action(ActionEvent event) {
         if(l1)
        {
            ElevatorManager.e1.addFloor(7);
        }
        else
        {
            ElevatorManager.e2.addFloor(7);
        }
    }

    @FXML
    private void lift5action(ActionEvent event) {
         if(l1)
        {
            ElevatorManager.e1.addFloor(5);
        }
        else
        {
            ElevatorManager.e2.addFloor(5);
        }
    }

    @FXML
    private void lift4action(ActionEvent event) {
         if(l1)
        {
            ElevatorManager.e1.addFloor(4);
        }
        else
        {
            ElevatorManager.e2.addFloor(4);
        }
    }

    @FXML
    private void lift6action(ActionEvent event) {
         if(l1)
        {
            ElevatorManager.e1.addFloor(6);
        }
        else
        {
            ElevatorManager.e2.addFloor(6);
        }
    }

    @FXML
    private void elevator1action(ActionEvent event) {
        
        l1 = true;
        l2= false;
    }

    @FXML
    private void elevator2action(ActionEvent event) {
        
        
        l1 = false ;
        l2 = true;
    }

    @FXML
    private void alarmaction(ActionEvent event) {
    SendingMail.sendMail("jayantreddybodkurwar@gmail.com");
    //  SendingMail.sendMail("sudhanshuupadhyay817@gmail.com");
      // SendingMail.sendMail("sbkjobanputra@gmail.com");
        // SendingMail.sendMail("varshak333@gmail.com");
         // SendingMail.sendMail("gunjank333@gmail.com");
       
    }
    
}
