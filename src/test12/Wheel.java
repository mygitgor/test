package test12;

public class Wheel {
    private String brand;

    public Wheel(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
}

class Engine{
    private String model;

    public Engine(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }
}

class Car{
    private String make;
    private Wheel[] wheels;
    private Engine engine;

    public Car(String make, Wheel[] wheels, Engine engine){
        this.engine = engine;
        this.make = make;
        this.wheels = wheels;
    }

    public void drive(){
        System.out.println("Автомобиль марки " + make + " едет.");
    }

    public void refuel(){
        System.out.println("Автомобиль марки " + make + " заправляется.");
    }

    public void changeWheel(Wheel newWheel, int wheelNumber){
        if(wheelNumber >= 1 && wheelNumber <= 4){
            wheels[wheelNumber -1] = newWheel;
            System.out.println("Колесо номер " + wheelNumber + " заменено на колесо марки " + newWheel.getBrand());
        }else {
            System.out.println("Ошибка: неверный номер колеса.");
        }
    }

    public String getMake(){
        return make;
    }
}

class Test{
    public static void main(String[] args) {
        Wheel[] wheels = new Wheel[4];
        wheels[0] = new Wheel("Continental");
        wheels[1] = new Wheel("Continental");
        wheels[2] = new Wheel("Continental");
        wheels[3] = new Wheel("Continental");

        Engine engine = new Engine("V6");
        Car car = new Car("Audi", wheels, engine);

        car.drive();
        car.refuel();

        Wheel newWheel = new Wheel("Michelin");
        car.changeWheel(newWheel, 3);

        System.out.println("Марка автомобиля: " + car.getMake());
    }
}
