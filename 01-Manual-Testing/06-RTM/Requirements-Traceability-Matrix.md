# Requirements Traceability Matrix (RTM)

## Document Information

| Field | Details |
|---|---|
| Document Name | Requirements Traceability Matrix |
| Application Type | Oil & Gas Well Operations Management System |
| Testing Type | Functional, Regression, Negative, Validation, Integration, Data Integrity |
| Test Environment | QA |
| Test Case Coverage | Login, Dashboard, Well Management, Well Information, Wellbore Configuration, Engineering Parameters, Treatment, MiniFrac / DFIT, Version Management |
| Traceability Direction | Requirement → Test Case |
| Test Data | Synthetic test data |
| Status | In Progress |

---

## 1. RTM Objective

The Requirements Traceability Matrix establishes traceability between documented requirements and corresponding test cases.

The RTM is used to:

- Verify that functional requirements are covered by test cases.
- Identify requirements without corresponding test coverage.
- Track test coverage during the testing lifecycle.
- Support regression testing and release readiness assessment.
- Identify gaps between requirements and implemented test scenarios.
- Provide a structured reference between requirements and validation activities.

---

## 2. Requirement Traceability Matrix

### 2.1 Authentication Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-AUTH-001 | User Authentication | TC-LOGIN-001, TC-LOGIN-002 | Covered | Ready |
| REQ-AUTH-002 | Invalid Credential Validation | TC-LOGIN-003, TC-LOGIN-004, TC-LOGIN-005 | Covered | Ready |
| REQ-AUTH-003 | Session Management | TC-LOGIN-006, TC-LOGIN-007 | Covered | Ready |
| REQ-AUTH-004 | Logout | TC-LOGIN-008, TC-LOGIN-009 | Covered | Ready |
| REQ-AUTH-005 | Role-Based Access Control | TC-LOGIN-010, TC-LOGIN-011, TC-LOGIN-012 | Covered | Ready |

---

### 2.2 Dashboard Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-DASH-001 | Dashboard Access | TC-DASH-001 | Covered | Ready |
| REQ-DASH-002 | Dashboard Information | TC-DASH-002, TC-DASH-003 | Covered | Ready |
| REQ-DASH-003 | Dashboard Navigation | TC-DASH-004, TC-DASH-005 | Covered | Ready |
| REQ-DASH-004 | Module Visibility | TC-DASH-006, TC-DASH-007 | Covered | Ready |

---

### 2.3 Well Management Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-WELL-001 | Pad Listing | TC-WELL-001, TC-WELL-002 | Covered | Ready |
| REQ-WELL-002 | Well Listing | TC-WELL-003 | Covered | Ready |
| REQ-WELL-003 | Well Search | TC-WELL-004, TC-WELL-005 | Covered | Ready |
| REQ-WELL-004 | Well Filtering | TC-WELL-006, TC-WELL-007 | Covered | Ready |
| REQ-WELL-005 | Well Selection | TC-WELL-008 | Covered | Ready |
| REQ-WELL-006 | Well Status | TC-WELL-009, TC-WELL-010 | Covered | Ready |
| REQ-WELL-007 | Well Navigation | TC-WELL-011, TC-WELL-012 | Covered | Ready |

---

### 2.4 Well Information Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-WINFO-001 | General Information Display | TC-WINFO-001, TC-WINFO-002 | Covered | Ready |
| REQ-WINFO-002 | General Information Maintenance | TC-WINFO-003, TC-WINFO-004 | Covered | Ready |
| REQ-WINFO-003 | Data Persistence | TC-WINFO-005, TC-WINFO-006 | Covered | Ready |
| REQ-WINFO-004 | Required Field Validation | TC-WINFO-007, TC-WINFO-008 | Covered | Ready |

---

### 2.5 Wellbore Configuration Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-WB-001 | Wellbore Configuration Access | TC-WB-001 | Covered | Ready |
| REQ-WB-002 | Wellbore Data Entry | TC-WB-002, TC-WB-003 | Covered | Ready |
| REQ-WB-003 | Wellbore Validation | TC-WB-004, TC-WB-005 | Covered | Ready |
| REQ-WB-004 | Wellbore Data Persistence | TC-WB-006, TC-WB-007 | Covered | Ready |
| REQ-WB-005 | Wellbore Sequence Validation | TC-WB-008, TC-WB-009 | Covered | Ready |

---

### 2.6 Engineering Parameter Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-ENG-001 | Engineering Parameter Access | TC-ENG-001 | Covered | Ready |
| REQ-ENG-002 | Engineering Parameter Input | TC-ENG-002, TC-ENG-003 | Covered | Ready |
| REQ-ENG-003 | Engineering Parameter Validation | TC-ENG-004, TC-ENG-005 | Covered | Ready |
| REQ-ENG-004 | Engineering Parameter Processing | TC-ENG-006, TC-ENG-007 | Covered | Ready |
| REQ-ENG-005 | Engineering Result Display | TC-ENG-008, TC-ENG-009 | Covered | Ready |

---

### 2.7 Treatment Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-TREAT-001 | Treatment Access | TC-TREAT-001 | Covered | Ready |
| REQ-TREAT-002 | Treatment Design | TC-TREAT-002, TC-TREAT-003 | Covered | Ready |
| REQ-TREAT-003 | Actual Treatment Data | TC-TREAT-004, TC-TREAT-005 | Covered | Ready |
| REQ-TREAT-004 | Treatment Totals | TC-TREAT-006, TC-TREAT-007 | Covered | Ready |
| REQ-TREAT-005 | Treatment Validation | TC-TREAT-008, TC-TREAT-009 | Covered | Ready |
| REQ-TREAT-006 | Treatment Data Persistence | TC-TREAT-010, TC-TREAT-011 | Covered | Ready |

---

### 2.8 MiniFrac / DFIT Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-MF-001 | MiniFrac / DFIT Access | TC-MF-001, TC-MF-002 | Covered | Ready |
| REQ-MF-002 | MiniFrac / DFIT Data Input | TC-MF-002 | Covered | Ready |
| REQ-MF-003 | MiniFrac / DFIT Validation | TC-MF-003, TC-MF-004, TC-MF-005, TC-MF-015 | Covered | Ready |
| REQ-MF-004 | Clean Volume Calculation | TC-MF-006, TC-MF-007 | Covered | Ready |
| REQ-MF-005 | Clean Rate Calculation | TC-MF-008 | Covered | Ready |
| REQ-MF-006 | ISIP Analysis | TC-MF-009 | Covered | Ready |
| REQ-MF-007 | Square Root Analysis | TC-MF-010 | Covered | Ready |
| REQ-MF-008 | G-Function Analysis | TC-MF-011 | Covered | Ready |
| REQ-MF-009 | Log-Log Analysis | TC-MF-012 | Covered | Ready |
| REQ-MF-010 | MiniFrac / DFIT Result Persistence | TC-MF-013, TC-MF-014 | Covered | Ready |

---

### 2.9 Version Management Requirements

| Requirement ID | Requirement Description | Test Case ID | Coverage | Status |
|---|---|---|---|---|
| REQ-VER-001 | Version Information Display | TC-VER-001, TC-VER-002, TC-VER-009 | Covered | Ready |
| REQ-VER-002 | Version Navigation | TC-VER-003, TC-VER-007 | Covered | Ready |
| REQ-VER-003 | Version Data Integrity | TC-VER-005, TC-VER-006, TC-VER-010, TC-VER-011, TC-VER-014 | Covered | Ready |
| REQ-VER-004 | Version Selection | TC-VER-004, TC-VER-008, TC-VER-013 | Covered | Ready |

---

## 3. Requirements Pending Test Case Coverage

The following requirements are defined in the Requirements Specification but their dedicated test-case documents have not yet been created.

| Requirement Area | Requirement IDs | Coverage Status |
|---|---|---|
| Location | REQ-LOC-001 to REQ-LOC-003 | Pending |
| Channel | REQ-CHANNEL-001 to REQ-CHANNEL-004 | Pending |
| Heat Transfer | REQ-HT-001 to REQ-HT-004 | Pending |
| Reservoir | REQ-RES-001 to REQ-RES-004 | Pending |
| Material | REQ-MAT-001 to REQ-MAT-004 | Pending |
| Comments | REQ-COM-001 to REQ-COM-004 | Pending |
| Reports | REQ-REP-001 to REQ-REP-005 | Pending |
| RBAC | REQ-RBAC-001 to REQ-RBAC-005 | Pending |
| Navigation | REQ-NAV-001 to REQ-NAV-004 | Pending |
| Data Validation | REQ-DATA-001 to REQ-DATA-006 | Partial |
| Non-Functional | REQ-NFR-001 to REQ-NFR-005 | Pending |
| Data Integrity | REQ-DI-001 to REQ-DI-005 | Partial |
| Audit | REQ-AUD-001 to REQ-AUD-003 | Pending |
| Error Handling | REQ-ERR-001 to REQ-ERR-004 | Partial |

---

## 4. Traceability Status Definitions

| Status | Definition |
|---|---|
| Covered | Requirement has one or more mapped test cases |
| Partial | Requirement has some indirect or supporting test coverage but dedicated coverage is incomplete |
| Pending | Dedicated test coverage has not yet been created |
| Ready | Requirement is mapped to an available test case and can be executed |

---

## 5. Coverage Summary

| Metric | Current Status |
|---|---:|
| Total Requirement Areas | 17 |
| Requirement Areas With Dedicated Test Cases | 9 |
| Requirement Areas Pending | 8 |
| Dedicated Test Case Modules Completed | 9 |
| Test Case Files Completed | 9 |
| RTM Status | In Progress |

---

## 6. Test Case Modules Currently Linked

| Test Case Module | Test Case Range | RTM Status |
|---|---|---|
| Login | TC-LOGIN-001 to TC-LOGIN-015 | Covered |
| Dashboard | TC-DASH-001 to TC-DASH-012 | Covered |
| Well Management | TC-WELL-001 to TC-WELL-015 | Covered |
| Well Information | TC-WINFO-001 to TC-WINFO-015 | Covered |
| Wellbore Configuration | TC-WB-001 to TC-WB-015 | Covered |
| Engineering Parameters | TC-ENG-001 to TC-ENG-015 | Covered |
| Treatment | TC-TREAT-001 to TC-TREAT-015 | Covered |
| MiniFrac / DFIT | TC-MF-001 to TC-MF-015 | Covered |
| Version Management | TC-VER-001 to TC-VER-015 | Covered |

---

## 7. Traceability Validation Rules

The following rules are applied while maintaining the RTM:

1. Every functional requirement should have at least one corresponding test case.
2. Critical requirements should have multiple test cases covering positive, negative, boundary, and regression scenarios where applicable.
3. Each test case should reference at least one requirement ID.
4. Requirement IDs must remain consistent across requirements, test cases, and RTM.
5. A requirement should not be marked fully covered when only indirect testing exists.
6. New requirements should be added to the RTM before test execution.
7. Changes to requirements should trigger an impact analysis against mapped test cases.
8. Removed requirements should be retained in historical traceability records when required.
9. Test case execution results should be maintained separately from requirement traceability.
10. RTM coverage should be reviewed before regression and release assessment.

---

## 8. Requirement Change Impact Analysis

When a requirement changes, the following process should be followed:

Requirement Change
→ Identify impacted Requirement ID
→ Identify mapped Test Cases
→ Review affected Test Steps
→ Update Test Data if required
→ Update Expected Results
→ Execute impacted Test Cases
→ Execute Related Regression Tests
→ Update RTM
→ Record Change Impact

---

## 9. RTM Maintenance

The RTM should be updated whenever:

- A new requirement is introduced.
- An existing requirement is modified.
- A requirement is removed.
- A new test case is created.
- An existing test case is modified.
- A test case is retired.
- Requirement coverage changes.
- Regression scope changes.
- Major application functionality changes.

---

## 10. Final Traceability Assessment

The current RTM provides traceability for the completed test-case modules covering authentication, dashboard, well management, well information, wellbore configuration, engineering parameters, treatment, MiniFrac / DFIT, and version management.

Requirements related to Location, Channel, Heat Transfer, Reservoir, Material, Comments, Reports, RBAC, Navigation, Non-Functional testing, Audit, and remaining Data/Error requirements will be linked as their dedicated test-case modules are added.

The RTM remains **In Progress** until all planned functional requirements have corresponding test coverage.
