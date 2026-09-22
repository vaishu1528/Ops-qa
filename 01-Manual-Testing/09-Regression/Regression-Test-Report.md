# Regression Test Report

## WellOps QA Portfolio — Regression Testing

This document demonstrates the regression testing approach used to verify that application changes, defect fixes, and enhancements have not negatively impacted existing functionality.

All test results and data in this document are fictional and created for portfolio demonstration purposes.

---

# 1. Regression Testing Overview

| Field | Details |
|---|---|
| Project | WellOps — Oil & Gas Well Operations Management System |
| Testing Type | Regression Testing |
| Regression Cycle | Regression Cycle 1 |
| Environment | QA |
| Build Version | WellOps QA Build 1.1 |
| Previous Build | WellOps QA Build 1.0 |
| Execution Start Date | 2026-09-08 |
| Execution End Date | 2026-09-10 |
| Executed By | QA Team |
| Total Regression Test Cases | 60 |
| Executed | 60 |
| Passed | 57 |
| Failed | 3 |
| Blocked | 0 |
| Not Executed | 0 |
| Pass Percentage | 95.00% |
| Overall Status | Completed with Minor Issues |

---

# 2. Regression Testing Objective

The objective of regression testing is to verify that recent defect fixes and application changes have not introduced new issues into existing functionality.

Regression testing focuses on:

- Previously failed scenarios
- Critical business workflows
- Impacted modules
- Related dependent functionality
- Authentication and authorization
- Data persistence
- Engineering calculations
- Report generation
- Cross-module workflows
- High-risk areas

---

# 3. Regression Entry Criteria

Regression testing starts when:

- Required build is deployed to QA.
- Critical defects are fixed.
- Application is available and stable.
- Required test data is available.
- Major blockers are resolved.
- Smoke testing is completed successfully.

---

# 4. Regression Exit Criteria

Regression testing is considered complete when:

- All planned regression test cases are executed.
- Critical and high-risk scenarios are validated.
- Fixed defects are successfully retested.
- No unresolved Critical defects remain.
- Regression failures are documented.
- Test execution results are recorded.
- Regression summary is prepared.

---

# 5. Regression Scope

The following areas were included in the regression cycle:

- Authentication
- Well Management
- Well Information
- Wellbore Configuration
- Directional Survey
- MiniFrac
- Reports
- Role-Based Access
- Data Validation
- Cross-Module Navigation
- End-to-End Business Flow

---

# 6. Regression Test Selection Strategy

Regression test cases were selected using the following criteria:

| Selection Criteria | Description |
|---|---|
| Defect-Based | Test cases related to recently fixed defects |
| Impact-Based | Test cases covering functionality impacted by code changes |
| Risk-Based | High-risk and business-critical scenarios |
| Business Flow | Important end-to-end workflows |
| Integration | Tests covering interaction between modules |
| Data Validation | Tests verifying data persistence and consistency |
| Security | Authentication and authorization scenarios |

---

# 7. Regression Test Execution Summary

| Result | Count | Percentage |
|---|---:|---:|
| Total Regression Test Cases | 60 | 100% |
| Executed | 60 | 100% |
| Passed | 57 | 95.00% |
| Failed | 3 | 5.00% |
| Blocked | 0 | 0% |
| Not Executed | 0 | 0% |

---

# 8. Module-Wise Regression Summary

| Module | Total TC | Executed | Passed | Failed | Blocked |
|---|---:|---:|---:|---:|---:|
| Authentication | 8 | 8 | 8 | 0 | 0 |
| Well Management | 8 | 8 | 7 | 1 | 0 |
| Well Information | 8 | 8 | 8 | 0 | 0 |
| Wellbore Configuration | 7 | 7 | 7 | 0 | 0 |
| Directional Survey | 7 | 7 | 7 | 0 | 0 |
| MiniFrac | 14 | 14 | 12 | 2 | 0 |
| Reports | 5 | 5 | 5 | 0 | 0 |
| Cross-Module / E2E | 3 | 3 | 3 | 0 | 0 |
| **Total** | **60** | **60** | **57** | **3** | **0** |

---

# 9. Authentication Regression

| Test Case ID | Scenario | Result | Defect Reference |
|---|---|---|---|
| TC-AUTH-001 | Valid login | Pass | — |
| TC-AUTH-002 | Invalid password rejection | Pass | BUG-AUTH-001 |
| TC-AUTH-006 | Password masking | Pass | — |
| TC-AUTH-008 | Logout functionality | Pass | — |
| TC-AUTH-009 | Browser back after logout | Pass | — |
| TC-AUTH-010 | Viewer login | Pass | — |
| TC-AUTH-011 | Session expiration | Pass | — |
| TC-AUTH-013 | Failed login handling | Pass | — |

---

# 10. Well Management Regression

| Test Case ID | Scenario | Result | Defect Reference |
|---|---|---|---|
| TC-WELL-002 | Create new well | Pass | — |
| TC-WELL-003 | Mandatory validation | Pass | — |
| TC-WELL-004 | Duplicate Well ID validation | Pass | BUG-WELL-001 |
| TC-WELL-005 | Well search | Pass | — |
| TC-WELL-008 | Active well filter | Pass | — |
| TC-WELL-009 | Inactive well filter | Pass | — |
| TC-WELL-010 | Edit well | Fail | — |
| TC-WELL-012 | Well status update | Pass | — |

### Regression Observation

The duplicate Well ID defect was successfully fixed and passed regression validation.

The Well Edit scenario failed during regression because the updated status value was not refreshed correctly in the Well Management list.

---

# 11. Well Information Regression

| Test Case ID | Scenario | Result | Defect Reference |
|---|---|---|---|
| TC-WINFO-002 | Existing data display | Pass | — |
| TC-WINFO-003 | Edit well information | Pass | — |
| TC-WINFO-004 | Mandatory validation | Pass | — |
| TC-WINFO-008 | Data persistence | Pass | BUG-WINFO-001 |
| TC-WINFO-009 | Cancel modification | Pass | — |
| TC-WINFO-010 | Viewer edit restriction | Pass | BUG-RBAC-001 |
| TC-WINFO-011 | Save confirmation | Pass | — |
| TC-WINFO-015 | Data integrity | Pass | — |

---

# 12. Wellbore Configuration Regression

| Test Case ID | Scenario | Result | Defect Reference |
|---|---|---|---|
| TC-WB-001 | Page load | Pass | — |
| TC-WB-003 | Add casing | Pass | — |
| TC-WB-004 | Mandatory validation | Pass | — |
| TC-WB-005 | Numeric validation | Pass | — |
| TC-WB-008 | Edit casing | Pass | — |
| TC-WB-009 | Delete casing | Pass | — |
| TC-WB-011 | Data persistence | Pass | — |

---

# 13. Directional Survey Regression

| Test Case ID | Scenario | Result | Defect Reference |
|---|---|---|---|
| TC-DS-002 | Existing survey records | Pass | — |
| TC-DS-003 | Add survey record | Pass | — |
| TC-DS-005 | Numeric validation | Pass | — |
| TC-DS-006 | Negative inclination validation | Pass | BUG-DS-001 |
| TC-DS-007 | Inclination boundary | Pass | — |
| TC-DS-008 | Azimuth boundary | Pass | — |
| TC-DS-013 | Data persistence | Pass | — |

---

# 14. MiniFrac Regression

| Test Case ID | Scenario | Result | Defect Reference |
|---|---|---|---|
| TC-MF-002 | Valid engineering inputs | Pass | — |
| TC-MF-004 | Clean Volume calculation | Pass | BUG-MF-001 |
| TC-MF-005 | Step Slurry calculation | Pass | — |
| TC-MF-006 | Rho calculation | Pass | — |
| TC-MF-010 | ISIP Plot | Pass | — |
| TC-MF-011 | SQRT Plot | Pass | — |
| TC-MF-012 | G-Function Plot | Pass | — |
| TC-MF-013 | Log-Log Plot | Pass | — |
| TC-MF-014 | Pump Time | Pass | — |
| TC-MF-015 | Closure Time | Pass | — |
| TC-MF-016 | G-Function calculation | Pass | — |
| TC-MF-018 | Recalculation after input change | Fail | — |
| TC-MF-023 | Slope validation | Pass | — |
| TC-MF-024 | Tangent validation | Fail | — |

### Regression Observation

The Clean Volume calculation defect was successfully fixed and passed regression.

Two MiniFrac scenarios continued to fail during regression:

- Recalculation after changing engineering input values
- Tangent validation

These failures require additional investigation and defect tracking.

---

# 15. Reports Regression

| Test Case ID | Scenario | Result | Defect Reference |
|---|---|---|---|
| TC-REP-002 | Generate report | Pass | — |
| TC-REP-003 | Well data accuracy | Pass | — |
| TC-REP-004 | MiniFrac report | Pass | — |
| TC-REP-008 | Report download | Pass | BUG-REP-001 |
| TC-REP-009 | Report data consistency | Pass | — |

---

# 16. Cross-Module Regression

| Test Case ID | Scenario | Result |
|---|---|---|
| TC-E2E-001 | Login → Well → Well Information → Report | Pass |
| TC-E2E-002 | Well → Wellbore → Directional Survey | Pass |
| TC-E2E-003 | Well → MiniFrac → Report | Pass |

---

# 17. Regression Failures

| Test Case | Module | Failure | Severity | Status |
|---|---|---|---|---|
| TC-WELL-010 | Well Management | Updated status not refreshed in list | Medium | Open |
| TC-MF-018 | MiniFrac | Recalculation did not update correctly | High | Open |
| TC-MF-024 | MiniFrac | Tangent validation produced incorrect result | High | Open |

---

# 18. Defect Retest Summary

| Defect ID | Original Issue | Retest Result | Regression Result |
|---|---|---|---|
| BUG-AUTH-001 | Invalid password accepted | Pass | Pass |
| BUG-WELL-001 | Duplicate Well ID accepted | Pass | Pass |
| BUG-WINFO-001 | Well information not persisted | Pass | Pass |
| BUG-RBAC-001 | Viewer could edit Well Information | Pass | Pass |
| BUG-DS-001 | Negative inclination accepted | Pass | Pass |
| BUG-MF-001 | Incorrect Clean Volume calculation | Pass | Pass |
| BUG-REP-001 | Empty report download | Pass | Pass |

---

# 19. Regression Metrics

### Regression Execution Coverage

```text
Execution Coverage = Executed / Total × 100

                   = 60 / 60 × 100

                   = 100%
