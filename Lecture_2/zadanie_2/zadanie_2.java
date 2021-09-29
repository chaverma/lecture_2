package Lecture_2.zadanie_2;

public class zadanie_2 {
        public static void main(String[] args){
            Animal animal1=new Animal("Мясо","Россия");
            System.out.println(animal1.makeNoise());
            System.out.println(animal1.eat());
            System.out.println(animal1.sleep());
            System.out.println(animal1.makeNoise());
            System.out.println(animal1.eat());
            System.out.println(animal1.unSleep());
            System.out.println(animal1.makeNoise());
            System.out.println(animal1.eat());
            System.out.println();
            Dog animal2=new Dog("Корм","Россия", true);
            System.out.println(animal2.makeNoise());
            System.out.println(animal2.eat());
            System.out.println(animal2.sleep());
            System.out.println(animal2.makeNoise());
            System.out.println(animal2.eat());
            System.out.println(animal2.unSleep());
            System.out.println(animal2.makeNoise());
            System.out.println(animal2.eat());
            System.out.println("Собака знает команды?:" + animal2.isKnowCommands);
            System.out.println();
            Cat animal3=new Cat("Что попало","Россия", false);
            System.out.println(animal3.makeNoise());
            System.out.println(animal3.eat());
            System.out.println(animal3.sleep());
            System.out.println(animal3.makeNoise());
            System.out.println(animal3.eat());
            System.out.println(animal3.unSleep());
            System.out.println(animal3.makeNoise());
            System.out.println(animal3.eat());
            System.out.println("Кошка приучена к лотку?:" + animal3.isKnowWhereWc);
            System.out.println();

            Horse animal4=new Horse("Яблоки","Россия", "Скаковая");
            System.out.println(animal4.makeNoise());
            System.out.println(animal4.eat());
            System.out.println(animal4.sleep());
            System.out.println(animal4.makeNoise());
            System.out.println(animal4.eat());
            System.out.println(animal4.unSleep());
            System.out.println(animal4.makeNoise());
            System.out.println(animal4.eat());
            System.out.println("Порода лошади:" + animal4.poroda);
            System.out.println();
            Animal[] animals = {animal1, animal2, animal3, animal4};
            Veterinar.treatAnimal(animals);
        }
    }
