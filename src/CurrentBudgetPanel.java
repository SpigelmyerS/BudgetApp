
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;
/**
 *
 * @author jeffreyyeager
 */
public class CurrentBudgetPanel extends JPanel{
    public JLabel currentBudget;
    public String budgetAmount = "0"; 
    private Font font = new Font("Rockwell Extra Bold", Font.BOLD,20);
    
   CurrentBudgetPanel()
    {
        super();
       
        currentBudget = new JLabel("This is your current budget: " + budgetAmount);
        currentBudget.setFont(font);
        currentBudget.setBackground(Color.red);
        add(currentBudget);
        setBackground(Color.LIGHT_GRAY);
        
        
        this.add(currentBudget, BorderLayout.NORTH );
    }
    
}
