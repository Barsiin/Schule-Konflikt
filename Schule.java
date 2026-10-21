public class Schule
{
    private String name;
    private int labor;
    private boolean abendschule;
    
    public String getName()
    {
        return  name;
    }
    
    public int getLabor()
    {
        return labor;
    }
    
    public boolean getAbendschule()
    {
        return abendschule;
    }
    
    public void setName( String neuName)
    {
        name=neuName;
    }
    
    public void setLabor( int neuLabor)
    {
        labor=neuLabor;
    }
    
    public void setAbendschule( boolean neuAbendschule)
    {
        abendschule=neuAbendschule;
    }
    public Schule(String neuName, int neuLabor, boolean neuAbendschule)
    {
        setName(neuName);
        setLabor(neuLabor);
        setAbendschule(neuAbendschule);
    }
    public Schule()
    {
        setName("ahmad");
        setLabor(67);
        setAbendschule(true);
    }
}

