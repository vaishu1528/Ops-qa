# Test Cases

## Module: Authentication

The following test cases validate the login functionality of the fictional WellOps application.

---

| Test Case ID | Scenario | Preconditions | Test Steps | Expected Result | Priority |
|---|---|---|---|---|---|
| TC-AUTH-001 | Verify login with valid Administrator credentials | Valid Administrator account exists | 1. Open WellOps login page.<br>2. Enter `admin.demo` in Username.<br>3. Enter `Demo@123` in Password.<br>4. Click Login.<br>5. Observe the application. | User is authenticated successfully and redirected to the Dashboard. | High |
| TC-AUTH-002 | Verify login with valid Engineer credentials | Valid Engineer account exists | 1. Open login page.<br>2. Enter `engineer.demo`.<br>3. Enter `Demo@123`.<br>4. Click Login.<br>5. Observe the application. | Engineer is authenticated and redirected to the Dashboard with Engineer permissions. | High |
| TC-AUTH-003 | Verify login with invalid username | Login page is accessible | 1. Open login page.<br>2. Enter an invalid username.<br>3. Enter a valid password.<br>4. Click Login.<br>5. Observe the response. | Login fails and an appropriate authentication error message is displayed. | High |
| TC-AUTH-004 | Verify login with invalid password | Valid username exists | 1. Open login page.<br>2. Enter a valid username.<br>3. Enter an incorrect password.<br>4. Click Login.<br>5. Observe the response. | Login fails and an appropriate authentication error message is displayed. | High |
| TC-AUTH-005 | Verify login with both username and password blank | Login page is accessible | 1. Open login page.<br>2. Leave Username blank.<br>3. Leave Password blank.<br>4. Click Login.<br>5. Observe validation messages. | Required field validation messages are displayed and login is not performed. | High |
| TC-AUTH-006 | Verify username field validation | Login page is accessible | 1. Open login page.<br>2. Enter unsupported characters in Username.<br>3. Enter a valid password.<br>4. Click Login.<br>5. Observe validation behavior. | Username validation is applied according to the defined input rules and login is prevented when invalid input is supplied. | Medium |
| TC-AUTH-007 | Verify password masking | Login page is accessible | 1. Open login page.<br>2. Click Password field.<br>3. Enter a password.<br>4. Observe the password field.<br>5. Check displayed characters. | Password characters are masked and are not displayed as plain text. | Medium |
| TC-AUTH-008 | Verify login using leading/trailing spaces | Valid account exists | 1. Open login page.<br>2. Enter username with leading/trailing spaces.<br>3. Enter valid password.<br>4. Click Login.<br>5. Observe the result. | Application handles whitespace according to the defined authentication rules without unexpected authentication behavior. | Medium |
| TC-AUTH-009 | Verify logout functionality | User is successfully logged in | 1. Login with valid credentials.<br>2. Navigate to Dashboard.<br>3. Click Logout.<br>4. Observe the application.<br>5. Attempt to access a protected page. | User is logged out and protected pages cannot be accessed without authentication. | High |
| TC-AUTH-010 | Verify browser Back button after logout | User has logged out successfully | 1. Login to the application.<br>2. Navigate to Dashboard.<br>3. Logout from the application.<br>4. Click browser Back button.<br>5. Observe the displayed page. | Previously authenticated pages are not accessible after logout and the user is redirected to the login page when required. | High |
| TC-AUTH-011 | Verify Viewer access permissions | Valid Viewer account exists | 1. Login using `viewer.demo`.<br>2. Open Dashboard.<br>3. Navigate to available modules.<br>4. Attempt to access restricted functionality.<br>5. Observe permissions. | Viewer can access only permitted functionality and restricted actions are unavailable or denied. | High |
| TC-AUTH-012 | Verify session expiration | User is logged in | 1. Login with valid credentials.<br>2. Keep the application inactive until session timeout.<br>3. Attempt to access a protected page.<br>4. Observe the response.<br>5. Attempt to continue using the application. | Session expires according to the configured timeout and the user is redirected to authentication when required. | High |
| TC-AUTH-013 | Verify login page UI elements | Login page is accessible | 1. Open login page.<br>2. Verify Username field.<br>3. Verify Password field.<br>4. Verify Login button.<br>5. Verify labels, alignment and visibility. | All required login elements are displayed correctly, aligned properly and are usable. | Medium |
| TC-AUTH-014 | Verify multiple failed login attempts | Login page is accessible | 1. Open login page.<br>2. Enter invalid credentials.<br>3. Submit the login request repeatedly according to the configured limit.<br>4. Observe application behavior.<br>5. Verify account protection behavior. | Application applies the configured security behavior after repeated failed authentication attempts. | High |
| TC-AUTH-015 | Verify successful login after correcting invalid credentials | Login page is accessible | 1. Enter invalid credentials.<br>2. Submit the login request.<br>3. Verify authentication error.<br>4. Enter valid credentials.<br>5. Click Login. | Invalid attempt is rejected and the valid credentials subsequently authenticate the user successfully. | High |

---

## Test Coverage

The authentication test cases cover:

- Positive Testing
- Negative Testing
- Functional Testing
- UI Testing
- Validation Testing
- Role-Based Access Testing
- Session Management
- Security-Oriented Validation
- Regression Testing
- Boundary and Input Validation
