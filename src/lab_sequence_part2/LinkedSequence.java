/*
 * To change this license firster, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_sequence_part2;

/**
 *
 * @author thnom
 * @param <E>
 */
public class LinkedSequence<E> implements Sequence<E> {

    DLLNode<E> first;
    DLLNode<E> last;
    private int size;

    public LinkedSequence() {
        this.size = 0;
        first = null;
        last = null;
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

        for (int i = 1; i < k; i++) {
            // if (i == k) {
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

        for (int i = 1; i < k; i++) {
            element = element.getSucc();

        }
        element.setElement(newElement);
    }

    /**
     * Inserts the specified element at the specified position in this sequence.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * @param k - the index at which the element is to be inserted.
     * @param element - the element to be inserted.
     *
     * @throws IndexOutOfBoundsException - if k is either negative or greater
     * than the number of elements in this Sequence object.
     */
    @Override
    public void add(int k, E element) {

        DLLNode<E> current = first;
        for (int i = 1; i < k-1; i++) {
            current = current.getSucc();
            if (current == null) {
                System.out.println("place is null");
            }
        }
        DLLNode<E> newNode = new DLLNode<E>(element);

        if (current == last) {
            newNode.setSucc(null);
            last = newNode;
            size++;
        } else {
            newNode.setSucc(current.getSucc());
            //newNode.setPred(current.getPred());
            size++;
        }
        newNode.setPred(current);
        current.setSucc(newNode);
    }

    /**
     * Removes the element at a specified index in this Sequence object and
     * returns it. Shifts any subsequent elements to the left (subtracts one
     * from their indices).
     *
     * @param k - the index of the element to be removed.
     *
     * @return the element that was at index k in this Sequence object.
     *
     * @throws IndexOutOfBoundsException - if k is either negative or greater
     * than or equal to the number of elements in this Sequence object.
     */
    @Override
    public E remove(int k) {
        DLLNode<E> next = first;

        for (int i = 1; i < k; i++) {
            next = next.getSucc();

        }
        DLLNode<E> pre = next.getPred();
        DLLNode<E> succ = next.getSucc();
        if (pre != null) {
            next.setPred(pre);
        }

        if (succ != null) {
            pre.setSucc(succ);
        } else {
            pre.setSucc(null);
        }
        size--;
        return (E) this;
    }

    /**
     * Returns true if this Sequence object contains one or more elements equal
     * to the given Object, otherwise returns false.
     *
     * @param obj - the object to search for.
     *
     * @return the true if the object is present, false if not.
     *
     */
    @Override
    public boolean contains(Object obj) {
        DLLNode<E> next = first;
        for (int i = 0; i < size; i++) {
            if (next.getElement().equals(obj)) {
                return true;
            }
            next = next.getSucc();

        }

        return false;
    }

    @Override

    public void display() {
        DLLNode<E> temp = first;
        while (temp != null) {
            System.out.print(temp.getElement() + " ");
            temp = temp.getSucc();
        }
        //System.out.println("------------------");
    }
}
