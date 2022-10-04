package Lab7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class RailroadCarCollection implements Set<RailroadCar> {

    private DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    private int size = 0;

    public RailroadCarCollection() {
    }

    public RailroadCarCollection(RailroadCar railroadCar) {
        add(railroadCar);
    }

    public RailroadCarCollection(Collection<? extends RailroadCar> railroadCars) {
        addAll(railroadCars);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node currentNode = doublyLinkedList.getHead();
        while (currentNode != null) {
            RailroadCar c = (RailroadCar) o;
            System.out.println(currentNode.data + c.toString());
            System.out.println((currentNode.data.amountOfPassengers == c.amountOfPassengers) && (currentNode.data.amountOfLuggage == c.amountOfLuggage) && (currentNode.data.levelOfComfort == c.levelOfComfort));
            if (currentNode.data == o) {
                System.out.println(currentNode.data);
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public Iterator<RailroadCar> iterator() {
        return new RailroadCarIterator();
    }

    @Override
    public Object[] toArray() {
        int i = 0;
        Object[] array = new Object[size];
        Iterator<RailroadCar> iterator = iterator();
        boolean flag = iterator.hasNext();
        while (flag){
            array[i] = iterator.next();
            i++;
            flag = iterator.hasNext();
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(RailroadCar railroadCar) {
        if (!contains(railroadCar)) {
            doublyLinkedList.add(railroadCar);
            size++;
            return contains(railroadCar);
        } else return false;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            doublyLinkedList.delete((RailroadCar) o);
            size--;
            return contains(o);
        } else return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<RailroadCar> iterator = (Iterator<RailroadCar>) c.iterator();
        while (iterator.hasNext()) {
            if (!contains(iterator.next())) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends RailroadCar> c) {
        if (!containsAll(c)) {
            for (RailroadCar railroadCar : c) {
                add(railroadCar);
            }
            return containsAll(c);
        } else return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (RailroadCar currentRailroadCar : this) {
            if (!c.contains(currentRailroadCar)) remove(currentRailroadCar);
        }
        return c.containsAll(this);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object railroadCar : c) {
            remove(railroadCar);
        }
        return containsAll(c);
    }

    @Override
    public void clear() {
        doublyLinkedList = new DoublyLinkedList();
    }

    @Override
    public Spliterator<RailroadCar> spliterator() {
        return Set.super.spliterator();
    }

    class RailroadCarIterator implements Iterator {

        private Node currentNode = doublyLinkedList.getHead();

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public RailroadCar next() {
            //System.out.println(hasNext() + currentNode.data.toString() + currentNode.next);
            RailroadCar railroadCar = currentNode.data;
            currentNode = currentNode.next;
            return railroadCar;
        }

        @Override
        public void remove() {
            doublyLinkedList.delete(currentNode.data);
        }
    }
}
