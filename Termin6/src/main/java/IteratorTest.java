import java.util.Iterator;

public class IteratorTest {
    public static class Node<T> {
        public Node<T> next;
        public T value;
    }

    public static class MyList implements Iterable<String> {
        public Node<String> myListStartNode;


        public Iterator<String> iterator() {
            return new Iterator<String>() {
                private Node<String> iteratorStartNode = myListStartNode;

                public boolean hasNext() {
                    return iteratorStartNode != null && iteratorStartNode.next != null;
                }

                public String next() {
                    iteratorStartNode = iteratorStartNode.next;
                    return iteratorStartNode.value;
                }

                public void remove() {

                }
            };
        }
    }

}
