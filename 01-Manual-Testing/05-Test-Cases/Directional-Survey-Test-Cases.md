# Directional Survey Test Cases

## Module: Directional Survey

These test cases validate directional survey data entry, validation, calculations, editing, deletion, sorting, and data integrity.

---

| Test Case ID | Scenario | Preconditions | Test Steps | Expected Result | Priority |
|---|---|---|---|---|---|
| TC-DS-001 | Verify Directional Survey page loads successfully | User is logged in and a valid well exists | 1. Login to WellOps.<br>2. Open Well Management.<br>3. Select an existing well.<br>4. Navigate to Directional Survey.<br>5. Observe the page. | Directional Survey page loads successfully and displays the survey data and available actions. | High |
| TC-DS-002 | Verify existing survey records are displayed correctly | Well contains survey data | 1. Open Directional Survey.<br>2. Review the survey table.<br>3. Verify MD values.<br>4. Verify Inclination and Azimuth values.<br>5. Compare records with test data. | Existing survey records are displayed accurately with the correct values and units. | High |
| TC-DS-003 | Verify adding a valid directional survey record | User has edit permission | 1. Open Directional Survey.<br>2. Click Add Survey.<br>3. Enter valid MD, Inclination and Azimuth values.<br>4. Save the record.<br>5. Verify the newly added record. | Valid survey data is saved successfully and appears in the survey list. | High |
| TC-DS-004 | Verify mandatory field validation for survey data | Add Survey form is accessible | 1. Open Add Survey form.<br>2. Leave a mandatory field blank.<br>3. Enter valid values in the remaining fields.<br>4. Click Save.<br>5. Observe validation messages. | Required field validation is displayed and incomplete survey data is not saved. | High |
| TC-DS-005 | Verify MD accepts valid numeric values | Add Survey form is accessible | 1. Open Add Survey form.<br>2. Enter a valid numeric MD value.<br>3. Enter valid Inclination and Azimuth values.<br>4. Save the record.<br>5. Review the saved record. | Valid MD value is accepted and stored correctly. | High |
| TC-DS-006 | Verify MD rejects invalid non-numeric values | Add Survey form is accessible | 1. Open Add Survey form.<br>2. Enter alphabetic characters in MD.<br>3. Enter valid values in other fields.<br>4. Click Save.<br>5. Observe validation behavior. | Application rejects non-numeric MD input and displays appropriate validation feedback. | High |
| TC-DS-007 | Verify inclination boundary values | Directional Survey form is accessible | 1. Open Add Survey form.<br>2. Enter inclination value of 0 degrees.<br>3. Save the record.<br>4. Enter inclination value of 180 degrees.<br>5. Verify the validation behavior. | Supported inclination boundary values are accepted according to business rules, while values outside the permitted range are rejected. | High |
| TC-DS-008 | Verify azimuth boundary values | Directional Survey form is accessible | 1. Open Add Survey form.<br>2. Enter the minimum supported azimuth value.<br>3. Save the record.<br>4. Enter the maximum supported azimuth value.<br>5. Verify the validation behavior. | Supported azimuth boundary values are accepted and values outside the permitted range are rejected. | High |
| TC-DS-009 | Verify negative inclination is rejected | Directional Survey form is accessible | 1. Open Add Survey form.<br>2. Enter a negative inclination value.<br>3. Enter valid MD and Azimuth values.<br>4. Click Save.<br>5. Observe the result. | Negative inclination is rejected when it violates the defined directional survey rules. | High |
| TC-DS-010 | Verify survey records are maintained in MD order | Multiple survey records exist | 1. Open Directional Survey.<br>2. Review the MD column.<br>3. Add a record with a valid MD value.<br>4. Refresh the survey list.<br>5. Review the record ordering. | Survey records are displayed according to the configured MD sorting or ordering rules. | Medium |
| TC-DS-011 | Verify editing an existing survey record | Existing survey record is available | 1. Select an existing survey record.<br>2. Click Edit.<br>3. Modify a valid survey value.<br>4. Save the changes.<br>5. Reopen the survey record. | Updated survey information is saved and displayed correctly. | High |
| TC-DS-012 | Verify deleting an existing survey record | Existing survey record is available and user has delete permission | 1. Select a survey record.<br>2. Click Delete.<br>3. Review the confirmation message.<br>4. Confirm deletion.<br>5. Verify the survey list. | Selected survey record is deleted successfully after confirmation and no longer appears in the list. | High |
| TC-DS-013 | Verify duplicate survey record handling | Existing survey record is available | 1. Open Add Survey.<br>2. Enter the same unique survey values as an existing record.<br>3. Complete required fields.<br>4. Click Save.<br>5. Observe the application response. | Duplicate survey records are prevented when uniqueness rules apply and appropriate validation is displayed. | Medium |
| TC-DS-014 | Verify survey data persists after page refresh | Valid survey record has been saved | 1. Add or update a valid survey record.<br>2. Save the changes.<br>3. Refresh the browser page.<br>4. Reopen Directional Survey.<br>5. Verify the record. | Saved survey data persists after refresh and displays the latest stored values. | High |
| TC-DS-015 | Verify calculated survey values are consistent with input data | Valid survey records exist | 1. Open Directional Survey.<br>2. Review MD, Inclination and Azimuth values.<br>3. Review any calculated positional values such as N-S, E-W or TVD.<br>4. Compare calculated values with the expected calculation rules.<br>5. Verify the displayed results. | Calculated survey values are generated consistently from the entered survey data according to the defined calculation rules. | High |

---

## Test Coverage

The Directional Survey test cases cover:

- Functional Testing
- Positive Testing
- Negative Testing
- UI Testing
- Numeric Validation
- Boundary Value Analysis
- Range Validation
- CRUD Operations
- Duplicate Data Validation
- Sorting and Ordering
- Data Persistence
- Calculation Validation
- Data Integrity
- Regression Testing
