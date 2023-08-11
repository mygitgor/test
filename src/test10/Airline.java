package test10;

import java.util.Arrays;

public class Airline {
    private String destination;
    private int fligthNumber;
    private String aircraftType;
    private String departureTime;
    private String[] daysOfWeek;

    
    public Airline(String destination, int fligthNumber, String aircraftType, String departureTime,
            String[] daysOfWeek) {
        this.destination = destination;
        this.fligthNumber = fligthNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public int getFligthNumber() {
        return fligthNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    @Override
    public String toString() {
        return "Airline [destination=" + destination + ", fligthNumber=" + fligthNumber + ", aircraftType="
                + aircraftType + ", departureTime=" + departureTime + ", daysOfWeek=" + Arrays.toString(daysOfWeek)
                + "]";
    }
}

class AirlineDatabase{
    private Airline[] airlines;
    private int size;


    public AirlineDatabase(int capacity){
        airlines = new Airline[capacity];
        size = 0;
    }

    public void addAirline(Airline airline){
        if (size < airlines.length){
            airlines[size] = airline;
            size++;
        }else {
            System.out.println("Ошибка: база данных авиалиний заполнена.");
        }
    }

    public void printFlightsToDestination(String destination){
        System.out.println("Список рейсов в пункт назначения " + destination + ":");
        for (int i = 0; i < size; i++){
            String flightDestination = airlines[i].getDestination();
            if (flightDestination.equalsIgnoreCase(destination)){
                System.out.println(airlines[i]);
            }
        }
    }

    public void printFlightsOnDayOfWeek(String dayOfWeek){
        System.out.println("Список рейсов на день недели " + dayOfWeek + ":");
        for (int i = 0; i < size; i++) {
            String[] daysOfWeek = airlines[i].getDaysOfWeek();
            for (String day : daysOfWeek){
                if (day.equals(dayOfWeek)){
                    System.out.println(airlines[i]);
                    break;
                }
            }
        }
    }

    public void printFlightsByDayAndTime(String dayOfWeek, String departureTime) {
        System.out.println("Список рейсов для дня недели " + dayOfWeek +
                ", время вылета для которых больше " + departureTime + ":");
        for (int i = 0; i < size; i++) {
            String[] days = airlines[i].getDaysOfWeek();
            for (String day : days) {
                if (day.equalsIgnoreCase(dayOfWeek) && airlines[i].getDepartureTime().compareTo(departureTime) > 0) {
                    System.out.println(airlines[i]);
                    break;
                }
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        AirlineDatabase airlineDatabase = new AirlineDatabase(5);

        String[] days1 = {"Monday", "Wednesday", "Friday"};
        String[] days2 = {"Tuesday", "Thursday", "Saturday"};
        String[] days3 = {"Sunday"};

        Airline airline1 = new Airline("New York", 123, "Boeing 747", "12:00", days1);
        Airline airline2 = new Airline("Los Angeles", 456, "Airbus A320", "15:30", days2);
        Airline airline3 = new Airline("Chicago", 789, "Boeing 777", "18:45", days3);

        airlineDatabase.addAirline(airline1);
        airlineDatabase.addAirline(airline2);
        airlineDatabase.addAirline(airline3);

        String searchDestination = "New York";
        airlineDatabase.printFlightsToDestination(searchDestination);

        String searchDayOfWeek = "Tuesday";
        airlineDatabase.printFlightsOnDayOfWeek(searchDayOfWeek);

        String searchDay = "Saturday";
        String searchTime = "15:00";
        airlineDatabase.printFlightsByDayAndTime(searchDay, searchTime);
    }
}
