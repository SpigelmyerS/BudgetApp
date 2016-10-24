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
public class ViewNavigationControllerTest {
    
    public ViewNavigationControllerTest() {
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
     * Test of RemovePanels method, of class ViewNavigationController.
     */
    @Test
    public void testRemovePanels() {
        System.out.println("RemovePanels");
        ViewNavigationController instance = new ViewNavigationController();
        instance.RemovePanels();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of actionPerformed method, of class ViewNavigationController.
     */
    @Ignore
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        ViewNavigationController instance = new ViewNavigationController();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
