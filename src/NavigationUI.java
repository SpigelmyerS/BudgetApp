
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
public class NavigationUI extends JPanel {
    
    //Beginning visuals, feel free to change as needed
    public JButton btnHome;
    public JButton btnEnterExpense;
    public  JButton btnEnterBudget;
    public JButton btnViewReport;
    public Box verticalBox;
    
    NavigationUI()
    {   
        this.setBackground(Color.darkGray);
        verticalBox = Box.createVerticalBox();
        btnHome = new JButton("Home");
        btnEnterExpense = new JButton("Enter Expense");
        btnEnterBudget = new JButton("Enter Budget");
        btnViewReport = new JButton ("View Report");
        verticalBox.add(btnHome);
        verticalBox.add(Box.createRigidArea(new Dimension(0, 30)));
        verticalBox.add(btnEnterExpense);
        verticalBox.add(Box.createRigidArea(new Dimension(0, 30)));
        verticalBox.add(btnEnterBudget);
        verticalBox.add(Box.createRigidArea(new Dimension(0, 30)));
        verticalBox.add(btnViewReport);
        
        add(verticalBox, "Center");
    }
    
}
