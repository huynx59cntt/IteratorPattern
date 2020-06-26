/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

/**
 *
 * @author asus
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();
        Iterator i = ca.CreateIretator();
        int k = i.First();
        while(!i.IsDone()){
        k = i.CurrentItem();
        i.Next();
        System.out.println(k);
        }  
    }

 
    
}
