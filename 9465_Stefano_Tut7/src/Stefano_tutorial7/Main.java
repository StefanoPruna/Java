
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


public class Main extends Application{

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        GridPane gridpane = new GridPane();
        
        //Title of the border pane
//        HBox hBoxTitle = new HBox();
//        hBoxTitle.getChildren().add(titleLabel);
//        hBoxTitle.setAlignment(Pos.CENTER);        
        //borderPane.setTop(hBoxTitle);
        
        //Create the inner grid
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(25));
        gridPane.setAlignment(Pos.CENTER);
        
        List<Integer> numbers = new ArrayList();
        Label resultLabel = new Label();
        
        //var for the result
        int result = 0;
        
        //Creating the buttons
        Button zeroButton = new Button(String.valueOf(0));
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        zeroButton.setOnAction(new EventHandler<ActionEvent>()
        {
                @Override
            public void handle(ActionEvent t) 
            {
                //Here we code an event, what the button will do when getting clicked
                resultLabel.setText(resultLabel.getText().concat("0"));
                numbers.add(0);
            }
        });
        
        Button oneButton = new Button(String.valueOf(1));
        oneButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        oneButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {               
                resultLabel.setText(resultLabel.getText().concat("1"));
                numbers.add(1);
            }
        });
        
        Button twoButton = new Button(String.valueOf(2));
        twoButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button threeButton = new Button(String.valueOf(3));
        threeButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button fourButton = new Button(String.valueOf(4));
        fourButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button fiveButton = new Button(String.valueOf(5));
        fiveButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button sixButton = new Button(String.valueOf(6));
        sixButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button sevenButton = new Button(String.valueOf(7));
        sevenButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button eightButton = new Button(String.valueOf(8));
        eightButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button nineButton = new Button(String.valueOf(9));
        nineButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button dotButton = new Button(".");
        dotButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button plusButton = new Button("+");
        plusButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        plusButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                resultLabel.setText(resultLabel.getText().concat("+"));  
                int result = (numbers.get(0) + numbers.get(1));
                resultLabel.setText(String.valueOf(result));
            }
        });
        Button minusButton = new Button("-");
        minusButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button multiplyButton = new Button("*");
        multiplyButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button divideButton = new Button("/");
        divideButton.setBorder(new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button calculateButton = new Button("=");
        calculateButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                resultLabel.setText(String.valueOf(result));
            }
        });
        
        calculateButton.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button clearButton = new Button("CE");
        clearButton.setBorder(new Border(new BorderStroke(Color.DARKGREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        
        
        
        gridPane.add(resultLabel, 1, 0);  
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
        
        
        
        //Create the border pane
        Scene scene = new Scene(gridPane, 500, 500);        
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
        
}
