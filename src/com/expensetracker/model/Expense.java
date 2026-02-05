package com.expensetracker.model;
import java.time.LocalDate;
public class Expense extends Transactions {

    public Expense(String id,double amount,LocalDate date,String description,String category){
        super(id,amount,date,description,category);

    }


    @Override
    public double getFinalAmount() {
        return -getAmount();
    }

}
