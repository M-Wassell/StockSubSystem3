package stocksubsystem3;
/**
 * Represents a PickableState state.
 * @author Michael Wassell
 * @author V8254888
 * @author v8254888@live.tees.ac.uk
 * @version 1.3
 * @since 1.3
 */
public class PickableState implements Stock
{   
    
    /**
     * Within PickableState , pickStock() allows for picking stock with a return message. 
     * Also manages the changing states attached to pickStock.
     * @param manager
     * @param stockPicked
     * @return false if out of stock, false if not enough stock and true if stock being picked.
     */
    @Override
    public boolean pickStock(DNDStock manager, int stockPicked)
    {
        if(manager.getStockLevel() <= 0)
        {
            System.out.println("Out of stock, restocking...");
            manager.setStock(new RestockingState());
            return false;
        }
        else if(manager.getStockLevel() < stockPicked)
        {
            System.out.println("Not enough stock, restocking...");
            manager.setStock(new RestockingState());
            return false;
        }
        else
        {
            System.out.println("Picking stock...");
            manager.setStockLevel(manager.getStockLevel() - stockPicked);
            if(manager.getStockLevel() == 0)
            {
                manager.restock();
            }
            return true;
        }
    }

    /**
     * Within PickableState , restock() allows for restock with a return message.
     * @param manager
     * @return false if restock isn't empty and true if it's empty.
     */
    @Override
    public boolean restock(DNDStock manager)
    {
        if(manager.getStockLevel() != 0)
        {
            System.out.println("Not empty yet!");
            return false;
        }
        else
        {
            manager.setStock(new RestockingState());
            return true;
        }
    }

    /**
     * Within PickableState , availableStock() allows for available stock true or false.
     * @param manager
     * @return true
     */
    @Override
    public boolean availableStock(DNDStock manager) 
    {   
        return true;
    }

}
