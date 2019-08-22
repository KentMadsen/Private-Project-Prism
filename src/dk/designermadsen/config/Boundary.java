package dk.designermadsen.config;

public class Boundary
{
    public Boundary()
    {

    }

    private Boundary[] boundaries = null;
    private Statement[] statements = null;

    // Accessors
    public final Boundary[] getBoundaries()
    {
        return boundaries;
    }

    public final void setBoundaries( Boundary[] boundaries )
    {
        this.boundaries = boundaries;
    }

    public final Statement[] getStatements()
    {
        return statements;
    }

    public final void setStatements( Statement[] statements )
    {
        this.statements = statements;
    }

    // Object implementations
    /**
     *
     * @return
     */
    @Override
    public final String toString()
    {
        return super.toString();
    }
}
