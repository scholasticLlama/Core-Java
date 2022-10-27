package Lab6;

public class RailroadCar {
    int amountOfPassengers;
    int amountOfLuggage;
    int levelOfComfort;

    public RailroadCar(int amountOfPassengers, int amountOfLuggage, int levelOfComfort) {
        this.amountOfPassengers = amountOfPassengers;
        this.amountOfLuggage = amountOfLuggage;
        this.levelOfComfort = levelOfComfort;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public int getAmountOfLuggage() {
        return amountOfLuggage;
    }

    public int getLevelOfComfort() {
        return levelOfComfort;
    }


    @Override
    public String toString() {
        return "RailroadCar{" +
                "type=" + super.getClass().getSimpleName() +
                ", amountOfPassengers=" + amountOfPassengers +
                ", amountOfLuggage=" + amountOfLuggage +
                ", levelOfComfort=" + levelOfComfort +
                '}';
    }
}
