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
public class ConcreteAggregate extends Aggregate{

    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    
    @Override
    public Iterator CreateIretator() {
        return new ConcreteIterator(this);
    }
   
    public int Cout(){
        return arr.length;
    }
   public int getObject(int i){
        return arr[i];
   }
    
}
