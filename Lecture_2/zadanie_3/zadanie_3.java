package Lecture_2.zadanie_3;

public class zadanie_3 {
    public static void main (String args[]){
        Phone phone1 = new Phone("+7 (916) 345-12-45","iPhone",140.0);
        Phone phone2 = new Phone("+7 (999) 999-45-65","Samsung");
        Phone phone3 = new Phone();
        Phone[] phones = {phone1, phone2, phone3};
        for(Phone p:phones){
            System.out.println("Model: " + p.model + "\nNumber: " + p.number + "\nWeight: " + p.weight + "\n");
        }
        phone1.receiveCall("Саша");
        phone2.receiveCall("Юра");
        phone3.receiveCall("Женя\n");
        for(Phone p:phones){
            System.out.println(p.getNumber());
        }
        phone1.receiveCall("Саша", "+7 (999) 333-11-22");
        phone2.receiveCall("Юра", "+7 (985) 127-45-12");
        phone3.receiveCall("Женя", "+7 (916) 834-48-63\n");

        Phone.sendMessage("Hello, World!", "+7 (999) 333-11-22", "+7 (985) 127-45-12", "+7 (916) 834-48-63");
    }
}
