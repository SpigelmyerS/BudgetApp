/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MainView mv = new MainView();
        
        ViewNavigationController viewNav = new ViewNavigationController();
        EnterABudgetController budgetController = new EnterABudgetController(viewNav.mainView.enterBudget, viewNav.mainView.budgetPane.currentBudgetPanel);
        
        //JSONObject obj = new JSONObject();
        
        
    }
    
}
