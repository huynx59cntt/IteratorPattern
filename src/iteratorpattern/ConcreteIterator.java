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
public class ConcreteIterator  extends Iterator{

    ConcreteAggregate concreteAggregate;
    int i = 0;
    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

  
    
    @Override
    public int First() {
        i = 0;
        return concreteAggregate.getObject(i);
   }

    @Override
    public int Next() {
        int step = concreteAggregate.getObject(i);
        i++;
        return step;
    }

    @Override
    public boolean IsDone() {
        if(i==concreteAggregate.Cout()){
            return true;
        }
        else return false;
    }

    @Override
    public int CurrentItem() {
        return concreteAggregate.getObject(i);
    }
    
}
