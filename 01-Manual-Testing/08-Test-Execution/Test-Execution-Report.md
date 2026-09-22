# Test Execution Report

## WellOps QA Portfolio — Test Execution

This document demonstrates the execution and reporting of manual test cases for the fictional WellOps Oil & Gas Well Operations Management System.

All execution results and test data are fictional and created for portfolio demonstration purposes.

---

# 1. Test Execution Overview

| Field | Details |
|---|---|
| Project | WellOps — Oil & Gas Well Operations Management System |
| Testing Type | Manual Testing |
| Test Cycle | Cycle 1 — Functional & Regression Testing |
| Environment | QA |
| Build Version | WellOps QA Build 1.0 |
| Execution Start Date | 2026-09-01 |
| Execution End Date | 2026-09-05 |
| Executed By | QA Team |
| Total Test Cases | 120 |
| Passed | 105 |
| Failed | 8 |
| Blocked | 2 |
| Not Executed | 5 |
| Execution Completed | 115 |
| Pass Percentage | 91.30% |
| Overall Status | Completed with Defects |

---

# 2. Test Execution Objective

The objective of this test cycle is to validate the functional behavior, data validation, role-based access, calculations, UI behavior, integration points, and reporting functionality of the WellOps application.

The execution covers:

- Functional Testing
- Positive Testing
- Negative Testing
- Boundary Testing
- UI Testing
- Data Validation
- Role-Based Access Testing
- Integration Testing
- Regression Testing
- End-to-End Validation

---

# 3. Test Execution Summary

| Test Result | Count | Percentage |
|---|---:|---:|
| Total Test Cases | 120 | 100% |
| Passed | 105 | 87.50% |
| Failed | 8 | 6.67% |
| Blocked | 2 | 1.67% |
| Not Executed | 5 | 4.17% |
| Executed | 115 | 95.83% |

### Pass Percentage

```text
Pass Percentage = Passed / Executed × 100

              = 105 / 115 × 100

              = 91.30%

4. Module-Wise Execution Summary

| Module                 | Total TC | Executed |  Passed | Failed | Blocked | Not Executed |
| ---------------------- | -------: | -------: | ------: | -----: | ------: | -----------: |
| Authentication         |       15 |       15 |      13 |      1 |       0 |            1 |
| Well Management        |       15 |       14 |      12 |      1 |       0 |            1 |
| Well Information       |       15 |       14 |      13 |      1 |       0 |            1 |
| Wellbore Configuration |       15 |       14 |      13 |      1 |       0 |            1 |
| Directional Survey     |       15 |       15 |      14 |      1 |       0 |            0 |
| MiniFrac               |       30 |       28 |      24 |      3 |       1 |            2 |
| Reports                |       15 |       15 |      14 |      1 |       0 |            0 |
| Cross-Module / E2E     |        5 |        0 |       2 |      0 |       1 |            2 |
| **Total**              |  **120** |  **115** | **105** |  **8** |   **2** |        **5** |

5. Authentication Execution

| Test Case ID | Scenario                                | Result       | Defect ID    |
| ------------ | --------------------------------------- | ------------ | ------------ |
| TC-AUTH-001  | Valid login with registered credentials | Pass         | —            |
| TC-AUTH-002  | Invalid password validation             | Fail         | BUG-AUTH-001 |
| TC-AUTH-003  | Blank username validation               | Pass         | —            |
| TC-AUTH-004  | Blank password validation               | Pass         | —            |
| TC-AUTH-005  | Username format validation              | Pass         | —            |
| TC-AUTH-006  | Password masking                        | Pass         | —            |
| TC-AUTH-007  | Leading/trailing whitespace validation  | Pass         | —            |
| TC-AUTH-008  | Logout functionality                    | Pass         | —            |
| TC-AUTH-009  | Browser back after logout               | Pass         | —            |
| TC-AUTH-010  | Viewer login validation                 | Pass         | —            |
| TC-AUTH-011  | Session expiration                      | Pass         | —            |
| TC-AUTH-012  | UI validation                           | Pass         | —            |
| TC-AUTH-013  | Failed login handling                   | Pass         | —            |
| TC-AUTH-014  | Successful retry after failed login     | Pass         | —            |
| TC-AUTH-015  | Authentication security validation      | Not Executed | —            |

6. Well Management Execution

| Test Case ID | Scenario                   | Result       | Defect ID    |
| ------------ | -------------------------- | ------------ | ------------ |
| TC-WELL-001  | Well Management page load  | Pass         | —            |
| TC-WELL-002  | Create new well            | Pass         | —            |
| TC-WELL-003  | Mandatory field validation | Pass         | —            |
| TC-WELL-004  | Duplicate well validation  | Fail         | BUG-WELL-001 |
| TC-WELL-005  | Search by Well ID          | Pass         | —            |
| TC-WELL-006  | Partial search             | Pass         | —            |
| TC-WELL-007  | No search results handling | Pass         | —            |
| TC-WELL-008  | Active well filter         | Pass         | —            |
| TC-WELL-009  | Inactive well filter       | Pass         | —            |
| TC-WELL-010  | Edit well information      | Pass         | —            |
| TC-WELL-011  | Cancel edit operation      | Pass         | —            |
| TC-WELL-012  | Well status update         | Pass         | —            |
| TC-WELL-013  | Well details validation    | Pass         | —            |
| TC-WELL-014  | Pagination                 | Pass         | —            |
| TC-WELL-015  | Role-based access          | Not Executed | —            |

7. Well Information Execution

| Test Case ID | Scenario                        | Result | Defect ID     |
| ------------ | ------------------------------- | ------ | ------------- |
| TC-WINFO-001 | Well Information page load      | Pass   | —             |
| TC-WINFO-002 | Existing well data display      | Pass   | —             |
| TC-WINFO-003 | Edit well information           | Pass   | —             |
| TC-WINFO-004 | Mandatory field validation      | Pass   | —             |
| TC-WINFO-005 | Invalid data validation         | Pass   | —             |
| TC-WINFO-006 | Data type validation            | Pass   | —             |
| TC-WINFO-007 | Maximum field length validation | Pass   | —             |
| TC-WINFO-008 | Data persistence after save     | Fail   | BUG-WINFO-001 |
| TC-WINFO-009 | Cancel modification             | Pass   | —             |
| TC-WINFO-010 | Viewer edit restriction         | Fail   | BUG-RBAC-001  |
| TC-WINFO-011 | Save confirmation               | Pass   | —             |
| TC-WINFO-012 | Navigation validation           | Pass   | —             |
| TC-WINFO-013 | Well switching validation       | Pass   | —             |
| TC-WINFO-014 | Special character validation    | Pass   | —             |
| TC-WINFO-015 | Data integrity validation       | Pass   | —             |

8. Wellbore Configuration Execution

| Test Case ID | Scenario                     | Result       | Defect ID |
| ------------ | ---------------------------- | ------------ | --------- |
| TC-WB-001    | Wellbore page load           | Pass         | —         |
| TC-WB-002    | Existing casing display      | Pass         | —         |
| TC-WB-003    | Add casing configuration     | Pass         | —         |
| TC-WB-004    | Mandatory field validation   | Pass         | —         |
| TC-WB-005    | Numeric validation           | Pass         | —         |
| TC-WB-006    | Negative value validation    | Pass         | —         |
| TC-WB-007    | Duplicate casing validation  | Fail         | —         |
| TC-WB-008    | Edit casing configuration    | Pass         | —         |
| TC-WB-009    | Delete casing configuration  | Pass         | —         |
| TC-WB-010    | Cancel configuration changes | Pass         | —         |
| TC-WB-011    | Data persistence             | Pass         | —         |
| TC-WB-012    | Tubing configuration         | Pass         | —         |
| TC-WB-013    | Configuration validation     | Pass         | —         |
| TC-WB-014    | Well association validation  | Pass         | —         |
| TC-WB-015    | UI validation                | Not Executed | —         |

9. MiniFrac Execution
| Test Case ID | Scenario                         | Result       | Defect ID  |
| ------------ | -------------------------------- | ------------ | ---------- |
| TC-MF-001    | MiniFrac module load             | Pass         | —          |
| TC-MF-002    | Valid engineering inputs         | Pass         | —          |
| TC-MF-003    | Mandatory field validation       | Pass         | —          |
| TC-MF-004    | Clean Volume calculation         | Fail         | BUG-MF-001 |
| TC-MF-005    | Step Slurry calculation          | Pass         | —          |
| TC-MF-006    | Rho calculation                  | Pass         | —          |
| TC-MF-007    | Two flow rate validation         | Pass         | —          |
| TC-MF-008    | Zero flow rate validation        | Pass         | —          |
| TC-MF-009    | Negative flow rate validation    | Pass         | —          |
| TC-MF-010    | ISIP Plot validation             | Pass         | —          |
| TC-MF-011    | SQRT Plot validation             | Pass         | —          |
| TC-MF-012    | G-Function Plot validation       | Pass         | —          |
| TC-MF-013    | Log-Log Plot validation          | Pass         | —          |
| TC-MF-014    | Pump Time calculation            | Pass         | —          |
| TC-MF-015    | Closure Time calculation         | Pass         | —          |
| TC-MF-016    | G-Function calculation           | Pass         | —          |
| TC-MF-017    | Engineering parameter validation | Pass         | —          |
| TC-MF-018    | Recalculation after input change | Fail         | —          |
| TC-MF-019    | Data persistence                 | Pass         | —          |
| TC-MF-020    | Edit engineering parameters      | Pass         | —          |
| TC-MF-021    | Cancel modification              | Pass         | —          |
| TC-MF-022    | API and UI data consistency      | Pass         | —          |
| TC-MF-023    | Slope validation                 | Pass         | —          |
| TC-MF-024    | Tangent validation               | Fail         | —          |
| TC-MF-025    | Report generation                | Pass         | —          |
| TC-MF-026    | Correct well association         | Pass         | —          |
| TC-MF-027    | UI validation                    | Pass         | —          |
| TC-MF-028    | Large dataset validation         | Pass         | —          |
| TC-MF-029    | Incomplete dataset handling      | Blocked      | —          |
| TC-MF-030    | End-to-End MiniFrac workflow     | Not Executed | —          |

10. Defect Summary
| Bug ID        | Module             | Severity | Priority | Test Case    | Status |
| ------------- | ------------------ | -------- | -------- | ------------ | ------ |
| BUG-AUTH-001  | Authentication     | Critical | P1       | TC-AUTH-002  | Closed |
| BUG-WELL-001  | Well Management    | High     | P2       | TC-WELL-004  | Closed |
| BUG-WINFO-001 | Well Information   | High     | P2       | TC-WINFO-008 | Closed |
| BUG-RBAC-001  | Role-Based Access  | High     | P2       | TC-WINFO-010 | Closed |
| BUG-DS-001    | Directional Survey | Medium   | P2       | TC-DS-006    | Closed |
| BUG-MF-001    | MiniFrac           | High     | P2       | TC-MF-004    | Closed |
| BUG-REP-001   | Reports            | Medium   | P2       | TC-REP-008   | Closed |

11. Failed Test Cases

| Test Case ID | Module             | Failure Reason                               | Defect ID     |
| ------------ | ------------------ | -------------------------------------------- | ------------- |
| TC-AUTH-002  | Authentication     | Invalid password was accepted                | BUG-AUTH-001  |
| TC-WELL-004  | Well Management    | Duplicate Well ID was accepted               | BUG-WELL-001  |
| TC-WINFO-008 | Well Information   | Updated data was not persisted               | BUG-WINFO-001 |
| TC-WINFO-010 | Role-Based Access  | Viewer could edit Well Information           | BUG-RBAC-001  |
| TC-DS-006    | Directional Survey | Negative inclination was accepted            | BUG-DS-001    |
| TC-MF-004    | MiniFrac           | Clean Volume calculation was incorrect       | BUG-MF-001    |
| TC-MF-018    | MiniFrac           | Recalculation did not update correctly       | —             |
| TC-MF-024    | MiniFrac           | Tangent validation produced incorrect result | —             |
| TC-REP-008   | Reports            | Downloaded report was empty                  | BUG-REP-001   |

