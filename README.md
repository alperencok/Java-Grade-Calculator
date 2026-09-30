# Java Grade Calculator

A simple Java application that evaluates numeric student exam scores (0–100) and converts them into letter grades, performance standing, and GPA coefficients.

## Grading Scale

| Score Range | Letter Grade | Academic Standing | GPA |
| :---: | :---: | :--- | :---: |
| 90.0 - 100.0 | AA | Successful (Passed) | 4.0 |
| 85.0 - 89.9 | BA | Successful (Passed) | 3.5 |
| 75.0 - 84.9 | BB | Successful (Passed) | 3.0 |
| 65.0 - 74.9 | CB | Successful (Passed) | 2.5 |
| 60.0 - 64.9 | CC | Successful (Passed) | 2.0 |
| 50.0 - 59.9 | DC | Conditionally Successful | 1.5 |
| 45.0 - 49.9 | DD | Conditionally Successful | 1.0 |
| 40.0 - 44.9 | FD | Failed | 0.5 |
| 0.0 - 39.9 | FF | Failed | 0.0 |

## Files

- `GradeResult.java`: Result model representing letter grade, standing, and GPA.
- `GradeCalculator.java`: Core evaluation logic and interactive console mode.
- `GradeCalculatorTest.java`: Automated boundary test suite.

## How to Run

### Interactive Mode
```bash
javac GradeResult.java GradeCalculator.java
java GradeCalculator
```

### Run Tests
```bash
javac GradeResult.java GradeCalculator.java GradeCalculatorTest.java
java GradeCalculatorTest
```

## Author

- **alperencok** (https://github.com/alperencok)

## License

This project is licensed under the MIT License.
