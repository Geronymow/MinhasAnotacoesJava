package entities;

public class Student {

    public String name;
    public double testScore1;
    public double testScore2;
    public double testScore3;

    public void gradeCheck() {

        if (testScore1 > 30 || testScore1 < 0) {
            System.out.println("Enter a possible note");
        } else if (testScore2 > 35 || testScore2 < 0) {
            System.out.println("Enter a possible note");
        } else if (testScore3 > 35 || testScore3 < 0) {
            System.out.println("Enter a possible note");
        }
        else {
            System.out.println("Possible note");
        }
    }

    public double finalGrade() {
        return testScore1 + testScore2 + testScore3;
    }

    public  void decision() {
        double difference = 60 - finalGrade();

        if (finalGrade() > 60) {
            System.out.printf("Final Grade = %.2f%n" +
                    "Pass", finalGrade());
        }
        else {
            System.out.printf("Final Grade = %.2f%n" +
                    "Failed\n" +
                    "Missing %.2f "
                    + "Points",finalGrade(),difference);
        }
    }
}