package org.benjamin.portfolio.model.controller;

import javax.servlet.http.HttpSession;

import org.benjamin.portfolio.model.bean.Code;
import org.benjamin.portfolio.model.bean.Token;
import org.benjamin.portfolio.model.repository.CodeRepository;
import org.benjamin.portfolio.model.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/submit/code")
public class SubmitCodeController {
	
	@Autowired
	CodeRepository codeRepository;
	
	@Autowired
	TokenRepository tokenRepository;

	@RequestMapping(path="/{code}", method=RequestMethod.POST)
	public void setSlip(@PathVariable("code") String id, HttpSession session) {
		System.out.println("Changing 'request slip'...");
		// Get KeyCode
		System.out.println("Id is null = " + Boolean.toString(id == null));
		Code code = codeRepository.findByCode(id);
		// get Token
		Token token  = tokenRepository.findOne((String) session.getAttribute("token-key"));
		// setRequestSlip
		System.out.println("Setting 'request slip'...");
		token.setRequestSlip(code.getRequestSlip());
		// update Token
		tokenRepository.save(token);
		System.out.println("Slip saved...");
		// send response
	}
	
}
