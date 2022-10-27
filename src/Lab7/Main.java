package Lab7;
/*
Core Java
Laboratory work №7
C2 = 215 % 2 = 1 -- Collection implements Set
C3 = 215 % 3 = 2 -- Internal structure of collection is doubly linked list
@author IO-02 Yaroslava Kozhemiako
@date 30.09.2022
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RailroadCar vip1 = new RailroadCar(TypeOfRailroadCar.VIP, 18, 10,3);
        RailroadCar vip2 = new RailroadCar(TypeOfRailroadCar.VIP, 20, 5,2);
        RailroadCar compartment1 = new RailroadCar(TypeOfRailroadCar.COMPARTMENT, 20, 5,2);
        RailroadCar compartment2 = new RailroadCar(TypeOfRailroadCar.COMPARTMENT, 20, 5,2);
        RailroadCar couchette = new RailroadCar(TypeOfRailroadCar.COUCHETTE, 25, 22,1);

        /*
            Create an empty collection and then fill it with the elements
         */
        RailroadCarCollection railroadCarCollection1 = new RailroadCarCollection();
        railroadCarCollection1.add(vip1);
        railroadCarCollection1.add(compartment1);
        railroadCarCollection1.add(compartment2);

        /*
            Create a collection with one object and then fill it with other elements
         */
        RailroadCarCollection railroadCarCollection2 = new RailroadCarCollection(new RailroadCar(TypeOfRailroadCar.COUCHETTE, 25, 22,1));
        railroadCarCollection2.add(couchette);
        railroadCarCollection2.add(vip2);

        /*
            Create a collection from another collection
         */
        RailroadCarCollection railroadCarCollection3 = new RailroadCarCollection(railroadCarCollection1);

        System.out.println("Size of railroadCarCollection2 == " + railroadCarCollection2.size());
        System.out.println("railroadCarCollection2 is empty: " + railroadCarCollection2.isEmpty() + "\nClear railroadCarCollection2");

        railroadCarCollection2.clear();
        System.out.println("railroadCarCollection2 is empty: " + railroadCarCollection2.isEmpty());

        System.out.println("railroadCarCollection1 is consist of: " + Arrays.toString(railroadCarCollection1.toArray()));
        System.out.println("railroadCarCollection1 contains " + vip1 + ": " + railroadCarCollection1.contains(vip1));
        System.out.println("railroadCarCollection1 contains " + vip2 + ": " + railroadCarCollection1.contains(vip2));

        railroadCarCollection1.add(vip2);
        System.out.println("Size of railroadCarCollection1 == " + railroadCarCollection1.size());

        railroadCarCollection1.remove(vip2);
        System.out.println("Size of railroadCarCollection1 == " + railroadCarCollection1.size());

        System.out.println("railroadCarCollection3 is consist of elements from railroadCarCollection1: " + railroadCarCollection3.containsAll(railroadCarCollection1));

        System.out.println("Size of railroadCarCollection3 before adding railroadCarCollection1 to the collection: " + railroadCarCollection3.size());
        railroadCarCollection3.addAll(railroadCarCollection1);
        System.out.println("Size of railroadCarCollection3 after adding railroadCarCollection1 to the collection: " + railroadCarCollection3.size());
        railroadCarCollection2.add(couchette);
        railroadCarCollection2.add(vip2);
        railroadCarCollection3.addAll(railroadCarCollection2);
        System.out.println("Size of railroadCarCollection3 after adding railroadCarCollection2 to the collection: " + railroadCarCollection3.size());

        System.out.println("3 - " + Arrays.toString(railroadCarCollection3.toArray()));
        System.out.println("2 - " + Arrays.toString(railroadCarCollection2.toArray()));
        railroadCarCollection2.retainAll(railroadCarCollection3);
        System.out.println(Arrays.toString(railroadCarCollection3.toArray()));
        System.out.println(Arrays.toString(railroadCarCollection2.toArray()));

    }
}
