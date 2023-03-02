package com.loanapp.LoanApplication.controller;

import com.loanapp.LoanApplication.models.Loans;
import com.loanapp.LoanApplication.repo.LoansRepository;
import com.loanapp.LoanApplication.service.loans.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

@RequestMapping("/loans")
public class loanController {
    @Autowired
    private LoanService loanService;



    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/addLoans")
    public ResponseEntity<?> addLoans(@RequestBody Loans loans)
    {
        Loans save = this.loansRepository.save(loans);
        return ResponseEntity.ok(save);
    }


    @GetMapping("/getAllLoans")
    public ResponseEntity<?> GetLoans()
    {
        return ResponseEntity.ok(this.loansRepository.findAll());
    }

    @GetMapping("/getOne/{loanId}")
     public Optional<Loans> getLoansById(@PathVariable int loanId){
        return loanService.findById(loanId);
     }

    @DeleteMapping("/deleteOne/{loanId}")
    public String deleteLoan(@PathVariable int loanId){

      loansRepository.deleteByLoanId(loanId);
      return "loan deleted successfully";
    }

    @PutMapping("/updateLoan")
    public ResponseEntity<?> updateLoan(@RequestBody Loans loans)
    {
        Loans save = this.loansRepository.save(loans);
        return ResponseEntity.ok(save);
    }


}