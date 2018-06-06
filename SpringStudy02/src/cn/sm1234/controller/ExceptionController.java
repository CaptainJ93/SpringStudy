package cn.sm1234.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value={java.lang.NullPointerException.class})
	public ModelAndView exception(Exception exception) {
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.addObject("msg",exception.toString());
		modelAndView.setViewName("/WEB-INF/jsp/error.jsp");
		return modelAndView;
	}
}
