package com.example.temp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.temp.model.Supplier;

public class SupplierDao {
	
	private static final String INSERT_SUPPLIER_SQL = "INSERT INTO temp.Supplier(CompanyName,ContactName,Address,City,Region,PostalCode,Country,Phone) VALUES (?,?,?,?,?,?,?,?);";
	private static final String FIND_ALL_MOVIE_QUERY = "SELECT * FROM temp.Supplier;";

	protected static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/temp";
        String username = "root";
        String password = "mysql@121";
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
	
	public static void insertSupplier(Supplier supplier) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SUPPLIER_SQL);
        
        preparedStatement.setString(1, supplier.getCompanyName());
        preparedStatement.setString(2, supplier.getContactName());
        preparedStatement.setString(3, supplier.getAddress());
        preparedStatement.setString(4, supplier.getCity());
        preparedStatement.setString(5, supplier.getRegion());
        preparedStatement.setInt(6, supplier.getPostalCode());
        preparedStatement.setString(7, supplier.getCountry());
        preparedStatement.setInt(8, supplier.getPhone());
        preparedStatement.executeUpdate();
    }
	
	public static List<Supplier> findSuppliers() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_MOVIE_QUERY);
        ResultSet rs = preparedStatement.executeQuery();
        Supplier supplier;
        List<Supplier> movies = new ArrayList<>();
        while (rs.next()) {
            supplier = new Supplier(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7),
                    rs.getString(8),
                    rs.getInt(9)
            );
            movies.add(supplier);
        }
        return movies;
    }
}
