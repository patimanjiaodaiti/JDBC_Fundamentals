package JDBCs;

import Library.myLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A1_Connection {
    public static void main(String[] args) {
        /*
        1. Connectivity
        username: as it is
        password: as it is
        URL:  jdbc:postgresql://hostname:port number/database
         */
        String username = "hr",
                password= "hr",
                URL ="jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/hr";

        //2.connect java to SQL database
//        Connection myConnection = DriverManager.getConnection(URL,username,password);
        Connection myconnection= myLib.getConnection(URL,username,password);
        System.out.println("java is connected to sql");
    }
}
