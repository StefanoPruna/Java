
package Stefano_tutorial7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        
        Label resultLabel = new Label();
        
        //Creating the buttons
        Button zeroButton = new Button("0");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button oneButton = new Button("1");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button twoButton = new Button("2");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button threeButton = new Button("3");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button fourButton = new Button("4");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button fiveButton = new Button("5");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button sixButton = new Button("6");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button sevenButton = new Button("7");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button eightButton = new Button("8");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button nineButton = new Button("9");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button dotButton = new Button(".");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button plusButton = new Button("+");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button minusButton = new Button("-");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button multiplyButton = new Button("*");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button divideButton = new Button("/");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        Button calculateButton = new Button("=");
        zeroButton.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        
        gridPane.add(resultLabel, 0, 0);        
        gridPane.add(oneButton, 0, 4);
        gridPane.add(twoButton, 1, 4);
        gridPane.add(threeButton, 2, 4);
        gridPane.add(multiplyButton, 3, 4);
        gridPane.add(fourButton, 0, 3);
        gridPane.add(fiveButton, 1, 3);
        gridPane.add(sixButton, 2, 3);
        gridPane.add(minusButton, 3, 3);
        gridPane.add(sevenButton, 0, 2);
        gridPane.add(eightButton, 1, 2);
        gridPane.add(nineButton, 2, 2);
        gridPane.add(divideButton, 3, 2);
        gridPane.add(dotButton, 0, 5);
        gridPane.add(zeroButton, 1, 5);
        gridPane.add(calculateButton, 2, 5);
        gridPane.add(plusButton, 3, 5);
        
        //Create the border pane
        Scene scene = new Scene(gridPane, 500, 500);        
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
        
}
