import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.NumberFormat;
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
public class EnterABudget extends JPanel{
    
    private JLabel enterAnAmount = new JLabel("Enter an amount: ", JLabel.CENTER);
    //NumberFormat amountType = NumberFormat.getNumberInstance();
    public static JTextField amountField = new JTextField();
   // JLabel enterADescription = new JLabel("Enter a description: ", JLabel.CENTER);
    //JTextField descriptionField = new JTextField();
    public JButton btnSubmit = new JButton("Submit"); 
    private JLabel chooseOption = new JLabel("Choose the appropriate category: ", JLabel.CENTER);
    public JRadioButton foodButton = new JRadioButton("Food");
    public JRadioButton rentButton = new JRadioButton("Rent");
    public JRadioButton leisureButton = new JRadioButton("Leisure");
    private ButtonGroup group;
    public JComboBox budgetCategories; 
    
    
    public EnterABudget()
    {
        super();
        
        budgetCategories= new JComboBox();
        amountField.setColumns(10);
        //amountField.addPropertyChangeListener(, this);

        //enterAnAmount.setBackground(Color.blue);
       // enterADescription.setBackground(Color.red);
        //chooseOption.setBackground(Color.pink);
        add(enterAnAmount);
        amountField.setPreferredSize( new Dimension( 200, 24 ) );
        add(amountField);
        //add(enterADescription);
        add(chooseOption);
        add(btnSubmit);
        add(budgetCategories);
        
        /*add(foodButton);
        add(rentButton);
        add(leisureButton);*/
        setBackground(Color.LIGHT_GRAY);
        
        //descriptionField.setPreferredSize( new Dimension( 200, 24 ) );
        //add(descriptionField);
        
       /* group = new ButtonGroup();
        group.add(foodButton);
        group.add(rentButton);
        group.add(leisureButton);   */     
        
        
        //foodButton.addActionListener(this);
        //rentButton.addActionListener(this);
        //leisureButton.addActionListener(this);
        
        
        
    }
}
