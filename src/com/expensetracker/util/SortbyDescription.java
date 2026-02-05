package com.expensetracker.util;
import com.expensetracker.model.Transactions;
import java.util.Comparator;
public class SortbyDescription implements Comparator<Transactions> {
    @Override
    public int compare(Transactions t1,Transactions t2){
        return t1.getDescription().compareTo(t2.getDescription());
    }
}
