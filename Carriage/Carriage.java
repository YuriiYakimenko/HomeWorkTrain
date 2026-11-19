package OOP.Carriage;

import OOP.IMovable;
import OOP.ITransportable;

public abstract class Carriage implements IMovable, ITransportable {
    private int id;
    private static int nextId = 1;
    private int weight;
    private final CarriageType carriageType;

    public Carriage(int weight, CarriageType carriageType) {
        if (weight < 30) {
            throw new IllegalArgumentException("Вага не може бути меншою ніж 30 тон");
        }
        this.carriageType = carriageType;
        this.weight = weight;
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 30) {
            throw new IllegalArgumentException("Вага не може бути меншою ніж 30 тон");
        }
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Вагон №" + id +
                ", вага: " + weight + " тон";
    }

    @Override
    public void transport() {
        System.out.println("Вагон №" + id);
    }

    @Override
    public void move() {
        System.out.println("Вагон №" + getId() + " рухається");
    }

    @Override
    public void stop() {
        System.out.println("Вагон №" + getId() + " зупинився");
    }
}
