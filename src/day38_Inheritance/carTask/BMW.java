package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(brand+" "+model+" is break down every 100 miles");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is racing car");
    }
public void start(){
    System.out.println("Call mechanic to Jump start " +brand+
            " "+model);
}


    @Override
    public void drive() {
        super.drive();
    }
}
