package smclab3n2;
import java.util.*;


/**
 * @inv isEmpty() implies elements.size() == 0
 */
public class StackImp implements Stack {
    private final LinkedList elements = new LinkedList();

    public void push(Object o) {
        if (o != null) {
            elements.add(o);
            System.out.println(o + " Object added");
        } else {
            throw new RuntimeException("");
        }
    }

    public Object pop() {
        final Object popped = top();
        elements.removeLast();
        return popped;
    }

    public Object top() {
        return elements.getLast();
    }

    public boolean isEmpty() {
        return elements.size() == 0;
    }

    public int size() {
        return elements.size();
    }

    public Object peek() {
        return elements.peekLast();
    }

}
