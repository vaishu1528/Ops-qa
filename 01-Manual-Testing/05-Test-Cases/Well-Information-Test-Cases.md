# Well Information Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Well Information Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | Well Information |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, Validation, UI, Data Integrity, Regression |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Verify General Information Section Access

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-001 |
| Scenario | Verify that an authorized user can access the General Information section for a selected well |
| Requirement ID | REQ-WINFO-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User is logged in and has access to Well Management |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Navigate to Well Management. | The Well Management page opens successfully. |
| 3 | Select `PAD-001 – Falcon North Pad`. | The wells associated with the selected pad are displayed. |
| 4 | Select `WELL-1001 – Falcon-A01`. | `WELL-1001` becomes the active well context. |
| 5 | Navigate to the General Information section. | The General Information section opens successfully. |
| 6 | Review the displayed well information fields. | The fields and existing values associated with the selected well are displayed correctly. |

---

## Test Case 2 — Verify General Information Display

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-002 |
| Scenario | Verify that existing General Information values are displayed correctly for the selected well |
| Requirement ID | REQ-WINFO-001 |
| Test Type | Functional / Data Validation |
| Priority | P1 |
| Preconditions | `WELL-1001` contains configured General Information test data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the General Information section for `WELL-1001`. | The General Information section loads successfully. |
| 2 | Review the well identifier displayed on the page. | The displayed identifier matches `WELL-1001`. |
| 3 | Review the well name and configured descriptive information. | The displayed values match the synthetic test data for the selected well. |
| 4 | Review the available editable and read-only fields. | Each field has the correct interaction state according to its configuration. |
| 5 | Compare the displayed information with the prepared test data. | Existing General Information values are displayed accurately. |
| 6 | Navigate away and return to the same well. | The same saved information remains associated with `WELL-1001`. |

---

## Test Case 3 — Update General Information with Valid Data

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-003 |
| Scenario | Verify that an authorized user can update General Information using valid values |
| Requirement ID | REQ-WINFO-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User has edit permission and `WELL-1001` is selected |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the General Information section for `WELL-1001`. | The existing General Information is displayed. |
| 2 | Enable the available edit functionality. | Editable fields become available for modification. |
| 3 | Update a permitted field using valid synthetic data. | The new value is accepted by the corresponding field. |
| 4 | Review the modified field before saving. | The updated value is displayed correctly without formatting issues. |
| 5 | Select the Save action. | The system validates and saves the updated General Information successfully. |
| 6 | Reload the well information. | The saved value remains available after the page is reloaded. |

---

## Test Case 4 — Verify General Information Persistence

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-004 |
| Scenario | Verify that saved General Information persists after navigation and page refresh |
| Requirement ID | REQ-WINFO-003 |
| Test Type | Data Persistence / Regression |
| Priority | P1 |
| Preconditions | User has permission to edit well information |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open `WELL-1002` and navigate to General Information. | General Information for `WELL-1002` is displayed. |
| 2 | Modify an editable field with a valid test value. | The new value is accepted by the field. |
| 3 | Save the updated information. | The system confirms or completes the save operation successfully. |
| 4 | Navigate to another section of the same well. | The user can leave General Information without losing the saved change. |
| 5 | Return to General Information. | The previously saved value is displayed. |
| 6 | Refresh the browser page and review the same field. | The saved value persists after refresh and remains associated with the correct well. |

---

## Test Case 5 — Verify Required Field Validation

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-005 |
| Scenario | Verify that mandatory General Information fields cannot be saved without required values |
| Requirement ID | REQ-WINFO-004, REQ-DATA-001 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | User has edit permission and at least one mandatory field is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open General Information for an editable well. | The General Information section is displayed in editable mode. |
| 2 | Identify a mandatory field containing an existing value. | The mandatory field is clearly available for editing. |
| 3 | Remove the value from the mandatory field. | The field becomes empty without automatically restoring the previous value. |
| 4 | Select Save. | The application performs mandatory-field validation and prevents an invalid save. |
| 5 | Review the affected field and validation area. | A clear validation message indicates that the required value must be provided. |
| 6 | Enter a valid value and save again. | The validation error is cleared and the information is saved successfully. |

---

## Test Case 6 — Verify Invalid Data in General Information

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-006 |
| Scenario | Verify that invalid data formats are rejected in applicable General Information fields |
| Requirement ID | REQ-DATA-002, REQ-DATA-004 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | Editable General Information fields with defined data formats are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable General Information record. | The editable fields are displayed successfully. |
| 2 | Select a field that requires a specific data format. | The selected field accepts input according to its configured data type. |
| 3 | Enter an invalid value that does not match the expected format. | The invalid value is either rejected immediately or retained for validation. |
| 4 | Attempt to save the record. | The system validates the entered value and prevents invalid data from being saved. |
| 5 | Review the validation feedback. | A meaningful error message identifies the invalid field or required format. |
| 6 | Replace the invalid value with a valid test value and save. | The validation error is removed and the valid information is saved successfully. |

---

## Test Case 7 — Verify Location Information Access

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-007 |
| Scenario | Verify that Location Information can be accessed for the selected well |
| Requirement ID | REQ-LOC-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | A valid well is selected |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open `WELL-1001` from Well Management. | The selected well becomes the active context. |
| 2 | Navigate to the Location Information section. | The Location section opens successfully. |
| 3 | Review the available location fields. | Applicable location fields are displayed. |
| 4 | Review the existing location values. | Configured synthetic location data is displayed for the selected well. |
| 5 | Compare the displayed well identifier with the selected well. | Location information is associated with `WELL-1001`. |
| 6 | Navigate to another well and open its Location section. | The location context changes to the newly selected well without retaining stale values from `WELL-1001`. |

---

## Test Case 8 — Verify Location Data Validation

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-008 |
| Scenario | Verify that invalid location values are rejected |
| Requirement ID | REQ-LOC-002, REQ-DATA-003 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | User has permission to edit Location Information |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Location Information for an editable well. | The Location section is displayed in editable mode. |
| 2 | Select a coordinate or numeric location field. | The selected field accepts location input. |
| 3 | Enter a value outside the configured valid range. | The system identifies the value as potentially invalid. |
| 4 | Attempt to save the Location Information. | The application prevents invalid location data from being saved. |
| 5 | Review the validation message. | The user receives clear feedback identifying the invalid value or expected range. |
| 6 | Replace the value with a valid location value and save. | The valid location data is accepted and saved successfully. |

---

## Test Case 9 — Verify Location Information Persistence

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-009 |
| Scenario | Verify that saved Location Information remains available after navigation and refresh |
| Requirement ID | REQ-LOC-003 |
| Test Type | Positive / Data Persistence |
| Priority | P1 |
| Preconditions | User has edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Location Information section for `WELL-1002`. | Existing location information is displayed. |
| 2 | Update an editable location field with a valid synthetic value. | The updated value is accepted by the field. |
| 3 | Save the Location Information. | The system successfully saves the updated location data. |
| 4 | Navigate to another section of the same well. | Navigation completes without losing the saved location update. |
| 5 | Return to Location Information. | The updated location value is displayed. |
| 6 | Refresh the page and review the same value. | The updated location value remains persisted after refresh. |

---

## Test Case 10 — Verify Channel Input Access

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-010 |
| Scenario | Verify that an authorized user can access the Channel Input section for a selected well |
| Requirement ID | REQ-CHANNEL-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User is logged in and a valid well is selected |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open a valid well from Well Management. | The selected well is displayed as the active context. |
| 2 | Navigate to the Channel Input section. | The Channel Input section opens successfully. |
| 3 | Review the available channel fields. | Configured channel input fields are displayed. |
| 4 | Review the existing channel values. | Existing synthetic channel data is displayed correctly where available. |
| 5 | Select an editable channel field. | The field becomes ready to accept valid input. |
| 6 | Verify the selected well context. | Channel data is associated with the currently selected well. |

---

## Test Case 11 — Verify Channel Data Entry

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-011 |
| Scenario | Verify that valid Channel Input data can be entered and saved |
| Requirement ID | REQ-CHANNEL-002, REQ-CHANNEL-004 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User has edit permission for Channel Input |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Channel Input for `WELL-1001`. | The Channel Input section is displayed. |
| 2 | Select an editable channel field. | The selected field accepts user input. |
| 3 | Enter a valid synthetic channel value. | The valid value is accepted by the field. |
| 4 | Review the entered value before saving. | The entered channel value is displayed correctly. |
| 5 | Save the Channel Input data. | The system validates and saves the channel information successfully. |
| 6 | Reopen the Channel Input section. | The saved channel value is displayed and remains associated with `WELL-1001`. |

---

## Test Case 12 — Verify Channel Data Validation

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-012 |
| Scenario | Verify that invalid Channel Input values are rejected |
| Requirement ID | REQ-CHANNEL-003, REQ-DATA-002, REQ-DATA-003 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | Channel Input section is editable |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Channel Input section for a valid well. | The Channel Input fields are displayed. |
| 2 | Select a numeric channel field. | The field is ready to receive channel data. |
| 3 | Enter a non-numeric or otherwise invalid value. | The application identifies the value as invalid according to the field rules. |
| 4 | Attempt to save the entered value. | The system prevents invalid channel data from being saved. |
| 5 | Review the validation feedback. | A meaningful validation message identifies the invalid input. |
| 6 | Replace the invalid value with a valid synthetic value and save. | The valid channel value is accepted and saved successfully. |

---

## Test Case 13 — Verify Channel Data Persistence After Navigation

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-013 |
| Scenario | Verify that saved Channel Input values remain associated with the correct well |
| Requirement ID | REQ-CHANNEL-004, REQ-DI-001, REQ-DI-003 |
| Test Type | Data Integrity / Regression |
| Priority | P1 |
| Preconditions | Two or more wells are available and Channel Input can be edited |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Channel Input for `WELL-1001`. | Channel data for `WELL-1001` is displayed. |
| 2 | Update a permitted channel field with a unique synthetic value. | The unique value is accepted. |
| 3 | Save the Channel Input data. | The updated value is saved successfully. |
| 4 | Switch to `WELL-1002`. | The application changes to the `WELL-1002` context. |
| 5 | Review the Channel Input values for `WELL-1002`. | Channel data belongs to `WELL-1002` and does not incorrectly display the value saved for `WELL-1001`. |
| 6 | Return to `WELL-1001` and open Channel Input. | The value previously saved for `WELL-1001` is retained and displayed correctly. |

---

## Test Case 14 — Verify Unsaved General Information Changes

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-014 |
| Scenario | Verify the application behavior when the user leaves General Information with unsaved changes |
| Requirement ID | REQ-WINFO-003, REQ-DI-002 |
| Test Type | Negative / Data Integrity |
| Priority | P2 |
| Preconditions | User has edit permission |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open General Information for an editable well. | Existing General Information values are displayed. |
| 2 | Modify an editable field without saving. | The changed value is visible as an unsaved modification. |
| 3 | Navigate to another section without selecting Save. | The application handles the unsaved change according to its configured behavior. |
| 4 | If a confirmation prompt is displayed, review its options. | The prompt clearly identifies that changes have not been saved and provides appropriate choices. |
| 5 | Choose the option to discard changes, where available. | The unsaved modification is discarded. |
| 6 | Return to General Information. | The original saved value is displayed instead of the discarded value. |

---

## Test Case 15 — Verify Well Information Context Integrity

| Field | Details |
|---|---|
| Test Case ID | TC-WINFO-015 |
| Scenario | Verify that General Information, Location, and Channel data remain associated with the correct well |
| Requirement ID | REQ-DI-001, REQ-DI-003, REQ-DI-005 |
| Test Type | Data Integrity / Regression |
| Priority | P1 |
| Preconditions | At least two wells have distinct synthetic information |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Select `WELL-1001` and open its General Information section. | General Information belonging to `WELL-1001` is displayed. |
| 2 | Navigate to Location Information for the same well. | Location data associated with `WELL-1001` is displayed. |
| 3 | Navigate to Channel Input for the same well. | Channel data associated with `WELL-1001` is displayed. |
| 4 | Switch to `WELL-1002`. | The active well context changes to `WELL-1002`. |
| 5 | Open General Information, Location, and Channel Input for `WELL-1002`. | Each section displays information belonging to `WELL-1002`. |
| 6 | Compare the information between both wells. | Data from `WELL-1001` is not incorrectly displayed in the `WELL-1002` context, and each record remains correctly associated with its well. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-WINFO-001 | Verify General Information section access | Positive / Functional | P1 |
| TC-WINFO-002 | Verify General Information display | Functional / Data Validation | P1 |
| TC-WINFO-003 | Update General Information with valid data | Positive / Functional | P1 |
| TC-WINFO-004 | Verify General Information persistence | Data Persistence / Regression | P1 |
| TC-WINFO-005 | Verify required field validation | Negative / Validation | P1 |
| TC-WINFO-006 | Verify invalid data in General Information | Negative / Validation | P1 |
| TC-WINFO-007 | Verify Location Information access | Positive / Functional | P1 |
| TC-WINFO-008 | Verify Location data validation | Negative / Validation | P1 |
| TC-WINFO-009 | Verify Location Information persistence | Positive / Data Persistence | P1 |
| TC-WINFO-010 | Verify Channel Input access | Positive / Functional | P1 |
| TC-WINFO-011 | Verify Channel data entry | Positive / Functional | P1 |
| TC-WINFO-012 | Verify Channel data validation | Negative / Validation | P1 |
| TC-WINFO-013 | Verify Channel data persistence after navigation | Data Integrity / Regression | P1 |
| TC-WINFO-014 | Verify unsaved General Information changes | Negative / Data Integrity | P2 |
| TC-WINFO-015 | Verify Well Information context integrity | Data Integrity / Regression | P1 |
