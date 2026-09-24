# Version Management Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Version Management Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | Version Management |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, Data Integrity, Regression, Validation |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Verify Version Management Section Access

| Field | Details |
|---|---|
| Test Case ID | TC-VER-001 |
| Scenario | Verify that an authorized user can access the Version Management section for a selected well |
| Requirement ID | REQ-VER-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User is logged in and has access to the selected well |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Navigate to `PAD-001 – Falcon North Pad`. | The wells associated with the selected pad are displayed. |
| 3 | Select `WELL-1001 – Falcon-A01`. | `WELL-1001` becomes the active well context. |
| 4 | Navigate to the Version Management section. | The Version Management section opens successfully. |
| 5 | Review the available version information. | Existing versions associated with the selected well are displayed. |
| 6 | Verify the active well identifier. | Version information belongs to the currently selected well. |

---

## Test Case 2 — Verify Existing Version Information Display

| Field | Details |
|---|---|
| Test Case ID | TC-VER-002 |
| Scenario | Verify that available versions display the correct version information |
| Requirement ID | REQ-VER-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | The selected well contains multiple synthetic versions |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Version Management for `WELL-1001`. | The Version Management section loads successfully. |
| 2 | Review the available version list. | All available versions for the selected well are displayed. |
| 3 | Identify versions `V1`, `V2`, and `V3`. | The expected synthetic versions are present. |
| 4 | Review the version labels or identifiers. | Each version has a unique and readable identifier. |
| 5 | Review the associated version details. | Version details correspond to the selected version. |
| 6 | Compare the displayed versions with the test data. | The displayed version information matches the configured synthetic test data. |

---

## Test Case 3 — Verify Version Navigation

| Field | Details |
|---|---|
| Test Case ID | TC-VER-003 |
| Scenario | Verify that the user can navigate between available versions |
| Requirement ID | REQ-VER-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | Multiple versions are available for the selected well |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Version Management for a well containing `V1`, `V2`, and `V3`. | The available versions are displayed. |
| 2 | Select version `V1`. | Version `V1` becomes the selected version. |
| 3 | Navigate to version `V2`. | Version `V2` is loaded successfully. |
| 4 | Navigate from `V2` to `V3`. | Version `V3` is loaded successfully. |
| 5 | Return from `V3` to `V1`. | Version `V1` is displayed again. |
| 6 | Review the version identifier after navigation. | The displayed data corresponds to the currently selected version. |

---

## Test Case 4 — Verify Version Selection

| Field | Details |
|---|---|
| Test Case ID | TC-VER-004 |
| Scenario | Verify that selecting a version loads the correct version-specific data |
| Requirement ID | REQ-VER-004 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | At least two versions contain different synthetic data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Version Management section. | Available versions are displayed. |
| 2 | Select `V1`. | `V1` becomes the active version. |
| 3 | Record a version-specific value from the selected data. | The value is available for comparison. |
| 4 | Select `V2`. | `V2` becomes the active version. |
| 5 | Review the same data field in `V2`. | The value displayed belongs to `V2` and is not incorrectly inherited from `V1`. |
| 6 | Switch back to `V1`. | The original `V1` value is displayed correctly. |

---

## Test Case 5 — Verify Version Data Integrity

| Field | Details |
|---|---|
| Test Case ID | TC-VER-005 |
| Scenario | Verify that data associated with one version is not incorrectly modified when another version is selected |
| Requirement ID | REQ-VER-003, REQ-DI-004 |
| Test Type | Data Integrity / Regression |
| Priority | P1 |
| Preconditions | `V1` and `V2` contain different synthetic data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open version `V1` and record selected test values. | The `V1` values are captured for comparison. |
| 2 | Navigate to version `V2`. | `V2` data is displayed. |
| 3 | Review the corresponding fields in `V2`. | The fields contain the expected `V2` values. |
| 4 | Return to version `V1`. | `V1` is loaded again. |
| 5 | Compare the previously recorded `V1` values with the current values. | The original `V1` values remain unchanged. |
| 6 | Verify the version identifier and data context. | The displayed data remains correctly associated with `V1`. |

---

## Test Case 6 — Verify Version Data Persistence After Refresh

| Field | Details |
|---|---|
| Test Case ID | TC-VER-006 |
| Scenario | Verify that the selected version remains correctly available after browser refresh |
| Requirement ID | REQ-VER-003 |
| Test Type | Persistence / Regression |
| Priority | P1 |
| Preconditions | Multiple versions are available for the selected well |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Version Management for `WELL-1001`. | Version information is displayed successfully. |
| 2 | Select `V2`. | `V2` becomes the selected version. |
| 3 | Record a unique value from `V2`. | The selected version value is captured. |
| 4 | Refresh the browser page. | The application reloads without a system error. |
| 5 | Navigate back to Version Management if required. | Version information becomes available again. |
| 6 | Review the selected version and recorded value. | The version context and associated data remain consistent after refresh. |

---

## Test Case 7 — Verify Version Context During Module Navigation

| Field | Details |
|---|---|
| Test Case ID | TC-VER-007 |
| Scenario | Verify that the selected version context remains consistent while navigating between well modules |
| Requirement ID | REQ-VER-002, REQ-DI-003 |
| Test Type | Integration / Regression |
| Priority | P1 |
| Preconditions | A valid well contains multiple versions |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open `WELL-1001` and select version `V2`. | `V2` becomes the active version context. |
| 2 | Navigate to the Well Information section. | The Well Information section opens successfully. |
| 3 | Navigate to the Wellbore Configuration section. | The Wellbore Configuration section opens successfully. |
| 4 | Return to Version Management. | Version Management opens for the same well. |
| 5 | Review the active version context. | The application retains or correctly restores the expected version context according to the configured workflow. |
| 6 | Compare version-specific data with the previously recorded values. | The displayed data remains associated with the correct version. |

---

## Test Case 8 — Verify Version Identifier Uniqueness

| Field | Details |
|---|---|
| Test Case ID | TC-VER-008 |
| Scenario | Verify that different versions are represented by unique version identifiers |
| Requirement ID | REQ-VER-001, REQ-VER-004 |
| Test Type | Validation / Data Integrity |
| Priority | P2 |
| Preconditions | Multiple versions exist for the selected well |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Version Management for a well with multiple versions. | The version list is displayed. |
| 2 | Record the identifiers of all available versions. | Each displayed identifier can be captured. |
| 3 | Compare the identifiers with each other. | No two versions use the same identifier within the selected version set. |
| 4 | Select each version individually. | Each version can be uniquely selected. |
| 5 | Review the loaded data after each selection. | The selected version corresponds to the correct version-specific data. |
| 6 | Return to the complete version list. | All versions remain uniquely identifiable. |

---

## Test Case 9 — Verify Version Ordering

| Field | Details |
|---|---|
| Test Case ID | TC-VER-009 |
| Scenario | Verify that available versions are displayed in the configured order |
| Requirement ID | REQ-VER-001 |
| Test Type | Functional / UI Validation |
| Priority | P2 |
| Preconditions | The selected well contains multiple sequential versions |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Version Management for a well containing `V1`, `V2`, and `V3`. | The version list is displayed. |
| 2 | Review the displayed version sequence. | The versions appear in the configured application order. |
| 3 | Compare the displayed sequence with the expected synthetic dataset. | The displayed order matches the expected test data arrangement. |
| 4 | Select the first displayed version. | The correct first version is loaded. |
| 5 | Select the next version in the displayed sequence. | The next configured version is loaded. |
| 6 | Continue until the final version is selected. | All versions can be accessed in the displayed sequence without skipping an available version. |

---

## Test Case 10 — Verify Version Selection With Unsaved Changes

| Field | Details |
|---|---|
| Test Case ID | TC-VER-010 |
| Scenario | Verify that unsaved changes are handled correctly when switching from one version to another |
| Requirement ID | REQ-VER-003, REQ-DATA-005 |
| Test Type | Negative / Data Integrity |
| Priority | P1 |
| Preconditions | User has edit permission and at least two versions are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable version such as `V2`. | `V2` data is displayed in editable mode. |
| 2 | Modify a permitted field without saving the change. | The field reflects the temporary unsaved value. |
| 3 | Attempt to switch to version `V3`. | The application detects that unsaved changes exist. |
| 4 | Review the available action or warning. | The user receives an appropriate option to save, discard, or cancel the navigation according to the configured workflow. |
| 5 | Select the discard option when testing the discard path. | The unsaved change is discarded and version `V3` opens without the temporary value. |
| 6 | Return to `V2` and review the modified field. | The discarded value is not incorrectly persisted in `V2`. |

---

## Test Case 11 — Verify Version Update Persistence

| Field | Details |
|---|---|
| Test Case ID | TC-VER-011 |
| Scenario | Verify that an authorized version update is persisted correctly |
| Requirement ID | REQ-VER-003, REQ-DI-005 |
| Test Type | Positive / Persistence |
| Priority | P1 |
| Preconditions | User has permission to modify version-associated data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable version such as `V2`. | `V2` opens in editable mode. |
| 2 | Modify a permitted synthetic data field. | The updated value is displayed in the field. |
| 3 | Save the change. | The application confirms successful save or completes the save operation. |
| 4 | Navigate to another version. | The other version opens without errors. |
| 5 | Return to `V2`. | `V2` is loaded with its associated data. |
| 6 | Verify the modified field. | The updated value is persisted against `V2` and is not incorrectly applied to other versions. |

---

## Test Case 12 — Verify Version Selection for an Inactive Well

| Field | Details |
|---|---|
| Test Case ID | TC-VER-012 |
| Scenario | Verify that version information for an inactive well follows the configured access and editing rules |
| Requirement ID | REQ-VER-001, REQ-RBAC-005 |
| Test Type | Negative / Functional |
| Priority | P2 |
| Preconditions | `WELL-1006 – Horizon-C02` is configured as inactive |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Navigate to the inactive well `WELL-1006`. | The inactive well is displayed with its inactive status. |
| 2 | Open Version Management. | Version information is displayed according to the configured inactive-well access rules. |
| 3 | Select an available version. | The selected version loads if viewing is permitted. |
| 4 | Attempt to modify version-associated data. | Editing is prevented when the inactive-well configuration does not permit modifications. |
| 5 | Review the available controls. | Disabled or restricted controls clearly indicate the unavailable action. |
| 6 | Navigate away and return to Version Management. | The application maintains data integrity and does not create an unauthorized version update. |

---

## Test Case 13 — Verify Version Access for Restricted User

| Field | Details |
|---|---|
| Test Case ID | TC-VER-013 |
| Scenario | Verify that a user without version modification permission cannot perform restricted version actions |
| Requirement ID | REQ-RBAC-005, REQ-VER-004 |
| Test Type | Negative / RBAC |
| Priority | P1 |
| Preconditions | `USR-006 – restricted.demo` has limited permissions |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using the restricted synthetic user account. | The user is authenticated successfully with the assigned restricted role. |
| 2 | Navigate to a well accessible to the user. | The permitted well information is displayed. |
| 3 | Open Version Management. | Version information is displayed according to the user's permissions. |
| 4 | Attempt to perform a restricted version modification action. | The restricted action is unavailable or denied. |
| 5 | Review the application response. | The user receives an appropriate permission or access message when applicable. |
| 6 | Verify the selected version data after the denied action. | No unauthorized modification is applied to the version data. |

---

## Test Case 14 — Verify Version Data Isolation Between Different Wells

| Field | Details |
|---|---|
| Test Case ID | TC-VER-014 |
| Scenario | Verify that version data from one well is not displayed for another well |
| Requirement ID | REQ-VER-003, REQ-DI-001, REQ-DI-003 |
| Test Type | Data Integrity / Regression |
| Priority | P1 |
| Preconditions | `WELL-1001` and `WELL-1005` contain different synthetic version datasets |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Version Management for `WELL-1001`. | Version data associated with `WELL-1001` is displayed. |
| 2 | Record a unique version identifier and value from `WELL-1001`. | The reference information is captured. |
| 3 | Switch to `WELL-1005`. | `WELL-1005` becomes the active well. |
| 4 | Open Version Management for `WELL-1005`. | Only version data associated with `WELL-1005` is displayed. |
| 5 | Compare the displayed information with the recorded `WELL-1001` data. | `WELL-1001` version-specific information is not incorrectly displayed for `WELL-1005`. |
| 6 | Return to `WELL-1001`. | The original version information remains correctly associated with `WELL-1001`. |

---

## Test Case 15 — Verify Version Management Recovery After Data Loading Failure

| Field | Details |
|---|---|
| Test Case ID | TC-VER-015 |
| Scenario | Verify that Version Management handles a controlled data-loading failure and recovers correctly |
| Requirement ID | REQ-ERR-004, REQ-VER-001 |
| Test Type | Negative / Error Handling |
| Priority | P2 |
| Preconditions | Test environment supports controlled simulation of a version data-loading failure |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open Version Management for a valid test well. | Version Management loads successfully under normal conditions. |
| 2 | Simulate a controlled failure while retrieving version data. | The application detects the data-loading failure. |
| 3 | Review the Version Management response. | A meaningful loading or error message is displayed instead of misleading version data. |
| 4 | Restore the version data service or connection. | The application becomes capable of retrieving version information again. |
| 5 | Retry loading the Version Management section. | The version data loads successfully after recovery. |
| 6 | Compare the recovered data with the expected synthetic dataset. | The recovered version information is complete, correctly associated, and consistent with the expected data. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-VER-001 | Verify Version Management section access | Positive / Functional | P1 |
| TC-VER-002 | Verify existing version information display | Positive / Functional | P1 |
| TC-VER-003 | Verify version navigation | Positive / Functional | P1 |
| TC-VER-004 | Verify version selection | Positive / Functional | P1 |
| TC-VER-005 | Verify version data integrity | Data Integrity / Regression | P1 |
| TC-VER-006 | Verify version data persistence after refresh | Persistence / Regression | P1 |
| TC-VER-007 | Verify version context during module navigation | Integration / Regression | P1 |
| TC-VER-008 | Verify version identifier uniqueness | Validation / Data Integrity | P2 |
| TC-VER-009 | Verify version ordering | Functional / UI Validation | P2 |
| TC-VER-010 | Verify version selection with unsaved changes | Negative / Data Integrity | P1 |
| TC-VER-011 | Verify version update persistence | Positive / Persistence | P1 |
| TC-VER-012 | Verify version selection for an inactive well | Negative / Functional | P2 |
| TC-VER-013 | Verify version access for restricted user | Negative / RBAC | P1 |
| TC-VER-014 | Verify version data isolation between different wells | Data Integrity / Regression | P1 |
| TC-VER-015 | Verify Version Management recovery after data loading failure | Negative / Error Handling | P2 |
