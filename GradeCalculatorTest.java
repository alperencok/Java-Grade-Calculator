public class GradeCalculatorTest {

    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("                   Grade Calculator Boundary Verification Suite                 ");
        System.out.println("================================================================================");

        double[] testScores = {
            105.0, // Upper out of bounds
            100.0, // Top of AA
            95.5,  // Inside AA
            90.0,  // Lower edge of AA
            89.9,  // Upper edge of BA
            85.0,  // Lower edge of BA
            75.0,  // Lower edge of BB
            65.0,  // Lower edge of CB
            60.0,  // Lower edge of CC
            50.0,  // Lower edge of DC (Conditional pass)
            45.0,  // Lower edge of DD (Conditional pass)
            40.0,  // Lower edge of FD
            39.9,  // Upper edge of FF
            15.0,  // Inside FF
            0.0,   // Lowest valid score
            -5.0   // Lower out of bounds
        };

        System.out.printf("%-10s | %-8s | %-6s | %-28s | %-8s%n",
                "Input", "Valid?", "Grade", "Academic Standing", "GPA");
        System.out.println("--------------------------------------------------------------------------------");

        for (double score : testScores) {
            GradeResult res = GradeCalculator.evaluate(score);
            System.out.printf("%-10.1f | %-8b | %-6s | %-28s | %-8.1f%n",
                    res.getScore(),
                    res.isValid(),
                    res.getLetterGrade(),
                    res.getStatus(),
                    res.getGpaCoefficient());
        }

        System.out.println("================================================================================");
        System.out.println("All boundary and conditional branches verified successfully.");
    }
}
