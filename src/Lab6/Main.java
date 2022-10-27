package Lab6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int minAmountOfPassengers = 10;
        int maxAmountOfPassengers = 30;
        int commonAmountOfPassengers = 0;
        int commonAmountOfLuggage = 0;

        VIP[] vips = {
                new VIP(10, 22, 3),
                new VIP(5, 10, 2)
        };
        Compartment[] compartments = {
                new Compartment(30, 40, 2),
                new Compartment(25, 10, 1),
                new Compartment(35, 20, 3)
        };
        Couchette[] couchettes = {
                new Couchette(40, 50, 6),
                new Couchette(50, 20, 5),
                new Couchette(40, 10, 4)
        };

        ArrayList<RailroadCar> train = new ArrayList<RailroadCar>();
        train.addAll(Arrays.asList(vips));
        train.addAll(Arrays.asList(compartments));
        train.addAll(Arrays.asList(couchettes));

        System.out.println("Railroad cars with specified amount of passengers: min = " + minAmountOfPassengers + ", max = " + maxAmountOfPassengers + ".");
        for (RailroadCar railroadCar : train) {
            commonAmountOfPassengers += railroadCar.getAmountOfPassengers();
            commonAmountOfLuggage += railroadCar.getAmountOfLuggage();
            if (railroadCar.getAmountOfPassengers() >= minAmountOfPassengers && railroadCar.getAmountOfPassengers() <= maxAmountOfPassengers) {
                System.out.println(railroadCar);
            }
        }
        System.out.println("\nCommon amount of passengers: " + commonAmountOfPassengers + ".");
        System.out.println("Common amount of luggage: " + commonAmountOfLuggage + ".");

        Arrays.sort(vips, new ComfortComparator());
        Arrays.sort(compartments, new ComfortComparator());
        Arrays.sort(couchettes, new ComfortComparator());

        System.out.println("\nSorted by comfort.");

        for (VIP vip : vips) {
            System.out.println(vip);
        }
        for (Compartment compartment : compartments) {
            System.out.println(compartment);
        }
        for (Couchette couchette : couchettes) {
            System.out.println(couchette);
        }
    }
}
