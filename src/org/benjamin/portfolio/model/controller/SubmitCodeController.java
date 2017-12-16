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

/**
 * Controller for receiving code submitions. 
 * 
 * @author Benjamin Rosman
 *
 */
@RestController
@RequestMapping("/submit/code")
public class SubmitCodeController {
	
	@Autowired
	CodeRepository codeRepository;
	
	@Autowired
	TokenRepository tokenRepository;

	/**
	 * Changes this users token request slip and administrator permission to match the 
	 * received codes.
	 * 
	 * @param input The received code.
	 * @param session The users session.
	 */
	@RequestMapping(path="/{code}", method=RequestMethod.POST)
	public void setSlip(@PathVariable("code") String input, HttpSession session) {
		System.out.println("Changing 'request slip'...");
		// Get KeyCode
		System.out.println("Id is null = " + Boolean.toString(input == null));
		Code code = codeRepository.findByCode(input);
		// get Token
		Token token  = tokenRepository.findOne((String) session.getAttribute("token-key"));
		// setRequestSlip
		System.out.println("Setting 'request slip'...");
		token.setRequestSlip(code.getRequestSlip());
		token.setAdmin(code.isAdmin());
		// update Token
		tokenRepository.save(token);
		System.out.println("Slip saved...");
		// send response?
	}
	
}
