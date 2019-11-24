package stocksubsystem3;

/**
 * Represents Stock interface.
 * @author Michael Wassell
 * @author V8254888
 * @author v8254888@live.tees.ac.uk
 * @version 1.3
 * @since 1.3
 */
public interface Stock 
{
    /**
     * Method: pickStock().
     * @param manager
     * @param stockPicked 
     * @return stock.pickStock(this, stockPicked)
     */
    public boolean pickStock(DNDStock manager, int stockPicked);

    /**
     * Method: restock().
     * @param manager
     * @return stock.restock(this)
     */
    public boolean restock(DNDStock manager);

    /**
     * Method: availableStock().
     * @param manager
     * @return stock.availableStock(this)
     */
    public boolean availableStock(DNDStock manager);

}
