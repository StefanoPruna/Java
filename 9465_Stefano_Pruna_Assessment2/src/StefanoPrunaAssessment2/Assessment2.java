
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
    
    //Data type for the withdraw
    private Float value;
    //User insert the withdraw value limit
    private Integer withdrawValueLimit;
    private Integer setWithdrawLimit;
    //Data type to store the multiple withdraws
    private Float withdrawTotal = 0f;

    @Override
    public void start(Stage stage) throws Exception 
    {
        borderPane = new BorderPane();
        
        //This method will be in charge of displaying a particular screen
        displayScreen(currentScreen);
        
        Scene scene = new Scene(borderPane, 400, 450);
        
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
        Button backButton = new Button("Back");
        
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
        logOutButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                System.exit(1);
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
        //I'm making an assumption that the Current Principal is $1000
        savings.setPrincipal(1000f);
                
        GridPane gridPane = new GridPane();
       
        Label accountLabel = new Label("Savings Account");
        Label withdrawLabel = new Label("Insert the amount you want to withdraw:");
        
        accountLabel.setId("account-text");//to stylish the welcome text
        withdrawLabel.setId("withdraw");
        
//        Label amountLabel = new Label("$");
//        amountLabel.setId("amount-text");
        TextField amountTextField = new TextField();
        amountTextField.editableProperty().set(false);
        
        //Label for the limit to withdraw - 
        //User can choose the limit in the Savings account only
        Label withdrawLimitText = new Label("You have to insert the withdraw limit to calculate your balance:");
        withdrawLimitText.setId("limit");
        TextField withdrawLimitTextField = new TextField();
        withdrawLimitTextField.editableProperty().set(false);
        
        gridPane.add(accountLabel, 1, 0);
        gridPane.add(withdrawLabel, 1, 1, 2, 1);
        //gridPane.add(amountLabel, 1, 2);
        gridPane.add(amountTextField, 2, 2, 2, 1);
        VBox vBox0 = new VBox(accountLabel, withdrawLabel, amountTextField);
        
        Label withdrewLabel = new Label("Withdraw");
        Label interestLabel = new Label("Interest");
        Label balanceLabel = new Label("Balance");
        Label withdrawLimitLabel = new Label("Limit");

               
        VBox vBox1 = new VBox(withdrewLabel, withdrawLimitLabel, interestLabel, balanceLabel);
        
        Label withdrawValueLabel = new Label(" $"); 
        Label interestValueLabel = new Label(" $");
        //I'm making an assumption that the Current Principal is $1000
        Label balanceValueLabel = new Label(" $1000");
        Label withdrawLimitValueLabel = new Label(" ");
        
        VBox vBox2 = new VBox(withdrawValueLabel, withdrawLimitValueLabel, interestValueLabel, balanceValueLabel);
        
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
        numPad.add(clear, 1, 3, 2, 1); //the last two numbers will expand the button
        
        twenty.setOnAction(new EventHandler<ActionEvent>() //throws InsufficientFundsException
        {
            @Override
            public void handle(ActionEvent t) 
            {                   
                try {                    
                    amountTextField.appendText("20");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    //withdrawValueLimit = Integer.valueOf(withdrawLimitTextField.getText());
                    savings.setAmountDeposit(0);                    
                    savings.setHowMuchWithdraw(20f);                    
                    savings.setWithdrawLimit(withdrawValueLimit);
                    withdrawTotal += value;
                    //savings.setHowMuchWithdraw(withdrawTotal);
                    if(withdrawTotal > withdrawValueLimit)
                    {
                        withdrawLimitTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(savings.getPrincipal() < 0)
                        {                      
                            //throw new InsufficientFundsException("You don't have enough money in your balace");
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        savings.deposit();
                        Float withdrew = savings.withdraw();
                        Float interestValue = savings.calculateInterest();
                        Float balance = (savings.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                    }                     
                } catch (InsufficientFundsException ex) 
                {
                    //amountTextField.setText("You don't have enough money");  
                }   
                //withdrawTotal = Integer.valueOf((savings.getHowMuchWithdraw() + savings.getHowMuchWithdraw())); 
            }
        });
        fifty.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t) //throws InsufficientFundsException
            {
                try {                    
                    amountTextField.appendText("50");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    //withdrawValueLimit = Integer.valueOf(withdrawLimitTextField.getText());
                    savings.setAmountDeposit(0);                    
                    savings.setHowMuchWithdraw(50f);                    
                    savings.setWithdrawLimit(withdrawValueLimit);
                    withdrawTotal += value;
                    //savings.setHowMuchWithdraw(withdrawTotal);
                    if(withdrawTotal > withdrawValueLimit)
                    {
                        withdrawLimitTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(savings.getPrincipal() < 0)
                        {                      
                            //throw new InsufficientFundsException("You don't have enough money in your balace");
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        savings.deposit();
                        Float withdrew = savings.withdraw();
                        Float interestValue = savings.calculateInterest();
                        Float balance = (savings.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                    }  
                } catch (InsufficientFundsException ex) 
                {
                    //amountTextField.setText("You don't have enough money");  
                }   
                //withdrawTotal = Integer.valueOf((savings.getHowMuchWithdraw() + savings.getHowMuchWithdraw()));
            }
        });
        hundred.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t) 
            {
                try {                    
                    amountTextField.appendText("100");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    //withdrawValueLimit = Integer.valueOf(withdrawLimitTextField.getText());
                    savings.setAmountDeposit(0);                    
                    savings.setHowMuchWithdraw(100f);                    
                    savings.setWithdrawLimit(withdrawValueLimit);
                    withdrawTotal += value;
                    //savings.setHowMuchWithdraw(withdrawTotal);
                    if(withdrawTotal > withdrawValueLimit)
                    {
                        withdrawLimitTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(savings.getPrincipal() < 0)
                        {                      
                            //throw new InsufficientFundsException("You don't have enough money in your balace");
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        savings.deposit();
                        Float withdrew = savings.withdraw();
                        Float interestValue = savings.calculateInterest();
                        Float balance = (savings.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                    }                      
                } catch (InsufficientFundsException ex) 
                {
                    //amountTextField.setText("You don't have enough money");  
                }   
                //withdrawTotal = Integer.valueOf((savings.getHowMuchWithdraw() + savings.getHowMuchWithdraw()));
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                amountTextField.setText("");
                interestValueLabel.setText("");
                withdrawLimitTextField.setText("");
            }
        });
        
        
        
        //Single numbers Pad for the daily limit
        GridPane singleNumPad = new GridPane();
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
        
//        singleNumPad.add(withdrawLimit, 0, 0, 2, 1);
        //singleNumPad.add(withdrawLimitTextField, 0, 0);
        singleNumPad.add(one, 0, 2);
        singleNumPad.add(two, 1, 2);
        singleNumPad.add(three, 2, 2);
        singleNumPad.add(four, 0, 3);        
        singleNumPad.add(five, 1, 3);
        singleNumPad.add(six, 2, 3);
        singleNumPad.add(seven, 0, 4);
        singleNumPad.add(eight, 1, 4);
        singleNumPad.add(nine, 2, 4);
        singleNumPad.add(zero, 0, 5);
        //singleNumPad.add(clear, 1, 6, 2, 1); //the last two numbers will expand the button
        //Set all the numbers when are clicked
        one.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("1");
            }
        });
        two.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("2");
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("3");                 
            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("4");
            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("5");
            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("6");
            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("7");
            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("8");
            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("9");
            }
        });
        zero.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitTextField.appendText("0");
            }
        });
        Button enter = new Button("Enter");
        enter.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {                  
                 //setWithdrawLimit = Integer.valueOf(withdrawLimitTextField.getText());
                withdrawValueLimit = Integer.valueOf(withdrawLimitTextField.getText());
                
                 //valueLimit = Integer.valueOf(withdrawLimitTextField.getText());
                 withdrawLimitValueLabel.setText("$" + withdrawValueLimit.toString());
            }
        });
//        //When click on Back button, the withdraw Limit go back to zero
//        backButton.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent t) 
//            {
//                currentScreen = currentScreen - 1;
//                displayScreen(currentScreen);
//            }
//        });
        
        HBox hBox = new HBox(enter);
        hBox.setAlignment(Pos.CENTER_RIGHT);
        
        //VBox vBox = new VBox(gridPane, numPad, enter);
        VBox vBox = new VBox(gridPane, numPad, withdrawLimitText, withdrawLimitTextField, singleNumPad, enter);
        borderPane.setCenter(vBox);
    }
}
