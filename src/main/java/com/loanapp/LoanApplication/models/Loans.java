package com.loanapp.LoanApplication.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Loans")
public class Loans {

    private int loanId;
    private String loanType;
    private String loanDescription;
    private int loanAmount;
    private String requestedDate;
    private String status;

    public Loans(int loanId, String loanType, String loanDescription, int loanAmount, String requestedDate, String status) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.loanDescription = loanDescription;
        this.loanAmount = loanAmount;
        this.requestedDate = requestedDate;
        this.status = status;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanDescription() {
        return loanDescription;
    }

    public void setLoanDescription(String loanDescription) {
        this.loanDescription = loanDescription;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
