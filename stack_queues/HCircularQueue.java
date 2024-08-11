public interface HCircularQueue<E> extends HQueue<E> {
    /**
     * Moves its initial element to the end of the queue. If the queue is empty it does nothing.
     * It's way more efficient rather than calling Q.enqueue(Q.dequeue()) to obtain the same result.
     */
    void rotate();
}
