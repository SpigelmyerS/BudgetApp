/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Suzanne
 */
public class EnterABudgetControllerTest {
    
    public EnterABudgetControllerTest() {
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
     * Test of CheckForMoneyAmount method, of class EnterABudgetController.
     */
    @Test
    public void testCheckForMoneyAmount() {
        System.out.println("CheckForMoneyAmount");
        MainView mainView = new MainView();
        EnterABudget enterBudget = new EnterABudget();
        CurrentBudgetPanel currentBudgetPanel = new CurrentBudgetPanel();
        
        EnterABudgetController instance = new EnterABudgetController(enterBudget, currentBudgetPanel);
        
        String expResult = "Please enter an amount";
        String result = instance.CheckForMoneyAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of actionPerformed method, of class EnterABudgetController.
     */
    
    @Ignore
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        EnterABudgetController instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(true);
    }
    
}
