package Lecture_2.zadanie_2;

public class Dog extends Animal{
    public Dog(String food, String location, boolean isKnowCommands) {
        super(food, location);
        this.isKnowCommands = isKnowCommands;
        animalType="Собака";
    }
    boolean isKnowCommands;
}
