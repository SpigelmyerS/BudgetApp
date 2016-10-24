/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garrettm.miller
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.NumberFormat;
import javax.swing.*;
import javax.swing.JPanel;

public class EnterAnExpense extends JPanel{
    
    
   private JLabel enterExpense = new JLabel("Enter an expense amount: ");
    //private JLabel enterDescription = new JLabel("Enter the description: ", JLabel.EAST );
 
    public static JTextField amountField = new JTextField();
    public static JTextField DescriptionField = new JTextField("Enter a description");
    
    public JButton btnSubmit = new JButton("Submit");
    
    private JLabel chooseOption = new JLabel("Choose the appropriate category: ", JLabel.CENTER);
    
    public JRadioButton foodButton = new JRadioButton("Food");
    public JRadioButton rentButton = new JRadioButton("Rent");
    public JRadioButton leisureButton = new JRadioButton("Leisure");
    private ButtonGroup group;
    
    
       public EnterAnExpense()
    {
        super();
        
        
        amountField.setColumns(10);
        //amountField.addPropertyChangeListener(, this);

        //enterExpense.setBackground(Color.blue);
       //enterADescription.setBackground(Color.red);
        chooseOption.setBackground(Color.pink);
       add(enterExpense);
        amountField.setPreferredSize( new Dimension( 200, 24 ) );
        add(amountField);
       // add(enterADescription);
        add(chooseOption);
        add(btnSubmit);
        add(foodButton);
        add(rentButton);
        add(leisureButton);
        setBackground(Color.LIGHT_GRAY);
        
        //descriptionField.setPreferredSize( new Dimension( 200, 24 ) );
        //add(descriptionField);
        
        group = new ButtonGroup();
        group.add(foodButton);
        group.add(rentButton);
        group.add(leisureButton);     
    }

  

}

  