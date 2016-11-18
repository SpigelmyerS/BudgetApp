
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javax.swing.DefaultComboBoxModel;

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
   private EnterABudget enterBudget;
   private CurrentBudgetPanel budgetPanel;
   private EnterABudgetModel budgetModel;
   public Double amountValue;
   private ArrayList<Double> overallBudgetAmounts;
   //public double budgetSum;
   private int sumIterator = 0;
   
                   private double oldvalue = 0;
    
    EnterABudgetController(EnterABudget enterBudget, CurrentBudgetPanel budgetPanel, EnterABudgetModel budgetModel)
    {
       this.enterBudget = enterBudget;
       this.budgetPanel = budgetPanel;
       this.budgetModel = budgetModel;
       
        budgetPanel.categories.setModel(new DefaultComboBoxModel(budgetModel.Modelcategories.toArray()));
        enterBudget.budgetCategories.setModel(new DefaultComboBoxModel(budgetModel.Modelcategories.toArray()));
        
        overallBudgetAmounts = new ArrayList<Double>();
        
        
         enterBudget.btnSubmit.addActionListener(this);
         enterBudget.foodButton.addActionListener(this);
         enterBudget.rentButton.addActionListener(this);
         enterBudget.leisureButton.addActionListener(this);
         
         enterBudget.budgetCategories.addActionListener(this);
    }
    
    public String CheckForMoneyAmount()
    {
       
         try
                {
                    
                    amountValue = Double.parseDouble( EnterABudget.amountField.getText());
                    //overallBudgetAmounts.add(amountValue); 
               
            if(overallBudgetAmounts.size()<enterBudget.budgetCategories.getItemCount() && overallBudgetAmounts.isEmpty())
                    {
                        for(int i = 0; overallBudgetAmounts.size() < enterBudget.budgetCategories.getItemCount(); i++)
                        {
                            overallBudgetAmounts.add(i, 0.0);
                            System.out.println(overallBudgetAmounts.get(i));
                        }
                       
                //budgetPanel.categories.getSelectedIndex();
                      int index = enterBudget.budgetCategories.getSelectedIndex();
                      overallBudgetAmounts.remove(index);
                      overallBudgetAmounts.add(index, amountValue);
                      System.out.println("Index replaced");
                      
                      
                    }

             else
                    {
                        int index =enterBudget.budgetCategories.getSelectedIndex();
                        overallBudgetAmounts.remove(index);
                        overallBudgetAmounts.add(index, amountValue);
                        System.out.println("Thing worked yay");
                        for(int i = 0; i < overallBudgetAmounts.size(); i++)
                        {
                            System.out.println(overallBudgetAmounts.get(i));
                        }
                    }
                
                double budgetSum = 0;    
                    for (sumIterator = 0;sumIterator < overallBudgetAmounts.size(); sumIterator++)
                    {
                        
                        
                        budgetSum += overallBudgetAmounts.get(sumIterator);
                    }
                    
                    //budgetPanel.budgetAmount = ;
                    budgetPanel.BudgetTotal.setText("Overall Budget: " + Double.toString(budgetSum));
                    
                  return budgetPanel.BudgetTotal.getText();
                    
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
        
        if(obj == enterBudget.btnSubmit && enterBudget.budgetCategories.getSelectedIndex() > -1)
        { 
            System.out.println("Button operational");
            System.out.println(enterBudget.budgetCategories.getSelectedItem() + " is selected");
            
           CheckForMoneyAmount();
              
            // amountValue = Double.parseDouble( EnterABudget.amountField.getText());

        //budgetPanel.currentBudget.getText();
           
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
        else
        {
            System.out.println("Something went wrong");
            
            /*Alert failed = new Alert(Alert.AlertType.ERROR);
            failed.setContentText("Please enter a proper amount or make sure a category is selected.");
            failed.setHeaderText("Budget Error");
            
            ButtonType btnOkay = new ButtonType("Okay", ButtonBar.ButtonData.OK_DONE);
            
           failed.getButtonTypes().setAll(btnOkay);
                    Optional<ButtonType> selection = failed.showAndWait();
                    if(selection.get() == btnOkay)
                    {
                        failed.close();

                    }*/
        }
       /* if(obj ==  enterBudget.btnSubmit && enterBudget.leisureButton.isSelected())
        {
            amountValue = Double.parseDouble( EnterABudget.amountField.getText());
              
             budgetPanel.LeisureTotal = amountValue;
             budgetPanel.LeisureAmount = amountValue;
             budgetPanel.LeisureLabel.setText("Leisure Amount Remaining: " + budgetPanel.LeisureAmount.toString() +
              "\n Total Budget: "+ budgetPanel.LeisureTotal.toString());
        }
        if(obj ==  enterBudget.btnSubmit && enterBudget.rentButton.isSelected())
        {
            amountValue = Double.parseDouble( EnterABudget.amountField.getText());
              
            budgetPanel.RentTotal = amountValue;
            budgetPanel.RentAmount = amountValue;
            budgetPanel.RentLabel.setText("Rent Amount Remaining: " + budgetPanel.RentAmount.toString() +
              "\n Total Budget: "+ budgetPanel.RentTotal.toString());
            System.out.println("Rent Button working");
            //CheckForMoneyAmount();
        }
        
        if(obj == enterBudget.btnSubmit && !enterBudget.foodButton.isSelected()
                && !enterBudget.leisureButton.isSelected() && !enterBudget.rentButton.isSelected())
        {
            System.out.println("No category selected, please select a category");
        }*/

            }
    
    }
    

