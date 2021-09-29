package Lecture_2.zadanie_2;

public class Cat extends Animal{
    public Cat(String food, String location, boolean isKnowWhereWc) {
        super(food, location);
        this.isKnowWhereWc=isKnowWhereWc;
        animalType="Кошка";
    }
    boolean isKnowWhereWc;
}
