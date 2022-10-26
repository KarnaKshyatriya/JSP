package com.jupiter.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.entity.Jupiter;
import com.jupiter.repository.JupiterInter;



@Service
public class JupiterService {
	
	@Autowired
	private JupiterInter jtr;
	
	public void save(Jupiter jp)
	{
		jtr.save(jp);
	}

	public List<Jupiter> display()
	{
		return jtr.findAll();
	}


	/*
	 * private void listUser(HttpServletRequest request, HttpServletResponse
	 * response) throws SQLException, IOException, ServletException { List<Jupiter>
	 * listUser = jtr.findAll(); request.setAttribute("listUser", listUser);
	 * RequestDispatcher dispatcher = request.getRequestDispatcher("One.jsp");
	 * dispatcher.forward(request, response); }
	 */

}
