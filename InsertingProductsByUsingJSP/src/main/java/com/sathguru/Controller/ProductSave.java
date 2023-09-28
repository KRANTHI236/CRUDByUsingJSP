package com.sathguru.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathguru.Dao.ProductDao;
import com.sathguru.Dto.ProductDto;

@WebServlet("/productdata")
public class ProductSave extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);

		int productno = Integer.parseInt(req.getParameter("productno"));
		int code = Integer.parseInt(req.getParameter("code"));
		String description = req.getParameter("description");
		float price = Float.parseFloat(req.getParameter("price"));
		int crtd_dt = Integer.parseInt(req.getParameter("crtd_dt"));
		String crtd_by = req.getParameter("crtd_by");

		ProductDto productDto = new ProductDto();

		productDto.setProductno(productno);
		productDto.setCode(code);
		productDto.setDescription(description);
		productDto.setPrice(price);
		productDto.setCrtd_dt(crtd_dt);
		productDto.setCrtd_by(crtd_by);

		ProductDao productDao = new ProductDao();
		ProductDto dto = productDao.saveProduct(productDto);

	}
	

}
