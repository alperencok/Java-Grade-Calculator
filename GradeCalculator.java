import java.util.Scanner;

public class GradeCalculator {

    public static GradeResult evaluate(double score) {
        if (score < 0.0 || score > 100.0) {
            return GradeResult.invalid(score);
        } else if (score >= 90.0) {
            return new GradeResult(score, "AA", "Successful (Passed)", 4.0, true);
        } else if (score >= 85.0) {
            return new GradeResult(score, "BA", "Successful (Passed)", 3.5, true);
        } else if (score >= 75.0) {
            return new GradeResult(score, "BB", "Successful (Passed)", 3.0, true);
        } else if (score >= 65.0) {
            return new GradeResult(score, "CB", "Successful (Passed)", 2.5, true);
        } else if (score >= 60.0) {
            return new GradeResult(score, "CC", "Successful (Passed)", 2.0, true);
        } else if (score >= 50.0) {
            return new GradeResult(score, "DC", "Conditionally Successful", 1.5, true);
        } else if (score >= 45.0) {
            return new GradeResult(score, "DD", "Conditionally Successful", 1.0, true);
        } else if (score >= 40.0) {
            return new GradeResult(score, "FD", "Failed", 0.5, true);
        } else {
            return new GradeResult(score, "FF", "Failed", 0.0, true);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("         Academic Letter Grade Calculator        ");
        System.out.println("==================================================");
        System.out.println("Enter numerical scores (0 - 100) to evaluate.");
        System.out.println("Type -1 to exit.\n");

        while (true) {
            System.out.print("Enter score: ");
            if (!scanner.hasNextDouble()) {
                String token = scanner.next();
                if (token.equalsIgnoreCase("exit") || token.equalsIgnoreCase("q")) {
                    break;
                }
                System.out.println("Invalid input! Please enter a numerical score.\n");
                continue;
            }

            double input = scanner.nextDouble();
            if (input == -1) {
                System.out.println("Exiting Grade Calculator. Goodbye!");
                break;
            }

            GradeResult result = evaluate(input);
            System.out.println("-> " + result);
            System.out.println();
        }

        scanner.close();
    }
}
