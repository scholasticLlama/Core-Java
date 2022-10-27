package Lab6;

import java.util.Comparator;

public class ComfortComparator implements Comparator<RailroadCar> {

    @Override
    public int compare(RailroadCar o1, RailroadCar o2) {
        return Integer.compare(o1.getLevelOfComfort(), o2.getLevelOfComfort());
    }
}
