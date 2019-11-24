package stocksubsystem3;
/**
 * Represents StockSubSystem3 class, test harness.
 * @author Michael Wassell
 * @author V8254888
 * @author v8254888@live.tees.ac.uk
 * @version 1.3
 * @since 1.3
 */
public class StockSubSystem3 {

    public static void main(String[] args)throws InterruptedException 
    {
                
          DNDStock newStock = new DNDStock(100, 100, 100);
          newStock.pickStock(50);
          System.out.println(newStock.getStock().getClass());
          newStock.restock();
          System.out.println(newStock.getStock().getClass());
          System.out.println("");
          System.out.println("");
          
          Thread.sleep(6000);
          DNDStock a = new DNDStock(200, 800, 1000);
          a.pickStock(50);
          System.out.println(a.getStock().getClass());
          a.restock();
          System.out.println(a.getStock().getClass());
          System.out.println("");
          System.out.println("");
          
          Thread.sleep(6000);
          DNDStock b = new DNDStock(1, 30, 1000);
          b.pickStock(50);
          System.out.println(b.getStock().getClass());
          b.restock();
          System.out.println(b.getStock().getClass());
          System.out.println("");
          System.out.println("");
          
          Thread.sleep(6000);
          DNDStock c = new DNDStock(0, 600, 2000);
          c.pickStock(50);
          System.out.println(c.getStock().getClass());
          c.restock();
          System.out.println(c.getStock().getClass());
          System.out.println("");
          System.out.println("");
          
          Thread.sleep(6000);
          DNDStock d = new DNDStock(0, 0, 0);
          d.pickStock(50);
          System.out.println(d.getStock().getClass());
          d.restock();
          System.out.println(d.getStock().getClass());
          System.out.println("");
          System.out.println("");
          
          Thread.sleep(6000);
          DNDStock e = new DNDStock(0, 1000, 1000);
          e.pickStock(50);
          System.out.println(e.getStock().getClass());
          e.restock();
          System.out.println(e.getStock().getClass());
          System.out.println("");
          System.out.println("");
          
          Thread.sleep(6000);
          DNDStock f = new DNDStock(5000, 0, 0);
          f.pickStock(50);
          System.out.println(f.getStock().getClass());
          f.restock();
          System.out.println(f.getStock().getClass());

          
          
          
    }
    
}
