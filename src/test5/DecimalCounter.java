package test5;

public class DecimalCounter {
    private int minValue;
    private int maxValue;
    private int value;

    public DecimalCounter(){
        minValue = 0;
        maxValue = 100;
        value = minValue;
    }

    public DecimalCounter(int minValue, int maxValue, int initialValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
        if(initialValue < minValue || initialValue > maxValue){
            System.out.println("Ошибка: начальное значение вне диапазона");
            value = minValue;
        }else {
            value = initialValue;
        }
    }

    public int getValue(){
        return value;
    }

    public void increment(){
        if(value < maxValue){
            value++;
        }else {
            System.out.println("Ошибка: достигнуто максимальное значение счетчика");
        }
    }

    public void decrement(){
        if(value > minValue){
            value--;
        }else {
            System.out.println("Ошибка: достигнуто минимальное значение счетчика");
        }
    }

    @Override
    public String toString(){
        return "minValue:"+minValue+ " maxValue:"+maxValue+" Value:"+value;
    }
    
}

class Test{
    public static void main(String[] args) {
        DecimalCounter counter1 = new DecimalCounter();
        System.out.println("decimalCounter: "+counter1);
        counter1.increment();
        System.out.println("Counter1 value: " + counter1.getValue());
        counter1.decrement();
        System.out.println("counter1 valeu: "+counter1.getValue());

        DecimalCounter counter2 = new DecimalCounter(-10, 10, 5);
        System.out.println("counter2 value: "+counter2);
        System.out.println("Counter2 value: " + counter2.getValue());
        counter2.increment();
        System.out.println("Counter2 value: " + counter2.getValue());
        counter2.increment();
        System.out.println("Counter2 value: " + counter2.getValue());
        counter2.decrement();
        System.out.println("Counter2 value: " + counter2.getValue());
        counter2.decrement();
        System.out.println("Counter2 value: " + counter2.getValue());
    }
}
