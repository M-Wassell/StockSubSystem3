/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocksubsystem3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v8254888
 */
public class PickingStateTest {
    
    public PickingStateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doThis method, of class PickingState.
     */
    @Test
    public void testDoThis() {
        System.out.println("doThis");
        PickingState expResult = null;
        PickingState result = PickingState.doThis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickStock method, of class PickingState.
     */
    @Test
    public void testPickStock() {
        System.out.println("pickStock");
        PickingState instance = new PickingState();
        instance.pickStock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restock method, of class PickingState.
     */
    @Test
    public void testRestock() {
        System.out.println("restock");
        PickingState instance = new PickingState();
        instance.restock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of availableStock method, of class PickingState.
     */
    @Test
    public void testAvailableStock() {
        System.out.println("availableStock");
        PickingState instance = new PickingState();
        boolean expResult = false;
        boolean result = instance.availableStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
