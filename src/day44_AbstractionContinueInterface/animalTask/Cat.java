package day44_AbstractionContinueInterface.animalTask;

public final class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating biryani");
    }
    public void meow(){
        System.out.println(getName() + " is Meowing");
    }

    public void play(){
        System.out.println(getName()+" is playing with fish toy");
    }
}
