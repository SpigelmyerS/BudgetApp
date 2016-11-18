
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
public class ButtonOptionsPanelController implements ActionListener{
    ButtonOptionsPanel optionsPanel;
    
    public ButtonOptionsPanelController(ButtonOptionsPanel optionsPanel)
    {
        this.optionsPanel = optionsPanel;
    }
   public void AddActionListeners()
   {
        optionsPanel.bills.addActionListener(this);
        optionsPanel.food.addActionListener(this);
        optionsPanel.leisure.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj == optionsPanel.food)
        {
         
        }
        //Buttons will do action here
        //Click of buttons will display different budget category amounts
        
        
        
    }
    
    
    
    
}
