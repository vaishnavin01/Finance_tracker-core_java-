package com.expensetracker.model;
import java.time.LocalDate;

public class Transactions {
    private String id;
    private double amount;
    private LocalDate date;
    private String description;
    private String category;
    public Transactions(String id,double amount,LocalDate date,String description,String category){
        this.id=id;
        this.amount=amount;
        this.date=date;
        this.description=description;
        this.category=category;

    }
    public double getAmount(){
        return amount;
    }
    public String getDescription(){
        return description;
    }
    public double getFinalAmount(){
        return amount;
    }
    public String getCategory(){
        return category;
    }
    @Override
    public String toString() {
        return "ID: " + id +
                ", Amount: " + amount +
                ", Category: " + category +
                ", Description: " + description +
                ", Date: " + date;
    }
}
