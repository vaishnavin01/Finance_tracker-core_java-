package com.expensetracker.model;

import java.time.LocalDate;

public class Income extends Transactions {

    public Income(String id, double amount, LocalDate date, String description,String category){
        super(id,amount,date,description,category);

    }


    @Override
    public double getFinalAmount() {
        return getAmount();
    }
}
