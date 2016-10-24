
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;
/**
 *
 * @author jeffreyyeager
 */
public class PanelBudget extends JPanel{
    CurrentBudgetPanel currentBudgetPanel;
    RemainingBalancePanel remainingBalancePanel;
    RecentSpendingPanel recentSpendingPanel;
    ButtonOptionsPanel buttonOptionsPanel;
    
    public PanelBudget()
    {
        super();
        GridLayout gr = new GridLayout(4,1);
        setLayout(gr);
        
        
        currentBudgetPanel = new CurrentBudgetPanel();
        remainingBalancePanel = new RemainingBalancePanel();
        recentSpendingPanel = new RecentSpendingPanel();
        buttonOptionsPanel = new ButtonOptionsPanel();
        //setBackground(Color.GRAY);
        
        currentBudgetPanel.setBackground(Color.LIGHT_GRAY);
        remainingBalancePanel.setBackground(Color.LIGHT_GRAY);
        recentSpendingPanel.setBackground(Color.LIGHT_GRAY);
        buttonOptionsPanel.setBackground(Color.LIGHT_GRAY);
        
        add(currentBudgetPanel);
        add(remainingBalancePanel);
        add(recentSpendingPanel);
        add(buttonOptionsPanel);
        
    }
    
}
