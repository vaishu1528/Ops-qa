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
