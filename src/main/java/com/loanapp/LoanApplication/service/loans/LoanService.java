package com.loanapp.LoanApplication.service.loans;

import com.loanapp.LoanApplication.models.Loans;

import java.util.Optional;

public interface LoanService {

    Optional<Loans> findById(int loanId);

}
