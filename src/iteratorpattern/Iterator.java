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
public abstract class Iterator {
    public abstract int First();
    public abstract int Next();
    public abstract boolean IsDone();
    public abstract int CurrentItem();
}
