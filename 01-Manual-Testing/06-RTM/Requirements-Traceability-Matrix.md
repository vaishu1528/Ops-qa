# Requirements Traceability Matrix

## Project: WellOps QA Portfolio

The Requirement Traceability Matrix (RTM) establishes traceability between business requirements and corresponding test cases.

It helps ensure that all identified requirements are covered by testing and provides visibility into requirement-to-test-case coverage.

---

## RTM

| Requirement ID | Module | Requirement | Test Case IDs | Coverage |
|---|---|---|---|---|
| REQ-AUTH-001 | Authentication | User shall be able to log in using valid credentials. | TC-AUTH-001, TC-AUTH-002, TC-AUTH-015 | Covered |
| REQ-AUTH-002 | Authentication | Application shall reject invalid authentication credentials. | TC-AUTH-003, TC-AUTH-004 | Covered |
| REQ-AUTH-003 | Authentication | Application shall validate mandatory login fields. | TC-AUTH-005 | Covered |
| REQ-AUTH-004 | Authentication | User shall be able to log out securely. | TC-AUTH-009, TC-AUTH-010 | Covered |
| REQ-AUTH-005 | Authentication | Application shall enforce role-based access. | TC-AUTH-011, TC-AUTH-015 | Covered |
| REQ-WELL-001 | Well Management | User shall be able to view available wells. | TC-WELL-001, TC-WELL-013 | Covered |
| REQ-WELL-002 | Well Management | Authorized users shall be able to create wells. | TC-WELL-002, TC-WELL-003 | Covered |
| REQ-WELL-003 | Well Management | Application shall prevent duplicate wells. | TC-WELL-004 | Covered |
| REQ-WELL-004 | Well Management | User shall be able to search for wells. | TC-WELL-005, TC-WELL-006, TC-WELL-007 | Covered |
| REQ-WELL-005 | Well Management | User shall be able to filter wells by status. | TC-WELL-008, TC-WELL-009 | Covered |
| REQ-WELL-006 | Well Management | Authorized users shall be able to update well information. | TC-WELL-010, TC-WELL-012 | Covered |
| REQ-WELL-007 | Well Management | Application shall support role-based Well Management access. | TC-WELL-015 | Covered |
| REQ-WINFO-001 | Well Information | User shall be able to view well information. | TC-WINFO-001, TC-WINFO-002 | Covered |
| REQ-WINFO-002 | Well Information | Authorized users shall be able to update well information. | TC-WINFO-003, TC-WINFO-013 | Covered |
| REQ-WINFO-003 | Well Information | Application shall validate Well Information input. | TC-WINFO-004, TC-WINFO-005, TC-WINFO-007, TC-WINFO-008 | Covered |
| REQ-WB-001 | Wellbore | User shall be able to view wellbore configuration. | TC-WB-001, TC-WB-002, TC-WB-003 | Covered |
| REQ-WB-002 | Wellbore | Authorized users shall be able to add casing and tubing information. | TC-WB-004, TC-WB-005 | Covered |
| REQ-WB-003 | Wellbore | Application shall validate wellbore configuration data. | TC-WB-006, TC-WB-007, TC-WB-008, TC-WB-009 | Covered |
| REQ-WB-004 | Wellbore | Application shall maintain wellbore data integrity. | TC-WB-010, TC-WB-011, TC-WB-012, TC-WB-014, TC-WB-015 | Covered |
| REQ-DS-001 | Directional Survey | User shall be able to view directional survey data. | TC-DS-001, TC-DS-002 | Covered |
| REQ-DS-002 | Directional Survey | Authorized users shall be able to add and update survey data. | TC-DS-003, TC-DS-011 | Covered |
| REQ-DS-003 | Directional Survey | Application shall validate directional survey values. | TC-DS-004, TC-DS-006, TC-DS-007, TC-DS-008, TC-DS-009 | Covered |
| REQ-DS-004 | Directional Survey | Application shall calculate survey-derived values correctly. | TC-DS-015 | Covered |
| REQ-TREAT-001 | Treatment | User shall be able to view treatment records. | TC-TREAT-001, TC-TREAT-002 | Covered |
| REQ-TREAT-002 | Treatment | Authorized users shall be able to create treatment records. | TC-TREAT-003, TC-TREAT-004 | Covered |
| REQ-TREAT-003 | Treatment | Application shall validate treatment data. | TC-TREAT-006, TC-TREAT-007, TC-TREAT-008 | Covered |
| REQ-TREAT-004 | Treatment | Authorized users shall be able to update treatment records. | TC-TREAT-010, TC-TREAT-012 | Covered |
| REQ-TREAT-005 | Treatment | Treatment data shall remain associated with the correct well. | TC-TREAT-014, TC-TREAT-015 | Covered |
| REQ-ENG-001 | Engineering | User shall be able to perform MiniFrac analysis. | TC-MF-001, TC-MF-002, TC-MF-030 | Covered |
| REQ-ENG-002 | Engineering | MiniFrac calculations shall produce correct engineering results. | TC-MF-004, TC-MF-005, TC-MF-006, TC-MF-007, TC-MF-015, TC-MF-016, TC-MF-017 | Covered |
| REQ-ENG-003 | Engineering | MiniFrac plots shall be generated correctly. | TC-MF-011, TC-MF-012, TC-MF-013, TC-MF-014 | Covered |
| REQ-ENG-004 | Engineering | MiniFrac results shall integrate correctly with application/API data. | TC-MF-020, TC-MF-023, TC-MF-024 | Covered |
| REQ-REP-001 | Reports | User shall be able to generate reports. | TC-REP-001, TC-REP-002 | Covered |
| REQ-REP-002 | Reports | Reports shall contain accurate application data. | TC-REP-003, TC-REP-010 | Covered |
| REQ-REP-003 | Reports | User shall be able to filter and export reports. | TC-REP-006, TC-REP-007, TC-REP-009 | Covered |
| REQ-REP-004 | Reports | Reports shall enforce appropriate access control. | TC-REP-012 | Covered |
| REQ-NFR-001 | Performance | Application should remain responsive during normal operations. | TC-MF-028 | Covered |
| REQ-NFR-002 | Security | Application shall restrict unauthorized operations. | TC-AUTH-011, TC-WELL-015, TC-WINFO-012, TC-REP-012 | Covered |
| REQ-NFR-003 | Data Integrity | Application shall maintain data consistency across modules. | TC-WINFO-015, TC-WB-015, TC-TREAT-015, TC-MF-026, TC-REP-010 | Covered |
| REQ-NFR-004 | Usability | Application UI shall provide clear controls and validation feedback. | TC-AUTH-013, TC-MF-027, TC-REP-014 | Covered |
| REQ-NFR-005 | Reliability | Application shall handle invalid and incomplete data without data corruption. | TC-MF-009, TC-MF-010, TC-MF-029, TC-REP-013 | Covered |

---

## Traceability Flow

```text
Requirement
     ↓
Test Scenario
     ↓
Test Case
     ↓
Test Execution
     ↓
Defect
     ↓
Retesting
     ↓
Regression
     ↓
Test Summary

Coverage Summary

| Metric                              | Status  |
| ----------------------------------- | ------- |
| Authentication Requirements         | Covered |
| Well Management Requirements        | Covered |
| Well Information Requirements       | Covered |
| Wellbore Requirements               | Covered |
| Directional Survey Requirements     | Covered |
| Treatment Requirements              | Covered |
| Engineering / MiniFrac Requirements | Covered |
| Reporting Requirements              | Covered |
| Non-Functional Requirements         | Covered |

Purpose of RTM

The RTM provides:

Requirement-to-test-case traceability
Requirement coverage visibility
Identification of untested requirements
Support for regression planning
Support for release readiness
Improved auditability of QA activities
