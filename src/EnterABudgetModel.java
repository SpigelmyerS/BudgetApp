
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suzanne
 */
public class EnterABudgetModel {
    public double OverallBudget;
    public ArrayList<String> Modelcategories = new ArrayList<String>();
    
    public EnterABudgetModel()
    {
    Modelcategories.add("Food");
    Modelcategories.add("Leisure");
    Modelcategories.add("Bills");
    
    }
    
    public double getBudgetOverall(double budget)
    {
        return budget; 
    }
    public ArrayList<String> getCategories(ArrayList<String> categories)
    {
        return Modelcategories;
    }
    public void addCategories(String newCategory)
    {
        Modelcategories.add(newCategory);
        
    }
    
}
