package Lab7;

public class DoublyLinkedList {
    private Node head, tail;

    public Node getHead(){
        return head;
    }


    public void add(RailroadCar railroadCar) {
        Node newNode = new Node(railroadCar);
        if (head == null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void delete(RailroadCar railroadCar) {
        Node currentNode = head;
        while(currentNode != null){
            if (currentNode.data.equals(railroadCar)){
                if(currentNode != head){
                    currentNode.data = currentNode.previous.data;
                    currentNode.previous.next = currentNode.next;
                    currentNode.previous = currentNode.previous.previous;
                    if (currentNode.next != null) currentNode.next.previous = currentNode.previous;
                } else {
                        if (currentNode.next != null) {
                            currentNode.data = currentNode.next.data;
                            currentNode.next.previous = null;
                            currentNode.next = currentNode.next.next;
                        } else{
                            head = null;
                        }
                }

            break;
            }
            currentNode = currentNode.next;
        }
    }

}
