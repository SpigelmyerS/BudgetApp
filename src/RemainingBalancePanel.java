
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;

//@author yeager

public class RemainingBalancePanel extends JPanel{
    JLabel remainingBalanceLabel = new JLabel("This is your remaining balance: ");
    Font font = new Font("Arial", Font.ITALIC, 25);
    
    public RemainingBalancePanel()
    {
        super();
        remainingBalanceLabel.setFont(font);
        remainingBalanceLabel.setBackground(Color.pink);
        remainingBalanceLabel.setForeground(Color.red);
        add(remainingBalanceLabel);
        setBackground(Color.cyan);
    }
    
}

   

