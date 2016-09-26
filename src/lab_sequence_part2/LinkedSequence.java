/*
 * To change this license firster, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_sequence_part2;

/**
 *
 * @author thnom
 */
public class LinkedSequence<E> implements Sequence<E> {

    DLLNode<E> first;
    DLLNode<E> last;
    private int size;

    public LinkedSequence() {
        this.size = 0;
    }

    /**
     * Returns the number of elements in this Sequence object.
     *
     * @return the number of elements in this Sequence object.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Appends a specified element to this Sequence object.
     *
     * @param element - the element to be inserted at the end of this Sequence
     * object.
     */
    @Override
    public void append(E element) {

        DLLNode<E> newNode = new DLLNode<E>(element);
        if (last == null) {
            first = newNode;
            last = newNode;
            newNode.setSucc(null);
            newNode.setPred(null);
            size++;
        } else {
            newNode.setPred(last);
            last.setSucc(newNode);
            last = newNode;
            size++;
        }

    }

    /**
     * Returns the element at a specified index in this Sequence object.
     *
     * @param k - the index of the element returned.
     *
     * @return the element at index k in this Sequence object.
     *
     * @throws IndexOutOfBoundsException - if k is either negative or greater
     * than or equal to the number of elements in this Sequence object.
     */
    @Override
    public E get(int k) {
        DLLNode<E> element = first;

        for (int i = 0; i < k; i++) {
            element = element.getSucc();

        }
        return element.getElement();
    }

    /**
     * Changes the element at a specified index in this Sequence object.
     *
     * @param k - the index of the element required.
     * @param newElement - the element to replace the element at index k in this
     * Sequence object.
     *
     * @throws IndexOutOfBoundsException - if k is either negative or greater
     * than or equal to the number of elements in this Sequence object.
     */
    @Override
    public void set(int k, E newElement) {
        DLLNode<E> element = first;

        for (int i = 0; i < k; i++) {
            element = element.getSucc();

        }
        element.setElement(newElement);
    }

    public void display() {
        DLLNode<E> temp = first;
        while (temp != null) {
            System.out.print(temp.getElement() + " ");
            temp = temp.getSucc();
        }
    }
}
