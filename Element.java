package MyLinkedList;

public class Element {
    private Object data;
    private Element next;
    private Element previous;
    
    public Element(Object data){
        this.data = data;

    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public Element getNext() {
        return next;
    }
    public void setNext(Element next) {
        this.next = next;
    }
    public Element getPrevious() {
        return previous;
    }
    public void setPrevious(Element previous) {
        this.previous = previous;
    }
}
