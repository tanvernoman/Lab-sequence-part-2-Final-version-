/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_sequence_part2;

/**
 *
 * @author thnom
 */
public interface Sequence<E> {

    /**
     * Appends a specified element to this Sequence object.
     *
     * @param element - the element to be inserted at the end of this Sequence
     * object.
     */
    void append(E element);

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
    E get(int k);

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
    void set(int k, E newElement);

    /**
     * Returns the number of elements in this Sequence object.
     *
     * @return the number of elements in this Sequence object.
     */
    int size();

    void display();
    
}
