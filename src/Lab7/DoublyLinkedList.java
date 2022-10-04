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
            if (currentNode.data == railroadCar){
                if(currentNode != head){
                    currentNode.data = currentNode.previous.data;
                    currentNode.previous.next = currentNode.next;
                    currentNode.previous = currentNode.previous.previous;
                    if (currentNode.next != null) currentNode.next.previous = currentNode.previous;
                } else {
                        currentNode.data = currentNode.next.data;
                        currentNode.next.previous = null;
                        currentNode.next = currentNode.next.next;
                }

            }
            currentNode = currentNode.next;
        }
    }

//    public void printNodes() {
//        //Node current will point to head
//        Node current = head;
//        if(head == null) {
//            System.out.println("Doubly linked list is empty");
//            return;
//        }
//        System.out.println("Nodes of doubly linked list: ");
//        while(current != null) {
//            //Print each node and then go to next.
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        //create a DoublyLinkedList object
//        DoublyLinkedList dl_List = new DoublyLinkedList();
//        //Add nodes to the list
//        dl_List.add(10);
//        dl_List.add(20);
//        dl_List.add(30);
//        dl_List.add(40);
//        dl_List.add(50);
//        dl_List.delete(10);
//
//        //print the nodes of DoublyLinkedList
//        dl_List.printNodes();
//    }
}
