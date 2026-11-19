package OOP.Train;

import OOP.Carriage.CarriageType;
import OOP.ITransportable;

public class SpecialTrain extends Train implements ITransportable {


    public SpecialTrain(String name, int maxSpeed, int weight, int carriageCount) {
        super(name, maxSpeed, weight, carriageCount, CarriageType.SpecialCarriage);
    }

    @Override
    public void transport() {
        System.out.println("Можу перевозити вантаж та людей");
    }
}
