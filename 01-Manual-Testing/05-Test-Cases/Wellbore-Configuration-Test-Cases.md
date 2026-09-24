# Wellbore Configuration Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Wellbore Configuration Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | Wellbore Configuration |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, Validation, UI, Data Integrity, Regression |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Verify Wellbore Configuration Access

| Field | Details |
|---|---|
| Test Case ID | TC-WB-001 |
| Scenario | Verify that an authorized user can access Wellbore Configuration for a selected well |
| Requirement ID | REQ-WB-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User is logged in and has permission to view Wellbore Configuration |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Navigate to Well Management and select `PAD-001 – Falcon North Pad`. | The wells associated with the selected pad are displayed. |
| 3 | Select `WELL-1001 – Falcon-A01`. | `WELL-1001` becomes the active well context. |
| 4 | Navigate to the Wellbore Configuration section. | The Wellbore Configuration section opens successfully. |
| 5 | Review the available configuration fields and sections. | Configured Wellbore Configuration fields are displayed without loading errors. |
| 6 | Verify the selected well context. | The configuration displayed belongs to `WELL-1001`. |

---

## Test Case 2 — Verify Existing Wellbore Configuration Data

| Field | Details |
|---|---|
| Test Case ID | TC-WB-002 |
| Scenario | Verify that existing Wellbore Configuration values are displayed correctly |
| Requirement ID | REQ-WB-001 |
| Test Type | Functional / Data Validation |
| Priority | P1 |
| Preconditions | `WELL-1001` contains configured Wellbore Configuration data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Wellbore Configuration for `WELL-1001`. | The configuration section loads successfully. |
| 2 | Review the configured wellbore entries. | Existing wellbore records are displayed. |
| 3 | Review the values associated with each configuration field. | Values match the prepared synthetic test data. |
| 4 | Review the order of the configured wellbore entries. | Entries appear in the expected configured sequence. |
| 5 | Review field units or applicable measurement indicators. | Applicable units are displayed consistently with the configured field definitions. |
| 6 | Navigate away and return to the same wellbore configuration. | The same saved configuration remains associated with `WELL-1001`. |

---

## Test Case 3 — Add Valid Wellbore Configuration Data

| Field | Details |
|---|---|
| Test Case ID | TC-WB-003 |
| Scenario | Verify that an authorized user can add a valid Wellbore Configuration entry |
| Requirement ID | REQ-WB-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User has edit permission for Wellbore Configuration |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Wellbore Configuration for an editable test well. | The configuration is displayed with editing controls available. |
| 2 | Select the option to add a new configuration entry. | A new configuration row or input area is displayed. |
| 3 | Enter valid synthetic values in all applicable fields. | Each valid value is accepted by the corresponding field. |
| 4 | Review the newly entered configuration before saving. | The new entry displays the entered values correctly. |
| 5 | Select Save. | The system validates and saves the new Wellbore Configuration entry successfully. |
| 6 | Reopen the configuration section. | The newly added entry is displayed with the saved values. |

---

## Test Case 4 — Edit Existing Wellbore Configuration

| Field | Details |
|---|---|
| Test Case ID | TC-WB-004 |
| Scenario | Verify that an authorized user can update an existing Wellbore Configuration entry |
| Requirement ID | REQ-WB-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | An editable Wellbore Configuration entry exists |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Wellbore Configuration section for `WELL-1002`. | Existing configuration entries are displayed. |
| 2 | Select an existing configuration entry for editing. | The selected entry becomes editable. |
| 3 | Change one permitted configuration value using valid test data. | The new value is accepted by the field. |
| 4 | Review the modified entry. | The updated value is displayed correctly before saving. |
| 5 | Save the configuration. | The system validates and saves the modified configuration. |
| 6 | Refresh the page and review the modified entry. | The updated value remains available after refresh. |

---

## Test Case 5 — Verify Mandatory Field Validation

| Field | Details |
|---|---|
| Test Case ID | TC-WB-005 |
| Scenario | Verify that mandatory Wellbore Configuration fields cannot be saved without required values |
| Requirement ID | REQ-WB-003, REQ-DATA-001 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | At least one mandatory Wellbore Configuration field is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable Wellbore Configuration entry. | The configuration fields are available for modification. |
| 2 | Identify a mandatory field containing a valid value. | The mandatory field is available for editing. |
| 3 | Remove the existing value from the mandatory field. | The field becomes empty. |
| 4 | Select Save. | The system prevents the incomplete configuration from being saved. |
| 5 | Review the affected field. | A clear required-field validation message is displayed. |
| 6 | Enter a valid value and save again. | The validation message is cleared and the configuration is saved successfully. |

---

## Test Case 6 — Verify Numeric Field Validation

| Field | Details |
|---|---|
| Test Case ID | TC-WB-006 |
| Scenario | Verify that non-numeric values are rejected in Wellbore Configuration numeric fields |
| Requirement ID | REQ-WB-003, REQ-DATA-002 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | A numeric Wellbore Configuration field is available for editing |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable Wellbore Configuration record. | The configuration fields are displayed. |
| 2 | Select a field that accepts numeric values. | The selected field is ready for numeric input. |
| 3 | Enter alphabetic or unsupported non-numeric characters. | The application rejects the invalid characters or identifies the value as invalid. |
| 4 | Attempt to save the configuration. | The system prevents invalid numeric data from being saved. |
| 5 | Review the validation feedback. | A meaningful message identifies the invalid numeric input. |
| 6 | Replace the invalid value with a valid numeric value and save. | The valid numeric value is accepted and the configuration saves successfully. |

---

## Test Case 7 — Verify Wellbore Value Range Validation

| Field | Details |
|---|---|
| Test Case ID | TC-WB-007 |
| Scenario | Verify that Wellbore Configuration values outside the permitted range are rejected |
| Requirement ID | REQ-WB-003, REQ-DATA-003 |
| Test Type | Negative / Boundary |
| Priority | P1 |
| Preconditions | The selected Wellbore Configuration field has defined minimum and maximum limits |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Wellbore Configuration section in edit mode. | Editable configuration fields are displayed. |
| 2 | Select a field with a defined numeric range. | The selected field accepts numeric input. |
| 3 | Enter a value below the configured minimum. | The application identifies the value as outside the allowed range. |
| 4 | Attempt to save the configuration. | The system prevents the out-of-range value from being saved. |
| 5 | Replace the value with one above the configured maximum. | The application also identifies the upper-bound violation. |
| 6 | Enter a value within the configured range and save. | The valid boundary-range value is accepted and saved successfully. |

---

## Test Case 8 — Verify Boundary Values in Wellbore Configuration

| Field | Details |
|---|---|
| Test Case ID | TC-WB-008 |
| Scenario | Verify that valid minimum and maximum boundary values are accepted |
| Requirement ID | REQ-WB-003, REQ-DATA-003 |
| Test Type | Boundary / Positive |
| Priority | P1 |
| Preconditions | Valid minimum and maximum values are defined for the selected field |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the applicable Wellbore Configuration field in edit mode. | The selected field is available for input. |
| 2 | Enter the configured minimum valid value. | The minimum boundary value is accepted without validation error. |
| 3 | Save the configuration. | The minimum valid value is saved successfully. |
| 4 | Edit the same field and enter the configured maximum valid value. | The maximum boundary value is accepted without validation error. |
| 5 | Save the updated configuration. | The maximum valid value is saved successfully. |
| 6 | Reopen the configuration. | The last saved boundary value is displayed correctly. |

---

## Test Case 9 — Verify Wellbore Sequence Validation

| Field | Details |
|---|---|
| Test Case ID | TC-WB-009 |
| Scenario | Verify that Wellbore Configuration entries follow the required sequence |
| Requirement ID | REQ-WB-005 |
| Test Type | Functional / Validation |
| Priority | P1 |
| Preconditions | Multiple Wellbore Configuration entries are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Wellbore Configuration section. | Existing configuration entries are displayed in their configured sequence. |
| 2 | Add or edit an entry that requires a sequence position. | The sequence field or ordering mechanism becomes available. |
| 3 | Enter a valid sequence value that follows the existing order. | The sequence value is accepted. |
| 4 | Save the configuration. | The system saves the configuration with the valid sequence. |
| 5 | Enter a sequence value that conflicts with the defined ordering rule. | The application identifies the sequence conflict. |
| 6 | Attempt to save the invalid sequence. | The system prevents the invalid sequence from being saved and provides appropriate validation feedback. |

---

## Test Case 10 — Verify Duplicate Wellbore Configuration Entry

| Field | Details |
|---|---|
| Test Case ID | TC-WB-010 |
| Scenario | Verify that duplicate configuration records are handled according to the defined business rule |
| Requirement ID | REQ-WB-003, REQ-DI-001 |
| Test Type | Negative / Data Integrity |
| Priority | P2 |
| Preconditions | An existing Wellbore Configuration entry is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Wellbore Configuration section. | Existing configuration entries are displayed. |
| 2 | Record the identifying values of an existing configuration entry. | The identifying values are available for comparison. |
| 3 | Attempt to create another entry using the same identifying combination. | The application accepts the input for validation or identifies the duplicate during entry. |
| 4 | Select Save. | The system evaluates the duplicate configuration against its business rules. |
| 5 | Review the result. | The duplicate is prevented or handled according to the configured duplicate-record rule. |
| 6 | Review the configuration list. | No unintended duplicate configuration record is created. |

---

## Test Case 11 — Verify Wellbore Configuration Persistence

| Field | Details |
|---|---|
| Test Case ID | TC-WB-011 |
| Scenario | Verify that saved Wellbore Configuration data persists after navigation and refresh |
| Requirement ID | REQ-WB-004 |
| Test Type | Data Persistence / Regression |
| Priority | P1 |
| Preconditions | User has edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Wellbore Configuration for `WELL-1001`. | Existing configuration data is displayed. |
| 2 | Modify a permitted field using a unique valid test value. | The new value is accepted. |
| 3 | Save the configuration. | The updated configuration is saved successfully. |
| 4 | Navigate to another section of the same well. | Navigation completes without losing the saved configuration. |
| 5 | Return to Wellbore Configuration. | The updated value is displayed. |
| 6 | Refresh the page and review the same configuration. | The updated value remains persisted after refresh. |

---

## Test Case 12 — Verify Wellbore Data Is Associated with the Correct Well

| Field | Details |
|---|---|
| Test Case ID | TC-WB-012 |
| Scenario | Verify that Wellbore Configuration data does not move between different well contexts |
| Requirement ID | REQ-WB-004, REQ-DI-001, REQ-DI-003 |
| Test Type | Data Integrity / Regression |
| Priority | P1 |
| Preconditions | `WELL-1001` and `WELL-1002` have different Wellbore Configuration data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Wellbore Configuration for `WELL-1001`. | Configuration belonging to `WELL-1001` is displayed. |
| 2 | Record a unique configuration value from `WELL-1001`. | The value is captured for comparison. |
| 3 | Switch to `WELL-1002`. | The active well context changes to `WELL-1002`. |
| 4 | Open Wellbore Configuration for `WELL-1002`. | Configuration associated with `WELL-1002` is displayed. |
| 5 | Compare the displayed values with the recorded `WELL-1001` value. | `WELL-1001` configuration values are not incorrectly displayed for `WELL-1002`. |
| 6 | Return to `WELL-1001`. | The original `WELL-1001` configuration remains unchanged and correctly associated with that well. |

---

## Test Case 13 — Verify Cancel or Discard of Unsaved Changes

| Field | Details |
|---|---|
| Test Case ID | TC-WB-013 |
| Scenario | Verify that unsaved Wellbore Configuration changes can be discarded |
| Requirement ID | REQ-WB-004, REQ-DI-002 |
| Test Type | Negative / Data Integrity |
| Priority | P2 |
| Preconditions | User has edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an existing Wellbore Configuration record. | The current saved configuration is displayed. |
| 2 | Modify an editable field without saving. | The modified value is displayed as an unsaved change. |
| 3 | Select Cancel, Discard, or navigate away using the supported workflow. | The application handles the unsaved change according to its configured behavior. |
| 4 | Confirm the discard action when a confirmation prompt is displayed. | The application discards the unsaved modification. |
| 5 | Reopen the Wellbore Configuration record. | The original saved value is displayed instead of the discarded value. |
| 6 | Refresh the page and review the field again. | The discarded value is not restored after refresh. |

---

## Test Case 14 — Verify Read-Only Access for Unauthorized User

| Field | Details |
|---|---|
| Test Case ID | TC-WB-014 |
| Scenario | Verify that a user without edit permission cannot modify Wellbore Configuration |
| Requirement ID | REQ-WB-001, REQ-RBAC-005 |
| Test Type | Negative / RBAC |
| Priority | P1 |
| Preconditions | A restricted user account exists without Wellbore Configuration edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using the restricted test account `restricted.demo`. | The restricted user is authenticated successfully. |
| 2 | Navigate to an authorized well. | The selected well is displayed according to the user's permissions. |
| 3 | Open Wellbore Configuration. | The Wellbore Configuration section is accessible only if view permission is granted. |
| 4 | Review the available editing controls. | Edit or Save controls are hidden or disabled when the user has no edit permission. |
| 5 | Attempt to modify an existing configuration value. | The user cannot modify or submit unauthorized changes. |
| 6 | Verify the stored configuration after the attempt. | Existing Wellbore Configuration data remains unchanged. |

---

## Test Case 15 — Verify Wellbore Configuration Recovery After Data Loading Failure

| Field | Details |
|---|---|
| Test Case ID | TC-WB-015 |
| Scenario | Verify Wellbore Configuration behavior when configuration data temporarily fails to load |
| Requirement ID | REQ-ERR-004, REQ-NFR-005 |
| Test Type | Negative / Error Handling |
| Priority | P2 |
| Preconditions | Test environment supports controlled simulation of a configuration-data loading failure |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Open Wellbore Configuration for a valid well. | The configuration page is available under normal conditions. |
| 3 | Simulate a controlled failure for the Wellbore Configuration data request. | The data request fails without causing an unexpected application crash. |
| 4 | Reload the configuration section or trigger the available retry action. | The application identifies the loading failure and presents an appropriate error or retry state. |
| 5 | Restore the configuration data service and retry the operation. | The application successfully retrieves the Wellbore Configuration data. |
| 6 | Review the recovered configuration. | The correct Wellbore Configuration records are displayed after recovery. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-WB-001 | Verify Wellbore Configuration access | Positive / Functional | P1 |
| TC-WB-002 | Verify existing Wellbore Configuration data | Functional / Data Validation | P1 |
| TC-WB-003 | Add valid Wellbore Configuration data | Positive / Functional | P1 |
| TC-WB-004 | Edit existing Wellbore Configuration | Positive / Functional | P1 |
| TC-WB-005 | Verify mandatory field validation | Negative / Validation | P1 |
| TC-WB-006 | Verify numeric field validation | Negative / Validation | P1 |
| TC-WB-007 | Verify Wellbore value range validation | Negative / Boundary | P1 |
| TC-WB-008 | Verify boundary values in Wellbore Configuration | Boundary / Positive | P1 |
| TC-WB-009 | Verify Wellbore sequence validation | Functional / Validation | P1 |
| TC-WB-010 | Verify duplicate Wellbore Configuration entry | Negative / Data Integrity | P2 |
| TC-WB-011 | Verify Wellbore Configuration persistence | Data Persistence / Regression | P1 |
| TC-WB-012 | Verify Wellbore data is associated with the correct well | Data Integrity / Regression | P1 |
| TC-WB-013 | Verify cancel or discard of unsaved changes | Negative / Data Integrity | P2 |
| TC-WB-014 | Verify read-only access for unauthorized user | Negative / RBAC | P1 |
| TC-WB-015 | Verify Wellbore Configuration recovery after data loading failure | Negative / Error Handling | P2 |
