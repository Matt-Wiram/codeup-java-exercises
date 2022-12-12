package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;





public class GradesApplications {

    public static void getGrades() {
        HashMap<String, Students> students = new HashMap<>();
        Students students1 = new Students("Tom", new ArrayList<>());
        Students students2 = new Students("Dick", new ArrayList<>());
        Students students3 = new Students("Or", new ArrayList<>());
        Students students4 = new Students("Harry", new ArrayList<>());
        students1.addGrade(50);
        students1.addGrade(60);
        students1.addGrade(45);
        students2.addGrade(67);
        students2.addGrade(60);
        students2.addGrade(67);
        students3.addGrade(50);
        students3.addGrade(87);
        students3.addGrade(60);
        students4.addGrade(50);
        students4.addGrade(87);
        students4.addGrade(60);
        students.put("Tommy", students1);
        students.put("Richy", students2);
        students.put("Orville", students3);
        students.put("Harold", students4);
        System.out.println("Welcome! \n\nHere are the Github usernames for our students: \n");
//        System.out.println(students.keySet());
        students.entrySet().stream().forEach(x -> System.out.printf("| %s | ", x.getKey()));
        System.out.println("\n\nWhat Student would you like information on?");
        Input input = new Input(new Scanner(System.in));
        String userInput = input.getString();
        if (userInput.equalsIgnoreCase("Tommy")) {
            System.out.println("Name: " + students.get("Tommy").getName() + " - Github Username: Tommy \nGrade Average: " + students.get("Tommy").getGradeAverage() + "\n");
        } else if (userInput.equalsIgnoreCase("Richy")) {
            System.out.println("Name: " + students.get("Richy").getName() + " - Github Username: Richy \nGrade Average: " + students.get("Richy").getGradeAverage() + "\n");
        } else if (userInput.equalsIgnoreCase("Orville")) {
            System.out.println("Name: " + students.get("Orville").getName() + " - Github Username: Orville \nGrade Average: " + students.get("Orville").getGradeAverage() + "\n");
        } else if (userInput.equalsIgnoreCase("Harold")) {
            System.out.println("Name: " + students.get("Harold").getName() + " - Github Username: Harold  \nGrade Average: " + students.get("Harold").getGradeAverage() + "\n");
        } else {
            System.out.println("Sorry wrong student");

        }

        boolean check = input.yesNo();
        if (check == true) {
        getGrades();
        } else {}
    }

    public static void main(String[] args) {
        getGrades();

//        for(Map.Entry<String, Students> entry : students.entrySet()){
//            String key=entry.getKey();
//            Students val=entry.getValue();
//            System.out.println("Here is the name " + val.getName());
//            System.out.println("Here is the grade average " + val.getGradeAverage());

//        }



    }
}



