
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
public class ReportViewController implements ActionListener{
    
    EnterAnExpense expense;
    ReportView reportView;
    ReportViewController(EnterAnExpense expense, ReportView reportView)
    {
        super();
        this.expense = expense;
        this.reportView = reportView; 
        
        
    }
    
    public void actionPerformed(ActionEvent d)
    {
        Object obj = d.getSource();
      if (obj == expense.btnSubmit)
      {
        reportView.expenseList.append(expense.DescriptionField.getText());  
        reportView.expenseList.setText(reportView.expenseList.getText());
      }
        
    }
    
}
