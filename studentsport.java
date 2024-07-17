interface Student {
    void displayAcademicScore();
}
interface Sports {
    void displaySportsScore();
}
class StudentSports implements Student, Sports {
    private String name;
    private int rollNo;
    private int academicScore;
    private int sportsScore;
    public StudentSports(String name, int rollNo, int academicScore, int sportsScore) {
        this.name = name;
        this.rollNo = rollNo;
        this.academicScore = academicScore;
        this.sportsScore = sportsScore;
    }
    @Override
    public void displayAcademicScore() {
        System.out.println("Academic Score of " + name + " (Roll No: " + rollNo + "): " + academicScore);
    }
    @Override
    public void displaySportsScore() {
        System.out.println("Sports Score of " + name + " (Roll No: " + rollNo + "): " + sportsScore);
    }
}
public class Main8 {
    public static void main(String[] args) {
        StudentSports student1 = new StudentSports("John", 101, 85, 90);
        student1.displayAcademicScore();
        student1.displaySportsScore();
    }
}