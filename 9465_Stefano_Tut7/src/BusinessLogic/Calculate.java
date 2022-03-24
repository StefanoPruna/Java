
package BusinessLogic;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Label;

public class Calculate implements Calculator
{  
    public Float result = 0f; 
    public String operator;
    public Float number;
    public Float test;

    @Override
    public Float sumCalculation() 
    {
        return number + number;
    }

    @Override
    public Float subtractCalculation() 
    {
        return number - number;
    }

    @Override
    public Float multiplyCalculation() 
    {
        return number / number;
    }

    @Override
    public Float divideCalculation() 
    {
        return number / number;
    }
    
}


