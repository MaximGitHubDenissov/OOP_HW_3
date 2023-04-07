package MyLinkedList;

import java.util.Iterator;

public class MyLinkedList implements Iterable<Object>{
    private Element first;
    private Element second;
    int size = 0;
    
    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            Element elmzero = new Element("0");
            {
                elmzero.setNext(first);
            }
            Element current = elmzero;
            @Override
            public boolean hasNext() {
                return current.getNext() != null;
            }
            @Override
            public Object next() {
                current = current.getNext();
                return current.getData();
            }
        };
    }
    public void add (Object item){
        size++;
        Element elm = new Element(item);
        if (first == null){
            first = elm;
            second = elm;
        }
        if (second == null){
            second = elm;
        }
        second.setNext(elm);
        elm.setPrevious(second);
        second = elm;
    }
}
