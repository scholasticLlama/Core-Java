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
        RailroadCarCollection railroadCarCollection1 = new RailroadCarCollection();
        RailroadCar vip1 = new RailroadCar(TypeOfRailroadCar.VIP, 18, 10,3);
        RailroadCar vip2 = new RailroadCar(TypeOfRailroadCar.VIP, 20, 5,2);
        RailroadCar couchette = new RailroadCar(TypeOfRailroadCar.COUCHETTE, 25, 22,1);
        railroadCarCollection1.add(vip1);
        railroadCarCollection1.add(couchette);
        RailroadCarCollection railroadCarCollection2 = new RailroadCarCollection(new RailroadCar(TypeOfRailroadCar.COUCHETTE, 25, 22,1));
        railroadCarCollection2.add(couchette);
        //RailroadCarCollection railroadCarCollection3 = new RailroadCarCollection(railroadCarCollection1);

        System.out.println(railroadCarCollection1.size());
        System.out.println(Arrays.toString(railroadCarCollection1.toArray()));

        railroadCarCollection1.addAll(railroadCarCollection2);

        System.out.println(railroadCarCollection1.size());
        System.out.println(Arrays.toString(railroadCarCollection1.toArray()));

        railroadCarCollection1.removeAll(railroadCarCollection2);

        System.out.println(railroadCarCollection1.size());
        System.out.println(Arrays.toString(railroadCarCollection1.toArray()));

//        railroadCarCollection1.remove(new RailroadCar(TypeOfRailroadCar.VIP, 18, 10,3));
//
//        System.out.println(railroadCarCollection1.size());
//        System.out.println(Arrays.toString(railroadCarCollection1.toArray()));
//
//        railroadCarCollection1.addAll(railroadCarCollection2);
//
//        System.out.println(railroadCarCollection1.size());
//        System.out.println(Arrays.toString(railroadCarCollection1.toArray()));
//
//        System.out.println(railroadCarCollection1.isEmpty());
//
//        railroadCarCollection1.removeAll(railroadCarCollection2);
//
//        System.out.println(railroadCarCollection1.size());
//        System.out.println(Arrays.toString(railroadCarCollection1.toArray()));

    }
}
