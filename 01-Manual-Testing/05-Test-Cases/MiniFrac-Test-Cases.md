# MiniFrac / DFIT Test Cases

## Document Information

| Field | Details |
|---|---|
| Document Name | MiniFrac / DFIT Test Cases |
| Application Type | Oil & Gas Well Operations Management System |
| Module | MiniFrac / DFIT |
| Test Level | System Testing |
| Test Type | Functional, Positive, Negative, Validation, Calculation, Plot Validation, Data Integrity, Regression |
| Test Data | Synthetic test data |
| Environment | QA |

---

## Test Case 1 — Verify MiniFrac / DFIT Section Access

| Field | Details |
|---|---|
| Test Case ID | TC-MF-001 |
| Scenario | Verify that an authorized user can access the MiniFrac / DFIT section for a selected well |
| Requirement ID | REQ-MF-001 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User is logged in and has permission to access MiniFrac / DFIT |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Log in using a valid authorized test account. | The user is authenticated successfully. |
| 2 | Navigate to Well Management and select `PAD-001 – Falcon North Pad`. | The wells associated with the selected pad are displayed. |
| 3 | Select `WELL-1001 – Falcon-A01`. | `WELL-1001` becomes the active well context. |
| 4 | Navigate to the MiniFrac / DFIT section. | The MiniFrac / DFIT section opens successfully. |
| 5 | Review the available input and analysis areas. | Applicable MiniFrac / DFIT fields and analysis controls are displayed. |
| 6 | Verify the selected well context. | The displayed MiniFrac / DFIT information belongs to `WELL-1001`. |

---

## Test Case 2 — Verify MiniFrac / DFIT Input Data Entry

| Field | Details |
|---|---|
| Test Case ID | TC-MF-002 |
| Scenario | Verify that valid MiniFrac / DFIT input data can be entered |
| Requirement ID | REQ-MF-002 |
| Test Type | Positive / Functional |
| Priority | P1 |
| Preconditions | User has permission to enter MiniFrac / DFIT data |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the MiniFrac / DFIT section for a valid test well. | The MiniFrac / DFIT input area is displayed. |
| 2 | Select the applicable input field for test data entry. | The selected field accepts user input. |
| 3 | Enter valid synthetic pressure, rate, time, and volume-related values as applicable. | Each valid input value is accepted. |
| 4 | Review the entered dataset before processing. | All entered values are displayed against the correct fields. |
| 5 | Verify that the entered values use the expected units and formats. | Input values follow the configured field format and unit requirements. |
| 6 | Save the MiniFrac / DFIT input data. | The valid dataset is saved successfully. |

---

## Test Case 3 — Verify Required MiniFrac / DFIT Input Validation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-003 |
| Scenario | Verify that required MiniFrac / DFIT input fields cannot be left blank |
| Requirement ID | REQ-MF-003, REQ-DATA-001 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | MiniFrac / DFIT input fields are available and at least one field is mandatory |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open MiniFrac / DFIT input for an editable test well. | The required input fields are displayed. |
| 2 | Identify a mandatory field containing a valid test value. | The mandatory field is available for editing. |
| 3 | Remove the value from the mandatory field. | The field becomes empty. |
| 4 | Attempt to save or process the dataset. | The system prevents the incomplete dataset from being saved or processed. |
| 5 | Review the validation feedback. | A clear validation message identifies the missing required value. |
| 6 | Enter a valid value and retry the operation. | The validation error is cleared and the dataset can proceed when all required values are valid. |

---

## Test Case 4 — Verify Numeric MiniFrac / DFIT Input Validation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-004 |
| Scenario | Verify that non-numeric values are rejected in numeric MiniFrac / DFIT input fields |
| Requirement ID | REQ-MF-003, REQ-DATA-002 |
| Test Type | Negative / Validation |
| Priority | P1 |
| Preconditions | Numeric MiniFrac / DFIT input fields are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the MiniFrac / DFIT input section. | The input fields are displayed successfully. |
| 2 | Select a field configured for numeric data. | The selected field is ready for numeric input. |
| 3 | Enter alphabetic or unsupported non-numeric characters. | The application rejects the invalid characters or identifies the value as invalid. |
| 4 | Attempt to save or process the dataset. | The system prevents invalid numeric input from being processed. |
| 5 | Review the validation message. | Clear feedback identifies the invalid numeric value. |
| 6 | Replace the invalid input with a valid numeric value and retry. | The valid value is accepted and the dataset can proceed. |

---

## Test Case 5 — Verify MiniFrac / DFIT Input Range Validation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-005 |
| Scenario | Verify that MiniFrac / DFIT values outside configured limits are rejected |
| Requirement ID | REQ-MF-003, REQ-DATA-003 |
| Test Type | Negative / Boundary |
| Priority | P1 |
| Preconditions | Applicable MiniFrac / DFIT fields have defined valid ranges |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open an editable MiniFrac / DFIT dataset. | The applicable input fields are displayed. |
| 2 | Select a field with a configured minimum value. | The selected field is ready for input. |
| 3 | Enter a value below the configured minimum. | The application identifies the value as outside the permitted range. |
| 4 | Attempt to save or process the dataset. | The invalid lower-range value is rejected. |
| 5 | Replace the value with one above the configured maximum and retry. | The application identifies the upper-range value as invalid. |
| 6 | Enter a value within the valid range and retry. | The valid value is accepted and processing can continue. |

---

## Test Case 6 — Verify Clean Volume Calculation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-006 |
| Scenario | Verify that Clean Volume is calculated correctly from valid MiniFrac / DFIT input data |
| Requirement ID | REQ-MF-004 |
| Test Type | Functional / Calculation |
| Priority | P1 |
| Preconditions | Valid synthetic rate, time, and applicable volume inputs are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the MiniFrac / DFIT analysis section with a valid dataset. | The analysis area loads with the available input data. |
| 2 | Review the rate and time values used for Clean Volume calculation. | The calculation inputs are displayed correctly. |
| 3 | Trigger the Clean Volume calculation or analysis operation. | The application processes the provided input data. |
| 4 | Wait for the calculation to complete. | Clean Volume is calculated without a processing error. |
| 5 | Review the displayed Clean Volume value. | The Clean Volume value is populated in the designated result area. |
| 6 | Compare the result with the expected synthetic calculation. | The displayed Clean Volume matches the expected calculation within the application's defined precision. |

---

## Test Case 7 — Verify Clean Volume Changes with Input Data

| Field | Details |
|---|---|
| Test Case ID | TC-MF-007 |
| Scenario | Verify that Clean Volume is recalculated when relevant input data changes |
| Requirement ID | REQ-MF-004 |
| Test Type | Functional / Calculation |
| Priority | P1 |
| Preconditions | A valid MiniFrac / DFIT dataset has already been processed |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the processed MiniFrac / DFIT dataset. | Existing input and Clean Volume result are displayed. |
| 2 | Record the current Clean Volume value. | The original Clean Volume value is available for comparison. |
| 3 | Modify a calculation input such as rate or time using a valid test value. | The updated input value is accepted. |
| 4 | Recalculate the MiniFrac / DFIT analysis. | The application processes the updated input data. |
| 5 | Review the new Clean Volume result. | Clean Volume is recalculated using the updated input. |
| 6 | Compare the new result with the original value. | The Clean Volume result reflects the changed input according to the defined calculation logic. |

---

## Test Case 8 — Verify Clean Rate Calculation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-008 |
| Scenario | Verify that Clean Rate is calculated correctly from valid MiniFrac / DFIT data |
| Requirement ID | REQ-MF-005 |
| Test Type | Functional / Calculation |
| Priority | P1 |
| Preconditions | Valid MiniFrac / DFIT rate and related input data are available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the MiniFrac / DFIT analysis section. | The analysis page loads successfully. |
| 2 | Review the input data required for Clean Rate calculation. | Required calculation inputs are populated with valid values. |
| 3 | Trigger the analysis or Clean Rate calculation. | The application starts processing the calculation. |
| 4 | Wait for processing to complete. | The Clean Rate calculation completes without an error. |
| 5 | Review the Clean Rate result. | A Clean Rate value is displayed in the appropriate result area. |
| 6 | Compare the result with the expected synthetic calculation. | The displayed Clean Rate matches the expected result within the defined application precision. |

---

## Test Case 9 — Verify ISIP Plot Generation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-009 |
| Scenario | Verify that the ISIP plot is generated from a valid MiniFrac / DFIT dataset |
| Requirement ID | REQ-MF-006 |
| Test Type | Functional / Plot Validation |
| Priority | P1 |
| Preconditions | Valid pressure and time-series data is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open a valid MiniFrac / DFIT dataset. | The dataset and analysis options are displayed. |
| 2 | Navigate to the ISIP analysis option. | The ISIP analysis control is available. |
| 3 | Trigger ISIP plot generation. | The application starts processing the ISIP analysis. |
| 4 | Wait for plot generation to complete. | The ISIP plot is generated successfully. |
| 5 | Review the plot axes, data points, and labels. | The plot displays the applicable pressure/time information with readable labels and data. |
| 6 | Compare the displayed ISIP-related result with the expected synthetic dataset behavior. | The generated plot and result are consistent with the supplied test data. |

---

## Test Case 10 — Verify Square Root Plot Generation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-010 |
| Scenario | Verify that the Square Root plot is generated correctly from valid data |
| Requirement ID | REQ-MF-007 |
| Test Type | Functional / Plot Validation |
| Priority | P1 |
| Preconditions | Valid MiniFrac / DFIT time and pressure data is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the MiniFrac / DFIT analysis section for a valid dataset. | The analysis options are displayed. |
| 2 | Select the Square Root plot option. | The Square Root analysis option is selected. |
| 3 | Trigger the plot generation. | The application processes the selected dataset for Square Root analysis. |
| 4 | Wait for the analysis to complete. | The Square Root plot is generated successfully. |
| 5 | Review the plotted data and axes. | The plot contains the expected transformed data representation and readable labels. |
| 6 | Compare the displayed trend with the expected synthetic dataset. | The plot trend is consistent with the supplied input data and configured calculation logic. |

---

## Test Case 11 — Verify G-Function Plot Generation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-011 |
| Scenario | Verify that the G-Function plot is generated correctly |
| Requirement ID | REQ-MF-008 |
| Test Type | Functional / Plot Validation |
| Priority | P1 |
| Preconditions | Valid MiniFrac / DFIT pressure and time-series data is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the MiniFrac / DFIT analysis area. | The analysis controls are displayed. |
| 2 | Select the G-Function analysis option. | The G-Function analysis is selected. |
| 3 | Trigger G-Function plot generation. | The application begins G-Function processing. |
| 4 | Wait for the plot to render. | The G-Function plot is generated successfully. |
| 5 | Review the plotted values, axes, and labels. | The plot contains the applicable G-Function representation with readable information. |
| 6 | Compare the plot with the expected synthetic dataset behavior. | The generated plot is consistent with the supplied test data and configured calculation rules. |

---

## Test Case 12 — Verify Log-Log Plot Generation

| Field | Details |
|---|---|
| Test Case ID | TC-MF-012 |
| Scenario | Verify that the Log-Log plot is generated correctly |
| Requirement ID | REQ-MF-009 |
| Test Type | Functional / Plot Validation |
| Priority | P1 |
| Preconditions | Valid positive-valued MiniFrac / DFIT analysis data is available |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open the MiniFrac / DFIT analysis area with a valid dataset. | The analysis controls and dataset are displayed. |
| 2 | Select the Log-Log analysis option. | The Log-Log analysis is selected. |
| 3 | Trigger Log-Log plot generation. | The application starts processing the Log-Log transformation. |
| 4 | Wait for plot generation to complete. | The Log-Log plot is displayed successfully. |
| 5 | Review the plot axes and plotted data. | The axes and data representation use the expected logarithmic presentation. |
| 6 | Compare the plot against the expected synthetic dataset trend. | The displayed trend is consistent with the supplied valid input data. |

---

## Test Case 13 — Verify Analysis Results Persistence

| Field | Details |
|---|---|
| Test Case ID | TC-MF-013 |
| Scenario | Verify that processed MiniFrac / DFIT results remain available after navigation and refresh |
| Requirement ID | REQ-MF-010 |
| Test Type | Data Persistence / Regression |
| Priority | P1 |
| Preconditions | A valid MiniFrac / DFIT dataset has been processed successfully |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open a successfully processed MiniFrac / DFIT dataset. | Input data and calculated results are displayed. |
| 2 | Record the Clean Volume, Clean Rate, and applicable analysis results. | The processed values are available for comparison. |
| 3 | Navigate to another section of the selected well. | Navigation completes without losing the processed analysis. |
| 4 | Return to the MiniFrac / DFIT section. | The previously processed dataset is available. |
| 5 | Refresh the browser page. | The MiniFrac / DFIT section reloads successfully. |
| 6 | Compare the displayed results with the recorded values. | The persisted results remain consistent after navigation and refresh. |

---

## Test Case 14 — Verify MiniFrac / DFIT Data Association Between Wells

| Field | Details |
|---|---|
| Test Case ID | TC-MF-014 |
| Scenario | Verify that MiniFrac / DFIT analysis data remains associated with the correct well |
| Requirement ID | REQ-MF-010, REQ-DI-001, REQ-DI-003 |
| Test Type | Data Integrity / Regression |
| Priority | P1 |
| Preconditions | `WELL-1001` and `WELL-1002` contain different MiniFrac / DFIT datasets |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open MiniFrac / DFIT for `WELL-1001`. | The analysis data for `WELL-1001` is displayed. |
| 2 | Record a unique input or calculated value from `WELL-1001`. | The value is captured for comparison. |
| 3 | Switch to `WELL-1002`. | The active well context changes to `WELL-1002`. |
| 4 | Open MiniFrac / DFIT for `WELL-1002`. | The dataset associated with `WELL-1002` is displayed. |
| 5 | Compare the displayed values with the recorded `WELL-1001` value. | `WELL-1001` analysis data is not incorrectly displayed for `WELL-1002`. |
| 6 | Return to `WELL-1001`. | The original MiniFrac / DFIT dataset remains correctly associated with `WELL-1001`. |

---

## Test Case 15 — Verify MiniFrac / DFIT Processing Failure Handling

| Field | Details |
|---|---|
| Test Case ID | TC-MF-015 |
| Scenario | Verify that the application handles MiniFrac / DFIT processing failure without displaying misleading results |
| Requirement ID | REQ-MF-003, REQ-ERR-002 |
| Test Type | Negative / Error Handling |
| Priority | P2 |
| Preconditions | Test environment supports controlled simulation of a MiniFrac / DFIT processing failure |

| Step No. | Test Step | Expected Result |
|---:|---|---|
| 1 | Open MiniFrac / DFIT for a valid test well. | The MiniFrac / DFIT section loads successfully. |
| 2 | Enter or select a valid synthetic dataset for analysis. | The dataset is accepted by the application. |
| 3 | Simulate a controlled processing-service failure and trigger the analysis. | The application detects the processing failure. |
| 4 | Review the analysis response. | A meaningful error or failure state is displayed instead of fabricated or stale results being presented as new results. |
| 5 | Restore the processing service and retry the same valid analysis. | The application successfully starts the analysis after recovery. |
| 6 | Review the regenerated results and plots. | Valid Clean Volume, Clean Rate, and applicable analysis plots are generated from the supplied dataset. |

---

## Test Case Summary

| Test Case ID | Scenario | Type | Priority |
|---|---|---|---|
| TC-MF-001 | Verify MiniFrac / DFIT section access | Positive / Functional | P1 |
| TC-MF-002 | Verify MiniFrac / DFIT input data entry | Positive / Functional | P1 |
| TC-MF-003 | Verify required MiniFrac / DFIT input validation | Negative / Validation | P1 |
| TC-MF-004 | Verify numeric MiniFrac / DFIT input validation | Negative / Validation | P1 |
| TC-MF-005 | Verify MiniFrac / DFIT input range validation | Negative / Boundary | P1 |
| TC-MF-006 | Verify Clean Volume calculation | Functional / Calculation | P1 |
| TC-MF-007 | Verify Clean Volume changes with input data | Functional / Calculation | P1 |
| TC-MF-008 | Verify Clean Rate calculation | Functional / Calculation | P1 |
| TC-MF-009 | Verify ISIP plot generation | Functional / Plot Validation | P1 |
| TC-MF-010 | Verify Square Root plot generation | Functional / Plot Validation | P1 |
| TC-MF-011 | Verify G-Function plot generation | Functional / Plot Validation | P1 |
| TC-MF-012 | Verify Log-Log plot generation | Functional / Plot Validation | P1 |
| TC-MF-013 | Verify analysis results persistence | Data Persistence / Regression | P1 |
| TC-MF-014 | Verify MiniFrac / DFIT data association between wells | Data Integrity / Regression | P1 |
| TC-MF-015 | Verify MiniFrac / DFIT processing failure handling | Negative / Error Handling | P2 |
