# Well Management Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Well Management Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | Well Management |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, UI, Search, Filter, Navigation, Regression |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Verify Pad Listing

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-001 |
| Scenario | Verify that available pads are displayed correctly |
| Requirement ID | REQ-WELL-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User is logged in and has access to Well Management |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Navigate to the Well Management area. | The Well Management page opens successfully. |
| 3 | Review the available pad listing. | Available pads are displayed in the pad listing. |
| 4 | Locate synthetic pad `PAD-001 – Falcon North Pad`. | The specified pad is displayed with its configured information. |
| 5 | Review the status of the displayed pad. | `PAD-001` is shown with its configured Active status. |
| 6 | Review other available pads in the listing. | Other configured pads are displayed without duplication or missing records. |

---

## Test Case 2 — Verify Well Listing for a Selected Pad

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-002 |
| Scenario | Verify that wells associated with a selected pad are displayed |
| Requirement ID | REQ-WELL-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | `PAD-001` contains configured test wells |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The Well Management page is displayed successfully. |
| 2 | Select `PAD-001 – Falcon North Pad`. | The selected pad becomes the active context. |
| 3 | Wait for the associated well information to load. | Wells associated with the selected pad are retrieved successfully. |
| 4 | Review the displayed wells. | `WELL-1001` and `WELL-1002` are displayed under the selected pad. |
| 5 | Review the well names and identifiers. | Well names and identifiers match the configured synthetic test data. |
| 6 | Select another pad such as `PAD-002`. | The well listing updates to show wells associated with the newly selected pad. |

---

## Test Case 3 — Verify Well Search Using Exact Well Name

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-003 |
| Scenario | Verify that a well can be located using its exact well name |
| Requirement ID | REQ-WELL-003 |
| Test Type | Positive / Search |
| Priority | P1 |
| Preconditions | Well Management page is accessible and search functionality is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Navigate to the Well Management page. | The Well Management page loads successfully. |
| 2 | Locate the well search field. | The search field is available for user input. |
| 3 | Enter `Falcon-A01` in the search field. | The search value is accepted correctly. |
| 4 | Execute the search using the available search action. | The application processes the search request. |
| 5 | Review the filtered well results. | `Falcon-A01` / `WELL-1001` is displayed as the matching result. |
| 6 | Verify the result against the configured test data. | The displayed well information matches the synthetic record for `WELL-1001`. |

---

## Test Case 4 — Verify Well Search Using Partial Text

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-004 |
| Scenario | Verify that well search supports a valid partial search value |
| Requirement ID | REQ-WELL-003 |
| Test Type | Positive / Search |
| Priority | P2 |
| Preconditions | Multiple wells contain the search text |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The Well Management page is displayed. |
| 2 | Select the well search field. | The search field becomes ready for input. |
| 3 | Enter the partial search value `Falcon`. | The partial value is accepted by the search field. |
| 4 | Execute the search. | The system evaluates wells matching the entered text. |
| 5 | Review the search results. | Wells containing the matching `Falcon` text are displayed. |
| 6 | Verify unrelated well records. | Wells that do not match the search criteria are excluded from the filtered result set. |

---

## Test Case 5 — Verify Search with No Matching Well

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-005 |
| Scenario | Verify system behavior when a well search returns no matching records |
| Requirement ID | REQ-WELL-003, REQ-ERR-004 |
| Test Type | Negative / Search |
| Priority | P2 |
| Preconditions | Well Management page is accessible |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Navigate to the Well Management page. | The Well Management page loads successfully. |
| 2 | Enter a non-existing well value such as `Unknown-Well-999`. | The search value is accepted. |
| 3 | Execute the search. | The system processes the search without an application error. |
| 4 | Review the returned results. | No matching well record is displayed. |
| 5 | Review the empty result area. | A suitable no-results or empty-state message is displayed when supported. |
| 6 | Clear the search criteria. | The search filter is removed and the available well records are restored. |

---

## Test Case 6 — Verify Well Filtering by Status

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-006 |
| Scenario | Verify that wells can be filtered using their Active or Inactive status |
| Requirement ID | REQ-WELL-004, REQ-WELL-006 |
| Test Type | Functional / Filter |
| Priority | P1 |
| Preconditions | Test data contains both Active and Inactive wells |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The well listing is displayed successfully. |
| 2 | Locate the well status filter. | The available status filtering options are displayed. |
| 3 | Select the Active status option. | The Active status filter is applied. |
| 4 | Review the resulting well list. | Only wells configured as Active are displayed. |
| 5 | Change the filter to Inactive. | The Inactive status filter replaces the previous status filter. |
| 6 | Review the resulting list again. | Only wells configured as Inactive are displayed, such as `WELL-1006` where applicable. |

---

## Test Case 7 — Verify Well Filtering by Pad

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-007 |
| Scenario | Verify that the well listing can be filtered according to the selected pad |
| Requirement ID | REQ-WELL-001, REQ-WELL-002, REQ-WELL-004 |
| Test Type | Functional / Filter |
| Priority | P1 |
| Preconditions | Multiple pads with associated wells are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The pad and well information is available. |
| 2 | Select `PAD-001 – Falcon North Pad`. | `PAD-001` becomes the selected pad context. |
| 3 | Review the associated well records. | Wells belonging to `PAD-001` are displayed. |
| 4 | Verify that `WELL-1001` and `WELL-1002` are present. | Both configured wells for `PAD-001` are displayed. |
| 5 | Select `PAD-002 – Falcon Central Pad`. | The selected pad context changes to `PAD-002`. |
| 6 | Review the well listing after the change. | Wells associated with `PAD-002`, such as `WELL-1003` and `WELL-1004`, are displayed instead of the previous pad's wells. |

---

## Test Case 8 — Verify Well Selection

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-008 |
| Scenario | Verify that selecting a well opens the correct well context |
| Requirement ID | REQ-WELL-005 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | At least one active well is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Navigate to the Well Management page. | The well listing is displayed. |
| 2 | Select `PAD-001 – Falcon North Pad`. | The wells belonging to the selected pad are displayed. |
| 3 | Locate `WELL-1001 – Falcon-A01`. | The target well is displayed with its configured details. |
| 4 | Select the `Falcon-A01` well record. | The selected well becomes the active well context. |
| 5 | Wait for the well-specific page or details to load. | The application opens the information associated with `WELL-1001`. |
| 6 | Verify the well identifier and name. | The displayed well context matches `WELL-1001 – Falcon-A01`. |

---

## Test Case 9 — Verify Well Status Display

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-009 |
| Scenario | Verify that the configured status of each well is displayed correctly |
| Requirement ID | REQ-WELL-006 |
| Test Type | Functional / Data Validation |
| Priority | P1 |
| Preconditions | Well records with different statuses are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The well records are displayed successfully. |
| 2 | Locate `WELL-1001 – Falcon-A01`. | The well record is available in the listing. |
| 3 | Review the status displayed for `WELL-1001`. | The well is displayed as Active according to the test data. |
| 4 | Locate `WELL-1006 – Horizon-C02`. | The configured inactive well is available where inactive records are included in the current view. |
| 5 | Review the status displayed for `WELL-1006`. | The well is displayed as Inactive according to the test data. |
| 6 | Compare the displayed statuses with the source test data. | Well status values match the configured synthetic records. |

---

## Test Case 10 — Verify Navigation from Well Listing to Well Details

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-010 |
| Scenario | Verify that the selected well opens its corresponding detail area |
| Requirement ID | REQ-WELL-007 |
| Test Type | Functional / Navigation |
| Priority | P1 |
| Preconditions | User has permission to view well details |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The well listing is displayed successfully. |
| 2 | Select `PAD-002 – Falcon Central Pad`. | Wells associated with the selected pad are displayed. |
| 3 | Select `WELL-1004 – Falcon-B02`. | The selected well is highlighted or otherwise identified as the active selection. |
| 4 | Open the available well details action. | The system begins navigation to the selected well's detail area. |
| 5 | Wait for the destination page to load. | The well detail page opens successfully. |
| 6 | Verify the displayed well identifier. | The detail page shows `WELL-1004` and does not display information from another well. |

---

## Test Case 11 — Verify Switching Between Wells

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-011 |
| Scenario | Verify that users can switch between wells without displaying stale well information |
| Requirement ID | REQ-WELL-005, REQ-DI-003 |
| Test Type | Functional / Data Integrity |
| Priority | P1 |
| Preconditions | At least two wells are available under the selected pad |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Select `PAD-001 – Falcon North Pad`. | The wells belonging to the pad are displayed. |
| 2 | Select `WELL-1001 – Falcon-A01`. | `WELL-1001` becomes the active well context. |
| 3 | Record the displayed well identifier and basic information. | The information corresponds to `WELL-1001`. |
| 4 | Switch to `WELL-1002 – Falcon-A02`. | The application changes the active well context to `WELL-1002`. |
| 5 | Review the displayed well information after switching. | The displayed identifier and information correspond to `WELL-1002`. |
| 6 | Compare the information with the previous well. | Information from `WELL-1001` is not incorrectly retained in the `WELL-1002` context. |

---

## Test Case 12 — Verify Well Listing After Clearing Search and Filters

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-012 |
| Scenario | Verify that clearing search and filter criteria restores the appropriate well listing |
| Requirement ID | REQ-WELL-003, REQ-WELL-004 |
| Test Type | Functional / Regression |
| Priority | P2 |
| Preconditions | Multiple well records are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The default well listing is displayed. |
| 2 | Enter `Falcon` in the well search field. | The search value is accepted. |
| 3 | Apply the Active status filter. | The listing is restricted to matching Active wells. |
| 4 | Clear the search value. | The search criteria is removed from the search field. |
| 5 | Remove or reset the status filter. | The status filter returns to its default state. |
| 6 | Review the well listing. | The appropriate default set of well records is restored without stale filtering criteria. |

---

## Test Case 13 — Verify Well Listing with Inactive Pad

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-013 |
| Scenario | Verify the behavior of the well listing when an inactive pad is selected |
| Requirement ID | REQ-WELL-001, REQ-WELL-006 |
| Test Type | Negative / Edge Case |
| Priority | P2 |
| Preconditions | `PAD-004 – Horizon West Pad` is configured as Inactive |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The available pad information is displayed. |
| 2 | Locate `PAD-004 – Horizon West Pad`. | The inactive pad is displayed according to the configured visibility rules. |
| 3 | Review the status associated with `PAD-004`. | The pad is clearly identified as Inactive. |
| 4 | Select the inactive pad if the current user has permission to view it. | The system handles the inactive pad according to the configured business rules. |
| 5 | Review the associated well area. | The system displays the appropriate records or an appropriate unavailable/empty state based on the pad status. |
| 6 | Attempt an action that requires an active pad, if available. | The application prevents the action when the business rule does not permit operations on an inactive pad. |

---

## Test Case 14 — Verify Duplicate Well Records Are Not Displayed

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-014 |
| Scenario | Verify that the same well is not displayed multiple times in the listing |
| Requirement ID | REQ-WELL-002, REQ-DI-001 |
| Test Type | Data Integrity / Regression |
| Priority | P2 |
| Preconditions | Well Management contains configured well records |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Well Management page. | The well listing loads successfully. |
| 2 | Select a pad containing multiple wells. | The associated wells are displayed. |
| 3 | Review the well identifiers in the current listing. | Each well identifier is displayed as a distinct record. |
| 4 | Refresh the well listing. | The application reloads the current well data. |
| 5 | Review the identifiers again after refresh. | Refreshing the listing does not create duplicate well records. |
| 6 | Compare the number of displayed unique identifiers with the configured test data. | The displayed unique well count matches the applicable test data. |

---

## Test Case 15 — Verify Well Management Recovery After Data Loading Failure

| Field | Details |
|---|---|
| Test Case ID | TC-WELL-015 |
| Scenario | Verify Well Management behavior when well data temporarily fails to load |
| Requirement ID | REQ-ERR-004 |
| Test Type | Negative / Error Handling |
| Priority | P2 |
| Preconditions | Test environment supports controlled simulation of a well-data loading failure |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Navigate to Well Management. | The Well Management page opens successfully. |
| 3 | Simulate a controlled failure for the well-data request. | The well-data request fails without causing an unexpected application crash. |
| 4 | Reload or retry the Well Management data request. | The application detects the failed request and provides an appropriate error or retry state. |
| 5 | Restore the data service and perform the available retry action. | The application successfully requests the well data again. |
| 6 | Review the recovered well listing. | The applicable well records are displayed correctly after the data service is restored. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-WELL-001 | Verify pad listing | Positive / Functional | P1 |
| TC-WELL-002 | Verify well listing for a selected pad | Positive / Functional | P1 |
| TC-WELL-003 | Verify well search using exact well name | Positive / Search | P1 |
| TC-WELL-004 | Verify well search using partial text | Positive / Search | P2 |
| TC-WELL-005 | Verify search with no matching well | Negative / Search | P2 |
| TC-WELL-006 | Verify well filtering by status | Functional / Filter | P1 |
| TC-WELL-007 | Verify well filtering by pad | Functional / Filter | P1 |
| TC-WELL-008 | Verify well selection | Positive / Functional | P1 |
| TC-WELL-009 | Verify well status display | Functional / Data Validation | P1 |
| TC-WELL-010 | Verify navigation from well listing to well details | Functional / Navigation | P1 |
| TC-WELL-011 | Verify switching between wells | Functional / Data Integrity | P1 |
| TC-WELL-012 | Verify well listing after clearing search and filters | Functional / Regression | P2 |
| TC-WELL-013 | Verify well listing with inactive pad | Negative / Edge Case | P2 |
| TC-WELL-014 | Verify duplicate well records are not displayed | Data Integrity / Regression | P2 |
| TC-WELL-015 | Verify Well Management recovery after data loading failure | Negative / Error Handling | P2 |
