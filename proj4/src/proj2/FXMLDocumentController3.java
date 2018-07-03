/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import com.jfoenix.controls.JFXButton;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * FXML Controller class
 *
 * @author ASHOK
 */
// bg + music controller
public class FXMLDocumentController3 implements Initializable {

    @FXML
    private StackPane stackpane;
    @FXML
    private ImageView imageid;
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private JFXButton clickmebutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(2));
        transition.setNode(clickmebutton);
        transition.setToY(-200);
        transition.setToX(-200);
        transition.setAutoReverse(true);
       transition.setCycleCount(TranslateTransition.INDEFINITE);

    ScaleTransition transition1 = new ScaleTransition(Duration.seconds(3),clickmebutton);
    transition1.setToX(2);
    transition1.setToY(2);
    transition1.setAutoReverse(true);
    transition1.setCycleCount(ScaleTransition.INDEFINITE);
    //Rotate Transition
    RotateTransition transition2 = new RotateTransition(Duration.seconds(3),imageid);
    transition2.setByAngle(360);
    transition2.setAutoReverse(true);
    transition2.setCycleCount(ScaleTransition.INDEFINITE);
    
    /*
        transition.play();
        transition1.play();
        transition2.play();
    */
    /*
    ParallelTransition pt =new ParallelTransition(transition , transition1 ,transition2);
    //pt.getChildren().add();
    pt.play();
*/
    
    Circle cir = new Circle (100);
    PathTransition trans4 = new PathTransition();
    trans4.setNode(clickmebutton);
    trans4.setDuration(Duration.seconds(3));
    trans4.setPath(cir);
    trans4.setAutoReverse(true);
    trans4.setCycleCount(PathTransition.INDEFINITE);
    ParallelTransition pt =new ParallelTransition(trans4 , transition1 ,transition2);
    pt.play();
    
    
   
        
        
        // TODO
    }    
 public void music()
    {
      /*  AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
      
        try
        {
        BGM = new AudioStream(new FileInputStream("ChillingMusic.wav"));
        MD = BGM.getData();
        loop = new ContinuousAudioDataStream (MD);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        MGP.start(loop);
        */

       try
        {
        InputStream in = new FileInputStream("AUD-20171029-WA0029.wav");
           // InputStream in = new FileInputStream("Linkin Park - Breaking The Habit (Mp3Goo.io).wav");
          //  Coldplay_-_Hymn_For_The_Weekend_Official_Video[KeepVid.guru]
         // InputStream in = new FileInputStream("Coldplay_-_Hymn_For_The_Weekend_Official_Video[KeepVid.guru]).wav");
        AudioStream audiostream = new AudioStream(in);
        AudioPlayer .player.start(audiostream);
       // AudioPlayer.player.
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }

    @FXML
    private void clickmeaction(ActionEvent event) {
        music();
         Elevator e1 = new Elevator ();
         Elevator e2  = new Elevator ();
         ElevatorManager.e1 = e1;  e1.lift1 = true;
         ElevatorManager.e2 = e2;  e2.lift2 = true;
          try {
           // FXMLLoader.load(getClass().getResource("secondwindow.fxml"));
           Parent root1 =FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
           Stage stage = new Stage ();
           //stage.setTitle("Second Window");
           stage.setScene(new Scene (root1 ));
           stage.show();
                   } catch (IOException ex) {
           Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
       }
          
          
           Thread requestProcessorThread1 = new Thread(new MoveElevator(e1),
                "MoveElevatorThread");
         
          requestProcessorThread1.start();
           Thread requestProcessorThread2 = new Thread(new MoveElevator(e2),
                "MoveElevatorThread");
         
          requestProcessorThread2.start();
    }
    
    
    
}
