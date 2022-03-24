
package StefanoTutorial7;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends Application
{
    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        List<Float> digitNumber = new ArrayList();
        String firstNumber = JOptionPane.showInputDialog(new JFrame(),"Insert the first number: ");       
        
        BorderPane borderPane = new BorderPane();
        
        //Top area of the border pane
        Label titleLabel = new Label("Standard");
        HBox hBoxTitle = new HBox();
        hBoxTitle.getChildren().add(titleLabel);
        hBoxTitle.setAlignment(Pos.CENTER);        
        borderPane.setTop(hBoxTitle);
        
        List<String> digitButton = new ArrayList();
        digitButton.add("7");//n, "8", "9", "4", "5", "6", "1", "2", "3", "0", "+", "-", "." );


//        Label dotLabel = new Label(".");        
//        Label zeroLabel = new Label("0");   
//        Label resultLabel = new Label("=");   
//        Label plusLabel = new Label("+");   
//        Label oneLabel = new Label("1");   
//        Label twoLabel = new Label("2");   
//        Label threeLabel = new Label("3");      
//        Label multiplyLabel = new Label("*");
//        Label fourLabel = new Label("4");   
//        Label fiveLabel = new Label("5");   
//        Label sixLabel = new Label("6");   
//        Label minusLabel = new Label("-");   
//        Label sevenLabel = new Label("7");   
//        Label eightLabel = new Label("8");   
//        Label nightLabel = new Label("9");   
//        Label divideLabel = new Label("/");   
//        Label clearLabel = new Label("CE");   
//        VBox vBox1 = new VBox(dotLabel, zeroLabel, resultLabel, plusLabel, oneLabel, twoLabel, threeLabel, multiplyLabel, fourLabel, fiveLabel,
//                                sixLabel, minusLabel, sevenLabel, eightLabel, nightLabel, divideLabel, clearLabel);
        
        TextField resultTextField = new TextField();
        
        //borderPane.setBottom(digitButton[]);
        
        //Create the border pane
        Scene scene = new Scene(borderPane, 500, 500);        
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
    
}
