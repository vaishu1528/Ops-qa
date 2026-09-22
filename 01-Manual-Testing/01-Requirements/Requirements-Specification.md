# Requirements Specification

## Project

**Application:** Ops  
**Domain:** Oil & Gas  
**Application Type:** Web Application  
**Document Type:** Requirements Specification  

---

## 1. Purpose

The Ops application is a fictional web-based Oil & Gas Well Operations Management System.

The application allows authorized users to manage well information, wellbore configuration, directional survey data, treatment information, engineering analysis, and operational reports.

This document defines the functional requirements that will be used as the basis for QA planning, test case design, requirement traceability, and test execution.

---

# 2. User Roles

The application supports the following user roles:

### Administrator

The Administrator can create, update, deactivate, and manage application data and users.

### Engineer

The Engineer can view well information, maintain engineering data, perform engineering analysis, and access reports.

### Operations User

The Operations User can view well information, manage treatment-related information, and access operational reports.

### Viewer

The Viewer has read-only access to permitted application data and reports.

---

# 3. Functional Requirements

## 3.1 Authentication & Access Management

### REQ-AUTH-001 — User Login

The system shall allow registered users to log in using valid credentials.

### REQ-AUTH-002 — Invalid Login Validation

The system shall display an appropriate validation message when a user enters invalid login credentials.

### REQ-AUTH-003 — Mandatory Login Fields

The system shall validate that username and password fields are populated before allowing login.

### REQ-AUTH-004 — Role-Based Access

The system shall provide application access based on the user's assigned role.

### REQ-AUTH-005 — Logout

The system shall allow authenticated users to log out of the application.

---

# 3.2 Well Management

### REQ-WELL-001 — Create Well

The system shall allow authorized users to create a new well by providing required well information.

### REQ-WELL-002 — Mandatory Well Information

The system shall validate mandatory fields when creating or updating a well.

### REQ-WELL-003 — Unique Well ID

The system shall prevent creation of multiple wells using the same Well ID.

### REQ-WELL-004 — Search Well

The system shall allow users to search for wells using supported search criteria.

### REQ-WELL-005 — Filter Wells

The system shall allow users to filter wells based on available attributes such as status and field.

### REQ-WELL-006 — Update Well

The system shall allow authorized users to update permitted well information.

### REQ-WELL-007 — Well Status

The system shall allow authorized users to activate or deactivate a well.

---

# 3.3 Well Information

### REQ-WINFO-001 — General Well Information

The system shall display general information associated with the selected well.

### REQ-WINFO-002 — Well Data Validation

The system shall validate supported formats and acceptable values for well information fields.

### REQ-WINFO-003 — Save Well Information

The system shall save valid well information and make the updated information available when the well is reopened.

---

# 3.4 Wellbore Configuration

### REQ-WB-001 — Wellbore Data

The system shall allow authorized users to maintain wellbore configuration information.

### REQ-WB-002 — Casing Information

The system shall allow users with appropriate permissions to enter and update casing information.

### REQ-WB-003 — Tubing Information

The system shall allow users with appropriate permissions to enter and update tubing information.

### REQ-WB-004 — Depth Validation

The system shall validate depth-related values according to defined application rules.

---

# 3.5 Directional Survey

### REQ-DS-001 — Directional Survey Data

The system shall allow authorized users to enter and maintain directional survey records.

### REQ-DS-002 — Survey Fields

Each directional survey record shall support Measured Depth, Inclination, Azimuth, North/South, East/West, and TVD values.

### REQ-DS-003 — Survey Validation

The system shall validate required directional survey fields and supported numeric values.

### REQ-DS-004 — Survey Data Persistence

The system shall retain valid directional survey data after saving and reopening the well.

---

# 3.6 Treatment Management

### REQ-TREAT-001 — Treatment Schedule

The system shall allow authorized users to view and maintain treatment schedule information.

### REQ-TREAT-002 — Design Data

The system shall allow permitted users to enter and update treatment design information.

### REQ-TREAT-003 — Actual Data

The system shall allow permitted users to enter and update actual treatment information.

### REQ-TREAT-004 — Treatment Totals

The system shall display treatment totals based on valid treatment data.

### REQ-TREAT-005 — Treatment Data Validation

The system shall validate required treatment fields and supported numeric values.

---

# 3.7 Engineering Analysis

### REQ-ENG-001 — Engineering Parameters

The system shall allow authorized engineering users to view and maintain supported engineering parameters.

### REQ-ENG-002 — Engineering Analysis

The system shall allow authorized users to perform supported engineering analysis using valid input data.

### REQ-ENG-003 — Analysis Validation

The system shall validate required inputs before allowing engineering analysis to be performed.

### REQ-ENG-004 — Analysis Results

The system shall display analysis results based on the submitted valid input data.

---

# 3.8 Reports

### REQ-REP-001 — Well Report

The system shall allow authorized users to view a report containing relevant well information.

### REQ-REP-002 — Treatment Report

The system shall allow authorized users to view treatment-related information in a report.

### REQ-REP-003 — Engineering Report

The system shall allow authorized users to view engineering analysis results in a report.

### REQ-REP-004 — Report Data Consistency

The system shall display report information consistent with the corresponding application data.

---

# 4. Non-Functional Requirements

### REQ-NFR-001 — Usability

The application shall provide clear labels, navigation, validation messages, and user feedback.

### REQ-NFR-002 — Performance

The application should respond to normal user actions within an acceptable response time under expected usage conditions.

### REQ-NFR-003 — Security

The application shall restrict access to functionality based on user permissions.

### REQ-NFR-004 — Data Integrity

The application shall preserve valid user data during supported create, update, and retrieval operations.

### REQ-NFR-005 — Error Handling

The application shall display meaningful error messages when an operation cannot be completed.

---

# 5. QA Testing Scope

The requirements in this document will be validated using:

- Functional Testing
- Positive Testing
- Negative Testing
- Boundary Value Testing
- UI Testing
- Integration Testing
- Regression Testing
- Role-Based Access Testing
- Data Validation
- End-to-End Testing
- API Validation
- Compatibility Testing

---

# 6. Traceability

Each requirement will be mapped to one or more test cases in the Requirement Traceability Matrix.

The traceability flow will be:

Requirement → Test Case → Test Execution → Defect

---

## Disclaimer

This requirements document is part of a fictional QA portfolio project.

All application names, requirements, data, workflows, and scenarios are fictional and are not copied from any confidential company system.
