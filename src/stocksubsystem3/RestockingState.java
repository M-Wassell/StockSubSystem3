package stocksubsystem3;
/**
 * Represents a RestockingState state.
 * @author Michael Wassell
 * @author V8254888
 * @author v8254888@live.tees.ac.uk
 * @version 1.3
 * @since 1.3
 */
public class RestockingState implements Stock
{
    /**
     * Within RestockingState , pickStock() allows for picking stock with a return message.
     * @param manager
     * @param stockPicked
     * @return false.
     */
    @Override
    public boolean pickStock(DNDStock manager, int stockPicked) 
    {
        System.out.println("We are currently restocking");
        return false;
    }

    /**
     * Within RestockingState , pickStock() allows for restock with a return message.
     * @param manager
     * @return false if no overflow stock, true if stock is fully stocked, true if stock is partly stocked.
     */
    @Override
    public boolean restock(DNDStock manager) 
    {
        if(manager.getOverflowLevel() <= 0)
        {
            System.out.println("No overflow stock, ordering more");
            manager.setStock(new ReorderingState());
            return false;
        }
        else if(manager.getOverflowLevel() > manager.getMaxStockLevel())
        {
            manager.setStockLevel(manager.getMaxStockLevel());
            manager.setOverflowLevel(manager.getOverflowLevel() - manager.getMaxStockLevel());
            System.out.println("Restocked fully!");
            manager.setStock(new PickableState());
            return true;
        }
        else
        {
            manager.setStockLevel(manager.getOverflowLevel());
            manager.setOverflowLevel(0);
            System.out.println("Partly Stocked");
            manager.setStock(new PickableState());
            return true;
        } 
    }

    /**
     * Within RestockingState , availableStock() allows for available stock.
     * @param manager
     * @return true.
     */
    @Override
    public boolean availableStock(DNDStock manager) 
    {   
        return true;
                
    }
    
}
