package com.example.temp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.temp.dao.SupplierDao;
import com.example.temp.model.Supplier;

@WebServlet(name = "SupplierServlet", urlPatterns = {"/supplier-form", "/supplier-list"})
public class SupplierServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub
		List<Supplier> supplierList = new ArrayList<>();
		
		try {
			supplierList = SupplierDao.findSuppliers();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(supplierList);
		req.setAttribute("supplierList", supplierList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("supplier-list.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Supplier supplier = new Supplier(
				req.getParameter("companyName"),
				req.getParameter("contactName"),
				req.getParameter("address"), 
				req.getParameter("city"),
				req.getParameter("region"),
				Integer.parseInt(req.getParameter("postalCode")),
				req.getParameter("country"),
				Integer.parseInt(req.getParameter("phone"))
				);
		try {
			SupplierDao.insertSupplier(supplier);
		} catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
		
		resp.sendRedirect("/temp-project/supplier-list");
	}
}
