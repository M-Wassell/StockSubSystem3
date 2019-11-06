package stocksubsystem3;

/**
 *
 * @author v8254888
 */
public class ReorderingState implements Stock
{
    private static ReorderingState doThis = new ReorderingState();
    
    public static ReorderingState doThis()
    {
        return doThis;
    }

    @Override
    public void pickStock() 
    {
        System.out.println("We are currently in a reordering state, stock is not available to be picked");
    }

    @Override
    public void restock() 
    {
        System.out.println("We are unable to restock as the stock is currently on order");
    }

    @Override
    public boolean availableStock() {
        System.out.println("Stock is unavailable at the moments as it is being ordered");
        
        return false;
    }
    
}
