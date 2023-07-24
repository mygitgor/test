package test2;

public class Test2 {
    private String name;
    private int age;
// Конструктор с входными параметрами
    public Test2(String name, int age){
        this.name = name;
        this.age = age;
    }

// Конструктор, инициализирующий члены класса по умолчанию
    public Test2(){
        this.name = null;
        this.age = 0;
    }

// Метод для установки значения name
    public void setName(String name){
        this.name = name;
    }

 // Метод для получения значения name
    public String getName(){
        return name;
    }

// Метод для установки значения age
    public void setAge(int age){
        this.age = age;
    }

// Метод для получения значения age  
    public int getAge(){
        return age;
    }
}

class Test{
    public static void main(String[] args) {
        Test2 test1 = new Test2("mary", 20);
        System.out.println("name: "+test1.getName());
        System.out.println("age-mary: "+test1.getAge());

        System.out.println("-----------");

        Test2 test2 = new Test2();
        System.out.println("name: "+test2.getName());
        System.out.println("age-mary: "+test2.getAge());

        System.out.println("-----------");

        test2.setAge(23);
        test2.setName("Mary");
        System.out.println("name: "+test2.getName());
        System.out.println("age-Mary: "+test2.getAge());
    }
}
