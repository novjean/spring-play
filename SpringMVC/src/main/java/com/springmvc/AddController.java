package com.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		int i = Integer.parseInt(request.getParameter("t1"));		//The input name t1 and t2 from index.jsp
		int j = Integer.parseInt(request.getParameter("t2"));

		// Implement a service class and call like this
		AddService as = new AddService();
		int k = as.add(i, j);

		// Model object
		String viewName = "display.jsp";
		ModelAndView mv = new ModelAndView();
		mv.setViewName(viewName);				//which view to call
		mv.addObject("result", k);				//what data to pass

		return mv;
	}
}
