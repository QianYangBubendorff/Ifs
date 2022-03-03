package fh.campus02;

public class GradingTable {
    public static void main(String[] args) {
        int points = 95;
        System.out.println("Your grade is: " + PointsToGrade(points));

    }

    public static String PointsToGrade(int points) {
        String grade;
        if (points >= 90) {
            grade = "Outstanding";
        } else if (points <= 89 && points >= 78) {
            grade = "Excellent";
        } else if (points <= 77 && points >= 65) {
            grade = "Acceptable";
        } else if (points <= 64 && points >= 51) {
            grade = "Passing";
        } else {
            grade = "Fail";
        }
        return grade;
    }
}
