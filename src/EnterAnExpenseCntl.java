/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author garrettm.miller
 */
public class EnterAnExpenseCntl implements ActionListener{
    EnterAnExpense Expense;
    CurrentBudgetPanel Panel;
    
    EnterAnExpenseCntl( EnterAnExpense Expense, CurrentBudgetPanel Panel){
    
       this.Expense = Expense;
       this.Panel = Panel;
      
       
        
         Expense.btnSubmit.addActionListener(this);
         Expense.foodButton.addActionListener(this);
         Expense.rentButton.addActionListener(this);
         Expense.leisureButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        
        if(obj ==  Expense.btnSubmit)
        { 
            System.out.println("Button operational");
           
                try
                {
                    Double amountValue;
                    amountValue = Double.parseDouble( EnterABudget.amountField.getText()); 
                    Panel.budgetAmount = amountValue.toString();
                    Panel.currentBudget.setText("This is your current budget: " + Panel.budgetAmount);
                  
                    
                }
                catch(Exception exec)
                {
                    
                    System.out.println("Please enter an amount");
                    
                }
        }
            if(obj ==  Expense.foodButton)
            {
                System.out.println("Food Selected");
            }
             if(obj ==  Expense.leisureButton)
            {
                System.out.println("Leisure Selected");
            }
              if(obj ==  Expense.rentButton)
            {
                System.out.println("Rent Selected");
            }

            }
    
    }
    


  

