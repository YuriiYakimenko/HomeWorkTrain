package OOP.Carriage;

public class FreightCarriage extends Carriage {
    private int cargo;

    public FreightCarriage(int weight, int cargo) {
        if (cargo < 0) {
            throw new IllegalArgumentException("Вантаж не може бути меньше 0");
        }
        super(weight, CarriageType.FreightCarriage);
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

    @Override
    public void transport() {
        if (cargo == 0) {
            System.out.println("Вагон №" + getId() + " порожній");
            return;
        }
        System.out.println("Вагон №" + getId() + " перевозить " + cargo + " тон");
    }
}
