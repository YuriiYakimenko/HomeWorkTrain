package OOP.Train;

import OOP.Carriage.CarriageType;
import OOP.ITransportable;

public class PassengerTrain extends Train implements ITransportable {


    public PassengerTrain(String name, int maxSpeed, int weight, int carriageCount) {
        super(name, maxSpeed, weight, carriageCount, CarriageType.PassengerCarriage);
    }

    @Override
    public void transport() {
        System.out.println("Можу перевозити людей");
    }
}
