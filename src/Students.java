//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Students {
    private static List<Student> students = new ArrayList<>();

    public static void promoteAllStudents() {
        for (Student student : students) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            student.displayInfo();
        }
    }

    public static void addStudent(Student student) {
        students.add(student);
    }
}
