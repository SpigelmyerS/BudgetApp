
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garretm.miller
 */
public class ReportView extends JPanel {
    
    //placeholder, will be developed in future sprints
    public JTextArea expenseList;
     ReportView()
    {
        expenseList = new JTextArea("Expense names/descriptions/prices will go here");
        expenseList.setEditable(false);
        expenseList.setPreferredSize( new Dimension( 500, 524 ) );
        add(expenseList);
    }
}
