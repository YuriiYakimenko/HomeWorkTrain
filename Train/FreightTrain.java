package OOP.Train;

import OOP.Carriage.CarriageType;
import OOP.ITransportable;

public class FreightTrain extends Train implements ITransportable {

    public FreightTrain(String name, int maxSpeed, int weight, int carriageCount) {
        super(name, maxSpeed, weight, carriageCount, CarriageType.FreightCarriage);
    }

    @Override
    public void transport() {
        System.out.println("Можу перевозити вантаж");
    }
}
