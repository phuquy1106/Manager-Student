import utils.MenuUtil;
import Model.Student;
import utils.MenuUtil;
import utils.StudentManager;
import utils.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        StudentManager studentManager = new StudentManager(studentList);
        int i;
        do {
            MenuUtil.printMenu();

            do {
                i = Validator.getInt(scanner, "Choice: ");

                if ((i < 1) || (i > 3))
                    System.out.println("Enter a number from 1 to 3");
            } while ((i < 1) || (i > 3));

            switch (i) {
                case 1:
                    studentManager.addStudent();
                    System.out.println();
                    break;
                case 2:
                    studentManager.sortStudentList();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Program is finished");
                    break;
            }
        }while(i!=3);
    }
}