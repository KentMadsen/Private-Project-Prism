package dk.designermadsen;

public class Application
{
    /**
     *
     */
    public Application()
    {
        this.setBusiness( new Business() );
    }

    public void initialise()
    {

    }

    public void execute()
    {

    }

    // Internal Variables
    /**
     *
     */
    private Business business = null;

    // Accessors
    /**
     *
     * @return
     */
    public Business getBusiness()
    {
        return business;
    }

    /**
     *
     * @param business
     */
    public void setBusiness( Business business )
    {
        this.business = business;
    }

    // Entry
    /**
     *
     * @param argv
     */
    public static void main( String[] argv )
    {
        Application application = new Application();

        application.initialise();
        application.execute();
    }
}
