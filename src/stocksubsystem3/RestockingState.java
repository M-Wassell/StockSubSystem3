package stocksubsystem3;
/**
 *
 * @author v8254888
 */
public class RestockingState implements Stock
{
    private static RestockingState doThis = new RestockingState();
            
    public static RestockingState doThis()
    {
        return doThis;
    }
    
    @Override
    public void pickStock() 
    {
        System.out.println("We are currently restocking");
        doThis.pickStock();
    }

    @Override
    public void restock() 
    {
        System.out.println("Yes we are in the restock state");
        doThis.restock();
    }

    @Override
    public boolean availableStock() 
    {
        System.out.println("When we restock we can also pick the stock");
        
        return true;
                
    }
    
}
