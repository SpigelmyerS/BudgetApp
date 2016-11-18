
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyyeager
 */
public class ButtonOptionsPanel extends JPanel{
    JButton food = new JButton("Food");
    JButton leisure = new JButton("Leisure");
    JButton bills = new JButton("Bills");
    
    public ButtonOptionsPanel()
    {
        super();
        GridLayout gr = new GridLayout(3,1);
        setLayout(gr);
        add(food);
        add(leisure);
        add(bills);
    }
    
    
}
