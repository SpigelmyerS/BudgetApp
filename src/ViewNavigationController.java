
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
public class ViewNavigationController implements ActionListener {
       MainView mainView = new MainView();
    
    
    
    ViewNavigationController()
    {
        
    //AddActionListeners();    
        mainView.nav.btnHome.addActionListener(this);
        mainView.nav.btnEnterBudget.addActionListener(this);
        mainView.nav.btnEnterExpense.addActionListener(this);
        mainView.nav.btnViewReport.addActionListener(this);
        
    }
    
    public void RemovePanels()
    {
        
        mainView.remove(mainView.enterBudget);
        mainView.remove(mainView.titlePane);
        mainView.remove(mainView.currentBudgetPanel);
        mainView.remove(mainView.Expense);
        mainView.remove(mainView.reportView);
        //mainView.remove(mainView)
        mainView.repaint();
        mainView.revalidate();
        
    }
    //public void AddActionListeners()
    //{
        
    //}
    
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj == mainView.nav.btnHome)
        {
            RemovePanels();
            mainView.add(mainView.currentBudgetPanel);
            
            mainView.repaint();
            mainView.revalidate();
        }
        if (obj == mainView.nav.btnEnterBudget)
        {
            RemovePanels();
            mainView.add(mainView.enterBudget, "Center");
            
            mainView.repaint();
            mainView.revalidate();
            
        }
        if (obj == mainView.nav.btnEnterExpense)
        {
            RemovePanels();
            mainView.add(mainView.Expense,"Center");

            mainView.repaint();
            mainView.revalidate();
        }
        if (obj == mainView.nav.btnViewReport)
        {
            RemovePanels();
            mainView.add(mainView.reportView, "Center");
            
            mainView.repaint();
            mainView.revalidate();
        }
        
        
    }
    
}
