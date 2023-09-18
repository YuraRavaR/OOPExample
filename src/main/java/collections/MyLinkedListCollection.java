package collections;

import java.util.*;

public class MyLinkedListCollection<E> extends LinkedList<E> {

    public  int getCountOfElement(E element) {
        int count = 0;
        for (E e : this) {
            if (e != null && e.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
