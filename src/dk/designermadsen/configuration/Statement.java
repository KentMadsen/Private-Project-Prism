package dk.designermadsen.configuration;

public class Statement
{
    public Statement()
    {

    }

    // Variables
    private String key;
    private String[] args;

    // Accessor
    public String getKey()
    {
        return key;
    }

    public String[] getArgs()
    {
        return args;
    }

    public void setArgs(String[] args)
    {
        this.args = args;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    // Object Implementation
    @Override
    public final String toString()
    {
        return super.toString();
    }
}
