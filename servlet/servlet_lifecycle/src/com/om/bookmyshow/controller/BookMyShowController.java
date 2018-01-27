package com.om.bookmyshow.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class BookMyShowController extends HttpServlet {

	public String location;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("calling init from " + this.getClass().getSimpleName());
		String locFromWebxml = config.getInitParameter("location");
		this.location = locFromWebxml;
		System.out.println(this.location + "\t location");

	}

	public BookMyShowController() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("calling destroy from \t" + this.getClass().getSimpleName());
	}

}
