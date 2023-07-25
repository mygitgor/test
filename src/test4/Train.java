
package test4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Train{
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train(String destination, int trainNumber, String departureThime){
        this.departureTime = departureThime;
        this.destination = destination;
        this.trainNumber = trainNumber;
    }

    public String getDestination(){
        return destination;
    }

    public int getTrainNumber(){
        return trainNumber;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public static void sortByTrainNumber(Train[] trains){
        Arrays.sort(trains, Comparator.comparingInt(Train::getTrainNumber));
    }

    public static void sortByDestinationAndDepartureTime(Train[] trains){
        Arrays.sort(trains, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    public static void displayTrainInfoByNumber(Train[] trains, int trainNumber){
        for(Train train : trains){
            if (train.getTrainNumber()==trainNumber){
                System.out.println("Поезд номер: " + train.getTrainNumber());
                System.out.println("Пункт назначения: " + train.getDestination());
                System.out.println("Время отправления: " + train.getDepartureTime());
                return;
            }
        }
        System.out.println("Поезд c номером " + trainNumber + " не найден.");
    }

}

class Test{
    public static void main(String[] args) {
       Train[] trains = new Train[5];
       trains[0] = new Train("Москва", 123, "08:30");
       trains[1] = new Train("Санкт-Петербург", 456, "10:45");
       trains[2] = new Train("Казань", 789, "13:15");
       trains[3] = new Train("Москва", 321, "14:20");
       trains[4] = new Train("Екатеринбург", 654, "16:40");

       Train.sortByTrainNumber(trains);

       System.out.println("Сортировка по номерам поездов:");
       for(Train train : trains){
        System.out.println("Поезд номер: "+train.getTrainNumber());
        System.out.println("Пункт назначения: "+train.getDestination());
        System.out.println("Время отправления: " +train.getDepartureTime());
        System.out.println();
       }
        
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите номер поезда для вывода информации: ");
       int inputTrainNumber = scanner.nextInt();
       Train.displayTrainInfoByNumber(trains, inputTrainNumber);
       Train.sortByDestinationAndDepartureTime(trains);
       scanner.close();

       System.out.println("Сортировка по пункту назначения и времени отправления:");
       for(Train train : trains){
        System.out.println("Поезд номер: " + train.getTrainNumber());
        System.out.println("Пункт назначения: " +train.getDestination());
        System.out.println("Время отправления: "+train.getDepartureTime());
        System.out.println();
       }
    }
}

