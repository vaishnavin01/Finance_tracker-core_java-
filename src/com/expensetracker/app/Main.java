package com.expensetracker.app;
import com.expensetracker.dao.TransactionDao;
import com.expensetracker.model.*;
import com.expensetracker.services.TransactionService;
import java.time.LocalDate;
import java.util.Collections;
import com.expensetracker.util.SortByAmount;
public class Main {
    public static void main(String[]args){
        TransactionService service=new TransactionService();
       /* service.addTransaction(new Expense("E1",5000,LocalDate.now(),"shopping","cloths"));
        service.addTransaction(new Income("I1",10000,LocalDate.now(),"Salary","Job"));
        service.addTransaction(new Expense("E2",1000,LocalDate.now(),"Salary","Job"));
        Collections.sort(service.getTransact(),new SortByAmount());
        System.out.println("sorted transactions");
        for(Transactions t:service.getTransact()){
            System.out.println(t.getAmount()+"  "+t.getDescription());
        }
        System.out.println("TotalAmountTransaction"+service.calculateTransaction());
        System.out.println("TotalremainAmount"+service.calculateTotal());
        System.out.println("Total categories "+service.getCategories());
        System.out.println("categorywise expense "+service.categorywiesExpense());*/
        TransactionDao td=new TransactionDao();
        service.loadTransactionfromDatabase(td.fetchAlltransactions());
        service.printTransactions();
        System.out.println(service.categorywiesExpense());
    }
}
