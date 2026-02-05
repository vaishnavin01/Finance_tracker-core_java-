package com.expensetracker.services;
import com.expensetracker.model.Transactions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
 import java.util.Iterator;
public class TransactionService {
    private List<Transactions>ttransact=new ArrayList<>();
    public void addTransaction(Transactions transaction){
        ttransact.add(transaction);
    }
    public double calculateTransaction(){
        double total=0;
        for(Transactions t:ttransact){
            total+=t.getAmount();
        }
        return total;
    }
    public double calculateTotal(){
        double total=0;
        for(Transactions t:ttransact){
            total+=t.getFinalAmount();
        }
        return total;
    }
    public List<Transactions>getTransact(){
        return ttransact;
    }
    public void printTransactions(){
        for (Transactions t : ttransact) {
            System.out.println(t);
        }
    }

    public Set<String>getCategories(){
        Set<String>uniquecategory=new HashSet<>();
        for(Transactions t:ttransact){
            uniquecategory.add(t.getCategory());
        }
        return uniquecategory;
    }
    public Map<String,Double>categorywiesExpense(){
        Map<String,Double>map=new HashMap<>();
        for(Transactions t:ttransact){
            String category=t.getCategory();
            double amount=t.getFinalAmount();

                map.put(category,map.getOrDefault(category,0.0)+amount);


        }
        return map;

    }
    public void loadTransactionfromDatabase(List<Transactions>dbtransactions){
        ttransact.addAll(dbtransactions);
    }


   /*  public String getId(){
        Transactions t=ttransact.get(1);
        return t.id;
    }*/
}
