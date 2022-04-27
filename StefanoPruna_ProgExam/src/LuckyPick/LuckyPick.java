
package LuckyPick;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LuckyPick extends Application
{

    public static void main(String[] args) 
    {
        launch(args);  
    }   
    
    private BorderPane borderPane;
    
    private Integer balance = 0;
    private Boolean returnButton = false;
    @Override
    public void start(Stage stage) throws Exception 
    {
        CGiftCard valueCard = new CGiftCard();
        valueCard.getValue();
        BorderPane borderPane = new BorderPane();
        
        //Top area of the border pane
        Label balanceLabel = new Label("Balance: $");
        Label balanceLabelValue = new Label("" + balance);
        HBox hBoxTitle = new HBox();
        hBoxTitle.getChildren().add(balanceLabel);
        hBoxTitle.getChildren().add(balanceLabelValue);
        hBoxTitle.setAlignment(Pos.CENTER);
        
        borderPane.setTop(hBoxTitle);
        //Left area of the border pane
        //VBOX 1
        TextField textTextField = new TextField();
        textTextField.editableProperty().set(false);        
        
        GridPane numberPad = new GridPane();
        Button five = new Button("$5");
        Button ten = new Button("$10");
        Button twenty = new Button("$20");
        Button fifty = new Button("$50");        
        numberPad.setId("numPad");
        
        numberPad.add(five, 0, 0);
        numberPad.add(ten, 1, 0);
        numberPad.add(twenty, 0, 1);
        numberPad.add(fifty, 1, 1);
       
        VBox vBoxLeft = new VBox(textTextField, numberPad);
        
        //VBOX 2      
        Label returnButtonLabel = new Label("Return");
        Label PickButtonLabel = new Label("Pick");   
        
        VBox vBoxRight = new VBox(returnButtonLabel, PickButtonLabel);
        
        five.setOnAction(new EventHandler<ActionEvent>() {

              @Override
              public void handle(ActionEvent t) 
              {
                  textTextField.setText("");
                  textTextField.appendText("You insert $5");
                  balance += 5;
                  balanceLabelValue.setText("" + balance);
              }             
        });
        ten.setOnAction(new EventHandler<ActionEvent>() {

              @Override
              public void handle(ActionEvent t) 
              {
                  textTextField.setText("");
                  textTextField.appendText("You insert $10");
                  balance += 10;
                  balanceLabelValue.setText("" + balance);
              }             
        });
        twenty.setOnAction(new EventHandler<ActionEvent>() {

              @Override
              public void handle(ActionEvent t) 
              {
                  textTextField.setText("");
                  textTextField.appendText("You insert $20");
                  balance += 20;
                  balanceLabelValue.setText("" + balance);                
              }             
        });
        fifty.setOnAction(new EventHandler<ActionEvent>() {

              @Override
              public void handle(ActionEvent t) 
              {
                  textTextField.setText("");
                  textTextField.appendText("You insert $50");
                  balance += 50;
                  balanceLabelValue.setText("" + balance);
              }             
        });
        
        HBox hBox = new HBox(vBoxLeft, vBoxRight);
        borderPane.setCenter(hBox);
        
        Scene scene = new Scene(borderPane, 500, 200);
        
        stage.setTitle("Lucky Picky");        
        stage.setScene(scene);
        stage.show();
    }
}
