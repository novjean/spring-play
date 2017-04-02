package com.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView checkUser(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		// Retrieve the fields
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		System.out.println(uname);
		
		if (uname.equals("abc") && pass.equals("123")) {
			mv.setViewName("success.jsp");
		} else {
			mv.setViewName("index.jsp");
		}

		return mv;
	}
}
