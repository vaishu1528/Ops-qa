# Bug Report

## Document Information

| Field | Details |
|---|---|
| Document Name | Bug Report |
| Application Type | Oil & Gas Well Operations Management System |
| Testing Type | Manual Testing, Functional Testing, Regression Testing |
| Environment | QA |
| Test Data | Synthetic / Sanitized |
| Defect Tracking | Azure DevOps / Jira |
| Document Status | Sample Portfolio Artifact |

---

## 1. Purpose

This document demonstrates the defect identification, documentation, classification, tracking, retesting, and closure process used during software testing.

All defect examples in this document use synthetic data and generic application terminology.

---

## 2. Defect Severity Definitions

| Severity | Definition | Example |
|---|---|---|
| Critical | Blocks a major business workflow or causes significant data/security impact | Application unavailable or critical data corruption |
| High | Major functionality is broken with significant business impact | Unable to save well configuration |
| Medium | Functionality is partially affected but a workaround exists | Incorrect validation message |
| Low | Minor functional or UI issue with limited impact | Alignment or formatting issue |

---

## 3. Defect Priority Definitions

| Priority | Definition |
|---|---|
| P1 - Critical | Requires immediate attention |
| P2 - High | Should be addressed before the relevant release |
| P3 - Medium | Should be addressed as part of planned development |
| P4 - Low | Can be addressed based on available development capacity |

---

# 4. Sample Defect Reports

## BUG-001 — Well Search Does Not Return Exact Matching Record

| Field | Details |
|---|---|
| Defect ID | BUG-001 |
| Title | Well Search Does Not Return Exact Matching Record |
| Module | Well Management |
| Requirement ID | REQ-WELL-003 |
| Test Case ID | TC-WELL-004 |
| Environment | QA |
| Severity | High |
| Priority | P2 - High |
| Defect Type | Functional |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- User has successfully logged in.
- A valid pad contains multiple wells.
- Synthetic well `WELL-1001` exists in the test environment.

### Test Data

| Field | Value |
|---|---|
| Pad | PAD-001 |
| Well ID | WELL-1001 |
| Well Name | Falcon-A01 |

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Log in using a valid authorized account. |
| 2 | Navigate to Well Management. |
| 3 | Open `PAD-001 – Falcon North Pad`. |
| 4 | Enter `Falcon-A01` in the well search field. |
| 5 | Execute the search. |

### Expected Result

The exact matching well `Falcon-A01` should be displayed in the search results.

### Actual Result

The exact matching well was not displayed even though the record existed in the selected pad.

### Impact

Users may spend additional time locating a required well and may incorrectly assume that the well record is unavailable.

### Root Cause

Search filtering logic did not correctly handle the exact-match condition for the configured well identifier/name combination.

### Resolution

Search matching logic was updated to correctly process exact well-name and identifier values.

### Retest Result

The same search was executed after the fix and the expected well record was displayed successfully.

### Regression Result

Related well search and filtering scenarios were executed successfully.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-002 — Well Status Not Refreshed After Status Update

| Field | Details |
|---|---|
| Defect ID | BUG-002 |
| Title | Well Status Not Refreshed After Status Update |
| Module | Well Management |
| Requirement ID | REQ-WELL-006 |
| Test Case ID | TC-WELL-009 |
| Environment | QA |
| Severity | High |
| Priority | P2 - High |
| Defect Type | Functional / UI |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- Valid authorized user is logged in.
- Test well `WELL-1007` is available.
- User has permission to update the well status.

### Test Data

| Field | Value |
|---|---|
| Well ID | WELL-1007 |
| Well Name | Summit-D01 |
| Initial Status | Active |
| Updated Status | Inactive |

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Open the Well Management section. |
| 2 | Select `WELL-1007`. |
| 3 | Change the well status from Active to Inactive. |
| 4 | Save the status change. |
| 5 | Navigate back to the well list. |

### Expected Result

The well should display the updated Inactive status immediately after the successful save.

### Actual Result

The previous Active status remained visible until the page was manually refreshed.

### Impact

Users may see outdated well status information and make decisions based on stale data.

### Root Cause

The well list was not refreshed after the successful status update operation.

### Resolution

The well list refresh behavior was updated to retrieve the latest status after a successful update.

### Retest Result

After changing the status, the well list displayed the updated status without requiring a manual browser refresh.

### Regression Result

Well listing, filtering, and status scenarios passed after the fix.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-003 — General Information Changes Not Persisted

| Field | Details |
|---|---|
| Defect ID | BUG-003 |
| Title | General Information Changes Are Lost After Navigation |
| Module | Well Information |
| Requirement ID | REQ-WINFO-003 |
| Test Case ID | TC-WINFO-005 |
| Environment | QA |
| Severity | High |
| Priority | P2 - High |
| Defect Type | Data Persistence |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- User has edit permission.
- `WELL-1001` is available.
- Well Information section is accessible.

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Open `WELL-1001`. |
| 2 | Navigate to Well Information. |
| 3 | Update a permitted general information field with valid synthetic data. |
| 4 | Save the updated information. |
| 5 | Navigate to another module and return to Well Information. |

### Expected Result

The updated general information should remain available after navigation.

### Actual Result

The previous value was displayed after returning to the module.

### Impact

Users may lose valid business data and assume that their update was saved successfully.

### Root Cause

The updated field value was not correctly persisted in the backend data operation.

### Resolution

The save operation was corrected to persist the updated field value against the selected well.

### Retest Result

The field was updated and saved successfully. The new value remained available after navigation.

### Regression Result

General information display, required-field validation, and persistence scenarios passed.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-004 — Invalid Wellbore Sequence Accepted

| Field | Details |
|---|---|
| Defect ID | BUG-004 |
| Title | Invalid Wellbore Sequence Accepted During Save |
| Module | Wellbore Configuration |
| Requirement ID | REQ-WB-005 |
| Test Case ID | TC-WB-008 |
| Environment | QA |
| Severity | High |
| Priority | P2 - High |
| Defect Type | Validation |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- User has edit permission.
- Wellbore Configuration is accessible.
- Multiple wellbore entries can be configured.

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Open Wellbore Configuration for a valid test well. |
| 2 | Add multiple wellbore entries. |
| 3 | Configure an invalid sequence where a later section precedes the required sequence. |
| 4 | Save the configuration. |
| 5 | Reopen the Wellbore Configuration section. |

### Expected Result

The application should identify the invalid sequence and prevent the invalid configuration from being saved.

### Actual Result

The invalid sequence was accepted and saved successfully.

### Impact

Incorrect wellbore configuration may result in invalid downstream engineering data.

### Root Cause

Sequence validation was not triggered before the save operation.

### Resolution

Validation was added to verify the configured sequence before allowing the data to be saved.

### Retest Result

Invalid sequences were rejected with appropriate validation feedback.

### Regression Result

Valid sequence configuration and wellbore persistence scenarios passed.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-005 — Engineering Result Not Updated After Input Change

| Field | Details |
|---|---|
| Defect ID | BUG-005 |
| Title | Engineering Result Displays Previous Calculation After Input Update |
| Module | Engineering Parameters |
| Requirement ID | REQ-ENG-004, REQ-ENG-005 |
| Test Case ID | TC-ENG-006 |
| Environment | QA |
| Severity | High |
| Priority | P1 - Critical |
| Defect Type | Calculation / Functional |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- Valid engineering input data is available.
- User has permission to modify engineering parameters.

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Open Engineering Parameters for a valid test well. |
| 2 | Enter a valid set of engineering parameters. |
| 3 | Execute the calculation and record the result. |
| 4 | Modify one calculation input using another valid value. |
| 5 | Execute the calculation again. |

### Expected Result

The engineering result should be recalculated using the updated input values.

### Actual Result

The previous result remained displayed after the second calculation.

### Impact

Users may interpret outdated engineering results as current results.

### Root Cause

The calculation response was not correctly refreshing the result state after subsequent input changes.

### Resolution

Calculation result state management was corrected to replace the previous result after successful recalculation.

### Retest Result

The result changed correctly after modifying the input and executing the calculation again.

### Regression Result

Related engineering input, validation, processing, and result display scenarios passed.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-006 — Treatment Total Does Not Reflect Updated Stage Value

| Field | Details |
|---|---|
| Defect ID | BUG-006 |
| Title | Treatment Total Does Not Recalculate After Stage Value Update |
| Module | Treatment |
| Requirement ID | REQ-TREAT-004 |
| Test Case ID | TC-TREAT-006 |
| Environment | QA |
| Severity | High |
| Priority | P2 - High |
| Defect Type | Calculation |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- Valid treatment schedule exists.
- User has permission to update treatment data.

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Open Treatment Schedule for a valid well. |
| 2 | Navigate to the Design or applicable editable treatment section. |
| 3 | Record the existing treatment total. |
| 4 | Modify a valid stage quantity or duration value. |
| 5 | Save or recalculate the treatment schedule. |

### Expected Result

The treatment total should be recalculated using the updated stage value.

### Actual Result

The treatment total continued to display the previous value.

### Impact

Incorrect treatment totals may affect review and downstream operational analysis.

### Root Cause

The total calculation was not triggered after modification of the stage-level value.

### Resolution

The calculation trigger was updated to recalculate treatment totals after valid stage data changes.

### Retest Result

Treatment totals were recalculated correctly after changing stage values.

### Regression Result

Treatment design, actual data, validation, and persistence scenarios passed.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-007 — MiniFrac Clean Volume Not Recalculated

| Field | Details |
|---|---|
| Defect ID | BUG-007 |
| Title | Clean Volume Displays Previous Result After Input Modification |
| Module | MiniFrac / DFIT |
| Requirement ID | REQ-MF-004 |
| Test Case ID | TC-MF-007 |
| Environment | QA |
| Severity | High |
| Priority | P1 - Critical |
| Defect Type | Calculation |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- Valid MiniFrac / DFIT dataset is available.
- Initial Clean Volume has already been calculated.

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Open MiniFrac / DFIT for a valid test well. |
| 2 | Execute the analysis using the initial synthetic dataset. |
| 3 | Record the calculated Clean Volume. |
| 4 | Modify a valid rate or time input used by the calculation. |
| 5 | Execute the analysis again. |

### Expected Result

Clean Volume should be recalculated based on the updated input data.

### Actual Result

The previously calculated Clean Volume remained displayed.

### Impact

Incorrect Clean Volume values may affect engineering analysis and interpretation.

### Root Cause

The calculation result was not refreshed after modification of a dependent input value.

### Resolution

The calculation workflow was updated to invalidate the previous result and calculate Clean Volume using the latest dataset.

### Retest Result

Clean Volume changed according to the updated input data and matched the expected calculation.

### Regression Result

Clean Volume, Clean Rate, and analysis plot scenarios passed.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-008 — Version Data Incorrectly Displayed After Well Switch

| Field | Details |
|---|---|
| Defect ID | BUG-008 |
| Title | Version Data From Previous Well Displayed After Switching Wells |
| Module | Version Management |
| Requirement ID | REQ-VER-003, REQ-DI-001 |
| Test Case ID | TC-VER-014 |
| Environment | QA |
| Severity | Critical |
| Priority | P1 - Critical |
| Defect Type | Data Integrity |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- Two wells contain different synthetic version datasets.
- User can access both wells.

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Open Version Management for `WELL-1001`. |
| 2 | Record a unique version value from the selected well. |
| 3 | Switch to `WELL-1005`. |
| 4 | Open Version Management for the newly selected well. |
| 5 | Compare the displayed version information with the data recorded for `WELL-1001`. |

### Expected Result

Only version information associated with `WELL-1005` should be displayed.

### Actual Result

A version value belonging to `WELL-1001` was temporarily displayed for `WELL-1005`.

### Impact

Cross-record data display can cause incorrect engineering interpretation and represents a serious data integrity risk.

### Root Cause

The version data state was not cleared correctly when the active well context changed.

### Resolution

Version data loading was updated to reset the previous well context before retrieving the newly selected well's version information.

### Retest Result

Switching between wells displayed only the version information belonging to the active well.

### Regression Result

Version navigation, selection, persistence, and well-switching scenarios passed.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-009 — Restricted User Can Access Unauthorized Modification Control

| Field | Details |
|---|---|
| Defect ID | BUG-009 |
| Title | Restricted User Can Access Unauthorized Version Modification Control |
| Module | Version Management / Access Control |
| Requirement ID | REQ-RBAC-005 |
| Test Case ID | TC-VER-013 |
| Environment | QA |
| Severity | Critical |
| Priority | P1 - Critical |
| Defect Type | Security / RBAC |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- Restricted synthetic user `USR-006` is active.
- The user does not have version modification permission.

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Log in using `USR-006 – restricted.demo`. |
| 2 | Navigate to an accessible well. |
| 3 | Open Version Management. |
| 4 | Review the available version actions. |
| 5 | Attempt to access the version modification action. |

### Expected Result

The restricted user should not be able to perform the unauthorized modification action.

### Actual Result

The modification control was visible and could be accessed by the restricted user.

### Impact

Unauthorized users may gain access to restricted data modification functionality.

### Root Cause

The permission check was not consistently applied to the version modification control.

### Resolution

Role-based permission checks were enforced for the version modification action at both UI and service levels.

### Retest Result

The restricted user could view permitted information but could not perform the unauthorized modification.

### Regression Result

Role-based access scenarios for authorized and restricted users passed.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# BUG-010 — Validation Message Not Displayed for Missing Required Field

| Field | Details |
|---|---|
| Defect ID | BUG-010 |
| Title | Required Field Validation Message Not Displayed |
| Module | Well Information |
| Requirement ID | REQ-WINFO-004, REQ-DATA-001 |
| Test Case ID | TC-WINFO-007 |
| Environment | QA |
| Severity | Medium |
| Priority | P2 - High |
| Defect Type | Validation / UI |
| Status | Closed |
| Reported By | QA Engineer |
| Assigned To | Development Team |

### Preconditions

- User has access to Well Information.
- At least one field is configured as mandatory.

### Steps to Reproduce

| Step | Action |
|---:|---|
| 1 | Open Well Information for a valid test well. |
| 2 | Identify a mandatory field. |
| 3 | Remove the existing value from the mandatory field. |
| 4 | Click Save. |
| 5 | Review the field and validation area. |

### Expected Result

The application should prevent the save operation and display a clear validation message identifying the missing required value.

### Actual Result

The save operation was blocked, but no clear validation message was displayed near the affected field.

### Impact

Users may not understand why the save operation failed.

### Root Cause

Validation state was generated internally but was not correctly mapped to the UI message component.

### Resolution

The validation response was mapped to the corresponding field-level error message.

### Retest Result

The required-field message was displayed correctly after attempting to save incomplete data.

### Regression Result

Other mandatory field validation scenarios passed.

### Defect Closure

| Field | Result |
|---|---|
| Retest | Passed |
| Regression | Passed |
| Final Status | Closed |

---

# 5. Defect Lifecycle

The standard defect lifecycle used for this portfolio is:

New
→ Triaged
→ Assigned
→ In Development
→ Fixed
→ Ready for Retest
→ Retest
→ Reopened / Closed

### Defect Status Definitions

| Status | Description |
|---|---|
| New | Defect has been identified and logged |
| Triaged | Defect has been reviewed and classified |
| Assigned | Defect has been assigned to the responsible team |
| In Development | Defect is being investigated or fixed |
| Fixed | Development has completed the fix |
| Ready for Retest | Fix is available for QA validation |
| Retest | QA is validating the implemented fix |
| Reopened | Defect still exists after retest |
| Closed | Fix has passed retesting and required regression validation |

---

# 6. Defect Report Checklist

Before submitting a defect, verify that the report contains:

- Unique defect ID.
- Clear and concise title.
- Correct module.
- Requirement or user story reference.
- Test case reference.
- Environment details.
- Severity.
- Priority.
- Preconditions.
- Reproducible steps.
- Expected result.
- Actual result.
- Test data.
- Evidence reference when applicable.
- Business or functional impact.
- Developer assignment.
- Retest result.
- Regression result.
- Final defect status.

---

# 7. Defect Quality Guidelines

A high-quality defect should:

1. Describe one defect per ticket.
2. Use a clear and reproducible title.
3. Provide exact reproduction steps.
4. Clearly separate expected and actual behavior.
5. Include relevant test data without exposing confidential information.
6. Reference the requirement and test case where applicable.
7. Assign severity based on functional impact.
8. Assign priority based on release or business urgency.
9. Include evidence when it helps reproduce or understand the issue.
10. Update the defect after retesting.
11. Record regression results before closure.
12. Reopen the defect when the issue is still reproducible.

---

# 8. Defect Summary

| Defect ID | Module | Severity | Priority | Type | Status |
|---|---|---|---|---|---|
| BUG-001 | Well Management | High | P2 | Functional | Closed |
| BUG-002 | Well Management | High | P2 | Functional / UI | Closed |
| BUG-003 | Well Information | High | P2 | Data Persistence | Closed |
| BUG-004 | Wellbore Configuration | High | P2 | Validation | Closed |
| BUG-005 | Engineering Parameters | High | P1 | Calculation | Closed |
| BUG-006 | Treatment | High | P2 | Calculation | Closed |
| BUG-007 | MiniFrac / DFIT | High | P1 | Calculation | Closed |
| BUG-008 | Version Management | Critical | P1 | Data Integrity | Closed |
| BUG-009 | Version Management / Access Control | Critical | P1 | Security / RBAC | Closed |
| BUG-010 | Well Information | Medium | P2 | Validation / UI | Closed |

---

# 9. Defect Metrics Example

| Metric | Value |
|---|---:|
| Total Defects Logged | 10 |
| Critical Defects | 2 |
| High Severity Defects | 7 |
| Medium Severity Defects | 1 |
| Low Severity Defects | 0 |
| Closed Defects | 10 |
| Open Defects | 0 |
| Reopened Defects | 0 |
| Retest Passed | 10 |
| Regression Passed | 10 |

---

# 10. Defect Closure Criteria

A defect can be considered closed when:

- The reported issue is no longer reproducible.
- The implemented fix behaves according to the expected result.
- Required retesting has passed.
- Relevant regression scenarios have passed.
- No new critical or high-impact issue is introduced by the fix.
- Supporting evidence has been reviewed where applicable.
- The defect status is updated to Closed in the defect tracking system.

---

## 11. Portfolio Disclaimer

The defect IDs, users, well identifiers, module names, test data, values, and defect scenarios in this document are synthetic examples created for demonstration purposes.

No confidential customer, company, production, or proprietary project information is included.
