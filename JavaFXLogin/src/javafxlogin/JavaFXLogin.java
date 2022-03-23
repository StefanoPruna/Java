
package javafxlogin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//GUI INTERFACE

public class JavaFXLogin extends Application{

    public static void main(String[] args) 
    {
        launch(args); //Launch Java fx
    }
    
    //Creating the grid, or container called in Java Stage
    @Override
    public void start(Stage stage) throws Exception
    {
        //Creating the outside, whole container
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(25));
        gridPane.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        gridPane.setAlignment(Pos.CENTER);
                
        //Creating the labels/texts
        Label welcomeLabel = new Label("Welcome");
        //welcomeLabel.setId("welcome-text");//to stylish the welcome text
        Label usernameLabel = new Label("User Name");
        Label passwordLabel = new Label("Password");
        Label messageLabel = new Label();
        
        //Creating the text field where user can type on it
        TextField usernameTextField = new TextField();
        TextField passTextField = new TextField();
        
        //Creating the Sign In button
        Button signInButton = new Button("Sign In");
        signInButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                //Here we code an event, what the button will do when getting clicked
                messageLabel.setText("You clicked me");
                if(usernameTextField.getText().isEmpty())
                    messageLabel.setText("Please input the username");
                else
                    messageLabel.setText("");
            }
        });
        
        //Where to position the labels in the grid/container
        //First int/number is the column, the second is the row
        gridPane.add(welcomeLabel, 0, 0);
        gridPane.add(usernameLabel, 0, 1);
        gridPane.add(passwordLabel, 0, 2);
        gridPane.add(usernameTextField, 1, 1);
        gridPane.add(passTextField, 1, 2);
        gridPane.add(messageLabel, 1, 5);              
        //gridPane.add(signInButton, 1, 4);
        
        //We don't use the gridpane for the button anymore, but creating a new HBOX container for it
        //Creating the container specifically for the Sign in button to move it to the right
        HBox hbox = new HBox();
        hbox.getChildren().add(signInButton);
        hbox.setAlignment(Pos.CENTER_RIGHT);
        
        gridPane.add(hbox, 1, 4);
        
        //Stage is the outside container
        //while scene is inside of the Stage with dimensions
        //First number for the width, the second for the height
        //Scene scene = new Scene(welcomeLabel, 400, 300);
        Scene scene = new Scene(gridPane, 300, 275);
        //To add external file to stylish
        //scene.getStylesheets().add(JavaFXLogin.class.getResource("login.css").toExternalForm());
        
        stage.setScene(scene);
        stage.setTitle("My First JavaFX App");        
        stage.show();
    }    
}
