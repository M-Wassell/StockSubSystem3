package stocksubsystem3;
/**
 * Represents a ReorderingState class.
 * @author Michael Wassell
 * @author V8254888
 * @author v8254888@live.tees.ac.uk
 * @version 1.3
 * @since 1.3
 */
public class ReorderingState implements Stock
{
    /**
     * Within ReorderingState, pickStock() allows for picking stock with a return message ("We are currently in a reordering state, stock is not available to be picked").
     * @param manager
     * @param stockPicked
     * @return false
     */
    @Override
    public boolean pickStock(DNDStock manager, int stockPicked) 
    {
        System.out.println("We are currently in a reordering state, stock is not available to be picked");
        return false;
    }

    /**
     * Within ReorderingState, restock() allows for restock with a return message ("We are unable to restock as the stock is currently on order").
     * @param manager
     * @return false.
     */
    @Override
    public boolean restock(DNDStock manager) 
    {
        System.out.println("We are unable to restock as the stock is currently on order");
        return false;
    }

    /**
     * Within ReorderingState, availableStock() allows for availableStock with a return message ("Stock is unavailable at the moments as it is being ordered").
     * @param manager
     * @return false.
     */
    @Override
    public boolean availableStock(DNDStock manager) {
        System.out.println("Stock is unavailable at the moments as it is being ordered");
        return false;
    }
    
}
