interface Sports {
    int getSportsScore();
}
class Student {
    protected int rollNo;
    public Student(int rollNo) {
        this.rollNo = rollNo;
    }}
class Test extends Student {
    protected int part1Mark;
    protected int part2Mark;
    public Test(int rollNo, int part1Mark, int part2Mark) {
        super(rollNo);
        this.part1Mark = part1Mark;
        this.part2Mark = part2Mark;
    }
    public void displayMarks() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Part 1 Marks: " + part1Mark);
        System.out.println("Part 2 Marks: " + part2Mark);
    }}
class Participant extends Test implements Sports {
    public Participant(int rollNo, int part1Mark, int part2Mark) {
        super(rollNo, part1Mark, part2Mark);
    }
    @Override
    public int getSportsScore() {
        return 80; 
    }
    public void displayTotalScore() {
        int totalScore = part1Mark + part2Mark + getSportsScore();
        System.out.println("\nTotal Score Calculation:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Part 1 Marks: " + part1Mark);
        System.out.println("Part 2 Marks: " + part2Mark);
        System.out.println("Sports Score: " + getSportsScore());
        System.out.println("Total Score: " + totalScore);
    }}
public class Main7 {
    public static void main(String[] args) {
        Participant participant = new Participant(101, 85, 90);

        participant.displayMarks();
        participant.displayTotalScore();
    }}