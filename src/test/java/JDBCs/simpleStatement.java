package JDBCs;

import Library.myLib;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class simpleStatement {
    public static void main(String[] args) throws Exception {
        String username = "hr",
                password= "hr",
                URL ="jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/hr";
        Connection mycon = myLib.getConnection(URL,username,password);
        System.out.println("connected");

        //2.create statement
        Statement mystatement = mycon.createStatement();
        String sql="select * from account";
        ResultSet myset = mystatement.executeQuery(sql);
        while (myset.next()){
            System.out.println(myset.getString("password"));
            System.out.println(myset.getInt(1));
        }
        String sql2="select* from actor;";
        mystatement.executeQuery(sql2);
    }
}
