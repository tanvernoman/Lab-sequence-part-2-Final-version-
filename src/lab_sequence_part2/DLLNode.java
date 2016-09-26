/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_sequence_part2;

/**
 *
 * @author thnom
 * @param <E>
 */
public class DLLNode<E> {

    
    protected E element;
    protected DLLNode<E> pred, succ;

    public DLLNode(E element) {
        this(element,null,null);
    }

    public DLLNode(E elem, DLLNode<E> pred, DLLNode<E> succ) {
        this.element = elem;
        this.pred = pred;
        this.succ = succ;
    }

    public E getElement() {
        return element;
    }
    


    public void setElement(E element) {
        this.element = element;
    }

    public DLLNode<E> getPred() {
        return pred;
    }

    public void setPred(DLLNode<E> pred) {
        this.pred = pred;
    }

    public DLLNode<E> getSucc() {
        return succ;
    }

    public void setSucc(DLLNode<E> succ) {
        this.succ = succ;
    }

}
