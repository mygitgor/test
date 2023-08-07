package test8;

public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNime(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

       public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Customer [id ="+id+" name="+name+" email="+email+"]";
    }
}

class CustomerDatabase{
    private Customer[] Customers;
    private int size;

    public CustomerDatabase(int capacity){
        Customers = new Customer[capacity];
        size = 0;
    }

    public void addCustomer(Customer customer){
        if(size < Customers.length ){
            Customers[size] = customer;
            size++;
        }else {
            System.out.println("Ошибка: база данных покупателей заполнена.");
        }
    }

    public void printCustomersWithEmail(String email){
        System.out.println("Покупатели email " + email + ":");
        for (int i = 0; i < size; i++) {
            if(Customers[i].getEmail().equalsIgnoreCase(email)){
                System.out.println(Customers[i]);
            }
        }
    }

    public void printAllCustomers(){
        System.out.println("все покупатели:");
        for (int i = 0; i < size; i++) {
            System.out.println(Customers[i]);
        }
    }
}


class Test{
    public static void main(String[] args) {
        CustomerDatabase database = new CustomerDatabase(10);
        Customer customer1 = new Customer(5, "Sasha","example.com");
        Customer customer2 = new Customer(2, "Alice Johnson", "alice@example.com");
        Customer customer3 = new Customer(3, "Bob Thompson", "bob@example.com");

        System.out.println(customer1);
        database.addCustomer(customer1);
        database.addCustomer(customer2);
        database.addCustomer(customer3);

        database.printAllCustomers();
        String searchEmail = "alice@example.com";
        database.printCustomersWithEmail(searchEmail);
    }
}