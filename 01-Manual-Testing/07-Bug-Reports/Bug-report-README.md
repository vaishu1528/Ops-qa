# Bug Reports

This section demonstrates defect identification, documentation, severity and priority classification, retesting, and defect lifecycle management.

All defects documented in this portfolio are fictional and created for demonstration purposes.

---

## Defect Management Process

```text
Defect Identification
        ↓
Defect Logging
        ↓
Severity & Priority Assignment
        ↓
Developer Analysis
        ↓
Defect Fix
        ↓
QA Retesting
        ↓
Regression Testing
        ↓
Defect Closure

Defect Report Template
| Field              | Details                                                           |
| ------------------ | ----------------------------------------------------------------- |
| Bug ID             | BUG-XXX-001                                                       |
| Title              | Short and descriptive defect title                                |
| Module             | Application module                                                |
| Requirement ID     | Related requirement ID                                            |
| Test Case ID       | Related test case ID                                              |
| Environment        | QA / UAT / Staging                                                |
| Severity           | Critical / High / Medium / Low                                    |
| Priority           | P1 / P2 / P3 / P4                                                 |
| Status             | New / Assigned / In Progress / Fixed / Retest / Closed / Reopened |
| Reported By        | QA                                                                |
| Assigned To        | Developer                                                         |
| Preconditions      | Required conditions before execution                              |
| Test Data          | Data used during validation                                       |
| Steps to Reproduce | Steps required to reproduce the defect                            |
| Expected Result    | Expected application behavior                                     |
| Actual Result      | Actual application behavior                                       |
| Evidence           | Screenshot / Video / Logs                                         |
| Root Cause         | Identified technical or functional cause                          |
| Fix Details        | Description of implemented fix                                    |
| Retest Result      | Passed / Failed                                                   |
| Regression Result  | Passed / Failed                                                   |
| Comments           | Additional information                                            |

Defect Severity

| Severity | Description                                                                             |
| -------- | --------------------------------------------------------------------------------------- |
| Critical | Application crash, data loss, security issue, or major business flow completely blocked |
| High     | Major functionality is unavailable or produces incorrect business results               |
| Medium   | Functionality is partially impacted but a workaround is available                       |
| Low      | Minor UI, usability, formatting, or cosmetic issue                                      |

Defect Priority

| Priority      | Description                                  |
| ------------- | -------------------------------------------- |
| P1 - Critical | Requires immediate attention                 |
| P2 - High     | Should be fixed before release               |
| P3 - Medium   | Should be addressed in the planned release   |
| P4 - Low      | Can be addressed based on available capacity |

Defect Lifecycle

New
 ↓
Assigned
 ↓
In Progress
 ↓
Fixed
 ↓
Ready for Retest
 ↓
QA Retesting
 ↓
Passed
 ↓
Closed

If the defect fails during retesting:
Ready for Retest
       ↓
   QA Retesting
       ↓
     Failed
       ↓
    Reopened
       ↓
   Developer Fix
       ↓
    QA Retest

BUG-001 — Login Accepts Invalid Password
Defect Information

| Field          | Details                                      |
| -------------- | -------------------------------------------- |
| Bug ID         | BUG-AUTH-001                                 |
| Title          | Login allows access with an invalid password |
| Module         | Authentication                               |
| Requirement ID | REQ-AUTH-001                                 |
| Test Case ID   | TC-AUTH-002                                  |
| Environment    | QA                                           |
| Severity       | Critical                                     |
| Priority       | P1 - Critical                                |
| Status         | Closed                                       |
| Reported By    | QA                                           |
| Assigned To    | Development Team                             |

Preconditions
Valid demo user account exists.
User is on the WellOps login page.
Application is available in the QA environment.
Test Data

Username: engineer.demo
Password: Invalid@123

Steps to Reproduce
Navigate to the WellOps login page.
Enter a valid registered username.
Enter an incorrect password.
Click the Login button.
Observe the application response.
Expected Result

The application should reject the login attempt and display an appropriate authentication error message.

Actual Result

The application authenticated the user and redirected to the Dashboard even though an incorrect password was entered.

Root Cause

Authentication validation was not correctly enforcing password verification.

Fix Details

Password validation was updated to verify the entered password against the authenticated user credentials before creating a session.

Retest Result

Passed.

Regression Result

Passed.

Final Status

Closed.

