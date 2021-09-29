package Lecture_2.zadanie_1;

public class Aspirant extends Student{
    String scinceWorkTitle;

    public Aspirant(String firstName, String lastname, double averageMark, String group, String scinceWorkTitle) {
        super(firstName, lastname, averageMark, group);
        this.scinceWorkTitle=scinceWorkTitle;
    }

    @Override
    int getScholarship(){
        return (this.averageMark==5) ? 200:180;
    }
}
