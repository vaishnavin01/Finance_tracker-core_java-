package com.expensetracker.dao;
import java.sql.*;
import java.util.ArrayList;
import com.expensetracker.model.*;
import java.util.List;


public class TransactionDao {
    private final String url="jdbc:mysql://localhost:3306/ExpenseTracker";
    private final String username="root";
    private final String password="Nathe@1912";

    public List<Transactions>fetchAlltransactions(){
        List<Transactions>list=new ArrayList<>();
        String query="SELECT * FROM transactions";
        try( Connection connection=DriverManager.getConnection(url,username,password);
        PreparedStatement statement=connection.prepareStatement(query);
        ResultSet res=statement.executeQuery(query)){
            while(res.next()){
                String type=res.getString("type");
                Transactions t;
                if(type.equalsIgnoreCase("expense")){
                    t=new Expense(res.getString("id"),
                            res.getDouble("amount"),
                            res.getDate("date").toLocalDate(),
                            res.getString("description"),
                            res.getString("category")
                            );
                }
                else{
                    t=new Income(res.getString("id"),
                            res.getDouble("amount"),
                            res.getDate("date").toLocalDate(),
                            res.getString("description"),
                            res.getString("category")
                            );
                }
                list.add(t);
            }


        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return list;

    }

}
