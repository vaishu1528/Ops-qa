# Login Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | Login Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | Login |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, UI, Security, Regression |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Login with Valid Admin Credentials

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-001 |
| Scenario | Verify that an active Admin user can log in with valid credentials |
| Requirement ID | REQ-AUTH-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | Admin test account is active and valid credentials are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page using the configured QA environment URL. | The login page loads successfully without errors. |
| 2 | Enter the valid Admin username `admin.demo` in the username field. | The username is accepted and displayed in the username field. |
| 3 | Enter the valid password configured for the Admin test account. | The password is accepted and masked in the password field. |
| 4 | Select the Login button. | The system validates the submitted credentials and starts the authentication process. |
| 5 | Wait for authentication to complete. | The Admin user is successfully authenticated and redirected to the authorized application area. |
| 6 | Verify the displayed user role or available Admin-specific options. | Admin-specific permissions and accessible functionality are displayed according to the configured role. |

---

## Test Case 2 — Login with Valid Data Engineer Credentials

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-002 |
| Scenario | Verify that an active Data Engineer can log in with valid credentials |
| Requirement ID | REQ-AUTH-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | Data Engineer test account is active and valid credentials are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page. | The login page is displayed successfully. |
| 2 | Enter `data.engineer.demo` in the username field. | The Data Engineer username is displayed correctly. |
| 3 | Enter the valid password configured for the account. | The password is accepted and remains masked. |
| 4 | Select the Login button. | The submitted credentials are sent for authentication. |
| 5 | Wait for the login process to complete. | The Data Engineer is authenticated and redirected to the application. |
| 6 | Review the available modules or actions after login. | Only functionality permitted for the Data Engineer role is available. |

---

## Test Case 3 — Login with Valid Field Engineer Credentials

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-003 |
| Scenario | Verify that an active Field Engineer can log in with valid credentials |
| Requirement ID | REQ-AUTH-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | Field Engineer test account is active and valid credentials are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Navigate to the application login page. | The login screen is available and ready for authentication. |
| 2 | Enter `field.engineer.demo` in the username field. | The entered username is retained correctly. |
| 3 | Enter the valid password for the Field Engineer account. | The password is entered successfully and is not displayed as plain text. |
| 4 | Select the Login button. | The system submits the credentials for authentication. |
| 5 | Allow the authentication process to finish. | The Field Engineer account is successfully authenticated. |
| 6 | Check the accessible application functionality. | The application displays functionality permitted for the Field Engineer role. |

---

## Test Case 4 — Login with Valid Analyst Credentials

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-004 |
| Scenario | Verify that an active Analyst can log in with valid credentials |
| Requirement ID | REQ-AUTH-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | Analyst test account is active and valid credentials are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page. | The login page is displayed without validation or loading errors. |
| 2 | Enter `analyst.demo` as the username. | The Analyst username appears correctly in the input field. |
| 3 | Enter the valid password configured for the Analyst account. | The password is accepted and visually masked. |
| 4 | Select the Login button. | The application begins credential validation. |
| 5 | Wait until authentication is completed. | The Analyst is successfully logged into the application. |
| 6 | Verify the modules and actions available after login. | The displayed functionality matches the permissions configured for the Analyst role. |

---

## Test Case 5 — Login with Invalid Password

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-005 |
| Scenario | Verify that login is rejected when a valid username is used with an incorrect password |
| Requirement ID | REQ-AUTH-002 |
| Test Type | Negative / Functional |
| Priority | P1 |
| Preconditions | Active user `admin.demo` exists |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page. | The login page is displayed successfully. |
| 2 | Enter the valid username `admin.demo`. | The valid username is accepted by the username field. |
| 3 | Enter an incorrect password that does not match the account. | The incorrect password is entered and remains masked. |
| 4 | Select the Login button. | The system submits the credentials for validation. |
| 5 | Wait for the authentication response. | Authentication fails because the password does not match the account. |
| 6 | Observe the login page after the failed attempt. | An appropriate authentication error message is displayed and the user remains unauthenticated. |

---

## Test Case 6 — Login with Unregistered Username

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-006 |
| Scenario | Verify that login is rejected for a username that does not exist |
| Requirement ID | REQ-AUTH-002 |
| Test Type | Negative / Functional |
| Priority | P1 |
| Preconditions | The test username does not exist in the application |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Navigate to the application login page. | The login page is loaded successfully. |
| 2 | Enter the unregistered username `unknown.demo`. | The unregistered username is accepted as input. |
| 3 | Enter any password value. | The password value is entered and masked. |
| 4 | Select the Login button. | The application sends the credentials for authentication. |
| 5 | Wait for the authentication response. | The system rejects the authentication request because the username is not registered. |
| 6 | Verify the current application state. | The user remains on the login page and no protected application data is exposed. |

---

## Test Case 7 — Login with Blank Username

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-007 |
| Scenario | Verify validation when the username field is left blank |
| Requirement ID | REQ-DATA-001 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | Login page is accessible |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page. | The login page is displayed with the required authentication fields. |
| 2 | Leave the username field empty. | The username field remains blank without accepting a username value. |
| 3 | Enter a valid password value in the password field. | The password value is accepted and masked. |
| 4 | Select the Login button. | The application performs client-side or server-side validation instead of completing authentication. |
| 5 | Observe the username field and validation area. | A clear validation message indicates that the username is required. |
| 6 | Verify the application access state. | The user is not logged in and protected application content is not displayed. |

---

## Test Case 8 — Login with Blank Password

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-008 |
| Scenario | Verify validation when the password field is left blank |
| Requirement ID | REQ-DATA-001 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | Login page is accessible |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Navigate to the application login page. | The login page is displayed correctly. |
| 2 | Enter the valid username `admin.demo`. | The username is populated successfully. |
| 3 | Leave the password field empty. | The password field remains blank. |
| 4 | Select the Login button. | The application prevents successful authentication because the required password is missing. |
| 5 | Review the password field validation. | A clear validation message indicates that the password is required. |
| 6 | Verify whether the application opens after validation. | The user remains unauthenticated and no protected page is opened. |

---

## Test Case 9 — Login with Both Username and Password Blank

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-009 |
| Scenario | Verify validation when both login fields are empty |
| Requirement ID | REQ-DATA-001 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | Login page is accessible |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page. | The login screen is displayed successfully. |
| 2 | Confirm that the username field is empty. | No username value is present in the username field. |
| 3 | Confirm that the password field is empty. | No password value is present in the password field. |
| 4 | Select the Login button. | The system performs required-field validation without authenticating the user. |
| 5 | Review the validation messages. | Appropriate required-field messages are displayed for the missing login information. |
| 6 | Verify the application state. | The user remains on the login page and cannot access protected functionality. |

---

## Test Case 10 — Verify Password Masking

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-010 |
| Scenario | Verify that the password is masked while being entered |
| Requirement ID | REQ-AUTH-001 |
| Test Type | UI / Security |
| Priority | P1 |
| Preconditions | Login page is accessible |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the application login page. | The login page is displayed with the password field available. |
| 2 | Select the password field. | The password field receives input focus. |
| 3 | Enter the configured test password. | The password value is accepted by the field. |
| 4 | Observe the characters displayed inside the password field. | The actual password characters are hidden or represented by masking characters. |
| 5 | Enter additional password characters. | Newly entered characters are also masked consistently. |
| 6 | Verify the username field remains unaffected. | The username value is not modified while entering the password. |

---

## Test Case 11 — Login with Inactive User Account

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-011 |
| Scenario | Verify that an inactive user account cannot authenticate |
| Requirement ID | REQ-AUTH-002 |
| Test Type | Negative / Security |
| Priority | P1 |
| Preconditions | `inactive.demo` exists and its account status is Inactive |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Navigate to the application login page. | The login page is displayed successfully. |
| 2 | Enter the inactive username `inactive.demo`. | The username is accepted by the login field. |
| 3 | Enter the valid password configured for the inactive account. | The password is accepted and masked. |
| 4 | Select the Login button. | The system submits the credentials for account validation. |
| 5 | Wait for the authentication response. | Authentication is rejected because the user account is inactive. |
| 6 | Review the resulting application state. | The inactive user remains unauthenticated and cannot access protected functionality. |

---

## Test Case 12 — Verify Session After Successful Login

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-012 |
| Scenario | Verify that an authenticated user can navigate within protected pages during an active session |
| Requirement ID | REQ-AUTH-003 |
| Test Type | Functional / Session |
| Priority | P1 |
| Preconditions | Active valid Admin credentials are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using the valid Admin test account. | The user is successfully authenticated and enters the protected application area. |
| 2 | Navigate from the landing page to an authorized module. | The selected module opens without requiring another login. |
| 3 | Navigate to another authorized page within the same session. | The second page loads successfully while the authenticated session remains active. |
| 4 | Refresh the current protected page. | The page reloads without unexpectedly redirecting the authenticated user to the login page. |
| 5 | Navigate back to the previously opened module. | The authenticated session continues and the module remains accessible. |
| 6 | Verify the user authentication state. | The session remains associated with the logged-in user until logout or session expiry. |

---

## Test Case 13 — Verify Logout

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-013 |
| Scenario | Verify that an authenticated user can securely log out |
| Requirement ID | REQ-AUTH-004 |
| Test Type | Functional / Security |
| Priority | P1 |
| Preconditions | User is successfully logged into the application |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid active test account. | The user enters the authenticated application area. |
| 2 | Open the available user/account menu or logout control. | The logout option is displayed for the authenticated user. |
| 3 | Select the Logout option. | The system starts the logout process. |
| 4 | Wait for logout processing to complete. | The authenticated session is terminated. |
| 5 | Observe the resulting page. | The user is redirected to the login page or unauthenticated entry page. |
| 6 | Attempt to access a previously authorized page. | Access is denied or the user is redirected to the login page because the session is no longer authenticated. |

---

## Test Case 14 — Verify Protected Page After Logout

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-014 |
| Scenario | Verify that protected application pages cannot be accessed using browser navigation after logout |
| Requirement ID | REQ-AUTH-003, REQ-AUTH-004 |
| Test Type | Negative / Security |
| Priority | P1 |
| Preconditions | User has successfully logged in and then logged out |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid active test account. | The authenticated application area becomes accessible. |
| 2 | Open a protected module or page. | The protected page loads successfully for the authenticated user. |
| 3 | Perform the application Logout action. | The user session is terminated and the login page is displayed. |
| 4 | Use the browser Back action. | The browser does not provide authenticated access to the protected page. |
| 5 | Refresh the browser after attempting the Back action. | The system validates the current session and prevents unauthenticated access. |
| 6 | Verify the final application state. | The user remains unauthenticated and protected data is not exposed. |

---

## Test Case 15 — Verify Role-Based Access After Login

| Field | Details |
|---|---|
| Test Case ID | TC-LOGIN-015 |
| Scenario | Verify that the authenticated user's available functionality is controlled by the assigned role |
| Requirement ID | REQ-AUTH-005 |
| Test Type | Functional / RBAC |
| Priority | P1 |
| Preconditions | Active test accounts are available for Admin, Data Engineer, Field Engineer, and Analyst roles |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using the Admin test account. | The Admin account is authenticated successfully. |
| 2 | Review the modules and actions available to the Admin user. | Functionality configured for the Admin role is available. |
| 3 | Log out and log in using the Data Engineer test account. | The Data Engineer account is authenticated with its assigned role. |
| 4 | Review the modules and actions available to the Data Engineer. | The available functionality reflects Data Engineer permissions rather than Admin permissions. |
| 5 | Repeat the login process using the Field Engineer and Analyst test accounts. | Each account is authenticated successfully with its respective role. |
| 6 | Compare the accessible functionality across the four roles. | Access differences correspond to the configured role-permission matrix, and unauthorized functionality is not available to restricted roles. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-LOGIN-001 | Login with valid Admin credentials | Positive / Functional | P1 |
| TC-LOGIN-002 | Login with valid Data Engineer credentials | Positive / Functional | P1 |
| TC-LOGIN-003 | Login with valid Field Engineer credentials | Positive / Functional | P1 |
| TC-LOGIN-004 | Login with valid Analyst credentials | Positive / Functional | P1 |
| TC-LOGIN-005 | Login with invalid password | Negative / Functional | P1 |
| TC-LOGIN-006 | Login with unregistered username | Negative / Functional | P1 |
| TC-LOGIN-007 | Login with blank username | Negative / Validation | P1 |
| TC-LOGIN-008 | Login with blank password | Negative / Validation | P1 |
| TC-LOGIN-009 | Login with both fields blank | Negative / Validation | P1 |
| TC-LOGIN-010 | Verify password masking | UI / Security | P1 |
| TC-LOGIN-011 | Login with inactive user account | Negative / Security | P1 |
| TC-LOGIN-012 | Verify session after successful login | Functional / Session | P1 |
| TC-LOGIN-013 | Verify logout | Functional / Security | P1 |
| TC-LOGIN-014 | Verify protected page after logout | Negative / Security | P1 |
| TC-LOGIN-015 | Verify role-based access after login | Functional / RBAC | P1 |
