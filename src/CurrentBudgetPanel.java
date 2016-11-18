
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
    public JLabel categoryType;
    public String budgetAmount = "0"; 
    public JLabel BudgetRemaining;
    public JLabel BudgetTotal;
    public JLabel BudgetByCategory, RemainingBudgetByCategory;
    public JLabel LeisureLabel, LeisureAmountLabel; 
    public JLabel RentLabel, RentAmountLabel; 
    public JComboBox categories;
    /*public Double FoodAmount = 0.0;
    public Double LeisureAmount = 0.0;
    public Double RentAmount = 0.0;
    
    public Double FoodTotal = 0.0;
    public Double RentTotal = 0.0;
    public Double LeisureTotal = 0.0;*/
    
    private Font font = new Font("Rockwell Extra Bold", Font.BOLD,20);
    
    
   CurrentBudgetPanel()
    {
        super();
        //this.setLayout(new BorderLayout());
        categories = new JComboBox();
        
        BudgetTotal = new JLabel("Overall Budget: "); 
        
        BudgetRemaining = new JLabel("Remaining Budget: ");
        
        BudgetByCategory = new JLabel("Overall Budget by Category: ");
        RemainingBudgetByCategory = new JLabel("Remaining Budget by Category: ");
       
       // BudgetTotal.setLocation(50, 50);
       // BudgetRemaining.setLocation(500, 500);
        BudgetTotal.setFont(font);
        BudgetRemaining.setFont(font);
        BudgetByCategory.setFont(font);
        RemainingBudgetByCategory.setFont(font);
        
        add(BudgetTotal);
        
        add(BudgetRemaining);
        add(BudgetByCategory);
        add(RemainingBudgetByCategory);
        add(categories);
        
        /* 
       FoodAmount = 0.0;
       LeisureAmount = 0.0;
       RentAmount = 0.0;
    
       FoodTotal = 0.0;
       RentTotal = 0.0;
       LeisureTotal = 0.0;*/
        //BudgetRemaining = new JLabel("Budget Remaining");
        //BudgetTotal = new JLabel("Budget Total");
        
        //FoodAmountLabel = new JLabel(FoodTotal.toString());
        //LeisureAmountLabel = new JLabel(LeisureTotal.toString());
        //RentAmountLabel = new JLabel(RentTotal.toString());
        
        /*FoodLabel = new JLabel("Food Amount Remaining: " + FoodAmount.toString() +
              "\n Total Budget: "+ FoodTotal.toString());
        LeisureLabel = new JLabel("Leisure: ");
        RentLabel = new JLabel("Rent: ");*/
        
        //add(BudgetTotal);
        //add(BudgetRemaining);
        /*add(FoodLabel);
        add(LeisureLabel);
        add(RentLabel);*/
        
       // categoryType = new JLabel("No Category Selected");
       //currentBudget = new JLabel("This is your current budget: " + budgetAmount);
        //currentBudget.setFont(font);
        //currentBudget.setBackground(Color.red);
        //add(currentBudget);
        setBackground(Color.LIGHT_GRAY);
        
        
        //this.add(categoryType, BorderLayout.NORTH);
        //this.add(currentBudget, BorderLayout.NORTH );
        
    }
   public int getArrayIndex()
   {
       
       return  categories.getSelectedIndex();
   }
    
}
