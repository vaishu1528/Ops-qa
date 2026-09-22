# MiniFrac Test Cases

## Module: MiniFrac / DFIT Engineering Analysis

These test cases validate the fictional WellOps MiniFrac workflow, including input data, calculations, plots, engineering parameters, validation, and report generation.

> Note: All engineering values and scenarios in this document are fictional portfolio data and are not copied from any proprietary application.

---

| Test Case ID | Scenario | Preconditions | Test Steps | Expected Result | Priority |
|---|---|---|---|---|---|
| TC-MF-001 | Verify MiniFrac module loads successfully | User is logged in and a valid well exists | 1. Login to WellOps.<br>2. Select a valid well.<br>3. Navigate to MiniFrac.<br>4. Wait for the module to load.<br>5. Observe the page. | MiniFrac module loads successfully and displays the required engineering sections, inputs, controls, and plots. | High |
| TC-MF-002 | Verify valid MiniFrac input data can be entered | MiniFrac page is accessible | 1. Open MiniFrac.<br>2. Enter valid flow rate values.<br>3. Enter valid time and proppant concentration values.<br>4. Enter valid fluid and reservoir parameters.<br>5. Save the inputs. | Valid MiniFrac input data is accepted and saved successfully. | High |
| TC-MF-003 | Verify mandatory MiniFrac fields | MiniFrac input form is accessible | 1. Open MiniFrac input section.<br>2. Leave a mandatory field blank.<br>3. Enter valid values in other fields.<br>4. Click Calculate or Save.<br>5. Observe the validation behavior. | Required field validation is displayed and calculation/save is prevented until mandatory data is provided. | High |
| TC-MF-004 | Verify Clean Rate calculation | Valid Flow Rate and Proppant Concentration data is available | 1. Enter valid Flow Rate.<br>2. Enter valid Proppant Concentration.<br>3. Enter valid Proppant Specific Gravity.<br>4. Trigger the calculation.<br>5. Compare the displayed Clean Rate with the expected formula result. | Clean Rate is calculated correctly according to the configured engineering calculation. | High |
| TC-MF-005 | Verify Clean Volume calculation | Valid time and Clean Rate data is available | 1. Enter valid treatment time.<br>2. Enter valid Clean Rate 1.<br>3. Enter valid Clean Rate 2 where applicable.<br>4. Trigger the calculation.<br>5. Verify the displayed Clean Volume. | Clean Volume is calculated correctly and displayed with the expected unit. | High |
| TC-MF-006 | Verify Step Slurry calculation | Valid treatment time and flow rate data is available | 1. Enter valid treatment time.<br>2. Enter Flow Rate 1.<br>3. Enter Flow Rate 2.<br>4. Trigger the calculation.<br>5. Verify the calculated Step Slurry value. | Step Slurry is calculated correctly according to the defined calculation rule and displayed in the expected unit. | High |
| TC-MF-007 | Verify rho calculation for proppant/fluid data | Specific gravity value is available | 1. Enter a valid specific gravity value.<br>2. Trigger the calculation.<br>3. Observe the calculated rho value.<br>4. Compare it with the expected formula result.<br>5. Verify the displayed unit. | Rho is calculated correctly using the configured specific gravity conversion. | High |
| TC-MF-008 | Verify MiniFrac calculation with two flow rates | Valid Flow Rate 1 and Flow Rate 2 are available | 1. Enter different valid Flow Rate 1 and Flow Rate 2 values.<br>2. Enter valid treatment time.<br>3. Enter required fluid parameters.<br>4. Run the calculation.<br>5. Verify the calculated results. | Calculations correctly use both flow rates according to the defined engineering formulas. | High |
| TC-MF-009 | Verify zero flow rate validation | MiniFrac input form is accessible | 1. Open MiniFrac inputs.<br>2. Enter zero as Flow Rate.<br>3. Enter valid remaining parameters.<br>4. Trigger calculation.<br>5. Observe the validation result. | Application handles zero Flow Rate according to business rules and prevents invalid engineering calculations when required. | High |
| TC-MF-010 | Verify negative flow rate validation | MiniFrac input form is accessible | 1. Open MiniFrac inputs.<br>2. Enter a negative Flow Rate.<br>3. Enter valid remaining parameters.<br>4. Trigger calculation.<br>5. Observe the result. | Negative Flow Rate is rejected when it is outside the permitted engineering range. | High |
| TC-MF-011 | Verify ISIP plot generation | Valid MiniFrac pressure/time data is available | 1. Enter valid pressure and time data.<br>2. Run the MiniFrac calculation.<br>3. Navigate to the ISIP Plot.<br>4. Observe the plotted data.<br>5. Compare the plot with the input dataset. | ISIP Plot is generated successfully and represents the supplied pressure/time data correctly. | High |
| TC-MF-012 | Verify SQRT plot generation | Valid MiniFrac data is available | 1. Enter valid MiniFrac data.<br>2. Run the calculation.<br>3. Open the SQRT Plot.<br>4. Review the plotted values.<br>5. Verify the plot corresponds to the calculated dataset. | SQRT Plot is generated correctly using the available MiniFrac data. | High |
| TC-MF-013 | Verify G-Function plot generation | Valid pump-time and closure-time data is available | 1. Enter valid pump-time information.<br>2. Enter valid DIM Time values.<br>3. Run the MiniFrac calculation.<br>4. Open the G-Function Plot.<br>5. Verify the calculated plot values. | G-Function values and plot are generated according to the configured G-Function calculation. | High |
| TC-MF-014 | Verify Log-Log plot generation | Valid MiniFrac dataset is available | 1. Enter valid pressure/time data.<br>2. Run the calculation.<br>3. Navigate to the Log-Log Plot.<br>4. Observe the graph.<br>5. Compare the plotted data with the source dataset. | Log-Log Plot is generated successfully and represents the available data correctly. | High |
| TC-MF-015 | Verify Pump Time calculation | Valid Start Pump Clock and End Pump Clock values exist | 1. Enter Start Pump Clock.<br>2. Enter End Pump Clock.<br>3. Trigger the calculation.<br>4. Review the Pump Time value.<br>5. Compare it with the expected time difference. | Pump Time equals the difference between End Pump Clock and Start Pump Clock. | High |
| TC-MF-016 | Verify Closure Time calculation | Valid Pump Time and DIM Time are available | 1. Enter valid Pump Time.<br>2. Enter valid DIM Time.<br>3. Trigger the calculation.<br>4. Review Closure Time.<br>5. Compare it with the expected calculation. | Closure Time is calculated correctly according to the configured engineering formula. | High |
| TC-MF-017 | Verify G-Function calculation | Valid DIM Time is available | 1. Enter a valid DIM Time.<br>2. Trigger the G-Function calculation.<br>3. Review the G(TD) value.<br>4. Compare it with the expected formula result.<br>5. Verify the plotted value. | G(TD) is calculated correctly and the corresponding plot value is generated consistently. | High |
| TC-MF-018 | Verify engineering parameter validation | MiniFrac engineering inputs are accessible | 1. Open the engineering parameter section.<br>2. Enter valid parameter values.<br>3. Enter an out-of-range value.<br>4. Trigger calculation.<br>5. Observe the validation response. | Values outside the configured engineering range are rejected or appropriately validated. | High |
| TC-MF-019 | Verify calculation results update after input changes | Initial MiniFrac calculation is completed | 1. Enter valid input data.<br>2. Run the calculation.<br>3. Modify one calculation input.<br>4. Run the calculation again.<br>5. Compare the updated result with the previous result. | Calculation results are recalculated and reflect the latest input values without retaining stale results. | High |
| TC-MF-020 | Verify calculation results persist after saving | Valid MiniFrac calculation is completed | 1. Enter valid MiniFrac data.<br>2. Run the calculation.<br>3. Save the results.<br>4. Refresh or reopen the MiniFrac module.<br>5. Verify the saved results. | Saved MiniFrac inputs and results persist correctly after reopening the module. | High |
| TC-MF-021 | Verify editing MiniFrac input data | Existing MiniFrac data is available | 1. Open an existing MiniFrac dataset.<br>2. Select an editable input.<br>3. Modify the value with valid data.<br>4. Save or recalculate.<br>5. Review the results. | Updated input is saved and dependent calculations are recalculated correctly. | High |
| TC-MF-022 | Verify Cancel operation discards MiniFrac changes | Existing MiniFrac data is available | 1. Open existing MiniFrac data.<br>2. Modify one or more inputs.<br>3. Click Cancel or navigate away without saving.<br>4. Reopen the MiniFrac dataset.<br>5. Verify the original values. | Unsaved MiniFrac changes are discarded and the previously saved values remain unchanged. | Medium |
| TC-MF-023 | Verify API calculation values match UI values | MiniFrac API integration is available | 1. Enter valid MiniFrac input data.<br>2. Execute the calculation through the UI.<br>3. Retrieve the corresponding calculation response through the API.<br>4. Compare key calculated values.<br>5. Verify the results. | UI calculation values match the corresponding API response values within the defined precision and rounding rules. | High |
| TC-MF-024 | Verify slope and tangent values are displayed correctly | Valid MiniFrac plot data exists | 1. Generate the applicable MiniFrac plot.<br>2. Calculate or retrieve slope and tangent values.<br>3. Review the displayed engineering values.<br>4. Compare them with the source calculation/API response.<br>5. Verify consistency. | Slope and tangent values are displayed correctly and match the applicable calculation or API response. | High |
| TC-MF-025 | Verify MiniFrac report generation | Valid MiniFrac calculation is completed | 1. Complete a valid MiniFrac analysis.<br>2. Open the Reports option.<br>3. Select MiniFrac report.<br>4. Generate the report.<br>5. Review the generated report. | MiniFrac report is generated successfully and contains the expected inputs, calculations, plots, and engineering results. | High |
| TC-MF-026 | Verify MiniFrac data remains associated with the selected well | Multiple wells exist | 1. Open MiniFrac for `WELL-1001`.<br>2. Verify its MiniFrac data.<br>3. Navigate back to Well Management.<br>4. Select `WELL-1002`.<br>5. Open MiniFrac. | MiniFrac data displayed for each well belongs only to the selected well. | High |
| TC-MF-027 | Verify MiniFrac UI controls and labels | MiniFrac page is accessible | 1. Open MiniFrac.<br>2. Verify input field labels.<br>3. Verify buttons and controls.<br>4. Verify units and section headers.<br>5. Verify plot controls. | Required MiniFrac UI elements are visible, correctly labeled, aligned, and usable. | Medium |
| TC-MF-028 | Verify MiniFrac behavior with large valid dataset | Large synthetic dataset is available | 1. Load a large valid MiniFrac dataset.<br>2. Start the analysis.<br>3. Wait for calculation completion.<br>4. Review the plots and results.<br>5. Verify application responsiveness and data completeness. | Application processes the large dataset successfully without data loss, incorrect calculations, or unexpected UI failures. | Medium |
| TC-MF-029 | Verify MiniFrac error handling for incomplete dataset | Incomplete MiniFrac dataset is available | 1. Load incomplete MiniFrac data.<br>2. Attempt to run the analysis.<br>3. Observe validation or error behavior.<br>4. Review displayed messages.<br>5. Verify that invalid results are not presented as valid results. | Application identifies incomplete data and provides appropriate feedback without generating misleading engineering results. | High |
| TC-MF-030 | Verify end-to-end MiniFrac workflow | Valid well and MiniFrac test data are available | 1. Select a valid well.<br>2. Enter or load MiniFrac data.<br>3. Execute calculations and review plots.<br>4. Validate engineering results and save the analysis.<br>5. Generate the MiniFrac report. | Complete MiniFrac workflow executes successfully from data entry through calculation, plot validation, saving, and report generation. | High |

---

## Test Coverage

The MiniFrac test cases cover:

- Functional Testing
- Positive Testing
- Negative Testing
- UI Testing
- Engineering Calculation Validation
- Boundary Value Testing
- Data Validation
- Plot Validation
- API/UI Integration Testing
- Data Persistence
- Error Handling
- Regression Testing
- Report Validation
- End-to-End Testing
- Large Dataset Validation
