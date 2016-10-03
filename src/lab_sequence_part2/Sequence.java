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
    void add(int k, E element);

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

    E remove(int k);

    /**
     * Returns true if this Sequence object contains one or more elements equal
     * to the given Object, otherwise returns false.
     *
     * @param obj - the object to search for.
     *
     * @return the true if the object is present, false if not.
     *
     */

    boolean contains(Object obj);

    void display();

}
