package OOP.Train;

import OOP.Carriage.*;
import OOP.IMovable;

import java.util.Random;

public abstract class Train implements IMovable {
    private String name;
    private int maxSpeed;
    private int weight;
    private final int id;
    private static int nextId = 1;
    private Carriage[] carriage;
    private int carriageCount;

    Train(String name, int maxSpeed, int weight, int carriageCount, CarriageType carriageType) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Ім'я не може бути порожнім");
        }
        if (maxSpeed <= 0) {
            throw new IllegalArgumentException("Максимальна швидкість не може бути рівна або менше 0");
        }
        if (weight < 30) {
            throw new IllegalArgumentException("Вага не може бути менше 30 тон");
        }
        if (carriageCount < 0) {
            throw new IllegalArgumentException("Кількість вагонів не може бути відємною");
        }
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carriageCount = carriageCount;
        this.carriage = new Carriage[carriageCount];
        id = nextId++;

        Random random = new Random();
        for (int i = 0; i < carriage.length; i++) {
            switch (carriageType) {
                case PassengerCarriage ->
                        carriage[i] = new PassengerCarriage(random.nextInt(30, 50), random.nextInt(0, 50));
                case FreightCarriage ->
                        carriage[i] = new FreightCarriage(random.nextInt(30, 60), random.nextInt(0, 60));
                case SpecialCarriage ->
                        carriage[i] = new SpecialCarriage(random.nextInt(30, 70), random.nextInt(0, 70), random.nextInt(0, 70));
            }
        }
    }

    public int getId() {
        return id;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSpeed() {
        Random random = new Random();
        return random.nextInt(1, getMaxSpeed() + 1);
    }

    public int getWeight() {
        int totalWeight = weight;
        for (Carriage c : carriage) {
            totalWeight += c.getWeight();
        }
        return totalWeight;
    }

    public Carriage[] getCarriage() {
        return carriage;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Ім'я не може бути порожнім");
        }
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            throw new IllegalArgumentException("Максимальна швидкість не може бути рівна або менше 0");
        }
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(int weight) {
        if (weight < 30) {
            throw new IllegalArgumentException("Вага не може бути менше 30 тон");
        }
        this.weight = weight;
    }

    public void setCarriageCount(int carriageCount) {
        if (carriageCount < 0) {
            throw new IllegalArgumentException("Кількість вагонів не може бути відємною");
        }
        this.carriageCount = carriageCount;
    }

    public void setCarriage(Carriage[] carriage) {
        if (carriage == null) {
            throw new IllegalArgumentException("Вагон не може бути null");
        }
        this.carriage = carriage;
    }

    public void showCarriage() {
        System.out.println("Потяг: " + name + ", id: " + id);
        for (Carriage c : carriage) {
            c.transport();
        }
    }


    @Override
    public void move() {
        System.out.println("Потяг " + name + " id: " + id + " розпочав рух");
    }

    @Override
    public void stop() {
        System.out.println("Потяг " + name + " id: " + id + " зупинено");
    }

    @Override
    public String toString() {
        return "Потяг " + name +
                " id: " + id +
                " кількість вагонів: " + carriageCount +
                " вага " + getWeight() + " тон.";
    }
}
