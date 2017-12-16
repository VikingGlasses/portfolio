package org.benjamin.portfolio.model.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.benjamin.portfolio.model.bean.Code;
import org.benjamin.portfolio.model.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Intercepter for checking validity of submitted code.
 * 
 * @author Benjamin Rosman
 * @see HandlerInterceptor
 */
// TODO: lookup possibilities of other/better approach
public class CodeInterceptor implements HandlerInterceptor {
	
	@Autowired
	private CodeRepository codeRepository;

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Intercepting change slip request");
		// TODO: check how to get rest value from request.
		
//		String givenCode = (String) request.getAttribute("code");
		
		// check code exist in DB
		System.out.println("Checking if code exists...");
		System.out.println("code repo is null = " + Boolean.toString(codeRepository == null));
		// TODO: fix codeRepository null
//		Code code = codeRepository.findByCode("abc");
		Code code = new Code();
		if (code != null) {
			return true;
		}
		// set response?
		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		return false;
	}

}
