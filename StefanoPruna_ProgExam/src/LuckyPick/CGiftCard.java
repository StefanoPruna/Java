
package LuckyPick;

public class CGiftCard extends CBear implements CObject
{

    private Integer value = 0;
    
    public CGiftCard() {
    }

    @Override
    public String getDesc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getValue() 
    {
        return value += value;
    }

    @Override
    public boolean isSold() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
