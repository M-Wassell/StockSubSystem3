package stocksubsystem3;

/**
 *
 * @author V8254888
 */
public class DNDStock 
{
    private int stockLevel,overflowLevel;// reason for the change of state, not going in interface
    private Stock stock;
    
//    private StockState stockState; setting stock state
    
    public DNDStock(int stockLevel, int overflowLevel)// instances of the state 
    {
        this.stockLevel = stockLevel;
        this.overflowLevel = overflowLevel;
        
        if(stockLevel == 1000 && stockLevel <= 500 || overflowLevel < 5000 && overflowLevel >= 2000)
        {
            stock = new PickingState();
        }
        else if(stockLevel < 499 && stockLevel > 300 || overflowLevel < 2000 && overflowLevel >= 1000)
        {
            stock = new RestockingState();
        }
        else if(stockLevel < 299 || overflowLevel < 1000)
        {
            stock = new ReorderingState();
        }
    }
    
    public void pickStock()
    {
        stock.pickStock();
    }
    
    public void restock()
    {
        stock.restock();
    }

    public boolean availableStock()
    {
        stock.availableStock();
        
        return false;
        
    }
    
    
}
