# Well Management Test Cases

## Module: Well Management

These test cases validate well creation, search, filtering, editing, status management, duplicate handling, and well selection functionality.

---

| Test Case ID | Scenario | Preconditions | Test Steps | Expected Result | Priority |
|---|---|---|---|---|---|
| TC-WELL-001 | Verify Well Management page loads successfully | User is logged in with permitted access | 1. Login to WellOps.<br>2. Navigate to Well Management.<br>3. Wait for the page to load.<br>4. Verify the well list.<br>5. Observe the page layout. | Well Management page loads successfully and displays the available wells with required controls and information. | High |
| TC-WELL-002 | Verify creation of a new well with valid data | User has permission to create wells | 1. Open Well Management.<br>2. Click Add Well.<br>3. Enter valid well details.<br>4. Submit the well information.<br>5. Search for the newly created well. | New well is created successfully and appears in the well list with the entered information. | High |
| TC-WELL-003 | Verify mandatory field validation during well creation | Add Well form is accessible | 1. Open Add Well form.<br>2. Leave mandatory fields blank.<br>3. Enter valid data in optional fields.<br>4. Click Save.<br>5. Observe validation messages. | Required field validation messages are displayed and the well is not created until mandatory information is provided. | High |
| TC-WELL-004 | Verify duplicate well creation is prevented | Existing well `WELL-1001` is available | 1. Open Add Well form.<br>2. Enter the same unique well identifier as `WELL-1001`.<br>3. Enter valid remaining information.<br>4. Click Save.<br>5. Observe the application response. | Application prevents creation of a duplicate well and displays an appropriate validation message. | High |
| TC-WELL-005 | Verify well search using valid Well ID | Well data exists | 1. Open Well Management.<br>2. Enter `WELL-1001` in the search field.<br>3. Trigger the search.<br>4. Review the search results.<br>5. Compare the displayed Well ID. | The matching well is displayed and unrelated wells are excluded from the results. | High |
| TC-WELL-006 | Verify well search using partial text | Multiple wells exist | 1. Open Well Management.<br>2. Enter a partial well name or identifier.<br>3. Trigger the search.<br>4. Review the results.<br>5. Verify matching records. | Wells matching the supported partial-search criteria are displayed correctly. | Medium |
| TC-WELL-007 | Verify search with no matching well | Well Management page is accessible | 1. Open Well Management.<br>2. Enter a non-existing Well ID.<br>3. Trigger the search.<br>4. Review the results.<br>5. Observe the empty-state message. | No unrelated wells are displayed and an appropriate no-results message is shown. | Medium |
| TC-WELL-008 | Verify filtering wells by Active status | Active and inactive wells exist | 1. Open Well Management.<br>2. Open the Status filter.<br>3. Select Active.<br>4. Apply the filter.<br>5. Review the results. | Only wells with Active status are displayed. | High |
| TC-WELL-009 | Verify filtering wells by Inactive status | Active and inactive wells exist | 1. Open Well Management.<br>2. Open the Status filter.<br>3. Select Inactive.<br>4. Apply the filter.<br>5. Review the results. | Only wells with Inactive status are displayed. | High |
| TC-WELL-010 | Verify editing an existing well | Existing well is available and user has edit permission | 1. Select an existing well.<br>2. Click Edit.<br>3. Modify an editable field.<br>4. Save the changes.<br>5. Reopen the well. | Updated information is saved successfully and is displayed when the well is reopened. | High |
| TC-WELL-011 | Verify cancel operation while creating a well | Add Well form is accessible | 1. Open Add Well form.<br>2. Enter valid information.<br>3. Click Cancel.<br>4. Return to Well Management list.<br>5. Search for the entered Well ID. | Form is closed without saving the new well and no unwanted record is created. | Medium |
| TC-WELL-012 | Verify well status update | Existing active well is available | 1. Open an active well.<br>2. Select the status option.<br>3. Change the status to Inactive.<br>4. Save the changes.<br>5. Verify the well in the list. | Well status is updated successfully and the updated status is reflected consistently across the application. | High |
| TC-WELL-013 | Verify well details can be opened from the list | Well Management page contains wells | 1. Open Well Management.<br>2. Select a well from the list.<br>3. Click the well record.<br>4. Observe the details page.<br>5. Verify the Well ID and basic information. | Correct well details page opens and displays information corresponding to the selected well. | High |
| TC-WELL-014 | Verify pagination of well records | More records exist than the configured page size | 1. Open Well Management.<br>2. Verify the first page of records.<br>3. Click Next page.<br>4. Review the displayed records.<br>5. Navigate back to the previous page. | Pagination works correctly without losing, duplicating, or incorrectly repeating well records. | Medium |
| TC-WELL-015 | Verify role-based access for Well Management actions | Users with different roles exist | 1. Login as Administrator.<br>2. Verify available Well Management actions.<br>3. Login as Viewer.<br>4. Open Well Management.<br>5. Compare permitted actions. | Each role can perform only the Well Management operations permitted by its assigned access level. | High |

---

## Test Coverage

The Well Management test cases cover:

- Functional Testing
- Positive Testing
- Negative Testing
- UI Testing
- Input Validation
- Search Testing
- Filter Testing
- CRUD Validation
- Duplicate Data Validation
- Pagination Testing
- Role-Based Access Testing
- Regression Testing
