# Test Data

## 1. Document Overview

| Item | Details |
|---|---|
| Document | Test Data |
| Application Type | Web-Based Oil & Gas Well Operations Management System |
| Testing Purpose | Functional, Integration, Regression and End-to-End Testing |
| User Roles | Admin, Data Engineer, Field Engineer, Analyst |
| Data Type | Synthetic / Sanitized |
| Environment | QA / Test |
| Version | 1.0 |

---

## 2. Test Data Purpose

This document defines the controlled test data required to execute manual testing for the application.

The test data is designed to support:

- Authentication testing.
- Role-based access testing.
- Pad and well management.
- Well information validation.
- Location validation.
- Channel input validation.
- Wellbore configuration.
- Heat transfer parameters.
- Reservoir parameters.
- Material selection.
- Treatment schedule.
- Engineering analysis.
- MiniFrac / DFIT analysis.
- Version management.
- Comments.
- Results validation.
- Report generation.
- Positive testing.
- Negative testing.
- Boundary testing.
- Integration testing.
- Regression testing.
- End-to-end testing.

All values in this document are fictional and created specifically for portfolio testing.

---

## 3. Test User Accounts

| User ID | Username | Role | Status | Purpose |
|---|---|---|---|---|
| USR-001 | admin.demo | Admin | Active | Administrative and full-access validation |
| USR-002 | data.engineer.demo | Data Engineer | Active | Technical data and configuration validation |
| USR-003 | field.engineer.demo | Field Engineer | Active | Field and treatment workflow validation |
| USR-004 | analyst.demo | Analyst | Active | Analysis, results and reporting validation |
| USR-005 | inactive.demo | Data Engineer | Inactive | Inactive-user validation |
| USR-006 | restricted.demo | Analyst | Active | Restricted-access validation |

For portfolio safety, passwords and authentication secrets are intentionally not stored in this document.

Test credentials shall be maintained separately in a secure test environment.

---

## 4. User Role Permission Matrix

| Functionality | Admin | Data Engineer | Field Engineer | Analyst |
|---|---|---|---|---|
| Login | Yes | Yes | Yes | Yes |
| Dashboard | Yes | Yes | Yes | Yes |
| View Pads | Yes | Yes | Yes | Yes |
| View Wells | Yes | Yes | Yes | Yes |
| Search Wells | Yes | Yes | Yes | Yes |
| General Information | Full | Edit | View/Edit as permitted | View |
| Location | Full | Edit | View/Edit as permitted | View |
| Channel Inputs | Full | Edit | View | View |
| Wellbore Configuration | Full | Edit | View | View |
| Heat Transfer Parameters | Full | Edit | View | View |
| Reservoir Parameters | Full | Edit | View | View |
| Material Selection | Full | Edit | Edit as permitted | View |
| Treatment Schedule | Full | Edit as permitted | Edit | View |
| Engineering Analysis | Full | Edit | View/Execute as permitted | Execute/Review |
| MiniFrac / DFIT | Full | Edit/Execute | View | Execute/Review |
| Results | Full | View/Review | View/Review | View/Review |
| Reports | Full | Generate/View | Generate/View as permitted | Generate/View |
| Comments | Full | Add/View | Add/View | Add/View |
| Version Management | Full | Manage as permitted | View | View |
| User Management | Full | No | No | No |

---

## 5. Pad Test Data

| Pad ID | Pad Name | Field Name | Region | Status |
|---|---|---|---|---|
| PAD-001 | Falcon North Pad | Falcon Field | North | Active |
| PAD-002 | Falcon Central Pad | Falcon Field | Central | Active |
| PAD-003 | Horizon East Pad | Horizon Field | East | Active |
| PAD-004 | Horizon West Pad | Horizon Field | West | Inactive |
| PAD-005 | Summit Test Pad | Summit Field | South | Active |

---

## 6. Well Master Test Data

| Well ID | Well Name | Pad ID | Well Type | Status | API Identifier |
|---|---|---|---|---|---|
| WELL-1001 | Falcon-A01 | PAD-001 | Horizontal | Active | DEMO-1001 |
| WELL-1002 | Falcon-A02 | PAD-001 | Horizontal | Active | DEMO-1002 |
| WELL-1003 | Falcon-B01 | PAD-002 | Vertical | Active | DEMO-1003 |
| WELL-1004 | Falcon-B02 | PAD-002 | Directional | Active | DEMO-1004 |
| WELL-1005 | Horizon-C01 | PAD-003 | Horizontal | Active | DEMO-1005 |
| WELL-1006 | Horizon-C02 | PAD-003 | Vertical | Inactive | DEMO-1006 |
| WELL-1007 | Summit-D01 | PAD-005 | Horizontal | Active | DEMO-1007 |

---

## 7. Well Search Test Data

| Search Input | Expected Matching Data | Purpose |
|---|---|---|
| Falcon-A01 | WELL-1001 | Exact well-name search |
| Falcon | WELL-1001, WELL-1002, WELL-1003, WELL-1004 | Partial search |
| Horizon | WELL-1005, WELL-1006 | Field/name search |
| WELL-1005 | Horizon-C01 | Well ID search |
| DEMO-1004 | Falcon-B02 | API identifier search |
| NonExistingWell | No records | No-result validation |
| Empty search | Default well list | Empty search validation |
| Lowercase falcon | Applicable Falcon records | Case-handling validation |
| Special characters | No invalid records | Invalid search validation |

---

## 8. General Well Information

| Field | WELL-1001 | WELL-1002 | WELL-1003 |
|---|---|---|---|
| Pad Name | Falcon North Pad | Falcon North Pad | Falcon Central Pad |
| Field Name | Falcon Field | Falcon Field | Falcon Field |
| Well Name | Falcon-A01 | Falcon-A02 | Falcon-B01 |
| Well Identifier | DEMO-1001 | DEMO-1002 | DEMO-1003 |
| Company Name | Northstar Energy Demo | Northstar Energy Demo | Northstar Energy Demo |
| Company Representative | Alex Morgan | Jordan Lee | Taylor Brooks |
| Service Company | GeoServe Demo | GeoServe Demo | WellTech Demo |
| Service Company Representative | Chris Stone | Morgan Reed | Jamie Carter |
| Treatment Analyst | Riley Adams | Casey Brown | Avery Wilson |

---

## 9. General Information Negative Data

| Data Condition | Test Value | Expected Validation |
|---|---|---|
| Empty Well Name | Blank | Required-field validation |
| Empty Field Name | Blank | Required-field validation |
| Empty Well Identifier | Blank | Required-field validation |
| Invalid identifier | ###INVALID### | Format validation |
| Excessive text | 300-character string | Length validation |
| Whitespace-only value | Spaces | Required-field validation |
| Duplicate identifier | DEMO-1001 | Duplicate validation |
| Unsupported characters | @@## | Format validation |

---

## 10. Location Test Data

| Well ID | Surface Latitude | Surface Longitude | Elevation | Location Status |
|---|---:|---:|---:|---|
| WELL-1001 | 35.214500 | -101.845200 | 3245.50 | Valid |
| WELL-1002 | 35.215100 | -101.846000 | 3248.25 | Valid |
| WELL-1003 | 35.216200 | -101.850100 | 3198.75 | Valid |
| WELL-1004 | 35.217300 | -101.851500 | 3210.00 | Valid |
| WELL-1005 | 35.401200 | -102.110500 | 3305.40 | Valid |

---

## 11. Location Boundary and Negative Data

| Field | Test Value | Validation Purpose |
|---|---|---|
| Latitude | 90.000000 | Upper valid boundary |
| Latitude | -90.000000 | Lower valid boundary |
| Latitude | 90.000001 | Above valid boundary |
| Latitude | -90.000001 | Below valid boundary |
| Longitude | 180.000000 | Upper valid boundary |
| Longitude | -180.000000 | Lower valid boundary |
| Longitude | 180.000001 | Above valid boundary |
| Longitude | -180.000001 | Below valid boundary |
| Latitude | ABC | Invalid numeric value |
| Longitude | XYZ | Invalid numeric value |

---

## 12. Channel Input Test Data

| Channel ID | Channel Name | Unit | Sample Value | Status |
|---|---|---|---:|---|
| CH-001 | Pressure | psi | 4500.50 | Valid |
| CH-002 | Temperature | degF | 185.25 | Valid |
| CH-003 | Flow Rate | bpm | 42.75 | Valid |
| CH-004 | Surface Pressure | psi | 3750.00 | Valid |
| CH-005 | Treatment Rate | bpm | 35.50 | Valid |

---

## 13. Channel Negative and Boundary Data

| Channel | Test Value | Purpose |
|---|---:|---|
| Pressure | 0 | Boundary validation |
| Pressure | -1 | Negative validation |
| Pressure | 999999 | Upper-range validation |
| Temperature | -459.67 | Lower physical boundary reference |
| Temperature | -500 | Invalid lower value |
| Flow Rate | 0 | Zero-value validation |
| Flow Rate | -10 | Negative-value validation |
| Flow Rate | ABC | Non-numeric validation |
| Treatment Rate | 999999 | Upper-range validation |

---

## 14. Wellbore Configuration Test Data

| Record ID | Well ID | Component | Size | Length | Depth | Status |
|---|---|---|---:|---:|---:|---|
| WB-001 | WELL-1001 | Surface Casing | 13.375 | 2500 | 2500 | Valid |
| WB-002 | WELL-1001 | Intermediate Casing | 9.625 | 6200 | 6200 | Valid |
| WB-003 | WELL-1001 | Production Casing | 5.500 | 9800 | 9800 | Valid |
| WB-004 | WELL-1002 | Surface Casing | 13.375 | 2450 | 2450 | Valid |
| WB-005 | WELL-1002 | Production Casing | 5.500 | 9600 | 9600 | Valid |

---

## 15. Wellbore Negative Data

| Condition | Test Value | Expected Purpose |
|---|---|---|
| Negative size | -5.5 | Numeric validation |
| Negative length | -100 | Range validation |
| Negative depth | -50 | Range validation |
| Zero size | 0 | Boundary validation |
| Non-numeric size | ABC | Data type validation |
| Depth greater than configured limit | 999999 | Range validation |
| Invalid component | Unknown Component | Selection validation |
| Incorrect sequence | Production before Surface | Sequence validation |

---

## 16. Heat Transfer Parameter Data

| Well ID | Parameter | Value | Unit |
|---|---|---:|---|
| WELL-1001 | Surface Temperature | 75.5 | degF |
| WELL-1001 | Bottomhole Temperature | 210.5 | degF |
| WELL-1001 | Thermal Conductivity | 1.85 | W/mK |
| WELL-1002 | Surface Temperature | 72.0 | degF |
| WELL-1002 | Bottomhole Temperature | 205.0 | degF |
| WELL-1003 | Surface Temperature | 68.5 | degF |

---

## 17. Reservoir Parameter Data

| Well ID | Parameter | Value | Unit |
|---|---|---:|---|
| WELL-1001 | Reservoir Pressure | 4200 | psi |
| WELL-1001 | Reservoir Temperature | 195 | degF |
| WELL-1001 | Porosity | 8.5 | % |
| WELL-1001 | Permeability | 0.085 | md |
| WELL-1002 | Reservoir Pressure | 4050 | psi |
| WELL-1002 | Reservoir Temperature | 188 | degF |
| WELL-1002 | Porosity | 9.2 | % |
| WELL-1002 | Permeability | 0.095 | md |

---

## 18. Material Selection Data

| Material ID | Material Name | Category | Density | Status |
|---|---|---|---:|---|
| MAT-001 | Demo Fluid A | Fluid | 8.40 | Active |
| MAT-002 | Demo Fluid B | Fluid | 8.65 | Active |
| MAT-003 | Demo Additive A | Additive | 2.10 | Active |
| MAT-004 | Demo Proppant A | Proppant | 165.00 | Active |
| MAT-005 | Demo Material X | Test Material | 10.25 | Inactive |

---

## 19. Treatment Schedule Data

| Stage ID | Well ID | Stage Name | Planned Volume | Planned Rate | Duration | Status |
|---|---|---|---:|---:|---:|---|
| STG-001 | WELL-1001 | Stage 01 | 5000 | 35 | 20 | Planned |
| STG-002 | WELL-1001 | Stage 02 | 6500 | 40 | 25 | Planned |
| STG-003 | WELL-1001 | Stage 03 | 7200 | 42 | 28 | Planned |
| STG-004 | WELL-1002 | Stage 01 | 4500 | 32 | 18 | Planned |
| STG-005 | WELL-1002 | Stage 02 | 5800 | 38 | 23 | Planned |

---

## 20. Treatment Actual Data

| Stage ID | Actual Volume | Actual Rate | Actual Duration | Status |
|---|---:|---:|---:|---|
| STG-001 | 4985 | 34.8 | 20 | Completed |
| STG-002 | 6510 | 40.2 | 26 | Completed |
| STG-003 | 7180 | 41.7 | 28 | Completed |
| STG-004 | 4525 | 32.4 | 18 | Completed |
| STG-005 | 5775 | 37.6 | 24 | Completed |

---

## 21. Treatment Negative Data

| Condition | Test Value | Validation Purpose |
|---|---|---|
| Negative volume | -500 | Negative validation |
| Negative rate | -10 | Negative validation |
| Negative duration | -5 | Negative validation |
| Zero volume | 0 | Boundary validation |
| Zero rate | 0 | Boundary validation |
| Excessive rate | 999999 | Range validation |
| Non-numeric volume | ABC | Data type validation |
| Missing stage name | Blank | Required-field validation |

---

## 22. MiniFrac / DFIT Input Data

| Data Point | Value | Unit |
|---|---:|---|
| Initial Pressure | 4200 | psi |
| Final Pressure | 3050 | psi |
| Initial Rate | 35 | bpm |
| Final Rate | 0 | bpm |
| Pumping Time | 30 | min |
| Shut-In Time | 60 | min |
| Initial Volume | 0 | bbl |
| Injected Volume | 1050 | bbl |
| Fluid Density | 8.40 | ppg |
| Reservoir Temperature | 195 | degF |

---

## 23. MiniFrac / DFIT Validation Data

| Scenario | Input Condition | Expected Testing Purpose |
|---|---|---|
| MF-DATA-001 | Complete valid dataset | Standard analysis |
| MF-DATA-002 | Missing initial pressure | Mandatory validation |
| MF-DATA-003 | Missing injected volume | Mandatory validation |
| MF-DATA-004 | Negative pressure | Range validation |
| MF-DATA-005 | Negative volume | Range validation |
| MF-DATA-006 | Zero pumping time | Boundary validation |
| MF-DATA-007 | Zero shut-in time | Boundary validation |
| MF-DATA-008 | Non-numeric pressure | Data type validation |
| MF-DATA-009 | Non-numeric volume | Data type validation |
| MF-DATA-010 | Maximum supported values | Boundary validation |

---

## 24. Analysis Expected Result Data

| Analysis | Test Dataset | Expected Validation |
|---|---|---|
| Clean Volume | MF-DATA-001 | Calculated value generated from valid inputs |
| Clean Rate | MF-DATA-001 | Calculated rate generated from valid inputs |
| ISIP | MF-DATA-001 | ISIP result displayed |
| Square Root | MF-DATA-001 | Plot generated successfully |
| G-Function | MF-DATA-001 | G-Function plot generated successfully |
| Log-Log | MF-DATA-001 | Log-Log plot generated successfully |
| Recalculation | Modified valid dataset | Dependent results updated |
| Invalid analysis | MF-DATA-003 | Analysis prevented with validation |

---

## 25. Version Test Data

| Well ID | Version | Status | Purpose |
|---|---|---|---|
| WELL-1001 | V1 | Active | Initial version |
| WELL-1001 | V2 | Active | Updated version |
| WELL-1001 | V3 | Draft | Version editing |
| WELL-1002 | V1 | Active | Initial version |
| WELL-1002 | V2 | Archived | Historical version |

---

## 26. Version Validation Scenarios

| Scenario | Version | Validation |
|---|---|---|
| VER-001 | V1 | Verify initial data |
| VER-002 | V2 | Verify updated data |
| VER-003 | V3 | Verify draft data |
| VER-004 | V1 after V2 | Verify historical data remains unchanged |
| VER-005 | V2 after V3 | Verify version-specific data |
| VER-006 | Invalid version | Verify appropriate handling |

---

## 27. Comments Test Data

| Comment ID | Well ID | User Role | Comment |
|---|---|---|---|
| COM-001 | WELL-1001 | Data Engineer | Wellbore data reviewed successfully. |
| COM-002 | WELL-1001 | Field Engineer | Treatment stage information verified. |
| COM-003 | WELL-1001 | Analyst | Analysis inputs reviewed. |
| COM-004 | WELL-1002 | Admin | Record updated for validation. |
| COM-005 | WELL-1003 | Analyst | Analysis result requires review. |

---

## 28. Comments Negative Data

| Condition | Test Value | Expected Purpose |
|---|---|---|
| Empty comment | Blank | Required validation |
| Spaces only | Spaces | Empty-value validation |
| Maximum-length comment | Supported maximum | Boundary validation |
| Excessive comment | Above maximum | Length validation |
| Special characters | @#$%^&* | Character handling |
| Script-like text | Sanitized test string | Input security validation |

---

## 29. Report Test Data

| Report ID | Report Type | Well | Version | Status |
|---|---|---|---|---|
| REP-001 | Well Summary | WELL-1001 | V2 | Available |
| REP-002 | Treatment Summary | WELL-1001 | V2 | Available |
| REP-003 | Engineering Analysis | WELL-1001 | V2 | Available |
| REP-004 | MiniFrac Analysis | WELL-1001 | V2 | Available |
| REP-005 | Well Summary | WELL-1002 | V1 | Available |
| REP-006 | Complete Well Report | WELL-1001 | V2 | Available |

---

## 30. Report Validation Data

| Report Scenario | Input | Expected Validation |
|---|---|---|
| REP-VAL-001 | Valid well and version | Correct report generated |
| REP-VAL-002 | Valid analysis data | Analysis report contains applicable results |
| REP-VAL-003 | Valid treatment data | Treatment information appears correctly |
| REP-VAL-004 | Different well | Report contains selected well information |
| REP-VAL-005 | Historical version | Report reflects selected version |
| REP-VAL-006 | Missing data | Appropriate report handling |
| REP-VAL-007 | Download request | File downloaded successfully |
| REP-VAL-008 | Downloaded file | File opens and contains expected information |

---

## 31. Boundary Test Data

| Data Type | Lower Boundary | Valid Lower | Valid Upper | Upper Boundary |
|---|---:|---:|---:|---:|
| Pressure | -1 | 0 | 10000 | 10001 |
| Volume | -1 | 0 | 100000 | 100001 |
| Rate | -1 | 0 | 500 | 501 |
| Duration | -1 | 0 | 1440 | 1441 |
| Percentage | -1 | 0 | 100 | 101 |
| Latitude | -90.000001 | -90 | 90 | 90.000001 |
| Longitude | -180.000001 | -180 | 180 | 180.000001 |

The exact acceptable boundary values shall follow the application's configured business rules.

---

## 32. Invalid Data Set

The following invalid data conditions will be used for negative testing:

- Blank mandatory fields.
- Whitespace-only fields.
- Negative numeric values where unsupported.
- Values exceeding configured limits.
- Invalid decimal values.
- Alphabetic values in numeric fields.
- Unsupported special characters.
- Duplicate identifiers.
- Invalid dates.
- Invalid record sequences.
- Invalid version references.
- Unauthorized user actions.
- Invalid analysis inputs.
- Missing dependent data.

---

## 33. Role-Based Test Data Mapping

| Test Area | Admin | Data Engineer | Field Engineer | Analyst |
|---|---|---|---|---|
| Authentication | USR-001 | USR-002 | USR-003 | USR-004 |
| Well Information | Full access | Edit | Permitted access | View |
| Wellbore | Full access | Edit | View | View |
| Engineering | Full access | Edit | View | Review |
| Treatment | Full access | Permitted | Edit | View |
| Analysis | Full access | Execute | Permitted | Execute/Review |
| Reports | Full access | Generate/View | Generate/View | Generate/View |
| Comments | Full access | Add/View | Add/View | Add/View |
| Version | Full access | Permitted | View | View |

---

## 34. Integration Test Data Flow

The following data flow will be used for end-to-end and integration testing:

Well ID → Well Information → Location → Channel Inputs → Wellbore Configuration → Heat Transfer Parameters → Reservoir Parameters → Material Selection → Treatment Schedule → Engineering Analysis → MiniFrac / DFIT → Results → Report

The same well identifier will be retained across applicable test stages to validate data association and integrity.

Primary integration dataset:

- Well ID: WELL-1001
- Pad: PAD-001
- Version: V2
- Material: MAT-001
- Treatment Stages: STG-001, STG-002, STG-003
- Analysis Dataset: MF-DATA-001
- Report: REP-006

---

## 35. Regression Test Data

The following records will be prioritized for regression testing:

| Regression Area | Primary Data |
|---|---|
| Login | USR-001 to USR-004 |
| Well Search | WELL-1001 to WELL-1007 |
| Well Information | WELL-1001 |
| Wellbore | WB-001 to WB-005 |
| Engineering | WELL-1001 |
| Treatment | STG-001 to STG-005 |
| MiniFrac | MF-DATA-001 |
| Version | WELL-1001 V1-V3 |
| Comments | COM-001 to COM-005 |
| Reports | REP-001 to REP-006 |
| RBAC | All four active roles |

---

## 36. Test Data Reset Strategy

Test data will be restored or recreated when required to maintain consistent execution.

Data reset may be required after:

- Create/update scenarios.
- Delete scenarios where applicable.
- Negative testing.
- Role-based testing.
- Calculation testing.
- Version testing.
- Treatment modifications.
- Regression execution.

Baseline records will be maintained for repeatable regression execution.

---

## 37. Test Data Security

The portfolio test data shall not contain:

- Real usernames.
- Real passwords.
- API keys.
- Authentication tokens.
- Customer information.
- Production well information.
- Production URLs.
- Internal database information.
- Confidential operational information.
- Company-specific credentials.

All values in this document are synthetic demonstration data.

---

## 38. Test Data Maintenance

Test data shall be reviewed when:

- New functionality is introduced.
- Requirements change.
- New validation rules are added.
- New roles are introduced.
- Existing fields change.
- Engineering calculations change.
- Treatment workflows change.
- Analysis functionality changes.
- Reports are modified.

Obsolete data shall be removed or replaced with valid synthetic data where required.

---

## 39. Test Data Coverage

The test data is designed to provide coverage for:

- Four application roles.
- Multiple pads.
- Multiple wells.
- Active and inactive wells.
- Multiple well types.
- Valid and invalid inputs.
- Boundary conditions.
- Engineering parameters.
- Treatment stages.
- Analysis datasets.
- Multiple versions.
- Comments.
- Reports.
- Positive scenarios.
- Negative scenarios.
- Integration scenarios.
- Regression scenarios.


No real customer data, production information, company credentials, internal URLs, proprietary datasets, confidential engineering information, or sensitive project information is included.
