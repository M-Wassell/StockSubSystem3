package stocksubsystem3;

/**
 *
 * @author v8254888
 */
public class PickingState implements Stock
{

    private static PickingState doThis = new PickingState();
    
    public static PickingState doThis()
    {
        return doThis;
    }
    
    @Override
    public void pickStock()
    {
        System.out.println("We are currently picking stock");
        doThis.pickStock();
    }

    @Override
    public void restock()
    {
        System.out.println("Stock is being picked, no need to restock");
    }

    @Override
    public boolean availableStock() 
    {
        System.out.println("Stock is available");
        
        return true;
    }


    
}
