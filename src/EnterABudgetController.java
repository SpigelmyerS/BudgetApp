
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
public class EnterABudgetController implements ActionListener {
   EnterABudget enterBudget;
   CurrentBudgetPanel budgetPanel;
    
    EnterABudgetController(EnterABudget enterBudget, CurrentBudgetPanel budgetPanel)
    {
       this.enterBudget = enterBudget;
       this.budgetPanel = budgetPanel;
      
       
        
         enterBudget.btnSubmit.addActionListener(this);
         enterBudget.foodButton.addActionListener(this);
         enterBudget.rentButton.addActionListener(this);
         enterBudget.leisureButton.addActionListener(this);
    }
    
    public String CheckForMoneyAmount()
    {
         try
                {
                    Double amountValue;
                    amountValue = Double.parseDouble( EnterABudget.amountField.getText()); 
                    budgetPanel.budgetAmount = amountValue.toString();
                    budgetPanel.currentBudget.setText("This is your current budget: " + budgetPanel.budgetAmount);
                  return budgetPanel.currentBudget.getText();
                    
                }
                catch(Exception exec)
                {
                    
                    System.out.println("Please enter an amount");
                   return "Please enter an amount"; 
                }
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        
        if(obj ==  enterBudget.btnSubmit)
        { 
            System.out.println("Button operational");
            
           CheckForMoneyAmount();
             /**   try
                {
                    Double amountValue;
                    amountValue = Double.parseDouble( EnterABudget.amountField.getText()); 
                    budgetPanel.budgetAmount = amountValue.toString();
                    budgetPanel.currentBudget.setText("This is your current budget: " + budgetPanel.budgetAmount);
                  
                    
                }
                catch(Exception exec)
                {
                    
                    System.out.println("Please enter an amount");
                    
                }**/
        }
            if(obj ==  enterBudget.foodButton)
            {
                System.out.println("Food Selected");
            }
             if(obj ==  enterBudget.leisureButton)
            {
                System.out.println("Leisure Selected");
            }
              if(obj ==  enterBudget.rentButton)
            {
                System.out.println("Rent Selected");
            }

            }
    
    }
    

