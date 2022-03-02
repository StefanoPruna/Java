
package InterfaceExample;

public abstract class Human
{
    protected String name;
    
    public abstract void howISay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
    
    public void realName()
    {
        System.out.println("");
    }
}
