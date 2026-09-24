# Regression Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Regression Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Test Level | System Testing |
| Testing Type | Regression Testing |
| Environment | QA |
| Test Data | Synthetic / Sanitized |
| Execution Type | Manual |
| Scope | Critical and impacted application workflows |
| Document Status | Portfolio Demonstration |

---

## 1. Regression Testing Objective

The objective of regression testing is to verify that application changes, defect fixes, configuration updates, or enhancements do not negatively impact existing functionality.

Regression testing focuses on:

- Critical business workflows.
- Previously failed scenarios.
- Defect-fix validation.
- Data persistence.
- Calculation logic.
- Cross-module navigation.
- Role-based access.
- Data integrity.
- Frequently used application functionality.

---

## 2. Regression Scope

| Area | Regression Coverage |
|---|---|
| Authentication | Login, logout, session |
| Dashboard | Access and navigation |
| Well Management | Search, filtering, selection, status |
| Well Information | Update, validation, persistence |
| Wellbore Configuration | Input, validation, sequence |
| Engineering Parameters | Input, calculation, result |
| Treatment | Design, actual data, totals |
| MiniFrac / DFIT | Input, calculations, plots |
| Version Management | Selection, navigation, data integrity |
| RBAC | Authorized and restricted actions |
| Data Integrity | Cross-well and cross-version validation |
| Error Handling | Validation and processing failures |

---

# 3. Regression Test Cases

## TC-REG-001 — Verify User Login After Application Changes

| Field | Details |
|---|---|
| Test Case ID | TC-REG-001 |
| Scenario | Verify that valid user login continues to work after application changes |
| Requirement ID | REQ-AUTH-001 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page. | The login page is displayed successfully. |
| 2 | Enter the valid synthetic username `admin.demo`. | The username is accepted. |
| 3 | Enter the valid test password. | The password field accepts the credential securely. |
| 4 | Click the Login button. | The authentication request is processed successfully. |
| 5 | Review the landing page after authentication. | The user is successfully logged in and redirected to the authorized application area. |
| 6 | Verify the logged-in user context. | The correct user role and session context are displayed. |

---

## TC-REG-002 — Verify Logout and Session Termination

| Field | Details |
|---|---|
| Test Case ID | TC-REG-002 |
| Scenario | Verify that logout continues to terminate the active user session |
| Requirement ID | REQ-AUTH-004, REQ-AUTH-003 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized account. | The user is authenticated successfully. |
| 2 | Navigate to a protected application module. | The protected module is accessible. |
| 3 | Click the Logout action. | The logout operation is initiated. |
| 4 | Review the resulting page. | The user is redirected to the login or unauthenticated page. |
| 5 | Attempt to access the previously opened protected module directly. | Access to the protected module is denied because the session has ended. |
| 6 | Review the authentication state. | The previous authenticated session is no longer active. |

---

## TC-REG-003 — Verify Dashboard Navigation

| Field | Details |
|---|---|
| Test Case ID | TC-REG-003 |
| Scenario | Verify that dashboard navigation remains functional after changes |
| Requirement ID | REQ-DASH-003 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using an authorized test account. | The user reaches the application dashboard. |
| 2 | Review the dashboard navigation controls. | Available navigation options are displayed correctly. |
| 3 | Select the Well Management option. | The Well Management module opens successfully. |
| 4 | Navigate back to the dashboard. | The dashboard is displayed successfully. |
| 5 | Select another permitted module. | The selected module opens without navigation errors. |
| 6 | Return to the dashboard again. | Dashboard navigation continues to work correctly. |

---

## TC-REG-004 — Verify Well Search and Filtering

| Field | Details |
|---|---|
| Test Case ID | TC-REG-004 |
| Scenario | Verify that well search and filtering continue to return correct records |
| Requirement ID | REQ-WELL-003, REQ-WELL-004 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Well Management. | The pad and well listing is displayed. |
| 2 | Select `PAD-001 – Falcon North Pad`. | Wells associated with the selected pad are displayed. |
| 3 | Search for `Falcon-A01`. | The matching well record is displayed. |
| 4 | Apply a valid well status filter. | The well list is filtered according to the selected status. |
| 5 | Clear the search and filter values. | The complete applicable well list is restored. |
| 6 | Select `WELL-1001 – Falcon-A01`. | The correct well becomes the active well context. |

---

## TC-REG-005 — Verify Well Information Persistence

| Field | Details |
|---|---|
| Test Case ID | TC-REG-005 |
| Scenario | Verify that well information remains persisted after an update |
| Requirement ID | REQ-WINFO-002, REQ-WINFO-003 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Well Information for `WELL-1001`. | Existing well information is displayed. |
| 2 | Update a permitted field with valid synthetic data. | The new value is accepted. |
| 3 | Save the updated information. | The save operation completes successfully. |
| 4 | Navigate to another module. | Navigation completes without an error. |
| 5 | Return to Well Information. | The updated well information is displayed. |
| 6 | Refresh the browser and review the same field. | The updated value remains persisted after refresh. |

---

## TC-REG-006 — Verify Wellbore Configuration Validation

| Field | Details |
|---|---|
| Test Case ID | TC-REG-006 |
| Scenario | Verify that wellbore validation remains functional after changes |
| Requirement ID | REQ-WB-003, REQ-WB-005 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Wellbore Configuration for a valid well. | The configuration is displayed successfully. |
| 2 | Enter valid wellbore data. | The valid values are accepted. |
| 3 | Configure an invalid sequence. | The application identifies the invalid sequence. |
| 4 | Attempt to save the configuration. | The invalid configuration is rejected. |
| 5 | Review the validation feedback. | A meaningful validation message identifies the invalid configuration. |
| 6 | Correct the sequence and save again. | The valid configuration is accepted and saved successfully. |

---

## TC-REG-007 — Verify Engineering Calculation Recalculation

| Field | Details |
|---|---|
| Test Case ID | TC-REG-007 |
| Scenario | Verify that engineering results are recalculated after input changes |
| Requirement ID | REQ-ENG-004, REQ-ENG-005 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for a valid well. | Engineering inputs are displayed. |
| 2 | Enter a valid synthetic dataset. | The input values are accepted. |
| 3 | Execute the calculation and record the result. | A calculation result is generated successfully. |
| 4 | Change one calculation input using another valid value. | The updated value is accepted. |
| 5 | Execute the calculation again. | The application recalculates the result using the updated input. |
| 6 | Compare the new result with the original result. | The result reflects the updated input and is not incorrectly retained from the previous calculation. |

---

## TC-REG-008 — Verify Treatment Total Recalculation

| Field | Details |
|---|---|
| Test Case ID | TC-REG-008 |
| Scenario | Verify that treatment totals remain accurate after stage-level changes |
| Requirement ID | REQ-TREAT-004, REQ-TREAT-005 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Treatment section for a valid well. | Treatment data is displayed. |
| 2 | Review and record the current treatment total. | The existing total is available for comparison. |
| 3 | Modify a valid stage-level quantity. | The updated value is accepted. |
| 4 | Save or recalculate the treatment schedule. | The application processes the updated treatment data. |
| 5 | Review the treatment total. | The total is recalculated using the updated stage value. |
| 6 | Compare the new total with the expected synthetic calculation. | The displayed total matches the expected calculation within the defined precision. |

---

## TC-REG-009 — Verify MiniFrac Clean Volume Recalculation

| Field | Details |
|---|---|
| Test Case ID | TC-REG-009 |
| Scenario | Verify that Clean Volume is recalculated after relevant MiniFrac input changes |
| Requirement ID | REQ-MF-004 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open MiniFrac / DFIT for a valid test well. | The MiniFrac / DFIT dataset is displayed. |
| 2 | Execute the analysis using valid synthetic data. | The analysis completes successfully. |
| 3 | Record the calculated Clean Volume. | The initial Clean Volume is available for comparison. |
| 4 | Modify a valid rate or time input. | The updated input is accepted. |
| 5 | Execute the analysis again. | Clean Volume is recalculated using the latest input. |
| 6 | Compare the new result with the previous result. | The result reflects the updated dataset and does not incorrectly retain the previous value. |

---

## TC-REG-010 — Verify MiniFrac Analysis Plots

| Field | Details |
|---|---|
| Test Case ID | TC-REG-010 |
| Scenario | Verify that MiniFrac / DFIT analysis plots remain available after application changes |
| Requirement ID | REQ-MF-006, REQ-MF-007, REQ-MF-008, REQ-MF-009 |
| Priority | P1 |
| Type | Regression |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open a valid processed MiniFrac / DFIT dataset. | The analysis results are displayed. |
| 2 | Open the ISIP analysis. | The ISIP plot is generated successfully. |
| 3 | Open the Square Root analysis. | The Square Root plot is generated successfully. |
| 4 | Open the G-Function analysis. | The G-Function plot is generated successfully. |
| 5 | Open the Log-Log analysis. | The Log-Log plot is generated successfully. |
| 6 | Review the generated plots. | Each plot displays the expected data representation and remains consistent with the processed dataset. |

---

## TC-REG-011 — Verify Version Data Integrity After Well Switching

| Field | Details |
|---|---|
| Test Case ID | TC-REG-011 |
| Scenario | Verify that version data remains correctly associated after switching between wells |
| Requirement ID | REQ-VER-003, REQ-DI-001, REQ-DI-003 |
| Priority | P1 |
| Type | Regression / Data Integrity |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Version Management for `WELL-1001`. | Version information for `WELL-1001` is displayed. |
| 2 | Record a unique version value. | The value is available for comparison. |
| 3 | Switch to `WELL-1005`. | `WELL-1005` becomes the active well. |
| 4 | Open Version Management for `WELL-1005`. | Version information associated with `WELL-1005` is displayed. |
| 5 | Compare the displayed values with the recorded `WELL-1001` value. | Data from `WELL-1001` is not incorrectly displayed for `WELL-1005`. |
| 6 | Return to `WELL-1001`. | The original version data remains correctly associated with `WELL-1001`. |

---

## TC-REG-012 — Verify Restricted User Access

| Field | Details |
|---|---|
| Test Case ID | TC-REG-012 |
| Scenario | Verify that restricted users cannot perform unauthorized actions after permission-related changes |
| Requirement ID | REQ-RBAC-005 |
| Priority | P1 |
| Type | Regression / Security |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using `USR-006 – restricted.demo`. | The restricted user is authenticated successfully. |
| 2 | Navigate to an accessible well. | The permitted well information is displayed. |
| 3 | Open Version Management or another restricted module. | Access follows the user's assigned permissions. |
| 4 | Attempt a restricted modification action. | The unauthorized action is denied or unavailable. |
| 5 | Review the application response. | An appropriate permission restriction is displayed when applicable. |
| 6 | Verify the underlying data. | No unauthorized modification is applied. |

---

## TC-REG-013 — Verify Cross-Module Navigation

| Field | Details |
|---|---|
| Test Case ID | TC-REG-013 |
| Scenario | Verify that users can navigate between core well modules without losing the active well context |
| Requirement ID | REQ-NAV-001, REQ-NAV-002, REQ-DI-003 |
| Priority | P1 |
| Type | Regression / Integration |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open `WELL-1001`. | `WELL-1001` becomes the active well context. |
| 2 | Navigate to Well Information. | Well Information opens for `WELL-1001`. |
| 3 | Navigate to Wellbore Configuration. | Wellbore Configuration opens for the same well. |
| 4 | Navigate to Treatment. | Treatment opens for the same well. |
| 5 | Navigate to MiniFrac / DFIT. | MiniFrac / DFIT opens for the same well. |
| 6 | Review the active well context after navigation. | All visited modules remain associated with `WELL-1001`. |

---

## TC-REG-014 — Verify Data Persistence After Browser Refresh

| Field | Details |
|---|---|
| Test Case ID | TC-REG-014 |
| Scenario | Verify that saved application data remains available after browser refresh |
| Requirement ID | REQ-DATA-005, REQ-DI-002 |
| Priority | P1 |
| Type | Regression / Persistence |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open a module containing editable synthetic data. | The existing data is displayed. |
| 2 | Update a permitted field with valid data. | The new value is accepted. |
| 3 | Save the change. | The application confirms successful save. |
| 4 | Refresh the browser. | The application reloads successfully. |
| 5 | Navigate back to the updated module if required. | The updated record is available. |
| 6 | Verify the modified field. | The saved value remains available after refresh. |

---

## TC-REG-015 — Verify Validation Error Handling

| Field | Details |
|---|---|
| Test Case ID | TC-REG-015 |
| Scenario | Verify that invalid input continues to produce appropriate validation feedback |
| Requirement ID | REQ-DATA-006, REQ-ERR-001 |
| Priority | P1 |
| Type | Regression / Negative |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open a module containing a mandatory numeric input field. | The input field is displayed and available for editing. |
| 2 | Enter an invalid non-numeric value. | The invalid value is rejected or identified as invalid. |
| 3 | Leave another mandatory field blank. | The mandatory field remains incomplete. |
| 4 | Click Save or Process. | The operation is prevented because the dataset is invalid. |
| 5 | Review the validation messages. | Appropriate validation feedback identifies the invalid or missing data. |
| 6 | Correct all invalid and missing values. | The validation errors are cleared and the valid dataset can be processed. |

---

## 4. Regression Execution Summary

| Test Case ID | Regression Area | Priority | Status |
|---|---|---|---|
| TC-REG-001 | Authentication | P1 | Passed |
| TC-REG-002 | Logout / Session | P1 | Passed |
| TC-REG-003 | Dashboard Navigation | P1 | Passed |
| TC-REG-004 | Well Search / Filtering | P1 | Passed |
| TC-REG-005 | Well Information Persistence | P1 | Passed |
| TC-REG-006 | Wellbore Validation | P1 | Passed |
| TC-REG-007 | Engineering Recalculation | P1 | Passed |
| TC-REG-008 | Treatment Total Calculation | P1 | Passed |
| TC-REG-009 | MiniFrac Clean Volume | P1 | Passed |
| TC-REG-010 | MiniFrac Analysis Plots | P1 | Passed |
| TC-REG-011 | Version Data Integrity | P1 | Passed |
| TC-REG-012 | Restricted User Access | P1 | Passed |
| TC-REG-013 | Cross-Module Navigation | P1 | Passed |
| TC-REG-014 | Data Persistence | P1 | Passed |
| TC-REG-015 | Validation Error Handling | P1 | Passed |

---

## 5. Regression Test Metrics

| Metric | Result |
|---|---:|
| Total Regression Test Cases | 15 |
| Executed | 15 |
| Passed | 15 |
| Failed | 0 |
| Blocked | 0 |
| Not Executed | 0 |
| Execution Completion | 100% |
| Pass Percentage | 100% |

---

## 6. Regression Selection Criteria

Test cases should be added to the regression suite when they cover:

- Critical business functionality.
- Frequently used workflows.
- Previously failed functionality.
- High-severity defects.
- Calculation logic.
- Data persistence.
- Data integrity.
- Role-based access.
- Shared components.
- Cross-module workflows.
- Backend/API-dependent functionality.
- Areas affected by recent code changes.

---

## 7. Regression Execution Process

Change Identified
→ Impact Analysis
→ Identify Affected Modules
→ Select Regression Test Cases
→ Prepare Test Data
→ Execute Regression Suite
→ Log Defects
→ Retest Fixes
→ Execute Related Regression
→ Update Test Results
→ Update RTM
→ Report Regression Status

---

## 8. Regression Entry Criteria

Regression testing can begin when:

- A new build is available.
- Relevant defect fixes are deployed.
- Required environment is available.
- Test data is available.
- Regression test cases are reviewed.
- Known blocking issues are resolved or accepted.
- Required user accounts are available.

---

## 9. Regression Exit Criteria

Regression testing can be considered complete when:

- All selected regression test cases are executed.
- Critical workflows have been validated.
- No unresolved critical regression defects remain within the agreed scope.
- Failed test cases have corresponding defect records.
- Fixed defects have been successfully retested.
- Relevant impacted areas have been regression tested.
- Test execution results are documented.
- RTM and defect records are updated.

---

## 10. Regression Risk Areas

| Risk Area | Risk Level | Regression Focus |
|---|---|---|
| Authentication changes | High | Login, session, logout |
| Search/filter changes | High | Well search and filtering |
| Calculation changes | Critical | Engineering, treatment, MiniFrac |
| Data model changes | Critical | Persistence and data integrity |
| Permission changes | Critical | RBAC and restricted actions |
| Version changes | High | Version selection and data isolation |
| API changes | High | Data loading and persistence |
| UI changes | Medium | Navigation and validation |
| Database changes | Critical | Record association and persistence |

---

## 11. Regression Evidence

Recommended evidence for each regression cycle includes:

- Test execution screenshots.
- Passed test case evidence.
- Failed test case screenshots.
- Defect reproduction evidence.
- Retest screenshots.
- Browser console logs where applicable.
- API request/response evidence where applicable.
- Calculation result evidence.
- Data persistence evidence.
- RBAC validation evidence.

All evidence used for this portfolio should contain synthetic data and must not expose confidential company or customer information.

---

## 12. Regression Reporting Format

| Field | Details |
|---|---|
| Regression Cycle | Regression Cycle 1 |
| Build | Synthetic QA Build |
| Environment | QA |
| Total Tests | 15 |
| Passed | 15 |
| Failed | 0 |
| Blocked | 0 |
| Pass Rate | 100% |
| Critical Regression Defects | 0 |
| Regression Status | Passed |

---

## 13. Portfolio Disclaimer

The test cases, test data, well identifiers, user accounts, execution results, and regression scenarios in this document are synthetic examples created for portfolio demonstration purposes.

No confidential customer, company, production, or proprietary project information is included.
