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
    CurrentBudgetPanel budgetPanel;
    Double amountExpended;
    EnterAnExpenseCntl( EnterAnExpense Expense, CurrentBudgetPanel budgetPanel){
    
       this.Expense = Expense;
       this.budgetPanel = budgetPanel;
       
       
       
       
        
         Expense.btnSubmit.addActionListener(this);
         Expense.foodButton.addActionListener(this);
         Expense.rentButton.addActionListener(this);
         Expense.leisureButton.addActionListener(this);
         
         
    }
    
    public void actionPerformed(ActionEvent d)
    {
        Object obj = d.getSource();
        
       /* if(obj ==  Expense.btnSubmit && Expense.foodButton.isSelected())
        { 
            System.out.println("Button operational");

            
            amountExpended = Double.parseDouble(Expense.amountField.getText()); 
            budgetPanel.FoodAmount = budgetPanel.FoodAmount - amountExpended; 
            budgetPanel.FoodLabel.setText("Food Amount Remaining: " + budgetPanel.FoodAmount.toString() +
           "\n Total Budget: " + budgetPanel.FoodTotal.toString());           
        }
         if(obj ==  Expense.btnSubmit && Expense.leisureButton.isSelected())
        { 
            amountExpended = Double.parseDouble(Expense.amountField.getText());
            budgetPanel.LeisureAmount = budgetPanel.LeisureAmount - amountExpended; 
            budgetPanel.LeisureLabel.setText("Leisure Amount Remaining: " + budgetPanel.LeisureAmount.toString() +
           "\n Total Budget: " + budgetPanel.LeisureTotal.toString());
        }
         if(obj ==  Expense.btnSubmit && Expense.rentButton.isSelected())
        { 
             amountExpended = Double.parseDouble(Expense.amountField.getText()); 
              budgetPanel.RentAmount = budgetPanel.RentAmount - amountExpended; 
            budgetPanel.RentLabel.setText("Rent Amount Remaining: " + budgetPanel.RentAmount.toString() +
           "\n Total Budget: " + budgetPanel.RentTotal.toString());
        }*/

            }
    
    }
    


  

