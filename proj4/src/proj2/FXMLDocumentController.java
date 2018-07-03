/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 *
 * @author ASHOK
 */
// main tab page controller

public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private JFXHamburger hb;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private Tab floorkeypadtab;
    @FXML
    private Tab liftsimulationtab;
    @FXML
    private Tab liftkeypadtab;
    @FXML
    private AnchorPane root;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(!FXMLDocumentController1.issplashloaded)
        loadSplashScreen();
         VBox box = null;
        try {
            box = FXMLLoader.load(getClass().getResource("FXMLDocument_1.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
       AnchorPane sp = null;
        try {
             sp =   FXMLLoader.load(getClass().getResource("floor.fxml"));
        } catch (IOException ex) {
          
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
       AnchorPane sp1 = null;
        try {
             sp1=   FXMLLoader.load(getClass().getResource("FXMLDocument_2.fxml"));
        } catch (IOException ex) {
         
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        AnchorPane sp2 = null;
        try {
             sp2 =   FXMLLoader.load(getClass().getResource("keypad.fxml"));
        } catch (IOException ex) {
           
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        drawer.setSidePane(box);
        floorkeypadtab.setContent(sp);
        liftsimulationtab.setContent(sp1);
        liftkeypadtab.setContent(sp2);
        
         HamburgerBackArrowBasicTransition  trans2 = new HamburgerBackArrowBasicTransition(hb);
        trans2.setRate(-1);
        hb.addEventHandler(MouseEvent.MOUSE_CLICKED,(e)->{
           trans2.setRate(trans2.getRate()* -1);
           trans2.play();
           
           if(drawer.isShown())
           {
               drawer.close();
               
           }
           else
           {
               
               drawer.open();
               
               //drawer.setDisable(false);
             // liftkeypadtab.setDisable(true);
              // floorkeypadtab.setDisable(true);
               //liftsimulationtab.setDisable(true);
           }
          
        });
       
        // TODO
    
    }
    private void loadSplashScreen()
    {
        try {
            StackPane pane =FXMLLoader.load(getClass().getResource("splash.fxml"));
            root.getChildren().setAll(pane);
            FXMLDocumentController1.issplashloaded=true;
            
            FadeTransition fadein = new FadeTransition(Duration.seconds(2),pane);
            fadein.setFromValue(0);
            fadein.setToValue(1);
            fadein.setCycleCount(1);
            fadein.play();
            
              FadeTransition fadeout = new FadeTransition(Duration.seconds(2),pane);
            fadeout.setFromValue(1);
            fadeout.setToValue(0);
            fadeout.setCycleCount(1);
          //  fadeout.play();
          fadein.setOnFinished((e)->{
                fadeout.play();
            });
          fadeout.setOnFinished((e)->{
             AnchorPane parent;
                try {
                    parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                     root.getChildren().setAll(parent);
                } catch (IOException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            });
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
