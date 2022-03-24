
package Stefano_tutorial7;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import BusinessLogic.Calculate;
import java.util.HashSet;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import oracle.jrockit.jfr.events.Bits;


public class Main extends Application{

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        //A Calculate class for the result to use for every buttons
        //It's not ideal, but I couldn't find a better way at the moment
        //I still cannot manage the numbers with the .
        //I still cannot manage more than 2 numbers calculation properly and only single digit numbers
        //Good to come back later to improve the code when I have learnt more skills in Java or programming
        Calculate calculate = new Calculate();

        //Create the Scene
        BorderPane borderPane = new BorderPane();
        
        //Create the inner grid
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(25));
        gridPane.setAlignment(Pos.CENTER);
        
        List<Float> numbers = new ArrayList();
        List<String> signLabel = new ArrayList();
        Label resultLabel = new Label();
        resultLabel.setFont(new Font(25));        
        
        //Creating the buttons; when click on the button, the number will be added to the List
        Button zeroButton = new Button(String.valueOf(0));
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        zeroButton.setOnAction(new EventHandler<ActionEvent>()
        {
                @Override
            public void handle(ActionEvent t) 
            {
                //Here we code an event, what the button will do when getting clicked
                resultLabel.setText(resultLabel.getText().concat("0"));
                numbers.add(0f);
            }
        });
        
        Button oneButton = new Button(String.valueOf(1));
        oneButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        oneButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            { 
                resultLabel.setText(resultLabel.getText().concat("1"));  
                numbers.add(1f);
            }
        });
     
        Button twoButton = new Button(String.valueOf(2));
        twoButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        twoButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("2"));
                //numbers.add(resultLabel.getText());
                numbers.add(2f);            
            }
        });
        
        Button threeButton = new Button(String.valueOf(3));
        threeButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        threeButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("3"));
                //numbers.add(resultLabel.getText());
                numbers.add(3f);           
            }
        });
        
        Button fourButton = new Button(String.valueOf(4));
        fourButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        fourButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("4"));
                numbers.add(4f);           
            }
        });
        
        Button fiveButton = new Button(String.valueOf(5));
        fiveButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        fiveButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("5"));
                numbers.add(5f);           
            }
        });
        
        Button sixButton = new Button(String.valueOf(6));
        sixButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        sixButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("6"));
                numbers.add(6f);           
            }
        });
        
        Button sevenButton = new Button(String.valueOf(7));
        sevenButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        sevenButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("7"));
                numbers.add(7f);            
            }
        });
        
        Button eightButton = new Button(String.valueOf(8));
        eightButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        eightButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("8"));
                numbers.add(8f);           
            }
        });
        
        Button nineButton = new Button(String.valueOf(9));
        nineButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        nineButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("9"));
                numbers.add(9f);            
            }
        });
        
        //Different List for the symbols
        Button dotButton = new Button(".");
        dotButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        dotButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("."));
                signLabel.add(".");
                //numbers.add(resultLabel.getText());
            }
        });
        
        Button plusButton = new Button("+");
        plusButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        plusButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("+"));
                signLabel.add("+");
            }
        });
        Button minusButton = new Button("-");
        minusButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        minusButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("-"));
                signLabel.add("-");
            }
        });
        
        Button multiplyButton = new Button("*");
        multiplyButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        multiplyButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("*"));
                signLabel.add("*");
            }
        });
        
        Button divideButton = new Button("/");
        divideButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        divideButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(resultLabel.getText().concat("/"));
                signLabel.add("/");
            }
        });
        
        //This button calculate the numbers
        Button calculateButton = new Button("=");
        calculateButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                for (int i = 0; i < numbers.size(); i++)
                {
                   for (int s = 0; s < signLabel.size(); s++)
                    {
                        switch(signLabel.get(s))
                            {
                                case "+":
                                    calculate.result = numbers.get(0) + numbers.get(i);
                                    break;
                                case "-":
                                    calculate.result = numbers.get(0) - numbers.get(1)  - numbers.get(2);
                                    break;
                                case "*":
                                    calculate.result = numbers.get(0) * numbers.get(1);
                                    break;
                                case "/":
                                    calculate.result = numbers.get(0) / numbers.get(1);
                                    break;
            //                    case ".":
            //                        numbers.get(i) /= 10f;
            //                        break;
                            }
                    } 
                }      
                resultLabel.setText(String.valueOf(calculate.result));
            }
        });
        
        //CE button is the clear button that reset everything
        calculateButton.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button clearButton = new Button("CE");
        clearButton.setBorder(new Border(new BorderStroke(Color.DARKGREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        clearButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                signLabel.removeAll(signLabel);
                numbers.removeAll(numbers);
                calculate.result = 0f;
                resultLabel.setText("");
            }
        });
        
        //This is the graphic interface of the buttons
        //gridPane.add(resultLabel, 1, 0);  
        gridPane.add(clearButton, 0, 0);      
        gridPane.add(sevenButton, 0, 1);
        gridPane.add(eightButton, 1, 1);
        gridPane.add(nineButton, 2, 1);
        gridPane.add(divideButton, 3, 1);
        gridPane.add(fourButton, 0, 2);
        gridPane.add(fiveButton, 1, 2);
        gridPane.add(sixButton, 2, 2);
        gridPane.add(minusButton, 3, 2);
        gridPane.add(oneButton, 0, 3);
        gridPane.add(twoButton, 1, 3);
        gridPane.add(threeButton, 2, 3);
        gridPane.add(multiplyButton, 3, 3);
        gridPane.add(dotButton, 0, 4);
        gridPane.add(zeroButton, 1, 4);
        gridPane.add(calculateButton, 2, 4);
        gridPane.add(plusButton, 3, 4);
        
        VBox vBox = new VBox(resultLabel);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(25));
        borderPane.setTop(vBox);
        borderPane.setBottom(gridPane);
        
        
        //Create the border pane
        //Scene scene = new Scene(gridPane, 500, 500);        
        Scene scene = new Scene(borderPane, 300, 350);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }        
}
