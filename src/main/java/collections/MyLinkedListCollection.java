package collections;

import java.util.*;

public class MyLinkedListCollection<E> extends LinkedList<E> {
    private int count;

    //    public  int getCountOfElement(E element) {
//        int count = 0;
//        for (E e : this) {
//            if (e != null && e.equals(element)) {
//                count++;
//            }
//        }
//        return count;
//    }
    @Override
    public boolean add(E e) {
        if (contains(e))
            count++;
        return super.add(e);
    }

    public int getCountOfDuplicate() {
        return count;
    }
}
