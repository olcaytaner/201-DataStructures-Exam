package List;

public class DoublyLinkedList extends LinkedList{

    public void insertLast(DoublyNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        newNode.setPrevious((DoublyNode) tail);
        tail = newNode;
    }

    public void deleteLast(){
        tail = ((DoublyNode)tail).getPrevious();
        if (tail != null){
            tail.setNext(null);
        } else {
            head = null;
        }
    }

    DoublyLinkedList[] divideList(int k){
        return null;
    }

    DoublyLinkedList getEvenOnes(){
        return null;
    }

    public boolean isPalindrom(){
        return false;
    }

    void removeKthBeforeLast(int K){
    }

    public void reverse(){
    }

    public DoublyLinkedList sortElements(){
        return null;
    }
}
