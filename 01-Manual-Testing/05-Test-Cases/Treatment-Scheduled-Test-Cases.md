# Treatment Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Treatment Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | Treatment Scheduled |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, Validation, Calculation, Data Integrity, Regression |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Verify Treatment Scheduled Access

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-001 |
| Scenario | Verify that an authorized user can access Treatment Scheduled for a selected well |
| Requirement ID | REQ-TREAT-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User is logged in and has permission to view Treatment Scheduled |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Navigate to Well Management and select `PAD-001 – Falcon North Pad`. | Wells associated with the selected pad are displayed. |
| 3 | Select `WELL-1001 – Falcon-A01`. | `WELL-1001` becomes the active well context. |
| 4 | Navigate to the Treatment Scheduled section. | Treatment Scheduled opens successfully. |
| 5 | Review the available treatment tabs or sections. | Applicable treatment sections such as Design, Actual, and Treatment Totals are displayed. |
| 6 | Verify the selected well context. | Treatment information belongs to `WELL-1001`. |

---

## Test Case 2 — Verify Treatment Design Data Display

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-002 |
| Scenario | Verify that existing Treatment Design information is displayed correctly |
| Requirement ID | REQ-TREAT-002 |
| Test Type | Functional / Data Validation |
| Priority | P1 |
| Preconditions | Selected well contains configured Treatment Design data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Treatment Scheduled for `WELL-1001`. | Treatment Scheduled loads successfully. |
| 2 | Open the Design section. | The Design section is displayed. |
| 3 | Review the configured treatment stages. | Existing treatment stages are displayed in the configured order. |
| 4 | Review the values associated with each stage. | Displayed values match the prepared synthetic treatment data. |
| 5 | Review applicable units and field labels. | Units and labels are displayed consistently with the configured treatment fields. |
| 6 | Compare the displayed information with the test data. | Treatment Design values correspond to the selected well and configured test data. |

---

## Test Case 3 — Verify Treatment Design Editing

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-003 |
| Scenario | Verify that an authorized user can edit Treatment Design information |
| Requirement ID | REQ-TREAT-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User has edit permission and Treatment Design is editable |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Design section for an editable well. | Existing Treatment Design data is displayed. |
| 2 | Select the available Edit Schedule action. | The Design fields become editable. |
| 3 | Modify a permitted treatment-stage value using valid synthetic data. | The new value is accepted by the corresponding field. |
| 4 | Review the modified stage before saving. | The updated value is displayed correctly. |
| 5 | Save the Treatment Design changes. | The system validates and saves the updated Design information. |
| 6 | Reopen the Design section. | The updated treatment-stage value remains available. |

---

## Test Case 4 — Verify Treatment Actual Data Entry

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-004 |
| Scenario | Verify that valid Actual treatment data can be entered for an applicable treatment schedule |
| Requirement ID | REQ-TREAT-003 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | A valid Treatment Design exists and Actual data entry is permitted |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Treatment Scheduled for a valid well. | Treatment Scheduled is displayed successfully. |
| 2 | Open the Actual section. | Actual treatment fields are displayed according to the configured workflow. |
| 3 | Select an editable Actual field for a treatment stage. | The selected field accepts user input. |
| 4 | Enter valid synthetic Actual treatment values. | The entered values are accepted. |
| 5 | Review the Actual treatment data before saving. | All entered values are displayed correctly against the intended stage. |
| 6 | Save the Actual treatment data. | The system validates and saves the Actual values successfully. |

---

## Test Case 5 — Verify Treatment Totals Display

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-005 |
| Scenario | Verify that Treatment Totals reflect the applicable treatment data |
| Requirement ID | REQ-TREAT-004 |
| Test Type | Functional / Calculation |
| Priority | P1 |
| Preconditions | Valid Design or Actual treatment data exists |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Treatment Scheduled for a well containing treatment data. | Treatment Scheduled loads successfully. |
| 2 | Review the configured treatment stages. | Treatment stages and their applicable values are displayed. |
| 3 | Open the Treatment Totals section. | Treatment Totals are displayed for the available treatment data. |
| 4 | Compare the total values with the applicable stage-level values. | Totals correspond to the configured treatment-stage data. |
| 5 | Update a permitted stage-level value and save it. | The updated treatment value is saved successfully. |
| 6 | Reopen or refresh Treatment Totals. | The affected total reflects the updated treatment data according to the configured calculation rules. |

---

## Test Case 6 — Verify Required Treatment Field Validation

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-006 |
| Scenario | Verify that mandatory Treatment fields cannot be saved without required values |
| Requirement ID | REQ-TREAT-005, REQ-DATA-001 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | Treatment Design contains at least one mandatory editable field |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Design section in edit mode. | Editable treatment fields are displayed. |
| 2 | Identify a mandatory treatment field containing a value. | The mandatory field is available for modification. |
| 3 | Remove the existing value. | The field becomes empty. |
| 4 | Select Save. | The system prevents the incomplete treatment schedule from being saved. |
| 5 | Review the affected field. | A clear required-field validation message is displayed. |
| 6 | Enter a valid value and save again. | The validation message is removed and the treatment data is saved successfully. |

---

## Test Case 7 — Verify Numeric Treatment Field Validation

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-007 |
| Scenario | Verify that invalid non-numeric values are rejected in numeric Treatment fields |
| Requirement ID | REQ-TREAT-005, REQ-DATA-002 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | An editable numeric Treatment field is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable Treatment Design record. | Treatment fields are displayed for editing. |
| 2 | Select a field configured for numeric input. | The selected field is ready to accept numeric data. |
| 3 | Enter alphabetic or unsupported characters. | The application rejects the invalid input or identifies it as invalid. |
| 4 | Attempt to save the treatment schedule. | The system prevents invalid numeric data from being saved. |
| 5 | Review the validation feedback. | A meaningful validation message identifies the invalid value. |
| 6 | Replace the invalid value with a valid numeric value and save. | The valid value is accepted and the treatment schedule saves successfully. |

---

## Test Case 8 — Verify Treatment Value Range Validation

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-008 |
| Scenario | Verify that Treatment values outside configured limits are rejected |
| Requirement ID | REQ-TREAT-005, REQ-DATA-003 |
| Test Type | Negative / Boundary |
| Priority | P1 |
| Preconditions | The selected treatment field has defined valid limits |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the applicable Treatment field in edit mode. | The selected field is available for input. |
| 2 | Enter a value below the configured minimum. | The application identifies the value as outside the permitted range. |
| 3 | Attempt to save the Treatment data. | The invalid lower-range value is rejected. |
| 4 | Replace the value with one above the configured maximum. | The application identifies the upper-range value as invalid. |
| 5 | Attempt to save again. | The out-of-range value is prevented from being saved. |
| 6 | Enter a value within the permitted range and save. | The valid value is accepted and saved successfully. |

---

## Test Case 9 — Verify Treatment Stage Sequence

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-009 |
| Scenario | Verify that treatment stages are displayed and maintained in the expected sequence |
| Requirement ID | REQ-TREAT-002 |
| Test Type | Functional / Validation |
| Priority | P1 |
| Preconditions | Treatment Design contains multiple stages |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Treatment Design section. | Configured treatment stages are displayed. |
| 2 | Review the order of the treatment stages. | Stages are displayed in the configured sequence. |
| 3 | Add or edit a stage where the workflow permits ordering. | The stage ordering mechanism is available. |
| 4 | Assign a valid sequence position to the stage. | The valid sequence value is accepted. |
| 5 | Save the Treatment Design. | The treatment schedule is saved with the valid stage sequence. |
| 6 | Reopen the Design section. | The treatment stages remain in the saved sequence. |

---

## Test Case 10 — Verify Import Design to Actual

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-010 |
| Scenario | Verify that a valid Treatment Design can be imported into Actual where the workflow supports the action |
| Requirement ID | REQ-TREAT-002, REQ-TREAT-003 |
| Test Type | Functional / Integration |
| Priority | P1 |
| Preconditions | A valid Treatment Design exists and the Import Design to Actual action is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Design section for a valid treatment schedule. | The configured Treatment Design is displayed. |
| 2 | Record the relevant stage values from the Design section. | The Design values are available for comparison. |
| 3 | Select the Import Design to Actual action. | The system starts the design-to-actual import operation. |
| 4 | Wait for the import operation to complete. | The import completes without an unexpected application error. |
| 5 | Open the Actual section. | The Actual treatment schedule is displayed. |
| 6 | Compare the imported Actual values with the recorded Design values. | Applicable Design values are copied into Actual according to the configured import rules. |

---

## Test Case 11 — Verify Treatment Data Persistence

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-011 |
| Scenario | Verify that saved Treatment data persists after navigation and browser refresh |
| Requirement ID | REQ-TREAT-006 |
| Test Type | Data Persistence / Regression |
| Priority | P1 |
| Preconditions | User has edit permission for the Treatment schedule |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Treatment Design for `WELL-1001`. | Existing Treatment Design data is displayed. |
| 2 | Modify an editable treatment value using a unique valid test value. | The updated value is accepted. |
| 3 | Save the Treatment Design. | The system saves the updated treatment value successfully. |
| 4 | Navigate to another section of the same well. | Navigation completes without losing the saved treatment update. |
| 5 | Return to Treatment Design. | The updated treatment value is displayed. |
| 6 | Refresh the browser and review the same field. | The updated value remains persisted after refresh. |

---

## Test Case 12 — Verify Treatment Data Association Between Wells

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-012 |
| Scenario | Verify that Treatment data remains associated with the correct well |
| Requirement ID | REQ-TREAT-006, REQ-DI-001, REQ-DI-003 |
| Test Type | Data Integrity / Regression |
| Priority | P1 |
| Preconditions | `WELL-1001` and `WELL-1002` contain different treatment data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Treatment Scheduled for `WELL-1001`. | Treatment data associated with `WELL-1001` is displayed. |
| 2 | Record a unique treatment-stage value. | The value is captured for comparison. |
| 3 | Switch to `WELL-1002`. | The active well context changes to `WELL-1002`. |
| 4 | Open Treatment Scheduled for `WELL-1002`. | Treatment data belonging to `WELL-1002` is displayed. |
| 5 | Compare the displayed data with the recorded `WELL-1001` value. | `WELL-1001` treatment values are not incorrectly displayed for `WELL-1002`. |
| 6 | Return to `WELL-1001`. | The original treatment data remains correctly associated with `WELL-1001`. |

---

## Test Case 13 — Verify Unsaved Treatment Changes

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-013 |
| Scenario | Verify that unsaved Treatment changes are not persisted unintentionally |
| Requirement ID | REQ-TREAT-006, REQ-DI-002 |
| Test Type | Negative / Data Integrity |
| Priority | P2 |
| Preconditions | User has edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable Treatment Design record. | Existing saved treatment values are displayed. |
| 2 | Modify a treatment-stage value without saving. | The modified value is displayed as an unsaved change. |
| 3 | Navigate to another section. | The application handles the unsaved change according to its configured behavior. |
| 4 | If a confirmation prompt appears, review the available options. | The prompt clearly indicates that changes have not been saved. |
| 5 | Select the option to discard changes where supported. | The unsaved treatment modification is discarded. |
| 6 | Return to the Treatment Design section. | The original saved value is displayed instead of the discarded value. |

---

## Test Case 14 — Verify Read-Only Treatment Fields for Restricted User

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-014 |
| Scenario | Verify that a user without Treatment edit permission cannot modify restricted Treatment data |
| Requirement ID | REQ-TREAT-001, REQ-RBAC-005 |
| Test Type | Negative / RBAC |
| Priority | P1 |
| Preconditions | Restricted user account does not have Treatment edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using the restricted test account `restricted.demo`. | The restricted user is authenticated successfully. |
| 2 | Navigate to an accessible well. | The selected well is displayed according to the user's permissions. |
| 3 | Open Treatment Scheduled. | Treatment information is displayed if the user has view permission. |
| 4 | Review the Design and Actual editing controls. | Edit or Save controls are hidden or disabled where edit permission is not granted. |
| 5 | Attempt to modify a Treatment value. | The user cannot submit an unauthorized Treatment change. |
| 6 | Refresh the Treatment section. | Existing Treatment data remains unchanged. |

---

## Test Case 15 — Verify Treatment Data Recovery After Loading Failure

| Field | Details |
|---|---|
| Test Case ID | TC-TREAT-015 |
| Scenario | Verify Treatment Scheduled behavior when treatment data temporarily fails to load |
| Requirement ID | REQ-ERR-004, REQ-NFR-005 |
| Test Type | Negative / Error Handling |
| Priority | P2 |
| Preconditions | Test environment supports controlled simulation of a treatment-data loading failure |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Open Treatment Scheduled for a valid well. | Treatment information loads successfully under normal conditions. |
| 3 | Simulate a controlled failure for the Treatment data request. | The treatment-data request fails without causing an unexpected application crash. |
| 4 | Reload Treatment Scheduled or select the available retry action. | The application identifies the loading failure and displays an appropriate error or retry state. |
| 5 | Restore the treatment data service and retry the operation. | The application successfully retrieves the Treatment data. |
| 6 | Review the recovered Treatment schedule. | The correct Design, Actual, and applicable Treatment information is displayed after recovery. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-TREAT-001 | Verify Treatment Scheduled access | Positive / Functional | P1 |
| TC-TREAT-002 | Verify Treatment Design data display | Functional / Data Validation | P1 |
| TC-TREAT-003 | Verify Treatment Design editing | Positive / Functional | P1 |
| TC-TREAT-004 | Verify Treatment Actual data entry | Positive / Functional | P1 |
| TC-TREAT-005 | Verify Treatment Totals display | Functional / Calculation | P1 |
| TC-TREAT-006 | Verify required Treatment field validation | Negative / Validation | P1 |
| TC-TREAT-007 | Verify numeric Treatment field validation | Negative / Validation | P1 |
| TC-TREAT-008 | Verify Treatment value range validation | Negative / Boundary | P1 |
| TC-TREAT-009 | Verify Treatment stage sequence | Functional / Validation | P1 |
| TC-TREAT-010 | Verify Import Design to Actual | Functional / Integration | P1 |
| TC-TREAT-011 | Verify Treatment data persistence | Data Persistence / Regression | P1 |
| TC-TREAT-012 | Verify Treatment data association between wells | Data Integrity / Regression | P1 |
| TC-TREAT-013 | Verify unsaved Treatment changes | Negative / Data Integrity | P2 |
| TC-TREAT-014 | Verify read-only Treatment fields for restricted user | Negative / RBAC | P1 |
| TC-TREAT-015 | Verify Treatment data recovery after loading failure | Negative / Error Handling | P2 |
