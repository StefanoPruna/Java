
package javafxcirclecylinder;

import businesslogic.Cylinder;
import javafx.application.Application;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXCircleCylinder extends Application{

    public static void main(String[] args) 
    {
        launch(args);
    }    

    @Override
    public void start(Stage stage) throws Exception 
    {
        Cylinder cylinder = new Cylinder();
        
        BorderPane borderPane = new BorderPane();
        
        //Top area of the border pane
        Label titleLabel = new Label("Circle and Cylinder Measurements");
        HBox hBoxTitle = new HBox();
        hBoxTitle.getChildren().add(titleLabel);
        hBoxTitle.setAlignment(Pos.CENTER);
        
        borderPane.setTop(hBoxTitle);
        //Left area of the border pane
        //VBOX 1
        Label radiusLabel = new Label("Radius");
        Label areaLabel = new Label("Area");
        Label circumferenceLabel = new Label("Circumference");
        Label DiameterLabel = new Label("Diameter");        
        VBox vBox1 = new VBox(radiusLabel, areaLabel, circumferenceLabel, DiameterLabel);
        
        //VBOX 2
        TextField radiusTextField = new TextField();
        
        Label areaValueLabel = new Label("0");
        Label circumferenceValueLabel = new Label("0");
        Label diameterValueLabel = new Label(" ");  
        VBox vBox2 = new VBox(radiusTextField, areaValueLabel, circumferenceValueLabel, diameterValueLabel);
        
        HBox hBox1 = new HBox(vBox1, vBox2);        
        borderPane.setLeft(hBox1);
        
        radiusTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent t) 
            {
                //Every time you press the Enter key, the event will be executed
                if(t.getCode() == KeyCode.ENTER)
                {
                    Float value = Float.valueOf(radiusTextField.getText());
                    cylinder.setRadius(value);
                    Float circleArea = cylinder.calculateArea();
                    areaValueLabel.setText(circleArea.toString());
                    Float circleCircumference = cylinder.calculateCircumference();
                    circumferenceValueLabel.setText(circleCircumference.toString());
                    Float circleDiameter = cylinder.calculateDiameter();
                    diameterValueLabel.setText(circleDiameter.toString());
                }
            }
        });
        
        //Set the centre/right area
        Label heightLabel = new Label("Height");
        Label volumeLabel = new Label("Volume");
        VBox vBoxCentre = new VBox(heightLabel, volumeLabel);
        TextField heightTextField = new TextField();
        Label volumeValueLabel = new Label("0");
        VBox vBoxRight = new VBox(heightTextField, volumeValueLabel);
        
        heightTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent t) 
            {
                if(t.getCode() == KeyCode.ENTER)
                {
                    Float height = Float.valueOf(heightTextField.getText());
                    cylinder.setHeight(height);
                    Float cylinderVolume = cylinder.calculateVolume();
                    volumeValueLabel.setText(cylinderVolume.toString());
                }
            }
        });
        
        HBox hBox2 = new HBox(vBoxCentre, vBoxRight );        
        borderPane.setCenter(hBox2);
        
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) 
            {
                radiusTextField.setText("");
                areaValueLabel.setText("");
                circumferenceValueLabel.setText("");
                diameterValueLabel.setText("");
                heightTextField.setText("");
                volumeValueLabel.setText("");
            }
        });
        HBox hBoxButton = new HBox(clearButton);
        hBoxButton.setAlignment(Pos.CENTER);
        borderPane.setBottom((hBoxButton));
        
        Scene scene = new Scene(borderPane, 500, 200);
        
        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }
    
    
}
