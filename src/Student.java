//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private static int nextIndex = 1;
    private String fname;
    private String lname;
    private String email;
    private String address;
    private String indexNumber;
    private Date dateOfBirth;
    private String status = "Candidate";
    private List<String> grades = new ArrayList<>();
    private StudyProgramme studyProgramme;
    private int currentSemester = 1;
    private int itnCount = 0;

    public Student(String fname, String lname, String email, String address, Date dateOfBirth) {
        this.fname = fname;
        this.lname = lname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.indexNumber = "s" + nextIndex++;
    }

    public void addGrade(int itn, String grade) {
        if (itnCount < studyProgramme.getMaxITN()) {
            grades.add(grade);
            itnCount += itn;
        } else {
            System.out.println("Maximum number of ITN's exceeded for this semester.");
        }
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public void promoteToNextSemester() {
        if (currentSemester < studyProgramme.getSemesters()) {
            currentSemester++;
        } else {
            status = "Graduate";
        }
    }

    public void displayInfo() {
        System.out.println("Name and last name: " + fname + " " + lname);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Index Number: " + indexNumber);
        System.out.println("Birth date: " + dateOfBirth);
        System.out.println("Status: " + status);
        System.out.println("Current Semester: " + currentSemester);
        System.out.println("Grades: " + grades);
    }
}
