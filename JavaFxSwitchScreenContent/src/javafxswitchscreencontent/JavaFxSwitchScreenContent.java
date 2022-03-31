
package javafxswitchscreencontent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class JavaFxSwitchScreenContent extends Application
{
    private BorderPane borderPane;
    private int currentScreen = Constants.LOGIN_SCREEN;

    public static void main(String[] args) 
    {
        launch(args);
    }  

    @Override
    public void start(Stage stage) throws Exception 
    {
        borderPane = new BorderPane();
        
        //This method will be in charge of displaying a particular screen
        displayScreen(currentScreen);
        
        Scene scene = new Scene(borderPane, 400, 375);
        
        //To style with CSS
        scene.getStylesheets().add(JavaFxSwitchScreenContent.class.getResource("login.css").toExternalForm());
        
        stage.setTitle("FX Example");
        stage.setScene(scene);
        stage.show();
    }

    private void displayScreen(int currentScreen) 
    {
        switch(currentScreen)
        {
            case Constants.LOGIN_SCREEN:
                //show login screen
                setUpLoginScreen();
                break;
            case Constants.SELECT_ACCOUNT:
                //show accounts screen
                setUpAccountScreen();
                break;
        }
    }

    private void setUpLoginScreen() 
    {
        //set up login screen
        GridPane gridPane = new GridPane();
        Label welcomeLabel = new Label("Welcome");
        welcomeLabel.setId("welcome-text");//to stylish the welcome text
        gridPane.add(welcomeLabel, 0, 0, 2, 1);
        
        Label passwordLabel = new Label("Password");
        gridPane.add(passwordLabel, 0, 2);
        TextField passwordTextField = new TextField();
        passwordTextField.editableProperty().set(false);
        
        gridPane.add(passwordTextField, 1, 2);
        
        GridPane numPad = new GridPane();
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button zero = new Button("0");
        Button clear = new Button(" Clear ");
        
        numPad.add(one, 0, 0);
        numPad.add(two, 1, 0);
        numPad.add(three, 2, 0);
        numPad.add(four, 0, 1);
        numPad.add(five, 1, 1);
        numPad.add(six, 2, 1);
        numPad.add(seven, 0, 2);
        numPad.add(eight, 1, 2);
        numPad.add(nine, 2, 2);
        numPad.add(zero, 0, 3);
        numPad.add(clear, 1, 3, 2, 1); //the last two numbers will expand the button
        
        zero.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("0");
//                if(passwordTextField.getText().trim().equals(Constants.PIN))
//                {
//                    currentScreen = Constants.SELECT_ACCOUNT;
//                    displayScreen(currentScreen);
//                }
//                else
//                    System.out.println("The pin is not correct");                    
            }
        });
        
        Button enter = new Button("Enter");
        enter.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                if(passwordTextField.getText().trim().equals(Constants.PIN))
                {
                    currentScreen = Constants.SELECT_ACCOUNT;
                    displayScreen(currentScreen);
                }
                else
                    System.out.println("The pin is not correct");   
            }
        });
        
        HBox hBox = new HBox(enter);
        hBox.setAlignment(Pos.CENTER_RIGHT);
        
        VBox vBox = new VBox(gridPane, numPad, enter);
        
        borderPane.setCenter(vBox);
        //do more
    }

    private void setUpAccountScreen() 
    {
        Button savingsButton = new Button("Savings");
        Button chequeButton = new Button("Cheque");
        Button netSavingButton = new Button("Net Savings");
        Button fixedButton = new Button("Fixed");
        
        VBox vBox = new VBox(savingsButton, chequeButton, netSavingButton, fixedButton);
        Button logOutButton = new Button("Logout");
        Button backButton = new Button("Return");
        
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = currentScreen - 1;
                displayScreen(currentScreen);
            }
        });
        
        HBox hBox2 = new HBox(backButton, logOutButton);
        borderPane.setCenter(vBox);
        borderPane.setBottom(hBox2);
        //borderPane.setBottom(null);//clean the content
    }
    
}
