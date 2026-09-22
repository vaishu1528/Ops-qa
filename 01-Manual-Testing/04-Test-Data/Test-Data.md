# Test Data

## 1. Document Information

| Attribute | Details |
|---|---|
| Project | WellOps |
| Application | Oil & Gas Well Operations Management System |
| Document | Test Data |
| Version | 1.0 |
| Data Type | Synthetic / Demo Data |

---

# 2. User Test Data

| User ID | Role | Username | Password | Expected Access |
|---|---|---|---|---|
| USR-001 | Administrator | admin.demo | Demo@123 | Full authorized access |
| USR-002 | Engineer | engineer.demo | Demo@123 | Engineering and permitted well access |
| USR-003 | Operations User | operations.demo | Demo@123 | Treatment and permitted well access |
| USR-004 | Viewer | viewer.demo | Demo@123 | Read-only access |

> These credentials are fictional demonstration values and must never be used for a real application.

---

# 3. Invalid Login Data

| Test Data ID | Username | Password | Expected Result |
|---|---|---|---|
| LOGIN-NEG-001 | invalid.user | Demo@123 | Invalid username message |
| LOGIN-NEG-002 | admin.demo | Wrong@123 | Invalid password message |
| LOGIN-NEG-003 | invalid.user | Wrong@123 | Invalid credentials message |
| LOGIN-NEG-004 | blank | Demo@123 | Username required |
| LOGIN-NEG-005 | admin.demo | blank | Password required |
| LOGIN-NEG-006 | blank | blank | Required field validation |

---

# 4. Well Test Data

| Well ID | Well Name | Field | Operator | Well Type | Status |
|---|---|---|---|---|---|
| WELL-1001 | Alpha-01 | Demo Field | Demo Energy | Horizontal | Active |
| WELL-1002 | Bravo-02 | Demo Field | Demo Energy | Vertical | Active |
| WELL-1003 | Charlie-03 | North Demo Field | Demo Energy | Horizontal | Inactive |
| WELL-1004 | Delta-04 | South Demo Field | Demo Energy | Directional | Active |
| WELL-1005 | Echo-05 | Central Demo Field | Demo Energy | Horizontal | Active |

---

# 5. Duplicate Well Data

| Test Data ID | Existing Well ID | Duplicate Well ID | Expected Result |
|---|---|---|---|
| DUP-WELL-001 | WELL-1001 | WELL-1001 | Duplicate Well ID validation |
| DUP-WELL-002 | WELL-1002 | WELL-1002 | Duplicate Well ID validation |

---

# 6. Invalid Well Data

| Field | Invalid Value | Expected Result |
|---|---|---|
| Well ID | Blank | Required field validation |
| Well Name | Blank | Required field validation |
| Well ID | Special characters where unsupported | Validation message |
| Well ID | Duplicate value | Duplicate validation |
| Well Type | Unsupported value | Validation message |
| Status | Unsupported value | Validation message |

---

# 7. Directional Survey Test Data

| Survey ID | Well ID | MD | Inclination | Azimuth | N-S | E-W | TVD |
|---|---|---:|---:|---:|---:|---:|---:|
| DS-001 | WELL-1001 | 1000 | 2.5 | 90 | 10.2 | 15.4 | 999.8 |
| DS-002 | WELL-1001 | 2000 | 5.0 | 92 | 25.6 | 40.8 | 1995.2 |
| DS-003 | WELL-1001 | 3000 | 8.0 | 95 | 45.3 | 75.2 | 2988.7 |
| DS-004 | WELL-1002 | 1000 | 1.5 | 88 | 8.5 | 12.2 | 999.9 |
| DS-005 | WELL-1002 | 2000 | 4.0 | 90 | 20.4 | 35.6 | 1997.1 |

> Directional survey values are fictional and are provided only for QA demonstration.

---

# 8. Wellbore Test Data

## Casing

| Casing ID | Well ID | Casing Size | Depth |
|---|---|---:|---:|
| CAS-001 | WELL-1001 | 9.625 in | 5000 ft |
| CAS-002 | WELL-1002 | 7.000 in | 4500 ft |
| CAS-003 | WELL-1003 | 9.625 in | 4800 ft |

## Tubing

| Tubing ID | Well ID | Tubing Size | Depth |
|---|---|---:|---:|
| TUB-001 | WELL-1001 | 2.875 in | 8000 ft |
| TUB-002 | WELL-1002 | 2.375 in | 7500 ft |
| TUB-003 | WELL-1003 | 2.875 in | 7000 ft |

---

# 9. Treatment Test Data

| Treatment ID | Well ID | Stage | Time | Flow Rate | Prop Concentration | Status |
|---|---|---:|---:|---:|---:|---|
| TR-001 | WELL-1001 | 1 | 10 min | 40 bbl/min | 1.0 ppg | Design |
| TR-002 | WELL-1001 | 2 | 15 min | 45 bbl/min | 2.0 ppg | Design |
| TR-003 | WELL-1001 | 3 | 20 min | 50 bbl/min | 3.0 ppg | Actual |
| TR-004 | WELL-1002 | 1 | 12 min | 35 bbl/min | 1.5 ppg | Design |
| TR-005 | WELL-1002 | 2 | 18 min | 42 bbl/min | 2.5 ppg | Actual |

---

# 10. Treatment Negative Test Data

| Test Data ID | Field | Value | Expected Result |
|---|---|---|---|
| TR-NEG-001 | Time | Blank | Required validation |
| TR-NEG-002 | Time | Negative value | Validation message |
| TR-NEG-003 | Flow Rate | Negative value | Validation message |
| TR-NEG-004 | Flow Rate | Non-numeric text | Validation message |
| TR-NEG-005 | Prop Concentration | Negative value | Validation message |
| TR-NEG-006 | Stage | Blank | Required validation |

---

# 11. Engineering Test Data

| Analysis ID | Well ID | Analysis Type | Status |
|---|---|---|---|
| ENG-001 | WELL-1001 | MiniFrac / DFIT | Ready |
| ENG-002 | WELL-1002 | MiniFrac / DFIT | Ready |
| ENG-003 | WELL-1004 | MiniFrac / DFIT | Ready |

---

# 12. Report Test Data

| Report ID | Well ID | Report Type |
|---|---|---|
| REP-001 | WELL-1001 | Well Report |
| REP-002 | WELL-1001 | Treatment Report |
| REP-003 | WELL-1001 | Engineering Report |
| REP-004 | WELL-1002 | Well Report |
| REP-005 | WELL-1002 | Treatment Report |

---

# 13. Boundary Test Data

Boundary values will be used to validate application behavior around supported limits.

Examples:

| Test Type | Values |
|---|---|
| Minimum | Minimum supported value |
| Minimum - 1 | Value below minimum |
| Minimum + 1 | Value immediately above minimum |
| Maximum - 1 | Value immediately below maximum |
| Maximum | Maximum supported value |
| Maximum + 1 | Value above maximum |

Exact application limits will be defined when applicable to individual requirements.

---

# 14. Data Validation Rules

Test data will be used to validate:

- Required fields
- Data formats
- Numeric values
- Duplicate values
- Boundary values
- Data persistence
- Data retrieval
- Cross-module consistency
- Role-based access
- Report consistency

---

# 15. Data Management Guidelines

All data in this portfolio is synthetic.

No real:

- Customer data
- Production data
- Well data
- Credentials
- API keys
- Company information
- Internal URLs

are included.

---

## Disclaimer

This test data is fictional and created exclusively for QA portfolio demonstration and learning purposes.
