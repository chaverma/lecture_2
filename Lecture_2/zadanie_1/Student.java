package Lecture_2.zadanie_1;

public class Student {
    String firstName, lastname,group;
    double averageMark;
    public Student(String firstName, String lastname, double averageMark, String group){
        this.firstName=firstName;
        this.lastname=lastname;
        this.averageMark=averageMark;
        this.group=group;
    }
    int getScholarship(){
        if (this.averageMark==5){
            return 100;
        }
        else{
            return 80;
        }
    }
}
