/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import com.jfoenix.transitions.JFXFillTransition;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author ASHOK
 */
// simulation tab controller 
public class FXMLDocumentController2 implements Initializable {
    
  
   
    @FXML
    private TextField text0;
    @FXML
    private TextField text7;
    @FXML
    private TextField text6;
    @FXML
    private TextField text5;
    @FXML
    private TextField text4;
    @FXML
    private TextField text3;
    @FXML
    private TextField text2;
    @FXML
    private TextField text1;
    @FXML
    private TextField textt1;
    @FXML
    private TextField textt2;
    @FXML
    private TextField textt3;
    @FXML
    private TextField textt4;
    @FXML
    private TextField textt5;
    @FXML
    private TextField textt6;
    @FXML
    private TextField textt7;
    @FXML
    private TextField textt0;
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          ElevatorManager.e1.setController(this); 
        ElevatorManager.e2.setController(this);
        // TODO
    }    

      @FXML
    
    private void alert1(int l , int f )
    {
        Alert a1;
        a1 = new Alert(Alert.AlertType.INFORMATION);
        a1.setTitle("NOTIFICATION");
        a1.setHeaderText("LIFT " + l + " REACHED ON FLOOR " + f);
        a1.setContentText("Go on lift keypad tab once you enter the lift ");
       
        a1.show();
      
                
    }
      void act0 ()
    {
         text0.setText("lift passing ");
          JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(text0);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),text0,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            text0.clear();
          
        });
        
         
    }
      void actt0()
    {
        textt0.setText("lift passing");
          JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(textt0);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),textt0,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            textt0.clear();
          
        });
    }
      
      void act1 ()
    {
         text1.setText("lift passing");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(text1);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),text1,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            text1.clear();
          
        });
        
         
         
    }
      
       void actt1 ()
    {
         textt1.setText("lift passing");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(textt1);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),textt1,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            textt1.clear();
          
        });
        
         
         
    }
void act2 ()
    {
         text2.setText("lift passing");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(text2);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),text2,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            text2.clear();
          
        });
        
         
         
    }

void actt2 ()
    {
         textt2.setText("lift passing");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(textt2);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),textt2,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            textt2.clear();
          
        });
        
         
         
    }
void act3 ()
    {
         text3.setText("lift passing ");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(text3);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),text3,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            text3.clear();
          
        });
        
         
    }
void actt3 ()
    {
         textt3.setText("lift passing ");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(textt3);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),textt3,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
           textt3.clear();
          
        });
        
         
    }
void act4 ()
    {
         text4.setText("lift passing ");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(text4);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),text4,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            text4.clear();
          
        });
        
         
         
    }
void actt4 ()
    {
         textt4.setText("lift passing ");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(textt4);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),textt4,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
           textt4.clear();
          
        });
        
         
         
    }
void act5 ()
    {
         text5.setText("lift passing");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(text5);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),text5,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            text5.clear();
          
        });
        
         
         
    }
void actt5 ()
    {
         textt5.setText("lift passing");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(textt5);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),textt5,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
           textt5.clear();
          
        });
        
         
         
    }
void act6 ()
    {
         text6.setText("lift passing");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(text6);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),text6,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            text6.clear();
          
        });
        
         
         
    }
void actt6 ()
    {
         textt6.setText("lift passing ");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(textt6);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),textt6,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            textt6.clear();
          
        });
        
         
         
    }
void act7 ()
    {
         text7.setText("lift passing ");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(text7);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
        
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),text7,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            text7.clear();
          
        });
        
         
         
    }

void actt7 ()
    {
         textt7.setText("lift passing");
         JFXFillTransition trans1 = new JFXFillTransition();
        trans1.setDuration(Duration.millis(2000));
        trans1.setRegion(textt7);
        trans1.setFromValue(Color.WHITE);
        trans1.setToValue(Color.GREEN);
        trans1.play();
         
   
     
        JFXFillTransition trans11 = new JFXFillTransition(Duration.millis(1000),textt7,Color.GREEN ,Color.WHITE);
        trans1.setOnFinished((ActionEvent e) -> {
            trans11.play();
            textt7.clear();
          
        });
        
         
         
    }
void act00 ()
    {
         text0.setText("lift reached ");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),text0,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),text0,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             text0.clear();
            // alert1(1,0);
         });
         
    }
     void actt00 ()
    {
         textt0.setText("lift reached ");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),textt0,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),textt0,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
            textt0.clear();
           // alert1(2,0);
         });
         
    } 
      
      void act11 ()
    {
         text1.setText("lift reached ");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),text1,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),text1,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             text1.clear();
           //alert1(1,1);
         });
         
    }
       void actt11 ()
    {
         textt1.setText("lift reached ");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),textt1,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),textt1,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             textt1.clear();
           //  alert1(2,1);
         });
         
    }
void act22 ()
    {
         text2.setText("lift reached ");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),text2,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),text2,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
            text2.clear();
                    //alert1(1,2);
         });
         
    }
void actt22 ()
    {
         textt2.setText("lift reached ");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),textt2,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),textt2,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             textt2.clear();
            // alert1(2,2);
         });
         
    }

void act33 ()
    {
         text3.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),text3,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),text3,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             text3.clear();
             //alert1(1,3);
         });
         
    }
void actt33 ()
    {
         textt3.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),textt3,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),textt3,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             textt3.clear();
           //  alert1(2,3);
         });
         
    }
void act44 ()
    {
         text4.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),text4,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),text4,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
            text4.clear();
          //  alert1(1,4);
         });
         
    }
void actt44 ()
    {
         textt4.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),textt4,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),textt4,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             textt4.clear();
             //alert1(2,4);
         });
         
    }
void act55 ()
    {
         text5.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),text5,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),text5,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             text5.clear();
            // alert1(1,5);
         });
         
    }
void actt55 ()
    {
         textt5.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),textt5,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),textt5,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             textt5.clear();
             //alert1(2,5);
         });
         
    }

void act66 ()
    {
         text6.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),text6,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),text6,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             text6.clear();
             //alert1(1,6);
         });
         
    }
void actt66 ()
    {
         textt6.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),textt6,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),textt6,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             textt6.clear();
           //  alert1(2,6);
         });
         
    }
void act77 ()
    {
         text7.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),text7,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),text7,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             text7.clear();
            // alert1(1,7);
         });
         
    }
void actt77 ()
    {
         textt7.setText("lift reached");
         JFXFillTransition transred = new JFXFillTransition(Duration.millis(2000),textt7,Color.WHITE ,Color.RED);
         transred.play();
          JFXFillTransition transwhi = new JFXFillTransition(Duration.millis(1000),textt7,Color.RED ,Color.WHITE);
          transred.setOnFinished((ActionEvent e)->{
             transwhi.play();
             textt7.clear();
            // alert1(2,7);
         });
         
    }
   
    


    
}


