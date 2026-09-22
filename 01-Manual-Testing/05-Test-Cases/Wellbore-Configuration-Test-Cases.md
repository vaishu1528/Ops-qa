# Wellbore Configuration Test Cases

## Module: Wellbore Configuration

These test cases validate casing, tubing, wellbore configuration, input validation, data persistence, and configuration integrity.

---

| Test Case ID | Scenario | Preconditions | Test Steps | Expected Result | Priority |
|---|---|---|---|---|---|
| TC-WB-001 | Verify Wellbore Configuration page loads successfully | User is logged in and a valid well exists | 1. Login to WellOps.<br>2. Open Well Management.<br>3. Select an existing well.<br>4. Navigate to Wellbore Configuration.<br>5. Observe the page. | Wellbore Configuration page loads successfully and displays the configuration associated with the selected well. | High |
| TC-WB-002 | Verify existing casing information is displayed correctly | Well has casing data | 1. Open Wellbore Configuration.<br>2. Navigate to the casing section.<br>3. Review the displayed casing records.<br>4. Verify sizes and depths.<br>5. Compare the values with test data. | Existing casing information is displayed accurately without missing or incorrect values. | High |
| TC-WB-003 | Verify existing tubing information is displayed correctly | Well has tubing data | 1. Open Wellbore Configuration.<br>2. Navigate to the tubing section.<br>3. Review the tubing records.<br>4. Verify dimensions and depth information.<br>5. Compare the values with test data. | Existing tubing information is displayed correctly for the selected well. | High |
| TC-WB-004 | Verify adding a valid casing record | User has edit permission | 1. Open Wellbore Configuration.<br>2. Select Add Casing.<br>3. Enter valid casing information.<br>4. Save the configuration.<br>5. Verify the newly added record. | Valid casing information is saved successfully and appears in the casing list. | High |
| TC-WB-005 | Verify adding a valid tubing record | User has edit permission | 1. Open Wellbore Configuration.<br>2. Select Add Tubing.<br>3. Enter valid tubing information.<br>4. Save the configuration.<br>5. Verify the newly added record. | Valid tubing information is saved successfully and appears in the tubing list. | High |
| TC-WB-006 | Verify mandatory field validation for casing | Add Casing form is accessible | 1. Open Add Casing form.<br>2. Leave a mandatory field blank.<br>3. Enter valid values in other fields.<br>4. Click Save.<br>5. Observe validation messages. | Required field validation is displayed and incomplete casing data is not saved. | High |
| TC-WB-007 | Verify mandatory field validation for tubing | Add Tubing form is accessible | 1. Open Add Tubing form.<br>2. Leave a mandatory field blank.<br>3. Enter valid values in other fields.<br>4. Click Save.<br>5. Observe validation messages. | Required field validation is displayed and incomplete tubing data is not saved. | High |
| TC-WB-008 | Verify numeric field validation | Wellbore form is accessible | 1. Open a casing or tubing form.<br>2. Select a numeric field.<br>3. Enter alphabetic characters.<br>4. Attempt to save the record.<br>5. Observe the validation behavior. | Application rejects invalid non-numeric input and displays appropriate validation feedback. | High |
| TC-WB-009 | Verify negative values are rejected | Wellbore form is accessible | 1. Open a numeric wellbore field.<br>2. Enter a negative value.<br>3. Complete other required fields.<br>4. Click Save.<br>5. Observe the result. | Invalid negative values are rejected when they are outside the defined business rules. | High |
| TC-WB-010 | Verify duplicate casing records are handled correctly | Existing casing record is available | 1. Open Add Casing.<br>2. Enter the same unique configuration as an existing record.<br>3. Complete the remaining fields.<br>4. Click Save.<br>5. Observe the application response. | Application prevents duplicate configuration records when uniqueness rules apply and displays appropriate feedback. | High |
| TC-WB-011 | Verify editing an existing casing record | Existing casing record is available | 1. Select an existing casing record.<br>2. Click Edit.<br>3. Modify an editable value.<br>4. Save the changes.<br>5. Reopen the configuration. | Updated casing information is saved and displayed correctly after reopening. | High |
| TC-WB-012 | Verify deleting a casing record | Existing casing record is available and user has delete permission | 1. Select an existing casing record.<br>2. Click Delete.<br>3. Review the confirmation prompt.<br>4. Confirm deletion.<br>5. Refresh or reopen the configuration. | Casing record is deleted successfully after confirmation and no longer appears in the configuration. | High |
| TC-WB-013 | Verify Cancel operation does not save configuration changes | Wellbore configuration is editable | 1. Open an existing configuration record.<br>2. Modify a value.<br>3. Click Cancel.<br>4. Reopen the configuration.<br>5. Verify the original value. | Unsaved changes are discarded and the previously saved configuration remains unchanged. | Medium |
| TC-WB-014 | Verify configuration persists after page refresh | Valid configuration has been saved | 1. Update a valid wellbore configuration.<br>2. Save the changes.<br>3. Refresh the browser page.<br>4. Reopen Wellbore Configuration.<br>5. Verify the updated values. | Saved configuration remains unchanged after page refresh and displays the latest values. | High |
| TC-WB-015 | Verify wellbore configuration remains associated with the correct well | Multiple wells with different configurations exist | 1. Open Wellbore Configuration for `WELL-1001`.<br>2. Verify its configuration.<br>3. Navigate back to Well Management.<br>4. Select `WELL-1002`.<br>5. Open Wellbore Configuration. | Configuration displayed for each well belongs only to the selected well and no data is incorrectly shared between wells. | High |

---

## Test Coverage

The Wellbore Configuration test cases cover:

- Functional Testing
- Positive Testing
- Negative Testing
- UI Testing
- Casing Validation
- Tubing Validation
- Mandatory Field Validation
- Numeric Validation
- Boundary and Negative Value Validation
- CRUD Operations
- Duplicate Data Validation
- Data Persistence
- Data Integrity
- Role-Based Access
- Regression Testing
