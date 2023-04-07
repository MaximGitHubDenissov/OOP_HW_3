package MyLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add("5");
        ml.add(6);
        ml.add(5.6);
        ml.add("Первый");
        ml.add ("Второй");
// Первый способ
        for (Object item : ml) {
            System.out.println(item);
            
        }
// Второй способ через итератор        
        Iterator<Object> iter = ml.iterator();
        while(iter.hasNext()){
            var elm = iter.next();
            System.out.println(elm);
        }
    }
    
}
