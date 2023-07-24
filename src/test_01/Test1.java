package test_01;

public class Test1 {
    private int age1;
    private int age2;
 
    public void setAge1(int age1){
        this.age1 = age1;
    }
    public void setAge2(int age2){
        this.age2 = age2;
    }

    public void printTest(){
        System.out.println("age1: "+ age1);
        System.out.println("age2: "+ age2);
    }

    public int max(){
        return Math.max(age2, age1);
    }

    public int sum(){
        return age1 + age2;
    }


    @Override
    public String toString(){
        return "age1 "+ age1 +" age2 "+age2;
    }

}

class Program {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.setAge1(15);
        test.setAge2(30);
        test.printTest();
        int max = test.max();
        System.out.println("max= "+max);
        int sum = test.sum();
        System.out.println("sum= "+sum);
        
    }
}

