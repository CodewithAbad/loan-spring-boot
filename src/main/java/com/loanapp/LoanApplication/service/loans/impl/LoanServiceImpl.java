package com.loanapp.LoanApplication.service.loans.impl;

import com.loanapp.LoanApplication.models.Loans;
import com.loanapp.LoanApplication.repo.LoansRepository;
import com.loanapp.LoanApplication.service.loans.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService{


    @Autowired
    private LoansRepository loansRepository;



    @Override
    public Optional<Loans> findById(int loanId){


        return loansRepository.findByLoanId(loanId);

    }



}
