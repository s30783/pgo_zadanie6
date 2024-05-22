//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class StudyProgramme {
    private String name;
    private String description;
    private int semesters;
    private int maxITN;

    public StudyProgramme(String name, String description, int semesters, int maxITN) {
        this.name = name;
        this.description = description;
        this.semesters = semesters;
        this.maxITN = maxITN;
    }

    public int getSemesters() {
        return semesters;
    }
    public int getMaxITN(){return maxITN;}
}
