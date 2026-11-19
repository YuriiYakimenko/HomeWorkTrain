package OOP.Carriage;

public class PassengerCarriage extends Carriage {
    private int passengerCapacity;

    public PassengerCarriage( int weight, int passengerCapacity) {
        if (passengerCapacity < 0) {
            throw new IllegalArgumentException("Кількість пасажирів не може бути відємною");
        }
        super(weight, CarriageType.PassengerCarriage);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity < 0) {
            throw new IllegalArgumentException("Кількість пасажирів не може бути відємною");
        }
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void transport() {
        if (passengerCapacity == 0) {
            System.out.println("Вагон №" + getId() + " порожній");
            return;
        }
        System.out.println("Вагон №" + getId() + " перевозить " + passengerCapacity + " пасажирів");
    }
}
