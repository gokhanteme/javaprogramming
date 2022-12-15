package day38_Inheritance.carTask;

public class Tesla extends Car{


    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" is autopilot model");
    }

    public void start(){
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }


    @Override
    public void drive() {
        System.out.println("more slowly "+brand+" "+model);
    }
}
