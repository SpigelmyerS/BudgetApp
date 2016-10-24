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
public class ButtonOptionsPanelControllerTest {
    
    public ButtonOptionsPanelControllerTest() {
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
     * Test of AddActionListeners method, of class ButtonOptionsPanelController.
     */
    @Test
    public void testAddActionListeners() {
        System.out.println("AddActionListeners");
        ButtonOptionsPanel buttonOptions = new ButtonOptionsPanel();
        ButtonOptionsPanelController instance = new ButtonOptionsPanelController(buttonOptions);
        instance.AddActionListeners();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of actionPerformed method, of class ButtonOptionsPanelController.
     */
    @Ignore
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        ButtonOptionsPanelController instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
