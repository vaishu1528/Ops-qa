# Dashboard Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Dashboard Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | Dashboard |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, UI, Navigation, Regression |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Verify Dashboard Access After Successful Login

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-001 |
| Scenario | Verify that an authenticated user can access the Dashboard |
| Requirement ID | REQ-DASH-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User has a valid active account |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page. | The login page is displayed successfully. |
| 2 | Enter valid credentials for `admin.demo`. | The username and password are accepted in their respective fields. |
| 3 | Select the Login button. | The system validates the credentials successfully. |
| 4 | Wait for the application to complete navigation after authentication. | The authenticated application area is displayed. |
| 5 | Locate the Dashboard option or landing area. | The Dashboard is available to the authenticated user. |
| 6 | Open the Dashboard. | The Dashboard loads successfully without an access-denied or application error. |

---

## Test Case 2 — Verify Dashboard Information Display

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-002 |
| Scenario | Verify that the Dashboard displays the expected summary information |
| Requirement ID | REQ-DASH-002 |
| Test Type | Functional / UI |
| Priority | P1 |
| Preconditions | User is successfully logged in |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using an active test account. | The user is authenticated successfully. |
| 2 | Navigate to the Dashboard. | The Dashboard page loads successfully. |
| 3 | Review the visible summary sections, counts, cards, or widgets. | Available Dashboard information is displayed without missing or broken sections. |
| 4 | Compare the displayed well or operational information with the configured synthetic test data. | The displayed information corresponds to the available test data. |
| 5 | Check the labels, values, and status indicators displayed on the Dashboard. | Labels and values are readable and status information is presented consistently. |
| 6 | Refresh the Dashboard. | The Dashboard reloads successfully and continues to display the applicable information. |

---

## Test Case 3 — Verify Dashboard Navigation

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-003 |
| Scenario | Verify that users can navigate from the Dashboard to authorized application modules |
| Requirement ID | REQ-DASH-003 |
| Test Type | Functional / Navigation |
| Priority | P1 |
| Preconditions | User is logged in and has access to multiple modules |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid active user account. | The user successfully enters the application. |
| 2 | Open the Dashboard. | The Dashboard is displayed correctly. |
| 3 | Select an available authorized module from the Dashboard navigation area. | The selected module begins loading. |
| 4 | Wait for the module page to load. | The selected module opens successfully without an authorization error. |
| 5 | Navigate back to the Dashboard. | The Dashboard becomes available again without requiring a new login. |
| 6 | Select another authorized module. | The second authorized module opens successfully and the active session is maintained. |

---

## Test Case 4 — Verify Dashboard Module Visibility Based on User Role

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-004 |
| Scenario | Verify that Dashboard modules are displayed according to the logged-in user's role |
| Requirement ID | REQ-DASH-004 |
| Test Type | Functional / RBAC |
| Priority | P1 |
| Preconditions | Active accounts are available for Admin, Data Engineer, Field Engineer, and Analyst roles |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using the Admin test account. | The Admin user is authenticated successfully. |
| 2 | Open the Dashboard and record the modules or actions visible to the Admin. | The Dashboard displays functionality permitted for the Admin role. |
| 3 | Log out and log in using the Data Engineer test account. | The Data Engineer account is authenticated successfully. |
| 4 | Open the Dashboard and review the available modules. | The Dashboard displays functionality according to Data Engineer permissions. |
| 5 | Repeat the same verification using the Field Engineer and Analyst accounts. | Each role receives its configured Dashboard access. |
| 6 | Compare the visible functionality across the different roles. | Role-restricted modules are not exposed to users who do not have permission to access them. |

---

## Test Case 5 — Verify Dashboard with No Available Operational Records

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-005 |
| Scenario | Verify Dashboard behavior when no applicable operational records are available |
| Requirement ID | REQ-DASH-002 |
| Test Type | Negative / Edge Case |
| Priority | P2 |
| Preconditions | A test account is configured with no applicable operational records |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using the test account configured without operational records. | The user is authenticated successfully. |
| 2 | Navigate to the Dashboard. | The Dashboard loads successfully even when no records are available. |
| 3 | Review sections that normally display operational counts or records. | Empty sections display an appropriate empty-state message, zero value, or equivalent representation. |
| 4 | Review the Dashboard for broken cards, blank containers, or application errors. | No broken UI component or unexpected application error is displayed. |
| 5 | Attempt to open an available Dashboard navigation option. | Available navigation remains functional despite the absence of operational records. |
| 6 | Refresh the Dashboard. | The same valid empty-state behavior is maintained after refresh. |

---

## Test Case 6 — Verify Dashboard Data Refresh

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-006 |
| Scenario | Verify that Dashboard information reflects updated underlying data after refresh |
| Requirement ID | REQ-DASH-002, REQ-DATA-005 |
| Test Type | Functional / Data Validation |
| Priority | P1 |
| Preconditions | User is logged in and test data can be updated |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using an authorized test account and open the Dashboard. | The Dashboard loads with the current available data. |
| 2 | Record a relevant Dashboard value associated with the test data. | The initial Dashboard value is captured for comparison. |
| 3 | Update the corresponding synthetic record through an authorized application workflow. | The record is saved successfully with the updated value. |
| 4 | Return to the Dashboard. | The Dashboard is accessible without requiring a new authentication session. |
| 5 | Refresh the Dashboard data or reload the page. | The Dashboard retrieves the latest available data. |
| 6 | Compare the updated Dashboard value with the saved record. | The Dashboard reflects the updated value accurately. |

---

## Test Case 7 — Verify Dashboard UI Layout

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-007 |
| Scenario | Verify that Dashboard UI components are displayed in a consistent and usable layout |
| Requirement ID | REQ-DASH-002, REQ-NFR-003 |
| Test Type | UI / Usability |
| Priority | P2 |
| Preconditions | User is logged in |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the Dashboard using a supported desktop browser. | The Dashboard loads within the application viewport. |
| 2 | Review the page header, navigation area, cards, widgets, and data sections. | All visible components are aligned and displayed without overlapping elements. |
| 3 | Review the text labels and displayed values. | Text is readable and does not appear clipped or unexpectedly truncated. |
| 4 | Review buttons, links, filters, and other interactive controls. | Interactive controls are visually distinguishable and usable. |
| 5 | Scroll through the complete Dashboard page. | All available Dashboard content can be accessed without abnormal layout behavior. |
| 6 | Resize the browser window within the supported desktop range. | Dashboard components maintain an acceptable layout without major visual breakage. |

---

## Test Case 8 — Verify Dashboard Navigation State

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-008 |
| Scenario | Verify that the Dashboard navigation state is maintained when moving between authorized pages |
| Requirement ID | REQ-NAV-001, REQ-NAV-004 |
| Test Type | Functional / Navigation |
| Priority | P2 |
| Preconditions | User is authenticated and has access to multiple modules |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid active account. | Authentication completes successfully. |
| 2 | Open the Dashboard. | The Dashboard is displayed as the current application area. |
| 3 | Navigate to an authorized module from the Dashboard. | The selected module opens successfully. |
| 4 | Navigate back to the Dashboard using the available navigation control. | The Dashboard is restored successfully. |
| 5 | Review the Dashboard navigation indicator or active navigation state. | The Dashboard is identified as the currently selected area where such an indicator is supported. |
| 6 | Navigate to another authorized module and return to the Dashboard again. | Navigation continues to work consistently and the authenticated session remains active. |

---

## Test Case 9 — Verify Unauthorized Dashboard Module Access

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-009 |
| Scenario | Verify that a user cannot access a Dashboard module that is not permitted for the assigned role |
| Requirement ID | REQ-DASH-004, REQ-RBAC-005 |
| Test Type | Negative / Security |
| Priority | P1 |
| Preconditions | Restricted test account is active and an unauthorized module is defined for that role |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using the restricted test account `restricted.demo`. | The restricted user is authenticated successfully. |
| 2 | Open the Dashboard. | The Dashboard loads with role-specific functionality. |
| 3 | Review the available Dashboard modules and actions. | Unauthorized functionality is not normally presented as an available option. |
| 4 | Attempt to access a restricted module using a permitted navigation path or direct application route configured for testing. | The application validates the user's permissions before granting access. |
| 5 | Observe the response from the application. | Access to the restricted module is denied or the user is redirected to an authorized area. |
| 6 | Verify that restricted data is not displayed. | The restricted user's session does not expose unauthorized module data. |

---

## Test Case 10 — Verify Dashboard Session After Browser Refresh

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-010 |
| Scenario | Verify that an authenticated user can refresh the Dashboard without unexpected logout |
| Requirement ID | REQ-DASH-001, REQ-AUTH-003 |
| Test Type | Functional / Regression |
| Priority | P1 |
| Preconditions | User is successfully logged in and Dashboard is open |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid active user account. | The user is authenticated successfully. |
| 2 | Navigate to the Dashboard. | The Dashboard loads successfully. |
| 3 | Confirm that the Dashboard displays the expected information. | Dashboard content is visible and usable before refresh. |
| 4 | Refresh the browser page. | The browser reloads the Dashboard without an unexpected application error. |
| 5 | Wait until Dashboard loading is complete. | Dashboard content is restored successfully after the refresh. |
| 6 | Verify the authenticated state. | The user remains authenticated and is not unexpectedly redirected to the login page. |

---

## Test Case 11 — Verify Dashboard Access After Session Expiry

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-011 |
| Scenario | Verify that an expired authentication session does not allow continued Dashboard access |
| Requirement ID | REQ-AUTH-003, REQ-ERR-003 |
| Test Type | Negative / Security |
| Priority | P1 |
| Preconditions | User is logged in and the test environment supports controlled session expiry |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid active test account. | The user enters the authenticated application area. |
| 2 | Navigate to the Dashboard. | The Dashboard is displayed successfully. |
| 3 | Allow the configured authentication session to expire or use the approved test mechanism to expire it. | The authentication session becomes invalid. |
| 4 | Attempt to perform an authenticated Dashboard action. | The application detects that the session is no longer valid. |
| 5 | Observe the application response. | The user is redirected to the login page or shown an appropriate session-expiry message. |
| 6 | Attempt to access protected Dashboard information again. | Protected Dashboard information is not accessible until the user authenticates again. |

---

## Test Case 12 — Verify Dashboard Error Handling During Data Loading Failure

| Field | Details |
|---|---|
| Test Case ID | TC-DASH-012 |
| Scenario | Verify Dashboard behavior when required Dashboard data cannot be loaded |
| Requirement ID | REQ-ERR-004 |
| Test Type | Negative / Error Handling |
| Priority | P2 |
| Preconditions | Test environment allows controlled simulation of a Dashboard data-loading failure |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid active account. | The user is authenticated successfully. |
| 2 | Open the Dashboard while the required data service is available. | The Dashboard initially loads normally. |
| 3 | Simulate or configure a controlled failure for the Dashboard data request. | The Dashboard data request fails without affecting the entire application session unexpectedly. |
| 4 | Reload the Dashboard or trigger the affected data section to load. | The application detects the data-loading failure. |
| 5 | Review the affected Dashboard section. | A meaningful error, retry option, or appropriate fallback state is displayed instead of misleading data. |
| 6 | Restore the data service and retry the Dashboard operation. | The Dashboard successfully retrieves and displays the available data after recovery. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-DASH-001 | Verify Dashboard access after successful login | Positive / Functional | P1 |
| TC-DASH-002 | Verify Dashboard information display | Functional / UI | P1 |
| TC-DASH-003 | Verify Dashboard navigation | Functional / Navigation | P1 |
| TC-DASH-004 | Verify Dashboard module visibility based on user role | Functional / RBAC | P1 |
| TC-DASH-005 | Verify Dashboard with no available operational records | Negative / Edge Case | P2 |
| TC-DASH-006 | Verify Dashboard data refresh | Functional / Data Validation | P1 |
| TC-DASH-007 | Verify Dashboard UI layout | UI / Usability | P2 |
| TC-DASH-008 | Verify Dashboard navigation state | Functional / Navigation | P2 |
| TC-DASH-009 | Verify unauthorized Dashboard module access | Negative / Security | P1 |
| TC-DASH-010 | Verify Dashboard session after browser refresh | Functional / Regression | P1 |
| TC-DASH-011 | Verify Dashboard access after session expiry | Negative / Security | P1 |
| TC-DASH-012 | Verify Dashboard error handling during data loading failure | Negative / Error Handling | P2 |
