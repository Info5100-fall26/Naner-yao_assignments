package com.example;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        Scanner reader = new Scanner(new File("my_test_file.txt"));
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String phrase = input.nextLine();
        FileWriter writer = new FileWriter("my_test_file.txt", true);
        writer.write("\n" + phrase);
        writer.close();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "");
        con.setAutoCommit(false);
        Statement stmt = con.createStatement();

        System.out.print("Read:           ");
        int age = printRecord(stmt);

        age = age + 1;
        stmt.executeUpdate("update students set age = " + age + " where id = 1");
        System.out.print("After update:   ");
        printRecord(stmt);

        con.rollback();
        System.out.print("After rollback: ");
        printRecord(stmt);

        con.close();
    }

    static int printRecord(Statement stmt) throws SQLException
    {
        ResultSet rs = stmt.executeQuery("select * from students where id = 1");
        rs.next();
        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
        return rs.getInt(3);
    }
}
