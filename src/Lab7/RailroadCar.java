package Lab7;

public class RailroadCar {
    TypeOfRailroadCar typeOfRailroadCar;
    int amountOfPassengers;
    int amountOfLuggage;
    int levelOfComfort;

    public RailroadCar(TypeOfRailroadCar typeOfRailroadCar, int amountOfPassengers, int amountOfLuggage, int levelOfComfort) {
        this.typeOfRailroadCar = typeOfRailroadCar;
        this.amountOfPassengers = amountOfPassengers;
        this.amountOfLuggage = amountOfLuggage;
        this.levelOfComfort = levelOfComfort;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RailroadCar)) {
            return false;
        }
        RailroadCar c = (RailroadCar) o;
        return this.amountOfPassengers == c.amountOfPassengers && this.amountOfLuggage == c.amountOfLuggage && this.levelOfComfort == c.levelOfComfort;
    }

    @Override
    public String toString() {
        return "RailroadCar{" +
                "typeOfRailroadCar=" + typeOfRailroadCar +
                ", amountOfPassengers=" + amountOfPassengers +
                ", amountOfLuggage=" + amountOfLuggage +
                ", levelOfComfort=" + levelOfComfort +
                '}';
    }

    public static void main(String[] args) {
        RailroadCar vip1 = new RailroadCar(TypeOfRailroadCar.VIP, 18, 10,3);
        RailroadCar vip2 = new RailroadCar(TypeOfRailroadCar.VIP, 18, 10,3);
        System.out.println(vip1.equals(vip2));
    }
}
