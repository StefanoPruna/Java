
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
    
    /* GENERAL NOTES
    - I set the password as 0000 
    - Log out and only the Savings Account Back buttons for some reason need to be clicked twice
    - As requested in the description of the assignment, 
      the ATMs can give only $20, $50 and $100 notes
    - I'm making an assumption that the Current Principal is $1000 for all the accounts
    - I set the limit for withdrawing to $500 in the Net Saving account for testing purposes
    - For the Fixed account, as soon as there is a withdraw, there won't be interest, because as stated in the assignment description,
      we assume that any withdrawal is too early, however, the message will appear after a second attempt at withdrawing
    */
    
    //Creating the GUI interface with the windows to navigate in between
    private int currentScreen = Constants.LOGIN_SCREEN;
    private BorderPane borderPane;
    
    //Initialize the account balances
    private Float savingsBalance = 1000f;
    private Float netBalance = 1000f;
    private Float fixedBalance = 1000f;
    private Float chequeBalance = 1000f;
    //Data type for the withdraw
    private Float value;
    //User insert the withdraw value limit for the Savings account
    private Integer withdrawValueLimit;
    private Integer deposit;
    //to check when reaches the withdraw limit fpr the Savings and Net Savings accounts
    private Float savingsWithdrawTotal = 0f;
    private Float netWithdrawTotal = 0f;

    @Override
    public void start(Stage stage) throws Exception 
    {
        borderPane = new BorderPane();
        
        //This method will be in charge of displaying a particular screen
        displayScreen(currentScreen);
        
        Scene scene = new Scene(borderPane, 420, 615);
        
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
                break;
            case Constants.NET_SAVINGS:
                setUpNetSavingsScreen();
                break;
            case Constants.FIXED_WINDOW:
                setUpFixedScreen();
                        break;
            case Constants.CHEQUE_WINDOW:
                setUpChequeScreen();
        }
    }

    private void setUpLoginScreen() 
    {
        //set up login screen
        GridPane gridPane = new GridPane();
        Label welcomeLabel = new Label("Welcome to the AITBank");
        welcomeLabel.setId("welcome-text");//to stylish the welcome text
        gridPane.add(welcomeLabel, 2, 0, 2, 1);
        
        Label passwordLabel = new Label("Pin");
        gridPane.add(passwordLabel, 2, 2);
        TextField passwordTextField = new TextField();
        passwordTextField.editableProperty().set(false);
        passwordLabel.setId("pin");
        gridPane.add(passwordTextField, 3, 2);
        
        //GUI for the buttons
        GridPane numPad = new GridPane();
        numPad.setId("singleNumPad");
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
        hBox.setId("enterButton");
        
        VBox vBox = new VBox(gridPane, numPad, hBox);
        vBox.setId("vBox");
        
        //CSS stylish
        gridPane.setId("gridPane");
        
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
        //Creating the Net Savings account window
        netSavingButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = Constants.NET_SAVINGS;
                displayScreen(currentScreen);
            }
        });
        //Creating the Fixed Savings account window
        fixedButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = Constants.FIXED_WINDOW;
                displayScreen(currentScreen);
            }
        });
        //Creating the Cheque account window
        chequeButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = Constants.CHEQUE_WINDOW;
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
        
        //For some reason, it needs to be clicked twice
        logOutButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                System.exit(1);
            }
        });
        
        Label selectAccountText = new Label("Please select the account");
        VBox vBox = new VBox(selectAccountText, savingsButton, chequeButton, netSavingButton, fixedButton, backButton);
        vBox.setId("vBox");

        HBox hBox2 = new HBox(logOutButton);
        hBox2.setId("logOutButton");
        borderPane.setCenter(vBox);
        borderPane.setBottom(hBox2);
        //borderPane.setBottom(null);//clean the content
    }
    
    private void setUpSavingsScreen()
    {
        SavingsAccount savings = new SavingsAccount();
        //I'm making an assumption that the Current Principal is $1000
        savings.setPrincipal(savingsBalance);
                
        GridPane gridPane = new GridPane();
       
        Label accountLabel = new Label("Savings Account");
        Label withdrawLabel = new Label("Select the amount to withdraw:");
        accountLabel.setId("account-text");

        TextField amountTextField = new TextField();
        amountTextField.editableProperty().set(false);
        
        //Label for the limit to withdraw - 
        //User can choose the limit in the Savings account only
        Label withdrawLimitText = new Label("You must insert the withdraw limit:");
        withdrawLimitText.setId("limit");
        TextField withdrawLimitDepositTextField = new TextField();
        withdrawLimitDepositTextField.editableProperty().set(false);
        Label buttonText = new Label("Select the amount for the withdraw limit or a deposit");

        gridPane.add(accountLabel, 1, 0);
        gridPane.add(withdrawLabel, 1, 1, 2, 1);
        //gridPane.add(amountLabel, 1, 2);
        gridPane.add(amountTextField, 2, 2, 2, 1);
        VBox vBox0 = new VBox(accountLabel, amountTextField);
        
        Label withdrewLabel = new Label("Withdraw");
        Label interestLabel = new Label("Interest");
        Label balanceLabel = new Label("Balance");
        Label withdrawLimitLabel = new Label("Withdraw Limit");
        Label depositLabel = new Label("Deposit");

               
        VBox vBox1 = new VBox(withdrewLabel, withdrawLimitLabel, depositLabel, interestLabel, balanceLabel, withdrawLabel);
        
        Label withdrawValueLabel = new Label(" $"); 
        Label interestValueLabel = new Label(" $");
        //I'm making an assumption that the Current Principal is $1000
        Label balanceValueLabel = new Label(" $" + savingsBalance);
        Label withdrawLimitValueLabel = new Label(" $" + withdrawValueLimit);
        Label depositValueLabel = new Label(" $" + deposit);
        
        VBox vBox2 = new VBox(withdrawValueLabel, withdrawLimitValueLabel, depositValueLabel, interestValueLabel, balanceValueLabel);
        
        HBox hBox1 = new HBox(vBox1, vBox2);  
        gridPane.add(vBox0, 2, 2);
        gridPane.add(hBox1, 2, 3);
        
        //As requested in the description of the assignment, 
        //the ATMs can give only $20, $50 and $100 notes
        GridPane numPad = new GridPane();
        Button twenty = new Button("20");
        Button fifty = new Button("50");
        Button hundred = new Button("100");
        Button clear = new Button(" Clear ");
        numPad.setId("numPad");
        
        numPad.add(twenty, 0, 0);
        numPad.add(fifty, 1, 0);
        numPad.add(hundred, 2, 0);
        numPad.add(clear, 0, 2, 2, 1); //the last two numbers will expand the button
        
        twenty.setOnAction(new EventHandler<ActionEvent>() //throws InsufficientFundsException
        {
            @Override
            public void handle(ActionEvent t) 
            {                   
                try {                    
                    amountTextField.appendText("20");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    savings.setAmountDeposit(0);   
                    savings.setHowMuchWithdraw(20f);                    
                    savings.setWithdrawLimit(withdrawValueLimit);
                    savingsWithdrawTotal += value;
                    if(savingsWithdrawTotal > withdrawValueLimit)
                    {
                        withdrawLimitDepositTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(savings.getPrincipal() < 0)
                        {                      
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
                        savingsBalance = balance;
                    }                     
                } catch (InsufficientFundsException ex) 
                {
                    
                }   
            }
        });
        fifty.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t)
            {
                try {                    
                    amountTextField.appendText("50");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    savings.setAmountDeposit(0);                    
                    savings.setHowMuchWithdraw(50f);                    
                    savings.setWithdrawLimit(withdrawValueLimit);
                    savingsWithdrawTotal += value;
                    if(savingsWithdrawTotal > withdrawValueLimit)
                    {
                        withdrawLimitDepositTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(savings.getPrincipal() < 0)
                        {                      
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
                        savingsBalance = balance;
                    }  
                } catch (InsufficientFundsException ex) 
                {
                    
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
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    savings.setAmountDeposit(0);                    
                    savings.setHowMuchWithdraw(100f);                    
                    savings.setWithdrawLimit(withdrawValueLimit);
                    savingsWithdrawTotal += value;
                    if(savingsWithdrawTotal > withdrawValueLimit)
                    {
                        withdrawLimitDepositTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(savings.getPrincipal() < 0)
                        {                      
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
                        savingsBalance = balance;
                    }                      
                } catch (InsufficientFundsException ex) 
                {
                    
                }   
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                amountTextField.setText("");
                interestValueLabel.setText("");
                withdrawLimitDepositTextField.setText("");
            }
        });      
        
        //Single numbers Pad for the daily limit
        GridPane singleNumPad = new GridPane();
        singleNumPad.setId("singleNumPad");
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
        Button backButton1 = new Button("Back");

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
        //Set all the numbers when are clicked
        one.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("1");
            }
        });
        two.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("2");
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("3");                 
            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("4");
            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("5");
            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("6");
            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("7");
            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("8");
            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("9");
            }
        });
        zero.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                withdrawLimitDepositTextField.appendText("0");
            }
        });
        Button enter = new Button("Withdraw Limit");
        enter.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {                  
                withdrawValueLimit = Integer.valueOf(withdrawLimitDepositTextField.getText());
                withdrawLimitValueLabel.setText("$" + withdrawValueLimit.toString());
            }
        });
       
        Button depositButton = new Button("Deposit");
        depositButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {   
                deposit = Integer.valueOf(withdrawLimitDepositTextField.getText());
                depositValueLabel.setText("$" + deposit.toString());
                savings.setAmountDeposit(deposit);
                savings.deposit();
                balanceValueLabel.setText("$" + savings.getPrincipal());
            }
        });
        //For some reason, it needs to be clicked twice
        backButton1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = currentScreen - 1;
                displayScreen(currentScreen);
            }
        });
        
        //Creating and setting the two number pads with their texts and text fields
        
        HBox hBoxWithdrawText = new HBox(withdrawLimitText);
        hBoxWithdrawText.setAlignment(Pos.CENTER_LEFT);
        HBox hBox = new HBox(enter, depositButton);
        hBox.setId("hbox");
        hBox.setAlignment(Pos.CENTER_LEFT);
        HBox backButtonBox = new HBox(backButton1);
        backButtonBox.setId("backButton");
        HBox clearButton = new HBox(clear);
        clearButton.setId("clearButton");
        
        VBox vBox = new VBox(gridPane, numPad, clearButton, withdrawLimitText, withdrawLimitDepositTextField, buttonText, singleNumPad, hBox, backButtonBox);
        borderPane.setCenter(vBox);
    }
    
    private void setUpNetSavingsScreen()
    {
        NetSavingAccount netSavings = new NetSavingAccount();
        //I'm making an assumption that the Current Principal is $1000
        netSavings.setPrincipal(netBalance);
                
        GridPane gridPane = new GridPane();
       
        Label accountLabel = new Label("Net Savings Account");
        Label withdrawLabel = new Label("Insert the amount you want to withdraw:");
        
        accountLabel.setId("account-text");//to stylish the welcome text
        TextField amountTextField = new TextField();
        amountTextField.editableProperty().set(false);
        
        //Label for the deposit
        Label depositText = new Label("Insert the deposit");
        TextField depositTextField = new TextField();
        depositTextField.editableProperty().set(false);
        
        gridPane.add(accountLabel, 1, 0);
        gridPane.add(withdrawLabel, 1, 1, 2, 1);
        gridPane.add(amountTextField, 2, 2, 2, 1);
        VBox vBox0 = new VBox(accountLabel, withdrawLabel, amountTextField);
        
        Label withdrewLabel = new Label("Withdraw");
        Label interestLabel = new Label("Interest");
        Label balanceLabel = new Label("Balance");
        Label withdrawLimitLabel = new Label("Limit");
        Label depositLabel = new Label("Deposit");

               
        VBox vBox1 = new VBox(withdrewLabel, withdrawLimitLabel, depositLabel, interestLabel, balanceLabel);
        
        Label withdrawValueLabel = new Label(" $"); 
        Label interestValueLabel = new Label(" $");
        
        //I'm making an assumption that the Current Principal is $1000
        //And the withdraw limit is $500 for testing purposes
        Label balanceValueLabel = new Label(" $" + netBalance);
        Label withdrawLimitValueLabel = new Label(" 500");
        Label depositValueLabel = new Label(" $" + deposit);
        
        VBox vBox2 = new VBox(withdrawValueLabel, withdrawLimitValueLabel, depositValueLabel, interestValueLabel, balanceValueLabel);
        
        HBox hBox1 = new HBox(vBox1, vBox2);  
        gridPane.add(vBox0, 2, 2);
        gridPane.add(hBox1, 2, 3);
        
        //As requested in the description of the assignment, 
        //the ATMs can give only $20, $50 and $100 notes
        GridPane numPad = new GridPane();
        numPad.setId("numPad");
        Button twenty = new Button("20");
        Button fifty = new Button("50");
        Button hundred = new Button("100");
        Button clear = new Button(" Clear ");
        Button backButton2 = new Button("Back");
        
        numPad.add(twenty, 0, 0);
        numPad.add(fifty, 1, 0);
        numPad.add(hundred, 2, 0);
        numPad.add(clear, 0, 2, 2, 1); //the last two numbers will expand the button
                
        twenty.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent t) 
            {                   
                try {                    
                    amountTextField.appendText("20");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    netSavings.setAmountDeposit(0);                    
                    netSavings.setHowMuchWithdraw(20f);                    
                    netSavings.setWithdrawLimit(500);
                    netWithdrawTotal += value;
                    if(netWithdrawTotal > netSavings.getWithdrawLimit())
                    {
                        amountTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(netSavings.getPrincipal() < 0)
                        {                      
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        netSavings.deposit();
                        Float withdrew = netSavings.withdraw();
                        Float interestValue = netSavings.calculateInterest();
                        Float balance = (netSavings.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                        netBalance = balance;
                    }                     
                } catch (InsufficientFundsException ex) 
                {
                    
                }   
            }
        });
        fifty.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t) 
            {
                try {                    
                    amountTextField.appendText("50");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    netSavings.setAmountDeposit(0);                    
                    netSavings.setHowMuchWithdraw(50f);                    
                    netSavings.setWithdrawLimit(500);
                    netWithdrawTotal += value;
                    if(netWithdrawTotal > netSavings.getWithdrawLimit())
                    {
                        amountTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(netSavings.getPrincipal() < 0)
                        {                      
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        netSavings.deposit();
                        Float withdrew = netSavings.withdraw();
                        Float interestValue = netSavings.calculateInterest();
                        Float balance = (netSavings.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                        netBalance = balance;
                    }  
                } catch (InsufficientFundsException ex) 
                {
                    
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
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    netSavings.setAmountDeposit(0);                    
                    netSavings.setHowMuchWithdraw(100f);                    
                    netSavings.setWithdrawLimit(500);
                    netWithdrawTotal += value;
                    if(netWithdrawTotal > netSavings.getWithdrawLimit())
                    {
                        amountTextField.setText("You've reached the daily limit to withdraw, Click Back or Logout");
                    }
                    else if(netSavings.getPrincipal() < 0)
                        {                      
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        netSavings.deposit();
                        Float withdrew = netSavings.withdraw();
                        Float interestValue = netSavings.calculateInterest();
                        Float balance = (netSavings.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                        netBalance = balance;
                    }                      
                } catch (InsufficientFundsException ex) 
                {
                     
                }   
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                amountTextField.setText("");
                interestValueLabel.setText("");
                depositTextField.setText("");
            }
        }); 
        //Single numbers Pad for the deposit
        GridPane depositNumPad = new GridPane();
        depositNumPad.setId("singleNumPad");
        Button oneDepo = new Button("1");
        Button twoDepo = new Button("2");
        Button threeDepo = new Button("3");
        Button fourDepo = new Button("4");
        Button fiveDepo = new Button("5");
        Button sixDepo = new Button("6");
        Button sevenDepo = new Button("7");
        Button eightDepo = new Button("8");
        Button nineDepo = new Button("9");
        Button zeroDepo = new Button("0");
        
        depositNumPad.add(oneDepo, 0, 2);
        depositNumPad.add(twoDepo, 1, 2);
        depositNumPad.add(threeDepo, 2, 2);
        depositNumPad.add(fourDepo, 0, 3);        
        depositNumPad.add(fiveDepo, 1, 3);
        depositNumPad.add(sixDepo, 2, 3);
        depositNumPad.add(sevenDepo, 0, 4);
        depositNumPad.add(eightDepo, 1, 4);
        depositNumPad.add(nineDepo, 2, 4);
        depositNumPad.add(zeroDepo, 0, 5);

        //Set all the numbers when are clicked
        oneDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("1");
            }
        });
        twoDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("2");
            }
        });
        threeDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("3");                 
            }
        });
        fourDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("4");
            }
        });
        fiveDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("5");
            }
        });
        sixDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("6");
            }
        });
        sevenDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("7");
            }
        });
        eightDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("8");
            }
        });
        nineDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("9");
            }
        });
        zeroDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("0");
            }
        });
        Button depositButton = new Button("Deposit");
        depositButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {    
                 deposit = Integer.valueOf(depositTextField.getText());
                 depositValueLabel.setText("$" + deposit.toString());
                 netSavings.setAmountDeposit(deposit);
                 netSavings.deposit();
                 balanceValueLabel.setText("$" + netSavings.getPrincipal());
            }
        });
        backButton2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = currentScreen -3;
                displayScreen(currentScreen);
            }
        });
        
        //Creating and setting the number pad for the deposit with its text and text field
        HBox hBoxDepositButton = new HBox(depositButton);
        hBoxDepositButton.setId("depositButton");
        HBox backButtonBox = new HBox(backButton2);
        backButtonBox.setId("backButton");
        HBox clearButton = new HBox(clear);
        clearButton.setId("clearButton");
        //Creating and setting the whole Grid Pane
        VBox vBox = new VBox(gridPane, numPad, clearButton, depositText, depositTextField, depositNumPad, hBoxDepositButton, backButtonBox);
        borderPane.setCenter(vBox);
    }
    
    private void setUpFixedScreen()
    {
        /*
        In this account there is not limit to withdraw.
        however, if there is a withdraw, there won't be any interest,
        because as stated in the assignment description,
        we assume that any withdrawal is too early, thus there is no interest.
        The message of no interest appears after the second attempt to withdraw
        */
        
        FixedAccount fixedAccount = new FixedAccount();
        //The balance will be the current total balance
        fixedAccount.setPrincipal(fixedBalance);
                
        GridPane gridPane = new GridPane();
       
        Label accountLabel = new Label("Fixed Account");
        Label withdrawLabel = new Label("Insert the amount you want to withdraw:");
        accountLabel.setId("account-text");//to stylish the welcome text

        TextField amountTextField = new TextField();
        amountTextField.editableProperty().set(false);
        
        gridPane.add(accountLabel, 1, 0);
        gridPane.add(withdrawLabel, 1, 1, 2, 1);
        gridPane.add(amountTextField, 2, 2, 2, 1);
        VBox vBox0 = new VBox(accountLabel, withdrawLabel, amountTextField);
        
         //Label for the deposit
        Label depositText = new Label("Insert the deposit");
        TextField depositTextField = new TextField();
        depositTextField.editableProperty().set(false);
        
        Label withdrewLabel = new Label("Withdraw");
        Label depositLabel = new Label("Deposit");
        Label interestLabel = new Label("Interest");
        Label balanceLabel = new Label("Balance");
               
        VBox vBox1 = new VBox(withdrewLabel, depositLabel, interestLabel, balanceLabel);
        
        Label withdrawValueLabel = new Label(" $"); 
        Label interestValueLabel = new Label(" $");
        
        //I'm making an assumption that the Current Principal is $1000
        Label balanceValueLabel = new Label(" $" + fixedBalance);
        Label depositValueLabel = new Label(" $" + deposit);
        
        VBox vBox2 = new VBox(withdrawValueLabel, depositValueLabel, interestValueLabel, balanceValueLabel);
        
        HBox hBox1 = new HBox(vBox1, vBox2);  
        gridPane.add(vBox0, 2, 2);
        gridPane.add(hBox1, 2, 3);
        
        //As requested in the description of the assignment, 
        //the ATMs can give only $20, $50 and $100 notes
        GridPane numPad = new GridPane();
        numPad.setId("numPad");
        Button twenty = new Button("20");
        Button fifty = new Button("50");
        Button hundred = new Button("100");
        Button clear = new Button(" Clear ");
        Button backButton3 = new Button("Back");
        
        numPad.add(twenty, 0, 0);
        numPad.add(fifty, 1, 0);
        numPad.add(hundred, 2, 0);
        numPad.add(clear, 0, 2, 2, 1); //the last two numbers will expand the button
                
        twenty.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent t) 
            {     
                try {   
                    amountTextField.appendText("20");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    fixedAccount.setAmountDeposit(0);                    
                    fixedAccount.setHowMuchWithdraw(20f); 
                    //This message appears after the second attempt of withdrawing, 
                    //but does not calculate the interest as it's supposed
                    interestValueLabel.setText("You have withdrawn before the contract period");
                    if(fixedAccount.getEarlyWithdraw())
                    {        
                        interestValueLabel.setText("You have withdrawn before the contract period");
                        Float withdrew = fixedAccount.withdraw();
                        Float balance = (fixedAccount.getPrincipal());
                        balanceValueLabel.setText("$" + balance.toString());                                               
                    }                    
                    else if(fixedAccount.getPrincipal() < 0)
                        amountTextField.setText("You don't have enough money");  
                    else
                    {
                        Float withdrew = fixedAccount.withdraw();
                        Float interestValue = fixedAccount.calculateInterest();
                        Float balance = (fixedAccount.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                        fixedBalance = balance;
                    }                     
                } catch (InsufficientFundsException ex) 
                {
                     
                }   
            }
        });
        fifty.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t) 
            {
                try 
                {
                    amountTextField.appendText("50");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    fixedAccount.setAmountDeposit(0);                    
                    fixedAccount.setHowMuchWithdraw(50f); 
                    //This message appears after the second attempt of withdrawing, 
                    //but does not calculate the interest as it's supposed
                    interestValueLabel.setText("You have withdrawn before the contract period");
                    Float balance = (fixedAccount.getPrincipal());
                    balanceValueLabel.setText("$" + balance.toString());
                    if(fixedAccount.getEarlyWithdraw())
                    {        
                        interestValueLabel.setText("You have withdrawn before the contract period");
                        Float withdrew = fixedAccount.withdraw();
                        balance = (fixedAccount.getPrincipal());
                        balanceValueLabel.setText("$" + balance.toString());                                               
                    }                    
                    else if(fixedAccount.getPrincipal() < 0)
                        amountTextField.setText("You don't have enough money");  
                    else
                    {
                        Float withdrew = fixedAccount.withdraw();
                        Float interestValue = fixedAccount.calculateInterest();
                        balance = (fixedAccount.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                        fixedBalance = balance;
                    }                     
                } catch (InsufficientFundsException ex) 
                {
                     
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
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    fixedAccount.setAmountDeposit(0);                    
                    fixedAccount.setHowMuchWithdraw(100f); 
                    Float balance = (fixedAccount.getPrincipal());
                    if(fixedAccount.getEarlyWithdraw())
                    {     
                    //This message appears after the second attempt of withdrawing, 
                    //but does not calculate the interest as it's supposed
                        interestValueLabel.setText("You have withdrawn before the contract period");
                        Float withdrew = fixedAccount.withdraw();
                        balance = (fixedAccount.getPrincipal());
                        balanceValueLabel.setText("$" + balance.toString());                                               
                    }                    
                    else if(fixedAccount.getPrincipal() < 0)
                        amountTextField.setText("You don't have enough money");  
                    else
                    {
                        Float withdrew = fixedAccount.withdraw();
                        Float interestValue = fixedAccount.calculateInterest();
                        balance = (fixedAccount.getPrincipal() + interestValue);
                        balanceValueLabel.setText("$" + balance.toString());
                        interestValueLabel.setText("$" + interestValue.toString());
                        fixedBalance = balance;
                    }                     
                } catch (InsufficientFundsException ex) 
                {
                    
                }   
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                amountTextField.setText("");
                interestValueLabel.setText("");
                depositTextField.setText("");
            }
        }); 
        //For some reason, it needs to be clicked twice
        backButton3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = currentScreen -4;
                displayScreen(currentScreen);
            }
        });
        //Single numbers Pad for the deposit
        GridPane depositNumPad = new GridPane();
        depositNumPad.setId("singleNumPad");
        Button oneDepo = new Button("1");
        Button twoDepo = new Button("2");
        Button threeDepo = new Button("3");
        Button fourDepo = new Button("4");
        Button fiveDepo = new Button("5");
        Button sixDepo = new Button("6");
        Button sevenDepo = new Button("7");
        Button eightDepo = new Button("8");
        Button nineDepo = new Button("9");
        Button zeroDepo = new Button("0");
        
        depositNumPad.add(oneDepo, 0, 2);
        depositNumPad.add(twoDepo, 1, 2);
        depositNumPad.add(threeDepo, 2, 2);
        depositNumPad.add(fourDepo, 0, 3);        
        depositNumPad.add(fiveDepo, 1, 3);
        depositNumPad.add(sixDepo, 2, 3);
        depositNumPad.add(sevenDepo, 0, 4);
        depositNumPad.add(eightDepo, 1, 4);
        depositNumPad.add(nineDepo, 2, 4);
        depositNumPad.add(zeroDepo, 0, 5);

        //Set all the numbers when are clicked
        oneDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("1");
            }
        });
        twoDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("2");
            }
        });
        threeDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("3");                 
            }
        });
        fourDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("4");
            }
        });
        fiveDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("5");
            }
        });
        sixDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("6");
            }
        });
        sevenDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("7");
            }
        });
        eightDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("8");
            }
        });
        nineDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("9");
            }
        });
        zeroDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("0");
            }
        });
        Button depositButton = new Button("Deposit");
        depositButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                if(fixedAccount.getEarlyWithdraw())
                {
                    //This message appears after the second attempt of withdrawing, 
                    //but does not calculate the interest as it's supposed
                    interestValueLabel.setText("You have withdrawn before the contract period");
                    deposit = Integer.valueOf(depositTextField.getText());
                    depositValueLabel.setText("$" + deposit.toString());
                    fixedAccount.setAmountDeposit(deposit);
                    fixedAccount.deposit();
                    balanceValueLabel.setText("$" + fixedAccount.getPrincipal());
                }
                else
                {
                    deposit = Integer.valueOf(depositTextField.getText());
                    depositValueLabel.setText("$" + deposit.toString());
                    fixedAccount.setAmountDeposit(deposit);
                    fixedAccount.deposit();
                    balanceValueLabel.setText("$" + fixedAccount.getPrincipal());
                    Float interestValue = fixedAccount.calculateInterest();
                    Float balance = (fixedAccount.getPrincipal() + interestValue);
                    balanceValueLabel.setText("$" + balance.toString());
                    interestValueLabel.setText("$" + interestValue.toString());
                }
            }
        });
        //Creating and setting the number pad for the deposit with its text and text field
        HBox hBoxDepositButton = new HBox(depositButton);
        hBoxDepositButton.setId("depositButton");
        HBox backButtonBox = new HBox(backButton3);
        backButtonBox.setId("backButton");
        HBox clearButton = new HBox(clear);
        clearButton.setId("clearButton");
        //Creating and setting the whole Grid Pane
        VBox vBox = new VBox(gridPane, numPad, clearButton, depositText, depositTextField, depositNumPad, hBoxDepositButton, backButtonBox);
   
        borderPane.setCenter(vBox);
    }
    
    private void setUpChequeScreen()
    {
        //This account doesn't not have neither a withdraw limit, nor interest
        ChequeAccount chequeAccount = new ChequeAccount();
        //I'm making an assumption that the Current Principal is $1000
        chequeAccount.setPrincipal(chequeBalance);
                
        GridPane gridPane = new GridPane();
       
        Label accountLabel = new Label("Cheque Account");
        Label withdrawLabel = new Label("Insert the amount you want to withdraw:");
        
        accountLabel.setId("account-text");//to stylish the welcome text
        withdrawLabel.setId("withdraw");

        TextField amountTextField = new TextField();
        amountTextField.editableProperty().set(false);
        
        gridPane.add(accountLabel, 1, 0);
        gridPane.add(withdrawLabel, 1, 1, 2, 1);
        gridPane.add(amountTextField, 2, 2, 2, 1);
        VBox vBox0 = new VBox(accountLabel, withdrawLabel, amountTextField);
        
        //Label for the deposit
        Label depositText = new Label("Insert the deposit");
        TextField depositTextField = new TextField();
        depositTextField.editableProperty().set(false);
        
        Label withdrewLabel = new Label("Withdraw");
        Label depositLabel = new Label("Deposit");
        Label balanceLabel = new Label("Balance");
               
        VBox vBox1 = new VBox(withdrewLabel, depositLabel, balanceLabel);
        
        Label withdrawValueLabel = new Label(" $"); 
        Label depositValueLabel = new Label(" $" + deposit);
        //I'm making an assumption that the Current Principal is $1000
        Label balanceValueLabel = new Label(" $" + chequeBalance);
        
        VBox vBox2 = new VBox(withdrawValueLabel, depositValueLabel, balanceValueLabel);
        
        HBox hBox1 = new HBox(vBox1, vBox2);  
        gridPane.add(vBox0, 2, 2);
        gridPane.add(hBox1, 2, 3);
        
        //As requested in the description of the assignment, 
        //the ATMs can give only $20, $50 and $100 notes
        GridPane numPad = new GridPane();
        numPad.setId("numPad");
        Button twenty = new Button("20");
        Button fifty = new Button("50");
        Button hundred = new Button("100");
        Button clear = new Button(" Clear ");
        Button backButton4 = new Button("Back");
        
        numPad.add(twenty, 0, 0);
        numPad.add(fifty, 1, 0);
        numPad.add(hundred, 2, 0);
        numPad.add(clear, 0, 2, 2, 1); //the last two numbers will expand the button
                
        twenty.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t) 
            {                   
                try {                    
                    amountTextField.appendText("20");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    chequeAccount.setAmountDeposit(0);                    
                    chequeAccount.setHowMuchWithdraw(20f);                    
                    if(chequeAccount.getPrincipal() < 0)
                        {                      
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        chequeAccount.deposit();
                        Float withdrew = chequeAccount.withdraw();
                        Float balance = (chequeAccount.getPrincipal());
                        balanceValueLabel.setText("$" + balance.toString());
                        chequeBalance = balance;
                    }                     
                } catch (InsufficientFundsException ex) 
                {
 
                }   
                
            }
        });
        fifty.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent t) 
            {
                try {                    
                    amountTextField.appendText("50");
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    chequeAccount.setAmountDeposit(0);                    
                    chequeAccount.setHowMuchWithdraw(50f);                    
                    if(chequeAccount.getPrincipal() < 0)
                        {                      
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        chequeAccount.deposit();
                        Float withdrew = chequeAccount.withdraw();
                        Float balance = (chequeAccount.getPrincipal());
                        balanceValueLabel.setText("$" + balance.toString());
                        chequeBalance = balance;
                    }                     
                } catch (InsufficientFundsException ex) 
                {
                    
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
                    value = Float.valueOf(amountTextField.getText());
                    withdrawValueLabel.setText("$" + value.toString());
                    chequeAccount.setAmountDeposit(0);                    
                    chequeAccount.setHowMuchWithdraw(100f);                    
                    if(chequeAccount.getPrincipal() < 0)
                        {                      
                            amountTextField.setText("You don't have enough money");  
                        }
                    else
                    {
                        chequeAccount.deposit();
                        Float withdrew = chequeAccount.withdraw();
                        Float balance = (chequeAccount.getPrincipal());
                        balanceValueLabel.setText("$" + balance.toString());
                        chequeBalance = balance;
                    }                     
                } catch (InsufficientFundsException ex) 
                {
                    
                }   
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                amountTextField.setText("");
                depositTextField.setText("");
            }
        }); 
        
        backButton4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                currentScreen = currentScreen -5;
                displayScreen(currentScreen);
            }
        });
        
        //Single numbers Pad for the deposit
        GridPane depositNumPad = new GridPane();
        depositNumPad.setId("singleNumPad");
        Button oneDepo = new Button("1");
        Button twoDepo = new Button("2");
        Button threeDepo = new Button("3");
        Button fourDepo = new Button("4");
        Button fiveDepo = new Button("5");
        Button sixDepo = new Button("6");
        Button sevenDepo = new Button("7");
        Button eightDepo = new Button("8");
        Button nineDepo = new Button("9");
        Button zeroDepo = new Button("0");

        depositNumPad.add(oneDepo, 0, 2);
        depositNumPad.add(twoDepo, 1, 2);
        depositNumPad.add(threeDepo, 2, 2);
        depositNumPad.add(fourDepo, 0, 3);        
        depositNumPad.add(fiveDepo, 1, 3);
        depositNumPad.add(sixDepo, 2, 3);
        depositNumPad.add(sevenDepo, 0, 4);
        depositNumPad.add(eightDepo, 1, 4);
        depositNumPad.add(nineDepo, 2, 4);
        depositNumPad.add(zeroDepo, 0, 5);

        //Set all the numbers when are clicked
        oneDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("1");
            }
        });
        twoDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("2");
            }
        });
        threeDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("3");                 
            }
        });
        fourDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("4");
            }
        });
        fiveDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("5");
            }
        });
        sixDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("6");
            }
        });
        sevenDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("7");
            }
        });
        eightDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("8");
            }
        });
        nineDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("9");
            }
        });
        zeroDepo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                depositTextField.appendText("0");
            }
        });
        Button depositButton = new Button("Deposit");
        depositButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {    
                deposit = Integer.valueOf(depositTextField.getText());
                depositValueLabel.setText("$" + deposit.toString());
                chequeAccount.setAmountDeposit(deposit);
                chequeAccount.deposit();
                balanceValueLabel.setText("$" + chequeAccount.getPrincipal());
            }
        });
        //Creating and setting the number pad for the deposit with its text and text field
        HBox hBoxDepositButton = new HBox(depositButton);
        hBoxDepositButton.setId("depositButton");
        HBox backButtonBox = new HBox(backButton4);
        backButtonBox.setId("backButton");
        HBox clearButton = new HBox(clear);
        clearButton.setId("clearButton");
        //Creating and setting the whole Grid Pane
        VBox vBox = new VBox(gridPane, numPad, clearButton, depositText, depositTextField, depositNumPad, hBoxDepositButton, backButtonBox);
        
        borderPane.setCenter(vBox);
    }
}
