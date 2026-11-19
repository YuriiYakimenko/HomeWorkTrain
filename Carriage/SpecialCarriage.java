package OOP.Carriage;

public class SpecialCarriage extends Carriage {
    private int passengerCapacity;
    private int cargo;

    public SpecialCarriage(int weight, int passengerCapacity, int cargo) {
        if (passengerCapacity < 0) {
            throw new IllegalArgumentException("Кількість пасажирів не може бути відємною");
        }
        if (cargo < 0) {
            throw new IllegalArgumentException("Вантаж не може бути меньше 0");
        }
        super(weight, CarriageType.SpecialCarriage);
        this.passengerCapacity = passengerCapacity;
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        if (cargo < 0) {
            throw new IllegalArgumentException("Вантаж не може бути меньше 0");
        }
        this.cargo = cargo;
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
        if (cargo == 0) {
            System.out.println("Вагон №" + getId() + " перевозить " + passengerCapacity + " пасажирів");
            return;
        } else if (passengerCapacity == 0) {
            System.out.println("Вагон №" + getId() + " перевозить " + cargo + " тон вантажу");
            return;
        } else if (cargo == 0 && passengerCapacity == 0) {
            System.out.println("Вагон №" + getId() + " порожній");
            return;
        }
        System.out.println("Вагон №" + getId() + " перевозить " + passengerCapacity + " пасажирів" + " та " + cargo + " тон вантажу");
    }
}
