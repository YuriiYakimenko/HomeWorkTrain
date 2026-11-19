package OOP;

import OOP.Train.FreightTrain;
import OOP.Train.PassengerTrain;
import OOP.Train.SpecialTrain;
import OOP.Train.Train;

import java.util.ArrayList;
import java.util.Scanner;

public class RailwayStation {
    private static final RailwayStation RAILWAY_STATION = new RailwayStation();
    private ArrayList<Train> trains = new ArrayList<>();

    {
        trains.add(new FreightTrain("Вантажний потяг", 50, 100, 10));
        trains.add(new PassengerTrain("Пасажирський потяг", 100, 40, 9));
        trains.add(new SpecialTrain("Спеціальний потяг", 70, 70, 5));
    }

    public void addTrain(Train train) {
        if (train != null) {
            trains.add(train);
            System.out.println("Поїзд " + train.getName() + " додано!");
        }
    }

    public void removeTrain(Train train) {
        if (train != null && trains.remove(train)) {
            System.out.println("Поїзд " + train.getName() + " видалено!");
        } else {
            System.out.println("Поїзд не знайдено");
        }

    }

    public void choice() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    for (Train train : trains) {
                        System.out.println(train.toString());
                    }
                    break;
                case 2:
                    for (Train train : trains) {
                        train.showCarriage();
                    }
                    break;
                default:
                    System.out.println("Введено невірне значення");
            }
        }
    }

    static void main(String[] args) {
        while (true) {
            System.out.println("================ЗАЛІЗНИЧНИЙ ВОКЗАЛ================");
            System.out.println("1. Переглянути всі поїзди");
            System.out.println("2. Показати вагони");

            System.out.print("Оберіть дію: ");
            RAILWAY_STATION.choice();
        }
    }
}
