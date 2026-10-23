## How do you read a file in Java?
- Use the File class from the java.io package to point to the file, and the Scanner class to read it line by line. hasNextLine() checks if there is another line and nextLine() reads it. BufferedReader can also be used. If the file does not exist, a FileNotFoundException is thrown.

## How do you write to a file in Java?
- Use the FileWriter class and its write() method to write text to the file. When you are done writing, close the file with the close() method. Adding true as the second parameter appends the text to the end of the file instead of overwriting it.

## What is JDBC?
- JDBC stands for Java Database Connectivity. It is a Java API used to connect to a database and execute queries. It is part of Java SE. With JDBC we can save, update, delete and fetch data from a relational database, and it uses JDBC drivers to connect with the database.

## What are the four types of JDBC drivers?
- The four types are the JDBC-ODBC Bridge Driver, the Native Driver, the Network Protocol Driver, and the Thin Driver.

## What is the java.sql package?
- The java.sql package contains the classes and interfaces of the JDBC API, such as DriverManager, Connection, Statement, PreparedStatement, ResultSet and SQLException.

## What are the 5 steps to connect a Java application to a database?
- First register the driver class, then create a connection, then create a statement, then execute queries, and finally close the connection.
