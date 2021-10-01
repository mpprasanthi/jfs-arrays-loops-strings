package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    private final ArrayList<String> students = new ArrayList<String>();
    private final ArrayList<Integer> mathGrades = new ArrayList<Integer>();
    private final ArrayList<Integer> scienceGrades = new ArrayList<Integer>();
    private final ArrayList<Integer> englishGrades = new ArrayList<Integer>();

    public MSGrades(){
        // Add some students and their grades to the array
        students.add("STUDENT 1");
        students.add("STUDENT 2");
        mathGrades.add(90);
        mathGrades.add(50);
    }

    public void printStudents(){
        for (String student:students) {
            System.out.println(student);

        }
        
    }
            

    public static void main(String[] args) {
        // write your code here
        MSGrades msGrade7 = new MSGrades();

        System.out.println("Middle School Roster");
        System.out.println("====================");

        msGrade7.printStudents();

    }
}
