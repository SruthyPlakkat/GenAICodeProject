# Test Plan for Banking and Asset Movement Centre (BAM)

## Project Specific Impact to Testing

- **Project Phase:** Development
- **Technology Stack:** Banking and Asset Movement Centre (BAM)
- **Constraints:** Consolidation of multiple systems, user-friendly interface
- **Assumptions:** Minimize errors, enhance efficiency
- **Critical Success Factors:** Faster and easier transactions, reliable platform
- **Project Geography:** Not specified

## Scope of Testing

### In-Scope Components:
1. **Account to Account (A2A) retail transfers from BAM**
   - Description: Transfer of funds between accounts within the BAM system
   - Responsible side: Internal BAM team
   - Reference: BAM system documentation

2. **From and To account entry**
   - Description: Input fields for selecting the source and destination accounts for the transfer
   - Responsible side: Internal BAM team
   - Reference: BAM system documentation

3. **Transfer date entry (current and future up to 6 months)**
   - Description: Input field for selecting the transfer date within the allowable range
   - Responsible side: Internal BAM team
   - Reference: BAM system documentation

### Out-of-Scope Components:
1. **ACH transfers**
   - Description: Automated Clearing House transfers between financial institutions
   - Responsible side: External banking partners
   - Reference: N/A

2. **Check deposits**
   - Description: Deposit of physical checks into the account
   - Responsible side: Internal banking operations team
   - Reference: N/A

3. **External transfers**
   - Description: Transfers to accounts outside of the BAM system
   - Responsible side: Internal BAM team
   - Reference: N/A

4. **Banking and Lending**
   - Description: Banking and lending services offered by the institution
   - Responsible side: Internal banking and lending teams
   - Reference: N/A

### Third-Party Systems:
- TBD

## Quality and Acceptance Criteria

### Quality Benchmarks:
- Minimize errors in transactions.
- Enhance efficiency for branch teams and home office operations.

### Acceptance Criteria:
- Successful transfer of funds between accounts.
- Accurate entry of From and To account details.
- Correct transfer date entry within the allowable range.

### Test Process Description:
1. **Planning Phase:**
   - **Entry Criteria:** Business requirements and design documents are approved.
   - **Exit Criteria:** Test plan and test cases are ready for review.

2. **Design Phase:**
   - **Entry Criteria:** Approved test plan.
   - **Exit Criteria:** Test cases designed and reviewed.

3. **Execution Phase:**
   - **Entry Criteria:** Approved test cases.
   - **Exit Criteria:** Test execution completed with documented results.

4. **Reporting Phase:**
   - **Defect Severity Definitions:**
     - *Critical*: Any issue causing system crash or incorrect fund transfer.
     - *Major*: Issues leading to incorrect account details but not system crash.
     - *Minor*: UI discrepancies or non-critical issues.
   - **Test Case Creation and Management Rules:**
     - Test cases to cover all acceptance criteria.
     - Each test case should be traceable to requirements.
   - **Defect Reporting and Lifecycle Management:**
     - Defects to be reported in a defect tracking tool.
     - Defect life cycle includes New, Assigned, In Progress, Fixed, Retested, and Closed statuses.
   - **Testing Metrics and Tracking:**
     - Metrics include Defect Density, Test Case Productivity, and Test Execution Efficiency.
     - Tracking through daily status reports and weekly test summary reports.