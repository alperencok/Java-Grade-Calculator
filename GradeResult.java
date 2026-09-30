public class GradeResult {

    private final double score;
    private final String letterGrade;
    private final String status;
    private final double gpaCoefficient;
    private final boolean valid;

    public GradeResult(double score, String letterGrade, String status, double gpaCoefficient, boolean valid) {
        this.score = score;
        this.letterGrade = letterGrade;
        this.status = status;
        this.gpaCoefficient = gpaCoefficient;
        this.valid = valid;
    }

    public static GradeResult invalid(double score) {
        return new GradeResult(score, "N/A", "Invalid Grade (Must be between 0 and 100)", -1.0, false);
    }

    public double getScore() {
        return score;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public String getStatus() {
        return status;
    }

    public double getGpaCoefficient() {
        return gpaCoefficient;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public String toString() {
        if (!valid) {
            return String.format("[Score: %.1f] -> %s", score, status);
        }
        return String.format("[Score: %.1f] -> Letter: %s | Standing: %s | GPA: %.1f",
                score, letterGrade, status, gpaCoefficient);
    }
}
