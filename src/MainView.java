
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class MainView extends JFrame {
    JPanel titlePane;
    JLabel title;
     //CurrentBudgetPanel budgetPane;
    EnterABudget enterBudget;
    PanelBudget budgetPane;
    NavigationUI nav;
    EnterAnExpense Expense;
    ReportView reportView; 
    CurrentBudgetPanel currentBudgetPanel;
    //NavigationUI  side panel filled with navigation buttons 
    //BudgetAmountView main panel that will display budgets and information user first sees.
    MainView()
    {
        super("Budget App");
         titlePane = new JPanel();
        titlePane.setBackground(Color.green);
        title = new JLabel("Welcome");
        this.add(titlePane, BorderLayout.NORTH );
        titlePane.add(title);
        
        
         
        //budgetPane = new CurrentBudgetPanel();
        //enterBudget  = new EnterABudget();
        nav = new NavigationUI();
        enterBudget = new EnterABudget();
        //budgetPane = new PanelBudget();
        Expense = new EnterAnExpense();
        currentBudgetPanel = new CurrentBudgetPanel();
        reportView = new ReportView();
        getContentPane().add(nav,"West");
        getContentPane().add(currentBudgetPanel, "Center"); 
      
        //getContentPane().add(enterBudget, "South");
        //getContentPane().add()
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (500, 500);
        setVisible(true);
    }
    
    
}
