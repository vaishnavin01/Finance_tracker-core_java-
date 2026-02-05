package com.expensetracker.util;
import com.expensetracker.model.Transactions;
import java.util.Comparator;

public class SortByAmount implements Comparator<Transactions> {
    @Override
    public int compare(Transactions t1,Transactions t2){
        return Double.compare(t1.getAmount(),t2.getAmount()) ;
    }
}
