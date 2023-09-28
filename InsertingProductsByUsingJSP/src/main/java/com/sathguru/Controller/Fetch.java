package com.sathguru.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathguru.Dao.ProductDao;
import com.sathguru.Dto.ProductDto;

public class Fetch extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		ProductDao dao = new ProductDao();
		List<ProductDto> dto = dao.fetchAll();
		
		
		

	}

}
