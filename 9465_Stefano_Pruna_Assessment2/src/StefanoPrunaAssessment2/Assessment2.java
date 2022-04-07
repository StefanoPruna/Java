
package StefanoPrunaAssessment2;

import businessLogic.ChequeAccount;
import businessLogic.FixedAccount;
import businessLogic.InsufficientFundsException;
import businessLogic.NetSavingAccount;
import businessLogic.SavingsAccount;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class Assessment2 extends Application
{

    public static void main(String[] args) 
    {
        launch(args);        
    }
    //Creating the GUI interface with the windows to navigate in between
    private int currentScreen = Constants.LOGIN_SCREEN;
    private BorderPane borderPane;

    @Override
    public void start(Stage stage) throws Exception 
    {
        borderPane = new BorderPane();
        
        //This method will be in charge of displaying a particular screen
        displayScreen(currentScreen);
        
        Scene scene = new Scene(borderPane, 400, 375);
        
        //To style with CSS
        scene.getStylesheets().add(Assessment2.class.getResource("login.css").toExternalForm());
        
        stage.setTitle("AITBank");
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
            case Constants.SELECT_SAVINGS:
                setUpSavingsScreen();
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
        
        //GUI for the buttons
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
        
        //Set all the numbers when are clicked
        one.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("1");
            }
        });
        two.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("2");
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("3");                 
            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("4");
            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("5");
            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("6");
            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("7");
            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("8");
            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("9");
            }
        });
        zero.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.appendText("0");
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                passwordTextField.setText("");
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
                    passwordTextField.setText("The pin is not correct");
                    //System.out.println("The pin is not correct");   
            }
        });
        
        HBox hBox = new HBox(enter);
        hBox.setAlignment(Pos.CENTER_RIGHT);
        
        VBox vBox = new VBox(gridPane, numPad, enter);
        
        borderPane.setCenter(vBox);
    }

    private void setUpAccountScreen() 
    {
        Button savingsButton = new Button("Savings");
        Button chequeButton = new Button("Cheque");
        Button netSavingButton = new Button("Net Savings");
        Button fixedButton = new Button("Fixed");
        Button logOutButton = new Button("Logout");
        Button backButton = new Button("Return");
        
        //Creating the Saving account window
        savingsButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = Constants.SELECT_SAVINGS;
                displayScreen(currentScreen);
            }
        });
        
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = currentScreen - 1;
                displayScreen(currentScreen);
            }
        });
        
        VBox vBox = new VBox(savingsButton, chequeButton, netSavingButton, fixedButton);

        HBox hBox2 = new HBox(backButton, logOutButton);
        borderPane.setCenter(vBox);
        borderPane.setBottom(hBox2);
        //borderPane.setBottom(null);//clean the content
    }
    
    private void setUpSavingsScreen()
    {
        SavingsAccount savings = new SavingsAccount();
        
        GridPane gridPane = new GridPane();
       
        Label accountLabel = new Label("Savings Account");
        Label withdrawLabel = new Label("Insert the amount you want to withdraw");
        
        accountLabel.setId("account-text");//to stylish the welcome text
        withdrawLabel.setId("withdraw");
        
//        Label amountLabel = new Label("$");
//        amountLabel.setId("amount-text");
        TextField amountTextField = new TextField();
        amountTextField.editableProperty().set(false);
        
        gridPane.add(accountLabel, 1, 0);
        gridPane.add(withdrawLabel, 1, 1, 2, 1);
        //gridPane.add(amountLabel, 1, 2);
        gridPane.add(amountTextField, 2, 2, 2, 1);
        VBox vBox0 = new VBox(accountLabel, withdrawLabel, amountTextField);
        
        Label withdrewLabel = new Label("Withdraw");
        Label interestLabel = new Label("Interest");
        Label balanceLabel = new Label("Balance");

               
        VBox vBox1 = new VBox(withdrewLabel, interestLabel, balanceLabel);
        
        Label withdrawValueLabel = new Label(" $"); 
        Label interestValueLabel = new Label(" $");
        //I'm making an assumption that the Current Principal is $1000
        Label balanceValueLabel = new Label(" $1000");
        
        VBox vBox2 = new VBox(withdrawValueLabel, interestValueLabel, balanceValueLabel);
        
        HBox hBox1 = new HBox(vBox1, vBox2);  
        gridPane.add(vBox0, 2, 2);
        gridPane.add(hBox1, 2, 3);
//        gridPane.add(vBox1, 2, 4);
//        gridPane.add(vBox2, 2, 4);
        //borderPane.setLeft(hBox1);
        
        //As requested in the description of the assignment, 
        //the ATMs can give only $20, $50 and $100 notes
        GridPane numPad = new GridPane();
        Button twenty = new Button("20");
        Button fifty = new Button("50");
        Button hundred = new Button("100");
        Button clear = new Button(" Clear ");
        
        numPad.add(twenty, 0, 0);
        numPad.add(fifty, 1, 0);
        numPad.add(hundred, 0, 1);
        
//        numPad.add(five, 1, 1);
//        numPad.add(six, 2, 1);
//        numPad.add(seven, 0, 2);
//        numPad.add(eight, 1, 2);
//        numPad.add(nine, 2, 2);
//        numPad.add(zero, 0, 3);
        numPad.add(clear, 1, 3, 2, 1); //the last two numbers will expand the button
        
        twenty.setOnAction(new EventHandler<ActionEvent>() //throws InsufficientFundsException
        {
            @Override
            public void handle(ActionEvent t) 
            {
                try {
                    amountTextField.appendText("20");
                    Float value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    savings.setAmountDeposit(0);
                    savings.setWithdrawLimit(200);
                    savings.setHowMuchWithdraw(20f);
                    Float principalValue = Float.valueOf(savings.getBalance());
                    savings.getPrincipal();
                    savings.deposit();
                    Float withdrew = savings.withdraw();
                    Float interestValue = savings.calculateInterest();
                    Float balance = (savings.getPrincipal() + interestValue);
                    balanceValueLabel.setText("$" + balance.toString());
                    interestValueLabel.setText("$" + interestValue.toString());
                    if(savings.getPrincipal() < 0)
                    {                      
                        //throw new InsufficientFundsException("You don't have enough money in your balace");
                    }
                } catch (InsufficientFundsException ex) 
                {
                    amountTextField.setText("You don't have enough money");  
                }
            }
        });
        fifty.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t) //throws InsufficientFundsException
            {
                try {
                    amountTextField.appendText("50");
                    Float value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    savings.setAmountDeposit(0);                    
                    savings.setWithdrawLimit(200);
                    savings.setHowMuchWithdraw(50f);
                    savings.setPrincipal(1000f);
                    savings.deposit();                
                    Float withdrew = savings.withdraw();
                    Float interestValue = savings.calculateInterest();
                    Float balance = (savings.getPrincipal() + interestValue);
                    balanceValueLabel.setText("$" + balance.toString());
                    interestValueLabel.setText("$" + interestValue.toString());
                } catch (InsufficientFundsException ex) 
                {
                    amountTextField.setText("You don't have enough money");                    
                }   
            }
        });
        hundred.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t) 
            {
                try {
                    amountTextField.appendText("100");
                    Float value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    savings.setAmountDeposit(0);                    
                    savings.setWithdrawLimit(200);
                    savings.setHowMuchWithdraw(100f);
                    savings.setPrincipal(1000f);
                    savings.deposit();                
                    Float withdrew = savings.withdraw();
                    Float interestValue = savings.calculateInterest();
                    Float balance = (savings.getPrincipal() + interestValue);
                    balanceValueLabel.setText("$" + balance.toString());
                    interestValueLabel.setText("$" + interestValue.toString());
                } catch (InsufficientFundsException ex) 
                {
                    amountTextField.setText("You don't have enough money");                    
                }  
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                amountTextField.setText("");
                interestValueLabel.setText("");
            }
        });
        
        VBox vBox = new VBox(gridPane, numPad);
        borderPane.setCenter(vBox);
    }
}
