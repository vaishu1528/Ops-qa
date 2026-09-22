# Well Information Test Cases

## Module: Well Information

These test cases validate viewing, editing, saving, validation, and data integrity of well information.

---

| Test Case ID | Scenario | Preconditions | Test Steps | Expected Result | Priority |
|---|---|---|---|---|---|
| TC-WINFO-001 | Verify Well Information page loads successfully | User is logged in and a well exists | 1. Login to WellOps.<br>2. Open Well Management.<br>3. Select an existing well.<br>4. Navigate to Well Information.<br>5. Observe the page. | Well Information page loads successfully and displays the selected well's information. | High |
| TC-WINFO-002 | Verify existing well information is displayed correctly | Well contains saved information | 1. Open Well Information.<br>2. Note the displayed Well ID.<br>3. Verify well name and field information.<br>4. Verify other configured attributes.<br>5. Compare with the saved test data. | All displayed values match the information stored for the selected well. | High |
| TC-WINFO-003 | Verify editing valid well information | User has edit permission | 1. Open an existing well.<br>2. Navigate to Well Information.<br>3. Modify an editable field with valid data.<br>4. Click Save.<br>5. Reopen the well information. | Updated information is saved successfully and remains available after reopening the well. | High |
| TC-WINFO-004 | Verify mandatory field validation | Well Information form is editable | 1. Open Well Information.<br>2. Clear a mandatory field.<br>3. Enter valid values in other fields.<br>4. Click Save.<br>5. Observe validation behavior. | Required field validation is displayed and invalid information is not saved. | High |
| TC-WINFO-005 | Verify invalid data validation | Well Information form is editable | 1. Open Well Information.<br>2. Enter invalid data in a field.<br>3. Complete other required fields.<br>4. Click Save.<br>5. Observe the response. | Application rejects invalid data and displays an appropriate validation message. | High |
| TC-WINFO-006 | Verify Cancel operation discards changes | Existing well information is available | 1. Open Well Information.<br>2. Modify an editable field.<br>3. Click Cancel.<br>4. Reopen the Well Information page.<br>5. Check the modified field. | Unsaved changes are discarded and the previously saved value is retained. | Medium |
| TC-WINFO-007 | Verify field data type validation | Well Information form is editable | 1. Open Well Information.<br>2. Select a numeric field.<br>3. Enter alphabetic or unsupported characters.<br>4. Attempt to save the data.<br>5. Observe the validation result. | Application prevents unsupported data types and displays appropriate validation feedback. | High |
| TC-WINFO-008 | Verify maximum field length validation | Well Information form is editable | 1. Open Well Information.<br>2. Select a text field with a defined maximum length.<br>3. Enter data within the allowed limit.<br>4. Enter data beyond the allowed limit.<br>5. Observe the application behavior. | Application accepts data within the supported limit and prevents or validates values exceeding the configured maximum length. | Medium |
| TC-WINFO-009 | Verify special character handling | Well Information form is editable | 1. Open Well Information.<br>2. Enter supported special characters in applicable fields.<br>3. Complete the required fields.<br>4. Save the information.<br>5. Reopen the record. | Supported special characters are handled correctly without data corruption or unexpected behavior. | Medium |
| TC-WINFO-010 | Verify information persists after page refresh | Well information has been successfully updated | 1. Update a valid well information field.<br>2. Save the changes.<br>3. Refresh the browser page.<br>4. Reopen the Well Information section.<br>5. Verify the updated value. | Saved information persists after page refresh and displays the latest stored value. | High |
| TC-WINFO-011 | Verify correct well information is displayed when switching wells | Multiple wells exist | 1. Open Well Information for `WELL-1001`.<br>2. Verify the displayed Well ID.<br>3. Navigate back to Well Management.<br>4. Select `WELL-1002`.<br>5. Open Well Information. | Information displayed after switching wells belongs only to the newly selected well. | High |
| TC-WINFO-012 | Verify Viewer cannot edit restricted well information | Viewer account exists | 1. Login using the Viewer account.<br>2. Open Well Management.<br>3. Select an existing well.<br>4. Navigate to Well Information.<br>5. Observe available actions. | Viewer can view permitted information but cannot perform restricted edit operations. | High |
| TC-WINFO-013 | Verify successful save confirmation | User has edit permission | 1. Open Well Information.<br>2. Modify a valid editable field.<br>3. Click Save.<br>4. Wait for the save operation to complete.<br>5. Observe the notification. | A clear success indication is displayed after the information is saved successfully. | Medium |
| TC-WINFO-014 | Verify navigation from Well Information to related modules | Selected well exists | 1. Open Well Information for a valid well.<br>2. Verify navigation controls.<br>3. Navigate to Wellbore Configuration.<br>4. Return to Well Information.<br>5. Verify the selected well context. | Navigation works correctly and the selected well context is maintained across related modules. | Medium |
| TC-WINFO-015 | Verify data integrity after updating well information | Existing well contains valid information | 1. Record the existing well information.<br>2. Modify one editable field.<br>3. Save the changes.<br>4. Navigate to another module and return.<br>5. Verify all related information. | Updated data is retained without unintended changes to other well information or related records. | High |

---

## Test Coverage

The Well Information test cases cover:

- Functional Testing
- Positive Testing
- Negative Testing
- UI Testing
- Data Validation
- Mandatory Field Validation
- Boundary Validation
- Data Persistence
- Role-Based Access Testing
- Navigation Testing
- Data Integrity
- Regression Testing
