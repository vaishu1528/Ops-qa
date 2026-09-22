# Test Plan

## 1. Document Information

| Attribute | Details |
|---|---|
| Project | WellOps |
| Application | Oil & Gas Well Operations Management System |
| Document | Test Plan |
| Testing Type | Manual Testing |
| Environment | QA / Test Environment |
| Status | Draft |

---

# 2. Objective

The objective of this Test Plan is to define the testing approach, scope, resources, test environment, risks, and exit criteria for validating the WellOps application.

The testing activities are intended to verify that the application meets defined functional requirements and provides reliable, consistent, and usable functionality for authorized users.

---

# 3. Application Overview

WellOps is a fictional web-based Oil & Gas application used to manage:

- Well information
- Wellbore configuration
- Directional survey data
- Treatment information
- Engineering analysis
- Operational reports

The application supports different user roles with role-based access to application functionality.

---

# 4. Testing Scope

## 4.1 In Scope

The following areas are included in testing:

### Authentication

- User login
- Invalid login
- Mandatory field validation
- Logout
- Role-based access

### Well Management

- Create well
- Search well
- Filter wells
- View well
- Update well
- Activate/deactivate well
- Duplicate Well ID validation

### Well Information

- General information
- Field validation
- Mandatory fields
- Save and retrieve data

### Wellbore

- Casing information
- Tubing information
- Depth validation
- Data persistence

### Directional Survey

- Survey data entry
- Numeric validation
- Required field validation
- Data persistence

### Treatment Management

- Treatment schedule
- Design data
- Actual data
- Treatment totals
- Validation

### Engineering

- Engineering parameters
- Analysis inputs
- Analysis execution
- Results validation

### Reports

- Well report
- Treatment report
- Engineering report
- Report data consistency

---

# 5. Testing Types

The following testing types will be performed.

## Functional Testing

Verify that application functionality behaves according to defined requirements.

## Positive Testing

Verify that valid inputs produce expected results.

## Negative Testing

Verify that invalid inputs are handled correctly.

## UI Testing

Validate:

- Labels
- Fields
- Buttons
- Tables
- Navigation
- Messages
- Alignment
- Visibility

## Integration Testing

Validate data flow between related application modules.

Example:

Well Management → Treatment → Engineering → Reports

## Regression Testing

Verify that existing functionality continues to work after application changes.

## Boundary Testing

Validate minimum, maximum, and boundary input values.

## Role-Based Access Testing

Verify that users can access only the functionality permitted for their assigned roles.

## Data Validation

Verify consistency between entered, saved, retrieved, calculated, and displayed data.

## End-to-End Testing

Validate complete business workflows from login through report generation.

---

# 6. Testing Approach

Testing will follow a risk-based and requirement-driven approach.

The general workflow will be:

```text
Requirement Analysis
        ↓
Test Planning
        ↓
Test Case Design
        ↓
Test Data Preparation
        ↓
Test Execution
        ↓
Defect Logging
        ↓
Defect Retesting
        ↓
Regression Testing
        ↓
Test Summary

7. Test Environment

The fictional QA environment will contain:

Component	Details
Application	WellOps Web Application
Environment	QA
Browser	Google Chrome
Operating System	Windows
Test Data	Synthetic / Demo Data
User Types	Admin, Engineer, Operations, Viewer

No production data or confidential information will be used.
8 . Test Data
| Field     | Example     |
| --------- | ----------- |
| Well ID   | WELL-1001   |
| Well Name | Alpha-01    |
| Field     | Demo Field  |
| Operator  | Demo Energy |
| Status    | Active      |
| Well Type | Horizontal  |

9. Entry Criteria

Testing can begin when:

Requirements are available and reviewed.
Test environment is accessible.
Required application build is deployed.
Test data is available.
Test cases are reviewed.
Required user accounts are available.
Major environment issues are resolved.

10. Exit Criteria

Testing can be considered complete when:

Planned test cases have been executed.
Critical and high-severity defects are resolved or formally accepted.
Failed test cases have been analyzed.
Required regression testing is completed.
Requirement coverage is reviewed.
Test execution results are documented.
Test Summary Report is completed.

11. Defect Management

Defects identified during testing will be documented with:

Defect ID
Title
Module
Severity
Priority
Environment
Preconditions
Steps to Reproduce
Expected Result
Actual Result
Evidence
Status

Defect lifecycle:
New
 ↓
Assigned
 ↓
In Progress
 ↓
Fixed
 ↓
Retest
 ↓
Verified
 ↓
Closed
If the defect is not fixed:
Retest
 ↓
Failed
 ↓
Reopened

12. Severity Classification
| Severity | Description                                                          |
| -------- | -------------------------------------------------------------------- |
| Critical | Application or critical business workflow is unavailable             |
| High     | Major functionality is not working and significantly impacts testing |
| Medium   | Functionality is partially impacted but workaround may exist         |
| Low      | Minor functional or UI issue with limited impact                     |

13. Priority Classification
| Priority | Description                                  |
| -------- | -------------------------------------------- |
| P1       | Requires immediate attention                 |
| P2       | Should be addressed with high priority       |
| P3       | Can be addressed in normal development cycle |
| P4       | Low-priority improvement                     |

14. Test Deliverables

The following QA deliverables will be maintained:

Requirements Specification
Test Plan
Test Strategy
Test Cases
Requirement Traceability Matrix
Test Data
Bug Reports
Test Execution Report
Regression Test Report
Test Summary Report
15. Risks
| Risk                         | Impact                  | Mitigation                             |
| ---------------------------- | ----------------------- | -------------------------------------- |
| Environment unavailable      | Testing delay           | Coordinate environment availability    |
| Incomplete requirements      | Incorrect test coverage | Review requirements before execution   |
| Insufficient test data       | Limited validation      | Prepare synthetic test data in advance |
| High-severity defects        | Testing blocked         | Prioritize critical workflows          |
| Frequent application changes | Regression risk         | Maintain regression test suite         |

16. Assumptions
Required test environment is available.
Test users are available.
Requirements are sufficiently defined.
Test data can be created in the QA environment.
Application dependencies are available during testing.
Defects can be tracked and retested.

17. Testing Responsibilities
| Role             | Responsibility                                                  |
| ---------------- | --------------------------------------------------------------- |
| QA Engineer      | Test design, execution, defect reporting, retesting, regression |
| Developer        | Defect analysis and resolution                                  |
| Business Analyst | Requirement clarification                                       |
| Product Owner    | Requirement validation and business acceptance                  |
| QA Lead          | Test planning, review, reporting, and QA coordination           |

18. Reporting

Testing progress will be communicated through:

Daily QA Status
Test Execution Report
Defect Summary
Regression Status
Test Summary Report

Key metrics may include:

Total Test Cases
Executed Test Cases
Passed Test Cases
Failed Test Cases
Blocked Test Cases
Pass Percentage
Open Defects
Closed Defects
Requirement Coverage

19. Approval

This Test Plan is a fictional portfolio artifact created to demonstrate QA planning and testing practices.
