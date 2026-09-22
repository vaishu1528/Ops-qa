# Treatment Scheduled Test Cases

## Module: Treatment Management

These test cases validate treatment creation, treatment schedule data, stage information, volume and rate validation, editing, status handling, and data integrity.

---

| Test Case ID | Scenario | Preconditions | Test Steps | Expected Result | Priority |
|---|---|---|---|---|---|
| TC-TREAT-001 | Verify Treatment Management page loads successfully | User is logged in and a valid well exists | 1. Login to WellOps.<br>2. Open Well Management.<br>3. Select an existing well.<br>4. Navigate to Treatment Management.<br>5. Observe the page. | Treatment Management page loads successfully and displays available treatment records and actions. | High |
| TC-TREAT-002 | Verify existing treatment records are displayed correctly | Well contains treatment data | 1. Open Treatment Management.<br>2. Review the treatment list.<br>3. Verify treatment identifiers.<br>4. Verify stage and schedule information.<br>5. Compare the displayed data with test data. | Existing treatment records are displayed accurately with the correct information. | High |
| TC-TREAT-003 | Verify creation of a treatment with valid data | User has treatment creation permission | 1. Open Treatment Management.<br>2. Click Add Treatment.<br>3. Enter valid treatment information.<br>4. Save the treatment.<br>5. Search for the newly created treatment. | Treatment is created successfully and appears in the treatment list with the entered information. | High |
| TC-TREAT-004 | Verify mandatory field validation during treatment creation | Add Treatment form is accessible | 1. Open Add Treatment form.<br>2. Leave a mandatory field blank.<br>3. Enter valid values in other fields.<br>4. Click Save.<br>5. Observe validation messages. | Required field validation is displayed and incomplete treatment information is not saved. | High |
| TC-TREAT-005 | Verify treatment schedule accepts valid values | Treatment form is accessible | 1. Open Add Treatment form.<br>2. Enter valid schedule values.<br>3. Enter valid stage information.<br>4. Save the treatment.<br>5. Reopen the treatment. | Valid schedule information is accepted, saved, and displayed correctly. | High |
| TC-TREAT-006 | Verify invalid numeric treatment values are rejected | Treatment form is accessible | 1. Open the treatment form.<br>2. Enter alphabetic characters in a numeric field.<br>3. Complete the remaining required fields.<br>4. Click Save.<br>5. Observe validation behavior. | Invalid non-numeric values are rejected and appropriate validation feedback is displayed. | High |
| TC-TREAT-007 | Verify negative treatment values are rejected | Treatment form is accessible | 1. Open the treatment form.<br>2. Enter a negative value in a field where negative values are not permitted.<br>3. Enter valid remaining information.<br>4. Click Save.<br>5. Observe the result. | Application rejects invalid negative values according to the defined business rules. | High |
| TC-TREAT-008 | Verify zero-value validation for treatment fields | Treatment form is accessible | 1. Open the treatment form.<br>2. Enter zero in a field requiring a positive value.<br>3. Complete other required fields.<br>4. Click Save.<br>5. Observe the validation response. | Application accepts or rejects zero according to the defined business rule and displays appropriate validation when required. | Medium |
| TC-TREAT-009 | Verify treatment stage information can be added | Treatment creation form is accessible | 1. Open Add Treatment.<br>2. Enter valid treatment details.<br>3. Add a valid treatment stage.<br>4. Save the treatment.<br>5. Review the treatment stages. | Treatment stage is added successfully and is associated with the correct treatment. | High |
| TC-TREAT-010 | Verify editing an existing treatment | Existing treatment is available and user has edit permission | 1. Select an existing treatment.<br>2. Click Edit.<br>3. Modify an editable treatment field.<br>4. Save the changes.<br>5. Reopen the treatment. | Updated treatment information is saved and displayed correctly. | High |
| TC-TREAT-011 | Verify Cancel operation discards treatment changes | Existing treatment is available | 1. Open an existing treatment.<br>2. Modify an editable field.<br>3. Click Cancel.<br>4. Reopen the treatment.<br>5. Verify the modified field. | Unsaved changes are discarded and the previously saved treatment value remains unchanged. | Medium |
| TC-TREAT-012 | Verify treatment status can be updated | Existing treatment is available and user has permission | 1. Open an existing treatment.<br>2. Select the treatment status option.<br>3. Change the status to a valid status.<br>4. Save the changes.<br>5. Verify the treatment list. | Treatment status is updated successfully and the new status is reflected consistently. | High |
| TC-TREAT-013 | Verify duplicate treatment creation is handled | Existing treatment record is available | 1. Open Add Treatment.<br>2. Enter the same unique treatment information as an existing record.<br>3. Complete required fields.<br>4. Click Save.<br>5. Observe the application response. | Duplicate treatment records are prevented when uniqueness rules apply and an appropriate validation message is displayed. | High |
| TC-TREAT-014 | Verify treatment information persists after page refresh | Treatment has been successfully saved | 1. Create or update a valid treatment.<br>2. Save the changes.<br>3. Refresh the browser page.<br>4. Reopen Treatment Management.<br>5. Verify the treatment information. | Saved treatment information persists after refresh and displays the latest stored values. | High |
| TC-TREAT-015 | Verify treatment remains associated with the correct well | Multiple wells and treatment records exist | 1. Open Treatment Management for `WELL-1001`.<br>2. Verify its treatment records.<br>3. Navigate back to Well Management.<br>4. Select `WELL-1002`.<br>5. Open Treatment Management. | Only treatment records associated with the selected well are displayed and no treatment data is incorrectly shared between wells. | High |

---

## Test Coverage

The Treatment Management test cases cover:

- Functional Testing
- Positive Testing
- Negative Testing
- UI Testing
- Mandatory Field Validation
- Numeric Validation
- Boundary Validation
- Treatment Schedule Validation
- Stage Data Validation
- CRUD Operations
- Duplicate Data Validation
- Status Management
- Data Persistence
- Data Integrity
- Regression Testing
