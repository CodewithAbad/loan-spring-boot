package com.loanapp.LoanApplication.repo;

import com.loanapp.LoanApplication.models.Loans;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoansRepository extends MongoRepository<Loans, Integer> {

    Optional<Loans> findByLoanId(int loanId);


    void deleteByLoanId(int loanId);
}
