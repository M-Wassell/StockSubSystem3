package stocksubsystem3;
/**
 * Represents DNDStock class.
 * @author Michael Wassell
 * @author V8254888
 * @author v8254888@live.tees.ac.uk
 * @version 1.3
 * @since 1.3
 */
public class DNDStock 
{
    private int stockLevel,overflowLevel;
    private final int maxStockLevel;
    private Stock stock;

    /**
     * Sets the different stock levels for the different states.
     * @param stockLevel sets the stock level for the transition of states
     * @param overflowLevel sets the overflow level for the transition of states 
     * @param maxStockLevel sets the max stock level
     */
    public DNDStock(int stockLevel, int overflowLevel, int maxStockLevel) 
    {
        this.stockLevel = stockLevel;
        this.overflowLevel = overflowLevel;
        this.maxStockLevel = maxStockLevel;
        if(stockLevel > 0)
        {
            stock = new PickableState();
        }
        else if(overflowLevel > 0)
        {
            stock = new RestockingState();
        }
        else
        {
            stock = new ReorderingState();
        }
    }
    /**
     * Allows for input of an amount of stock to pick.
     * @param stockPicked 
     * @return stock.pickStock(this, stockPicked).
     */
    public boolean pickStock(int stockPicked)
    {
        return stock.pickStock(this, stockPicked);
    }
    
    /**
     * Method: restock().
     * @return stock.restock(this)
     */
    public boolean restock()
    {
        return stock.restock(this);
    }
    
    /**
     * Method: availableStock().
     * @return stock.availableStock(this)
     */
    public boolean availableStock()
    {
        return stock.availableStock(this);
    }
    
    /**
     * Getter: Gets the stock level.
     * @return stockLevel
     */
    public int getStockLevel() {
        return stockLevel;
    }
    
    /**
     * Getter: Gets overflow level.
     * @return overflowLevel
     */
    public int getOverflowLevel() {
        return overflowLevel;
    }
    /**
     * Getter: Gets stock level.
     * @return stock
     */
    public Stock getStock() {
        return stock;
    }
    
    /**
     * Setter: Sets the stock.
     * @param stock 
     */
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    
    /**
     * Setter: Sets stock level.
     * @param stockLevel 
     */
    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    /**
     * Setter: Sets overflow level.
     * @param overflowLevel 
     */
    public void setOverflowLevel(int overflowLevel) {
        this.overflowLevel = overflowLevel;
    }

    /**
     * Getter: Gets max stock level.
     * @return maxStockLevel
     */
    public int getMaxStockLevel() {
        return maxStockLevel;
    }
    
    
}
