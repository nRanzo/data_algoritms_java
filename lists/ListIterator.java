package lists;

/**
 * HListIterator interface that defines the methods of a list iterator.
 * Extends the HIterator interface and adds operations specific to forward and backward iteration in a list.
 */
public interface ListIterator<E> extends Iterable<E> {

    /**
     * Inserts the specified element into the list immediately before the element that would
     * be returned by the next call to {@code next()}.
     *
     * @param o the element to insert
     * @throws ArrayIndexOutOfBoundsException if an exception occurs during the operation
     */
    void add(E o) throws ArrayIndexOutOfBoundsException;

    /**
     * Checks if there is a previous element in the list.
     *
     * @return true if there is a previous element, otherwise false
     */
    boolean hasPrevious();

    /**
     * Checks if there is a following element in the list.
     *
     * @return true if there is a following element, otherwise false
     */
    boolean hasNext();

    /**
     * Returns the index of the element that would be returned by the next call to {@code next()}.
     *
     * @return the index of the next element
     */
    int nextIndex();

    /**
     * Returns the previous element in the list and moves the iterator backward.
     *
     * @return the previous element in the list
     * @throws ArrayIndexOutOfBoundsException if an exception occurs during the operation
     */
    E previous() throws ArrayIndexOutOfBoundsException;

    /**
     * Returns the following element in the list and moves the iterator backward.
     *
     * @return the following element in the list
     * @throws ArrayIndexOutOfBoundsException if an exception occurs during the operation
     */
    E next() throws ArrayIndexOutOfBoundsException;

    /**
     * Returns the index of the element that would be returned by the next call to {@code previous()}.
     *
     * @return the index of the previous element
     */
    int previousIndex();

    /**
     * Replaces the last element returned by the iterator with the specified element.
     *
     * @param o the new element to set
     * @throws ArrayIndexOutOfBoundsException if an exception occurs during the operation
     */
    void set(E o) throws ArrayIndexOutOfBoundsException;

}
