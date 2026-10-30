# Software Quality Engineering – Lab 01

## Task 2: Average.java – Defect Report

### BUG-01: Incorrect Average Calculation

| Field | Details |
|---|---|
| Defect ID | BUG-01 |
| Title | Incorrect Average Calculation |
| Severity | Medium |
| Program | Average.java |
| Steps to Reproduce | Run the program with marks 60, 70, 80 |
| Expected Result | Average: 70.0 |
| Actual Result | Average: 43.333333333333336 |
| Root Cause | Loop condition excluded the last array element. |
| Status | Fixed |

### Error, Fault and Failure

- **Error:** Programmer made a mistake while writing the loop condition.
- **Fault:** The loop condition used `marks.length - 1`, which excluded the last element.
- **Failure:** The program displayed an incorrect average of 43.333333333333336 instead of 70.0.

### Correction

Removed `- 1` from the loop condition.

Corrected condition:

`i < marks.length`

### Final Output

`Average: 70.0`

## Task 3: QA, QC, Testing, Verification and Validation

### 1. Difference between QA, QC and Testing

| Activity | Description |
|---|---|
| Quality Assurance (QA) | Process-oriented and preventive. It aims to prevent defects. |
| Quality Control (QC) | Product-oriented and detective. It aims to detect defects. |
| Software Testing | Executing software to find defects. Testing is a QC activity. |

### 2. Difference between Verification and Validation

| Verification | Validation |
|---|---|
| Checks whether the product is being built according to specifications and design. | Checks whether the product meets actual user needs. |
| Are we building the product right? | Are we building the right product? |
| Reviews, walkthroughs, inspections and static analysis. | Software execution, system testing and acceptance testing. |

## Task 5: Calculator Test Cases

| Test Case ID | Operation | Input | Expected Result |
|---|---|---|---|
| TC-01 | Addition | 2 + 3 | 5 |
| TC-02 | Addition (Negative) | -2 + -3 | -5 |
| TC-03 | Subtraction | 10 - 5 | 5 |
| TC-04 | Multiplication | 10 × 5 | 50 |
| TC-05 | Division | 10 ÷ 5 | 2 |
| TC-06 | Division by Zero | 10 ÷ 0 | ArithmeticException |

### BUG-02: Incorrect Multiplication Calculation

- **Defect ID:** BUG-02
- **Title:** Incorrect Multiplication Result
- **Severity:** Medium
- **Program:** Calculator.java
- **Test Case:** TC-04
- **Steps to Reproduce:** Call `multiply(10, 5)`.
- **Expected Result:** 50
- **Actual Result:** 15
- **Root Cause:** The multiplication method used the addition operator (`+`) instead of the multiplication operator (`*`).
- **Status:** Fixed (after correction)

**Correction:**

Changed:

`return a + b;`

To:

`return a * b;`

**Final Result:** The multiplication test passes after fixing the defect.

## Task 6: GitHub Repository

**GitHub Repository Link:**  
https://github.com/aliriaz199/SQE-lab-SE-241054

### Screenshots

1. Task 1 – JDK, Git and Maven Tool Verification
2. Task 4 – JUnit Test Success (10 Tests Passed)
3. Task 4 – JUnit Test Failure (Intentional Failure)

All project files, source code, test cases, lab report and screenshots have been uploaded to the GitHub repository.