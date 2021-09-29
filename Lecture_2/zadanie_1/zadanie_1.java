package Lecture_2.zadanie_1;

public class zadanie_1 {
    public static void main(String args[]){
        Student student1 = new Student("Gregor", "Lorentz",3.90 ,"1843");
        Aspirant aspirant1 = new Aspirant ("Filip", "Drozdov", 4.00, "1653","work1");
        Student aspirant2 = new Aspirant ("Fedor", "Fedorov", 5.00, "1654","work2");
        Student[] students = {student1, aspirant1, aspirant2};
        for (Student s:students){
            System.out.println(s.getScholarship());
        }
    }
}
