package utils;

import Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();

    public StudentManager() {
    }

    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent() {
        Student st = new Student();
        st.inputStudent(studentList);
        studentList.add(st);
    }

    public void sortStudentList() {
        System.out.println("Sort Student List by Medium Score Gradual:");
//        List<Student> list1 = new ArrayList<>();
//        list1.addAll(studentList);
        List<Student> list1 = new ArrayList<>(studentList);
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if (st1.getId() > st2.getId())
                    return 1;
                else if (st1.getId() < st2.getId())
                    return -1;
                else
                    return 0;
            }
        });
        for (Student st : list1)
            System.out.println(st);
    }
}
