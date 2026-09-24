# Engineering Parameter Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Engineering Parameter Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | Engineering Parameters |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, Validation, Boundary, Calculation, Data Integrity, Regression |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Verify Engineering Parameter Section Access

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-001 |
| Scenario | Verify that an authorized user can access the Engineering Parameters section for a selected well |
| Requirement ID | REQ-ENG-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User is logged in and has permission to view Engineering Parameters |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Navigate to Well Management and select `PAD-001 – Falcon North Pad`. | The wells associated with the selected pad are displayed. |
| 3 | Select `WELL-1001 – Falcon-A01`. | `WELL-1001` becomes the active well context. |
| 4 | Navigate to the Engineering Parameters section. | The Engineering Parameters section opens successfully. |
| 5 | Review the available parameter fields. | Applicable engineering parameter fields are displayed without loading errors. |
| 6 | Verify the selected well context. | The displayed engineering data belongs to `WELL-1001`. |

---

## Test Case 2 — Verify Existing Engineering Parameter Values

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-002 |
| Scenario | Verify that existing Engineering Parameter values are displayed correctly |
| Requirement ID | REQ-ENG-001 |
| Test Type | Functional / Data Validation |
| Priority | P1 |
| Preconditions | `WELL-1001` contains configured Engineering Parameter data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for `WELL-1001`. | The Engineering Parameters section loads successfully. |
| 2 | Review the configured parameter fields. | Existing engineering parameters are displayed. |
| 3 | Review the values populated in the parameter fields. | Displayed values match the prepared synthetic test data. |
| 4 | Review the units associated with the applicable parameters. | Correct units are displayed for the corresponding parameters. |
| 5 | Compare the displayed values with the source test data. | Engineering parameter values are accurate and associated with the selected well. |
| 6 | Navigate away and return to Engineering Parameters. | The same saved parameter values remain available. |

---

## Test Case 3 — Enter Valid Engineering Parameters

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-003 |
| Scenario | Verify that valid Engineering Parameter values can be entered |
| Requirement ID | REQ-ENG-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User has edit permission for Engineering Parameters |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for an editable test well. | Engineering Parameter fields are displayed in an editable state. |
| 2 | Select an applicable parameter field. | The selected field accepts user input. |
| 3 | Enter a valid synthetic engineering value. | The value is accepted by the selected field. |
| 4 | Enter valid values into the remaining required engineering fields. | Each valid value is accepted without validation errors. |
| 5 | Review all entered values before saving. | The entered values are displayed correctly and correspond to the intended parameters. |
| 6 | Select Save. | The system validates and saves the Engineering Parameter data successfully. |

---

## Test Case 4 — Edit Existing Engineering Parameters

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-004 |
| Scenario | Verify that an authorized user can update existing Engineering Parameter values |
| Requirement ID | REQ-ENG-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | An editable Engineering Parameter record exists |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for `WELL-1002`. | Existing engineering values are displayed. |
| 2 | Select an editable parameter. | The selected parameter becomes available for modification. |
| 3 | Replace the existing value with a valid synthetic value. | The new value is accepted by the field. |
| 4 | Review the modified parameter before saving. | The updated value is displayed correctly. |
| 5 | Save the Engineering Parameter changes. | The application validates and saves the updated value. |
| 6 | Refresh the page and review the parameter again. | The updated value remains available after refresh. |

---

## Test Case 5 — Verify Mandatory Engineering Parameter Validation

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-005 |
| Scenario | Verify that mandatory Engineering Parameters cannot be saved without required values |
| Requirement ID | REQ-ENG-003, REQ-DATA-001 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | At least one mandatory Engineering Parameter field is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters in edit mode. | Editable engineering fields are displayed. |
| 2 | Identify a mandatory parameter containing a valid value. | The mandatory parameter is available for modification. |
| 3 | Remove the value from the mandatory parameter. | The field becomes empty. |
| 4 | Select Save. | The system prevents the incomplete Engineering Parameter record from being saved. |
| 5 | Review the validation feedback. | A clear required-field message is displayed for the missing parameter. |
| 6 | Enter a valid value and save again. | The validation message is removed and the parameter data is saved successfully. |

---

## Test Case 6 — Verify Numeric Engineering Parameter Validation

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-006 |
| Scenario | Verify that non-numeric values are rejected for numeric Engineering Parameters |
| Requirement ID | REQ-ENG-003, REQ-DATA-002 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | A numeric Engineering Parameter field is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable Engineering Parameter record. | Engineering Parameter fields are displayed. |
| 2 | Select a field configured to accept numeric data. | The selected field is ready for numeric input. |
| 3 | Enter alphabetic characters or unsupported text. | The application rejects the invalid input or marks the field as invalid. |
| 4 | Attempt to save the parameter record. | The system prevents invalid numeric data from being saved. |
| 5 | Review the validation message. | The application provides clear feedback for the invalid numeric value. |
| 6 | Replace the invalid value with a valid numeric value and save. | The valid numeric value is accepted and saved successfully. |

---

## Test Case 7 — Verify Engineering Parameter Range Validation

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-007 |
| Scenario | Verify that Engineering Parameter values outside the configured range are rejected |
| Requirement ID | REQ-ENG-003, REQ-DATA-003 |
| Test Type | Negative / Boundary |
| Priority | P1 |
| Preconditions | The selected parameter has defined minimum and maximum limits |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the applicable Engineering Parameter in edit mode. | The selected parameter is available for input. |
| 2 | Enter a value below the configured minimum. | The system identifies the value as outside the permitted range. |
| 3 | Attempt to save the Engineering Parameters. | The invalid lower-range value is rejected. |
| 4 | Replace the value with one above the configured maximum. | The system identifies the upper-range value as invalid. |
| 5 | Attempt to save again. | The out-of-range upper value is prevented from being saved. |
| 6 | Enter a value within the permitted range and save. | The valid value is accepted and saved successfully. |

---

## Test Case 8 — Verify Engineering Parameter Boundary Values

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-008 |
| Scenario | Verify that valid minimum and maximum boundary values are accepted |
| Requirement ID | REQ-ENG-003, REQ-DATA-003 |
| Test Type | Boundary / Positive |
| Priority | P1 |
| Preconditions | Valid minimum and maximum values are defined for the selected parameter |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the applicable Engineering Parameter field. | The parameter is available for editing. |
| 2 | Enter the configured minimum valid value. | The minimum boundary value is accepted without validation error. |
| 3 | Save the parameter value. | The minimum boundary value is saved successfully. |
| 4 | Edit the same parameter and enter the configured maximum valid value. | The maximum boundary value is accepted without validation error. |
| 5 | Save the updated parameter. | The maximum boundary value is saved successfully. |
| 6 | Reopen the Engineering Parameters section. | The latest saved boundary value is displayed correctly. |

---

## Test Case 9 — Verify Engineering Parameter Processing

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-009 |
| Scenario | Verify that the application processes valid Engineering Parameter inputs correctly |
| Requirement ID | REQ-ENG-004 |
| Test Type | Functional / Processing |
| Priority | P1 |
| Preconditions | Required Engineering Parameters contain valid values |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for a valid test well. | The configured engineering values are displayed. |
| 2 | Enter or update the required input parameters with valid synthetic values. | All required values are accepted. |
| 3 | Save or trigger the available processing action. | The application accepts the valid input and starts processing. |
| 4 | Wait for processing to complete. | Processing completes without an unexpected application error. |
| 5 | Review the processed engineering output or calculated fields. | The application displays the corresponding processed results. |
| 6 | Compare the result with the expected test-data outcome. | The displayed result is consistent with the defined input data and calculation rules. |

---

## Test Case 10 — Verify Engineering Result Display

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-010 |
| Scenario | Verify that calculated or processed Engineering results are displayed correctly |
| Requirement ID | REQ-ENG-005 |
| Test Type | Functional / UI |
| Priority | P1 |
| Preconditions | Valid Engineering Parameters have been processed successfully |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Engineering Parameters section after successful processing. | The processed Engineering information is available. |
| 2 | Locate the result or calculated-value area. | The applicable result fields are displayed. |
| 3 | Review each displayed result value. | Result values are populated where calculation conditions are satisfied. |
| 4 | Review the units associated with the results. | Each result displays the appropriate unit where applicable. |
| 5 | Compare the displayed values with the expected synthetic calculation results. | The results match the expected values within the defined application precision. |
| 6 | Refresh the page and review the results again. | The saved or persisted results remain correctly displayed after refresh. |

---

## Test Case 11 — Verify Engineering Parameter Persistence

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-011 |
| Scenario | Verify that saved Engineering Parameters persist after navigation and browser refresh |
| Requirement ID | REQ-ENG-002, REQ-DATA-005 |
| Test Type | Data Persistence / Regression |
| Priority | P1 |
| Preconditions | User has permission to edit Engineering Parameters |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for `WELL-1001`. | Existing parameter values are displayed. |
| 2 | Update an editable parameter using a unique valid test value. | The new value is accepted. |
| 3 | Save the Engineering Parameter changes. | The system saves the updated value successfully. |
| 4 | Navigate to another section of the same well. | Navigation completes without losing the saved change. |
| 5 | Return to Engineering Parameters. | The updated parameter value is displayed. |
| 6 | Refresh the browser and review the same parameter. | The updated value remains persisted after refresh. |

---

## Test Case 12 — Verify Engineering Data Association Between Wells

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-012 |
| Scenario | Verify that Engineering Parameters remain associated with the correct well |
| Requirement ID | REQ-ENG-005, REQ-DI-001, REQ-DI-003 |
| Test Type | Data Integrity / Regression |
| Priority | P1 |
| Preconditions | `WELL-1001` and `WELL-1002` have different Engineering Parameter values |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for `WELL-1001`. | Engineering data for `WELL-1001` is displayed. |
| 2 | Record a unique Engineering Parameter value from `WELL-1001`. | The value is captured for comparison. |
| 3 | Switch to `WELL-1002`. | The active well context changes to `WELL-1002`. |
| 4 | Open Engineering Parameters for `WELL-1002`. | Engineering data associated with `WELL-1002` is displayed. |
| 5 | Compare the displayed data with the recorded `WELL-1001` value. | `WELL-1001` values are not incorrectly displayed for `WELL-1002`. |
| 6 | Return to `WELL-1001`. | The original Engineering Parameter data remains correctly associated with `WELL-1001`. |

---

## Test Case 13 — Verify Unsaved Engineering Parameter Changes

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-013 |
| Scenario | Verify that unsaved Engineering Parameter changes are not persisted unintentionally |
| Requirement ID | REQ-ENG-002, REQ-DI-002 |
| Test Type | Negative / Data Integrity |
| Priority | P2 |
| Preconditions | User has edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for an editable well. | Existing saved parameter values are displayed. |
| 2 | Modify an editable parameter without selecting Save. | The modified value is visible as an unsaved change. |
| 3 | Navigate to another application section. | The application handles the unsaved change according to its configured behavior. |
| 4 | If a confirmation prompt is displayed, review the available options. | The prompt clearly indicates that changes have not been saved. |
| 5 | Select the option to discard changes, where supported. | The unsaved parameter modification is discarded. |
| 6 | Return to Engineering Parameters. | The original saved value is displayed instead of the discarded value. |

---

## Test Case 14 — Verify Read-Only Access for Unauthorized User

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-014 |
| Scenario | Verify that a user without edit permission cannot modify Engineering Parameters |
| Requirement ID | REQ-ENG-001, REQ-RBAC-005 |
| Test Type | Negative / RBAC |
| Priority | P1 |
| Preconditions | Restricted user account exists without Engineering Parameter edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using `restricted.demo`. | The restricted user is authenticated successfully. |
| 2 | Navigate to a well accessible to the user. | The permitted well context is displayed. |
| 3 | Open Engineering Parameters. | The section is displayed if the user has view permission. |
| 4 | Review the available editing controls. | Edit and Save controls are hidden or disabled when edit permission is not granted. |
| 5 | Attempt to modify an Engineering Parameter. | The user cannot submit an unauthorized parameter change. |
| 6 | Reopen or refresh the Engineering Parameters section. | Existing Engineering Parameter data remains unchanged. |

---

## Test Case 15 — Verify Engineering Parameter Recovery After Processing Failure

| Field | Details |
|---|---|
| Test Case ID | TC-ENG-015 |
| Scenario | Verify that the application handles an Engineering Parameter processing failure correctly |
| Requirement ID | REQ-ENG-004, REQ-ERR-002 |
| Test Type | Negative / Error Handling |
| Priority | P2 |
| Preconditions | Test environment supports controlled simulation of a processing failure |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Engineering Parameters for a valid test well. | The Engineering Parameters section loads successfully. |
| 2 | Enter valid synthetic input values required for processing. | The input values are accepted. |
| 3 | Trigger the Engineering Parameter processing operation while the processing service is intentionally unavailable. | The application detects the processing failure. |
| 4 | Review the processing response. | A meaningful error or failure state is displayed instead of misleading results. |
| 5 | Restore the processing service and retry using the same valid inputs. | The application successfully starts processing again. |
| 6 | Review the resulting Engineering output. | Valid processed results are displayed after the service recovers. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-ENG-001 | Verify Engineering Parameter section access | Positive / Functional | P1 |
| TC-ENG-002 | Verify existing Engineering Parameter values | Functional / Data Validation | P1 |
| TC-ENG-003 | Enter valid Engineering Parameters | Positive / Functional | P1 |
| TC-ENG-004 | Edit existing Engineering Parameters | Positive / Functional | P1 |
| TC-ENG-005 | Verify mandatory Engineering Parameter validation | Negative / Validation | P1 |
| TC-ENG-006 | Verify numeric Engineering Parameter validation | Negative / Validation | P1 |
| TC-ENG-007 | Verify Engineering Parameter range validation | Negative / Boundary | P1 |
| TC-ENG-008 | Verify Engineering Parameter boundary values | Boundary / Positive | P1 |
| TC-ENG-009 | Verify Engineering Parameter processing | Functional / Processing | P1 |
| TC-ENG-010 | Verify Engineering result display | Functional / UI | P1 |
| TC-ENG-011 | Verify Engineering Parameter persistence | Data Persistence / Regression | P1 |
| TC-ENG-012 | Verify Engineering data association between wells | Data Integrity / Regression | P1 |
| TC-ENG-013 | Verify unsaved Engineering Parameter changes | Negative / Data Integrity | P2 |
| TC-ENG-014 | Verify read-only access for unauthorized user | Negative / RBAC | P1 |
| TC-ENG-015 | Verify Engineering Parameter recovery after processing failure | Negative / Error Handling | P2 |
