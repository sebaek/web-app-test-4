package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 * Servlet implementation class FileUpload
 */
@WebServlet("/upload")
@MultipartConfig()
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, String[]> params = request.getParameterMap();
		
		for (String name : params.keySet()) {
			String[] values = request.getParameterValues(name);
			for (String value: values) {
				System.out.println(name + ":" + value);
			}
		}
		
		String filePath = request.getParameter("destination");
		
		Part part = request.getPart("file");
		filePath += File.separator + part.getSubmittedFileName();
		
		System.out.println(part.getSubmittedFileName());
		
		
		InputStream fileSource = part.getInputStream();
		OutputStream fileDestination = new FileOutputStream(filePath);
		
		System.out.println("filePath:" + filePath);
		
		int r = 0;
		while ((r = fileSource.read()) != -1) {
			fileDestination.write(r);
		}
		
		fileSource.close();
		fileDestination.close();
		
//		Collection<Part> parts = request.getParts();
//		for (Part part : parts) {
//			System.out.println(part.getName());
//			System.out.println(part.getHeader("content-disposition"));
//			System.out.println(part.getSubmittedFileName());
//			System.out.println(part.getSize());
//			System.out.println(part.getContentType());
//		}
	
	}

}
