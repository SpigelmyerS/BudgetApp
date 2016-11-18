


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
        /*  BufferedWriter output = null;
        try {
        File file = new File("example.txt");
        output = new BufferedWriter(new FileWriter(file));
        output.write();
        } catch ( IOException e ) {
        e.printStackTrace();
        } finally {
        if ( output != null ) {
        output.close();
        }
        } */

        
        
        ViewNavigationController viewNav = new ViewNavigationController();
        EnterABudgetModel budgetModel = new EnterABudgetModel();
        EnterABudgetController budgetController = new EnterABudgetController(viewNav.mainView.enterBudget, viewNav.mainView.currentBudgetPanel, budgetModel);
        EnterAnExpenseCntl enterExpenseController = new EnterAnExpenseCntl(viewNav.mainView.Expense, viewNav.mainView.currentBudgetPanel);
        
        //JSONObject obj = new JSONObject();
        //Checkmethod();
        
    }


}
